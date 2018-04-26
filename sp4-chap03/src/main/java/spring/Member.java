package spring;

import java.util.Date;

public class Member {
	
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDae;
	
	
	
	public Member(String email, String password, String name, Date registerDae) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDae = registerDae;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public Date getRegisterDae() {
		return registerDae;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			throw new IdPasswordNotMatchingException();
		}
		this.password = newPassword;
	}
	

}
