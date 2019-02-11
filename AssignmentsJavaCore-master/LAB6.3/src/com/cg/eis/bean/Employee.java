package com.cg.eis.bean;
import com.cg.eis.exception.*;
public class Employee
{
	private long id; 
	private String name;
	private long salary; 
	private String designation; 
	private String insuranceScheme;
	
	public Employee(){}
	
	public Employee(long id,String name,long salary,String designation,
			        String insuranceScheme)
	{
		setId(id);
		setName(name);
		setSalary(salary);
		setDesignation(designation);
		setInsuranceScheme(insuranceScheme);
	}
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public long getSalary() 
	{
		return salary;
	}
	public void setSalary(long salary)
	{   
		try{
		if(salary>3000)
		this.salary = salary;
		else throw new EmployeeException();
	
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", name=" + getName() + ", salary=" + getSalary()
				+ ", designation=" + getDesignation() + ", InsuranceScheme="
				+ getInsuranceScheme() + "]";
	}
}
