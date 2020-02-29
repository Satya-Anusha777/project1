package com.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.DbConnection;
import com.dto.Employee;
//import com.web.EmpHomePage;
import com.mysql.jdbc.Statement;

public class EmpDAO  {
	public Employee getEmployee(String loginId, String password) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DbConnection.getConnection();
		String SELECT = "select * from employee where loginId = ? and password = ?";
		
		try {
			pst = con.prepareStatement(SELECT);
			pst.setString(1, loginId);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setLoginId(rs.getString(4));
				emp.setPassword(rs.getString(5));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int register(Employee emp) {
		Connection con = null;
		PreparedStatement pst = null;
		String INSERT="insert into employee values(?,?,?,?,?)";
		try {
			con = DbConnection.getConnection();
			pst = (PreparedStatement) con.prepareStatement(INSERT);

			pst.setInt(1, emp.getEmpId());
			pst.setString(2, emp.getEmpName());
			pst.setDouble(3,emp.getSalary());
			pst.setString(4, emp.getLoginId());
			pst.setString(5, emp.getPassword());

			int x = pst.executeUpdate();

			return x;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}


public Employee getEmployee(int empId, String empName, Double salary) {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	con = DbConnection.getConnection();
	String SELECT = "select * from employee";
	try {
		pst = con.prepareStatement(SELECT);
		pst.setInt(1,empId);
		pst.setString(2,empName);
		pst.setDouble(3,salary);
		rs = pst.executeQuery();
		if(rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			emp.setLoginId(rs.getString(4));
			emp.setPassword(rs.getString(5));

			return emp;
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return null;
}

public Employee getEmployee(int empId) {
	Connection con = null;
	PreparedStatement pst = null;

	ResultSet rs = null;
	con = DbConnection.getConnection();
	String SELECT = "Select * from employee where empId=?";
	try {
	pst = con.prepareStatement(SELECT);
	pst.setInt(1, empId);

	rs = pst.executeQuery();
	if(rs.next()) {
	Employee emp = new Employee();
	emp.setEmpId(rs.getInt(1));
	emp.setEmpName(rs.getString(2));
	emp.setSalary(rs.getDouble(3));
	return emp;

	}
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	return null;
	}

public Employee getEmployee(String loginId) {
	Connection con = null;
	PreparedStatement pst = null;

	ResultSet rs = null;
	con = DbConnection.getConnection();
	String SELECT = "Select * from employee where loginId=?";
	try {
	pst = con.prepareStatement(SELECT);
	pst.setString(1, loginId);

	rs = pst.executeQuery();
	if(rs.next()) {
	Employee emp = new Employee();
	emp.setEmpId(rs.getInt(1));
	emp.setEmpName(rs.getString(2));
	return emp;

	}
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return null;
}

public Employee[] allDetails() {
	Connection con = DbConnection.getConnection();
	java.sql.Statement st = null;
	ResultSet rs = null;
	try {
		st = con.createStatement();
		rs = st.executeQuery("select * from employee;");
		Employee  employees[] = new Employee[100];
		int i = 0;
		
		while (rs.next()) {
			employees[i] = new Employee();
			employees[i].setEmpId(rs.getInt(1));
			employees[i].setEmpName(rs.getString(2));
			employees[i].setSalary(rs.getDouble(3));
			employees[i].setLoginId(rs.getString(4));
			i = i+1;
		}
		return employees;
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
}