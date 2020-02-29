package com.dbtester;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DBConnectivity;

public class DeleteDemo1 {
	public static void main(String args[]) 
	{
		Connection con =null;
		Statement st = null;
		ResultSet rs =null;
	  String DELETE ="delete from employee where no = 1244"; 
		con= DBConnectivity.getConnection();
		System.out.println(con);
		try {
			st= con.createStatement();
			int x = st.executeUpdate(DELETE);
			System.out.println(x+"rows deleted"); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
			    st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


}
