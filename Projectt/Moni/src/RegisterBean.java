public class RegisterBean {
	
	private String username;
	private String email;
	private String ph_number;
	private String password;
	public RegisterBean() {
		super();
	}
	public RegisterBean( String username, String email, String ph_number, String password) {
		super();
		this.username = username;
		this.email = email;
		this.ph_number = ph_number;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh_number() {
		return ph_number;
	}
	public void setPh_number(String ph_number) {
		this.ph_number = ph_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}