package com.dbtester;

import java.sql.Connection;


import java.sql.SQLException;
import java.sql.Statement;

import com.db.DBConnectivity;

public class InsertDemo1 {
  
	public static void main(String args[]) 
	{
		Connection con =null;
		Statement st = null;
	  String INSERT="insert into employee values(1244,'anuu',110000)";
		con= DBConnectivity.getConnection();
		System.out.println(con);
		try {
			st= con.createStatement();
			int x = st.executeUpdate(INSERT);
			System.out.println(x+"rows inserted"); 
			
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
