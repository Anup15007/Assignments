package com.cg.eis.service;

import java.util.*;
import com.cg.eis.bean.*;

public class Service implements EmployeeService
{
  public String findInsuranceScheme(long salary,String designation)
  {   
	  String insuranceScheme;
	  
	  if(salary>5000 && salary<20000 && 
		designation.equalsIgnoreCase("System Associate"))
	  {
		insuranceScheme = "Scheme C";  
	  }
	  
	  else if(salary>=20000&& salary<40000 && 
		designation.equalsIgnoreCase("Programmer"))
	  {
		insuranceScheme = "Scheme B";  
	  }
	  
	  else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
	  {
		insuranceScheme = "Scheme A";  
	  }
	  else insuranceScheme = "No Scheme";
	  
	  return insuranceScheme;
	  
  }
}
