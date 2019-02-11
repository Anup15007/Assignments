package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	public EmployeeException(){
	System.out.println("Salary must be more than 3000 INR");
	System.exit(0);
	}
}
