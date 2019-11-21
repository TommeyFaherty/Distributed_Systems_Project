package ie.gmit.ds;

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
	private String hashedPassword;
	private String salt;
	private String password;
	
	public User() 
	{
		
	}
	
	public User(int id, String name, String email, String password)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.hashedPassword = "tempPass";
		this.salt = "tempSalt";
//		setHashedPassword("tempHash");
//		setSalt("tempSalt");
		
		//Pass password to password hasher and return salt and hashed password
		//User(id,name,email,hashedPassword,salt);
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
	
//	public String getPassword() {
//		return password;
//	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", hashedPassword=" + hashedPassword
				+ ", salt=" + salt + "]";
	}
}
