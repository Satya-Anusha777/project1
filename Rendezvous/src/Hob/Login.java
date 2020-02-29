package Hob;



import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer implements Serializable{
	private String userName;
	private String emailId;
	private String phoneNumber;
	private String interest1;
	private String interest2;
	private String interest3;
	private String userPassword;
	private String userConfirmPassword;
	private int age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInterest1() {
		return interest1;
	}
	public void setInterest1(String interest1) {
		this.interest1 = interest1;
	}
	public String getInterest2() {
		return interest2;
	}
	public void setInterest2(String interest2) {
		this.interest2 = interest2;
	}
	public String getInterest3() {
		return interest3;
	}
	public void setInterest3(String interest3) {
		this.interest3 = interest3;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}
	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Login {
	Scanner scan = new Scanner(System.in);
	
	public Customer readObject1(ObjectInputStream is) {
		Customer object = null;
		try {
			object = (Customer)is.readObject();
			return object;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public boolean signIn() {
		try {
			FileInputStream fis = new FileInputStream("Customers.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			List<Customer> list;
			
			list = (ArrayList<Customer>)is.readObject();
			int i = 1;
			
			System.out.print("Enter User Name  : ");
			String userId = scan.next();
			System.out.print("Enter Password : ");		
			String password = scan.next();
			
			for(Customer customer : list) {
				if(customer.getUserName().equals(userId) && customer.getUserPassword().equals(password)) {
					return true;
				}
			}
			
			is.close();
			fis.close();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void register() {	
		List<Customer> list = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		System.out.println("Enter your name : ");
        customer.setUserName(scan.next());
        System.out.println("Enter your Email Id");
        customer.setEmailId(scan.next());
        System.out.println("Enter your phoneNumber");
        customer.setPhoneNumber(scan.next());
        System.out.println("Enter any three of the Interests below\n");
        System.out.println("Badminton\n");
        System.out.println("Chess\n");
        System.out.println("Bowling\n");
        System.out.println("BasketBall\n");
        System.out.println("Painting\n");
        customer.setInterest1(scan.nextLine());
        customer.setInterest2(scan.nextLine());
        customer.setInterest3(scan.nextLine());
        System.out.println("Enter your age");
        customer.setAge(scan.nextInt());
        System.out.println("Enter your password");
        customer.setUserPassword(scan.next());
        System.out.println("Enter confirm password");
        customer.setUserConfirmPassword(scan.next());
		FileInputStream fis;
		ObjectInputStream is;

		FileOutputStream fos;
		ObjectOutputStream os;
		
		try {			
			fis = new FileInputStream("Customers.txt");
			is = new ObjectInputStream(fis);			
			list = (ArrayList<Customer>)is.readObject();	
			is.close();
			fis.close();
		}
		catch (Exception e) { 
			
		}
		
		try {
			fos = new FileOutputStream("Customers.txt");
			os = new ObjectOutputStream(fos);
			
			list.add(customer);
			os.writeObject(list);
			os.close();
			fos.close();
		}
		catch (Exception ex) {			
		}
		
		System.out.println("Customer Registered Successfully!!! \n");
	}
	
	public void mainMenu() {
		Login login = new Login();
		Admin admin = new Admin();
		int choice = 0;
		System.out.println("Hello, Welcome to Renzevous");
		System.out.println("Select one of the options");
		System.out.println("1.AdminLogin");
    	System.out.println("2.UserLogin");
    	choice = scan.nextInt();
		switch(choice) {
		case 2: {
		System.out.println("Select Your Choice");
		System.out.println("==================");
			
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit \n");
			
		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		System.out.println();
			
		if(choice == 1) {
			if(login.signIn()) {
				System.out.println("Successfully SignIn \n");
				
				//Write your project code
				
			}
			else {
				System.out.println("Login Failed!!!\n");
				mainMenu();
			}
		}
		else if(choice == 2) {
			login.register();	
			mainMenu();
		}	
		else if(choice == 3) {
			System.out.println("Application Terminated!!! \n");
		}
		}
		case 1: {
			admin.Adminlogin();
		}
	}
}
}




