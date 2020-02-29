package com.dbtester;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DBConnectivity;

public class SelectDemo1 {
  
	public static void main(String args[]) 
	{
		Connection con =null;
		Statement st = null;
		ResultSet rs =null;
	  String SELECT="select * from employee where no = 1201"; 
		con= DBConnectivity.getConnection();
		System.out.println(con);
		try {
			st= con.createStatement();
			rs = st.executeQuery(SELECT);
			while(rs.next()){
				System.out.println("Id :"+rs.getInt(1));
				System.out.println("name :"+rs.getString(2));
				System.out.println("salary :"+rs.getDouble(3));
				System.out.println("\n");
				
			}
			
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