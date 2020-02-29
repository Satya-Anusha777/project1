package com.dbtester;
import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.DBConnectivity;


public class InsertDemo2 {

	public static void main (String[] args){
		Connection con = null;
		PreparedStatement pst = null;
		Scanner sc = new Scanner(System.in);
		String choice;
		String INSERT = "insert into employee values(?,?,?)";
		try {
			con = DBConnectivity.getConnection();
			pst = con.prepareStatement(INSERT);
			do{	
				System.out.println("Enter id");
				int id = sc.nextInt();
				pst.setInt(1,id);

				System.out.println("Enter name");
				String name = sc.next();
				pst.setString(2,name);

				System.out.println("Enter salary");
				double salary = sc.nextDouble();
				pst.setDouble(3,salary);
                int x= pst.executeUpdate();
                System.out.println(x+ "rows inserted");
                
				System.out.println("select Y/N");
				choice = sc.next();
			}while(choice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
