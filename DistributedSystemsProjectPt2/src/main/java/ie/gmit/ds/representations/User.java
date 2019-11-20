package ie.gmit.ds.representations;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
 
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	
	@NotNull
	private Integer id;
	@NotBlank @Length(min=2, max=255)
	private String name;
	@Pattern(regexp=".+@.+\\.[a-z]+")
	private String email;
	@NotBlank @Length
	private String hashedPassword;
	@NotBlank @Length
	private String salt;
	
	public User() 
	{
		
	}
	
	public User(int id, String name, String email, String hashedPassword, String salt)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.hashedPassword = hashedPassword;
		this.salt = salt;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", hashedPassword=" + hashedPassword
				+ ", salt=" + salt + "]";
	}
}
