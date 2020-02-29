package Hobby;

import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);
	private String userName;
	private String emailId;
	private String phoneNumber;
	private String interest1;
	private String interest2;
	private String interest3;
	private String userPassword;
	private String userConfirmPassword;
	private int age;
	
	public User(String userName, String emailId, String phoneNumber, String userPassword, String userConfirmPassword, int age, String interest1, String interest2, String interest3)  {
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.userPassword = userPassword;
		this.userConfirmPassword = userConfirmPassword;
		this.age = age;
		this.interest1 = interest1;
		this.interest2 = interest2;
		this.interest3 = interest3;
	}
	
	public User() {
	}
	
	public  void userRegister()  {
		System.out.println("Enter your name : ");
        userName = this.scanner.next();
        System.out.println("Enter your Email Id");
        emailId = this.scanner.next();
        System.out.println("Enter your phoneNumber");
        phoneNumber = this.scanner.next();
        System.out.println("Enter any three of the Interests below\n");
        System.out.println("Badminton\n");
        System.out.println("Chess\n");
        System.out.println("Bowling\n");
        System.out.println("BasketBall\n");
        System.out.println("Painting\n");
        String interest1 = scanner.nextLine();
        String interest2 = scanner.nextLine();
        String interest3 = scanner.nextLine();
        System.out.println("Enter your age");
        age = this.scanner.nextInt();
        do {
        System.out.println("Enter your password");
        userPassword = this.scanner.next();
        System.out.println("Enter confirm password");
        userConfirmPassword = this.scanner.next();
        }
        while (!this.userPassword.equals(userConfirmPassword));
        System.out.println("Registered successfully");
        System.out.println("LOG IN");
        System.out.println("=======");
        
      }

	public void login() {
		int choice;
		
			System.out.println("Hello, Welcome to Renzevous");
			System.out.println("Select one of the options");
			System.out.println("1.AdminLogin");
        	System.out.println("2.UserLogin");
        	choice = scanner.nextInt();
        	switch (choice) {
            	case 1: {
            	}
            	case 2: {
            		System.out.println("1.Login");
                    System.out.println("2.SignUp");
                    int op = this.scanner.nextInt();
                    switch(op)  {
                    case 1: {
                    	userLogin();
                    	
                    }
                    case 2: {
                    	userRegister();
                    	
                    }
                  }
            	}
        	}
		}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private void userLogin() {
		System.out.println("enter username");
        String username = this.scanner.next();
        System.out.println("enter password");
        String password = this.scanner.next();
        if(password.equals(userPassword))  {
        	
        }
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	}
