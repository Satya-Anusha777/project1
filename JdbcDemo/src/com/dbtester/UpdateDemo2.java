package com.dbtester;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.db.DBConnectivity;

public class UpdateDemo2 {
	public static void main(String args[]) 
	{
		Connection con =null;
		Statement st = null;
		ResultSet rs =null;
	  String UPDATE="update employee set salary=salary+1000 where no =1201"; 
		con= DBConnectivity.getConnection();
		System.out.println(con);
		try {
			st= con.createStatement();
			int x = st.executeUpdate(UPDATE);
			System.out.println(x+"rows updated"); 
			
			
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