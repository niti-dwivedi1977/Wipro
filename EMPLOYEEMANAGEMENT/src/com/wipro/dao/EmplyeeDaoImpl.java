package com.wipro.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.wipro.connection.MyJdbcConnection;
import com.wipro.pojo.Employee;

//Service class --- business logic 
public class EmplyeeDaoImpl implements EmployeeDao {
	
	Scanner sc = new Scanner(System.in);
	 
	MyJdbcConnection jdcon;
	
	PreparedStatement pst ;
	Statement st;
	

	public EmplyeeDaoImpl() throws SQLException
	{
		//got the connection ready
		jdcon = MyJdbcConnection.getConnect();
	}
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
		
		Employee emp = new Employee();
		
		System.out.println("Enter Employee Id :");
		emp.setId(sc.nextInt());
		
		System.out.println("Enter Employee Name :");
		emp.setName(sc.next());
		
		System.out.println("Enter Employee Salary :");
		emp.setSalary(sc.nextInt());
		
		System.out.println("Enter Employee Age :");
		emp.setAge(sc.nextInt());
		
		System.out.println("Enter Employee Department :");
		emp.setDept(sc.next());
		
		System.out.println("Enter Employee DOJ :");
		emp.setDoj(LocalDate.parse(sc.next()));
		
		System.out.println("Enter Employee DOR :");
		emp.setDor(LocalDate.parse(sc.next()));
		
		try {
			
			String sqlquery = "insert into employees values(?, ?, ?, ?, ? , ?, ?)";
			
			// PreparedStatement interface is used for parameterized based query
			
		 pst =  jdcon.conn.prepareStatement(sqlquery);
		 pst.setInt(1, emp.getId());
		 pst.setInt(2, emp.getSalary());
		 pst.setInt(3, emp.getAge());
		 pst.setString(4, emp.getName());
		 pst.setString(5, emp.getDept());
		 pst.setDate(6, Date.valueOf(emp.getDoj()));
		 pst.setDate(7, Date.valueOf(emp.getDor()));
		 
		 int result = pst.executeUpdate();
		
		 if(result==1)
		 {
			 
			 System.out.println("Record Added successfully");
		 }
		 else
		 {
			 
			 System.out.println("Please check there is some issue with the code");
		 }
		 
			
		}
		catch(SQLException e)
		{
		e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee()  {
		// TODO Auto-generated method stub
		
		String sqlquery = "update employees set salary=? where id=?";
		try {
		System.out.println("Enter the id of whom you want to update salary :");
		int id = sc.nextInt();
		System.out.println("Enter the updated Employee Salary :");
		int updatedSalary = sc.nextInt();
		
		pst = jdcon.conn.prepareStatement(sqlquery);
		
		pst.setInt(1, updatedSalary);
		pst.setInt(2, id);
		
		int result = pst.executeUpdate();
		 if(result==1)
		 {
			 
			 System.out.println("Record Updated successfully");
		 }
		 else
		 {
			 
			 System.out.println("Please check there is some issue with the code");
		 }
		}
		catch(Exception e)
		{e.printStackTrace();}
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
		String sqlquery = "delete from employees where id=?";
		try {
		System.out.println("Enter the id you want to delete :");
		int id = sc.nextInt();
		
		
		pst = jdcon.conn.prepareStatement(sqlquery);
		
	
		pst.setInt(1, id);
		
		int result = pst.executeUpdate();
		 if(result==1)
		 {
			 
			 System.out.println("Record deleted successfully");
		 }
		 else
		 {
			 
			 System.out.println("Please check there is some issue with the code");
		 }
		}
		catch(Exception e)
		{e.printStackTrace();}
		
		
		
		
	}

	@Override
	public void searchEmployee() {
		// TODO Auto-generated method stub
		
		
		String sqlquery = "select * from employees where id=?";
		try {
		System.out.println("Enter the id you want to search for :");
		int id = sc.nextInt();
		
		
		pst = jdcon.conn.prepareStatement(sqlquery);
		
		
		pst.setInt(1, id);
		
		ResultSet rs = pst.executeQuery(); //fetch the data from a table
		while(rs.next())
		{
			
			System.out.println("Employee ID : " + rs.getInt("id") + rs.getString("empname"));
		}
		
		
		
		}
		catch(Exception e)
		{e.printStackTrace();}
		
		
	}
	
	@Override
	public void displayEmployees() {
		// TODO Auto-generated method stub
		
		
		String sqlquery = "select * from employees";
		try {
		
		
		st = jdcon.conn.prepareStatement(sqlquery);
		
			
		ResultSet rs = st.executeQuery(sqlquery); //fetch the data from a table
		while(rs.next())
		{
			
			System.out.println("Employee ID : " + rs.getInt("id") + " " + rs.getString("empname") + " " + rs.getInt("salary") + " " + rs.getString("dept"));
		}
		
		
		
		}
		catch(Exception e)
		{e.printStackTrace();}
		
		
	}

}
