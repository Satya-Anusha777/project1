package input;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Workshops {

public void show(){
	
 		String choice;
 		try {
 			FileInputStream fis=new FileInputStream("Workshops.txt");
 			ObjectInputStream is=new ObjectInputStream(fis);
 			List<Workshop>list;
 			list=(ArrayList<Workshop>)is.readObject();
 			for(Workshop workshop:list){
 				workshop.getname();
 				workshop.getspecification();
 			}
 		}
 		System.out.println("Enter the workshop your interested");
 		choice = scanner.nextLine();
 		for(Workshop workshop:list){
 			if(workshop.getname().equals(choice)){
 				System.out.println(workshop.getname());
 				System.out.println(workshop.getspecification());
 				System.out.println(workshop.getdate());
 				System.out.println(workshop.getdays());
 				System.out.println(workshop.getfee());
 				System.out.println(workshop.getph());
 				System.out.println(workshop.getmail());
 			}
 		}
        
}
}
