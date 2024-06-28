package com.wipro.employeemain;

import com.wipro.dao.*;

import java.sql.SQLException;
import java.util.Scanner;


//controller class
public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		int choice ;
		Scanner sc = new Scanner(System.in);
	    
		//Controller(Main) will interact with service layer ( EmplyeeDaoImpl)
		EmplyeeDaoImpl eDao = new EmplyeeDaoImpl();
		
		do
		{
			System.out.println("*********Employee Management System : ************");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. Display All Employees");
			System.out.println("0. Exit");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: eDao.addEmployee();
				break;
			case 2: eDao.updateEmployee();
				break;
			case 3: eDao.deleteEmployee();
				break;
			case 4: eDao.searchEmployee();
				break;
			case 5: eDao.displayEmployees();
			break;
			case 0:System.out.println("You have exited :");
			    break;
				
			default:System.out.println("Invalid input ! please try again ");
			
			
			}
		}
		while(choice!=0);

	}

}
