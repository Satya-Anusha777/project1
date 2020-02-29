package Hob;

import java.util.Scanner;

public class Admin {
	Scanner scan = new Scanner(System.in);
	private String userName;
	private String password;
	
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
    	this.userName = "Rendezvous";
    	this.password = "hobbies";
    }
	public void Adminlogin()  {
		System.out.println("enter username :");
    	String adminusername = this.scan.next();	
    	System.out.println("enter password");
    	String adminpassword = this.scan.next();
    	Admin admin = new Admin();
    	int ch;
    	if (admin.getuserName().compareTo(adminusername) == 0 && admin.getPassword().compareTo(adminpassword) ==  0) {
    		int choice;
			do {
    			System.out.println("1.Register as mentor");
    			System.out.println("2.Add a workshop");
    			System.out.println("3.Add an event");
    			choice = scan.nextInt();
    			    				
    		}while(choice < 4);
	}
}
}
	
