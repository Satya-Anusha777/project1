package input;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Search {

public void show(){
	
 		String choice;
 		try {
 			FileInputStream fis=new FileInputStream("Users.txt");
 			ObjectInputStream is=new ObjectInputStream(fis);
 			List<User>list;
 			list=(ArrayList<User>)is.readObject();
 		}
 		  System.out.println("Enter any  Interest from  below to search for partners\n");
          System.out.println("Badminton\n");
          System.out.println("Chess\n");
          System.out.println("Bowling\n");
          System.out.println("BasketBall\n");
          System.out.println("Painting\n");
 		choice = scanner.nextLine();
 		for(User user:list){
 			if(user.getinterest().equals(choice)){
 				System.out.println(user.getname());
 				System.out.println(user.getage());
 				System.out.println(user.getlocality());
 				System.out.println(user.getemail());
 				System.out.println(user.getphno());
 			}
 		}
        
}
}
