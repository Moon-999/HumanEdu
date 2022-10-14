package Exam09.domain.userinfo;

public class Userinfo {
	private String userId;
	private String password;
	private String username;
	
	public Userinfo() {
		//생략가능.
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
