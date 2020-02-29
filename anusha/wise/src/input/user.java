package input;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class user {
	public String user_name;
    private String password;
    public String input;
    public String interest1;
    public String interest2;
    public String interest3;
    public String age;
    public String mailid;
    public String phno;
    


    public user(String user_name, String password, String input, String interest1, String interest2, String interest3,
			String age, String mailid, String phno) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.input = input;
		this.interest1 = interest1;
		this.interest2 = interest2;
		this.interest3 = interest3;
		this.age = age;
		this.mailid = mailid;
		this.phno = phno;
	}

    public static void main(String[] args) {
    	String  input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("login");
        System.out.println("register");
        input = scanner.nextLine();


            if(input.equals("login")) {

                System.out.println("username");
                String Luser = scanner.nextLine();
                System.out.println("Password");
                String Lpassword = scanner.nextLine();
                
                File f1=new File("new.txt");
                FileReader fr;
                int flag = 0;
				try {
					fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr); 
				
                String s; 
                String[] words = null;
                int count = 0;   
                while((s = br.readLine()) != null)   
                {
                   words = s.split(",");
                    for (int i = 0;i < words.length;i++) 
                    {
                           if (words[i].equals(Luser))   
                           {
                             if(words[i + 1].equals(Lpassword)){
                            	 System.out.println("Successfully Logged in!");
                            	 System.out.println("Plan your rendezvous "+Luser);
                            	 flag = 1;
                             }
                           }
                    } if(flag == 0){
                    	System.out.println("Enter valid credentials!");
                    }
                }
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            }
            if (input.equals("register")) {
            	ArrayList<String> user_details = new ArrayList<String>();
            	ArrayList<String> Badminton = new ArrayList<String>();
            	ArrayList<String> Chess = new ArrayList<String>();
            	ArrayList<String> Bowling = new ArrayList<String>();
            	ArrayList<String> BasketBall = new ArrayList<String>();
            	ArrayList<String> Painting = new ArrayList<String>();
                System.out.println("username\n");
                String user_name = scanner.nextLine();
                
                user_details.add(user_name);
                System.out.println(user_details);

               System.out.println("Password\n");
                String password = scanner.nextLine();
                user_details.add(password);
                System.out.println(user_details);
                
                System.out.println("Enter any three of the Interests below\n");
                System.out.println("Badminton\n");
                System.out.println("Chess\n");
                System.out.println("Bowling\n");
                System.out.println("BasketBall\n");
                System.out.println("Painting\n");
                String interest1 = scanner.nextLine();
                user_details.add(interest1);
                System.out.println(user_details);
                String interest2 = scanner.nextLine();
                user_details.add(interest2);
                System.out.println(user_details);
                String interest3 = scanner.nextLine();
                user_details.add(interest3);
                System.out.println(user_details);
                System.out.println("Age:\n");
                String age = scanner.nextLine();
                user_details.add(age);
                System.out.println(user_details);
                System.out.println("Email:\n");
                String mailid = scanner.nextLine();
                user_details.add(mailid);
                System.out.println(user_details);
                System.out.println("Contact:\n");
                String phno = scanner.nextLine();
                user_details.add(phno);
                System.out.println(user_details);
                try{   
                	FileWriter writer = new FileWriter("new.txt",true); 
                	writer.write("[,");
                	for(String str: user_details) {
                	  writer.write(str+",");
                	}
                	writer.write("],");
                	writer.close();  
                   }catch(Exception e){System.out.println(e);}    
                   System.out.println("Successfully Registered!");
              }   
    }
}