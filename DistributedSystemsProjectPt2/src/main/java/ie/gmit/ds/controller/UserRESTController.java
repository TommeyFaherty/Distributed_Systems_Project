package ie.gmit.ds.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;
 
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
 
import ie.gmit.ds.dao.UserDB;
import ie.gmit.ds.representations.User;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserRESTController {
	
	private final Validator validator;
	
	public UserRESTController(Validator validator) {
		this.validator = validator;
	}
	
	@GET
	public Response getEmployees() {
		return Response.ok(UserDB.getUsers()).build();
	}
	
	@GET
	@Path("/{id}")
	public Response getUserById(@PathParam("id") Integer id) {
		User user = UserDB.getUser(id);
		if(user != null)
			return Response.ok(user).build();
		else
			return Response.status(Status.NOT_FOUND).build();
	}
	
	@POST
	public Response createUser(User user) throws URISyntaxException {
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		User u = UserDB.getUser(user.getId());
		if(violations.size() > 0) {
			ArrayList<String> validationMessages = new ArrayList<String>();
			for (ConstraintViolation<User> violation : violations) {
				validationMessages.add(violation.getPropertyPath().toString());
			}
			
			return Response.status(Status.BAD_REQUEST).entity(validationMessages).build();
		}
		if(u != null) {
			UserDB.updateUser(user.getId(), user);
			return Response.created(new URI("/users/"+user.getId())).build();
		}else
			return Response.status(Status.NOT_FOUND).build();
	}
	
	@PUT
	@Path("/{id}")
	public Response updateUserById(@PathParam("id") Integer id, User user) {
		//validation
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		User u = UserDB.getUser(user.getId());
		if(violations.size() > 0) {
			ArrayList<String> validationMessages = new ArrayList<String>();
            for (ConstraintViolation<User> violation : violations) {
                validationMessages.add(violation.getPropertyPath().toString() + ": " + violation.getMessage());
            }
			return Response.status(Status.BAD_REQUEST).entity(validationMessages).build();
		}
		if(u != null) {
			user.setId(id);
			UserDB.updateUser(id, user);
			return Response.ok(user).build();
		}else
			return Response.status(Status.NOT_FOUND).build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeUserById(@PathParam("id") Integer id) {
		User user = UserDB.getUser(id);
		if(user != null)
		{
			UserDB.removeUser(id);
			return Response.ok().build();
		}else
			return Response.status(Status.NOT_FOUND).build();
	}
}
