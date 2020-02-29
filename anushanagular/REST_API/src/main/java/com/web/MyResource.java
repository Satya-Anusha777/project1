package com.web;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.EmpDAO;
import com.dto.Employee;


@Path("myresource")
public class MyResource {

    @Path("hi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        return "HI";
    }

@Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";
    }

@Path("getEmployee")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public EmpDAO getEmployee() {
EmpDAO emp = new EmpDAO();

        return emp;
    }

@Path("getEmployeeJ")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
public EmpDAO getEmployeeJ() {
EmpDAO emp = new EmpDAO();
        return emp;
    }

@Path("getAllEmployee")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee[] getAllEmployee() {

EmpDAO emp = new EmpDAO();
Employee[] empList = emp.allDetails();
for(Employee e : empList) {
System.out.println(e);
}
        return  empList;
    }


@Path("registerEmp")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerEmp(Employee emp) {
EmpDAO emp1 = new EmpDAO();
emp1.register(emp);
System.out.println("register" + emp);
}
}
