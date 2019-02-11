package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.*;
import com.cg.eis.service.Service;
public class EmployeeInfo
{
   public static void main(String...args)
   { 
	long id; 
    String name;
    long salary; 
    String designation; 
    String insuranceScheme;
    
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter ID");
	  id = sc.nextLong();
	  System.out.println("Enter Name");
	  name = sc.next();
	  System.out.println("Enter Salary");
	  salary = sc.nextLong();
	  System.out.println("Enter Designation");
	  designation = sc.next();
	  
	  Service service = new Service();
	  insuranceScheme = service.findInsuranceScheme(salary,designation);
	  
	  Employee emp = new Employee(id,name,salary,designation,insuranceScheme);
      System.out.println(emp.toString());
   }
   
}
