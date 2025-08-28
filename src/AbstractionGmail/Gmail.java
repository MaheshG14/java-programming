package AbstractionGmail;

import java.util.Scanner;

public class Gmail
{
	
	static Scanner s= new Scanner(System.in);
	
	private String username=s.next();
	
	private String password=s.next();

	

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
 
}
