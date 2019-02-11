  

 import java.util.*;

 public class PersonMain
  {
	  
	  public static void main(String...args)
	  {   
		  String fName=null, lName=null;
	      try
	      {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your First Name");
	      fName = sc.nextLine();
	      System.out.println("Enter your Last Name");
	      lName = sc.nextLine();
	      if(fName.equalsIgnoreCase("")||lName.equalsIgnoreCase(""))
	      throw new UserDefinedException();
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }
		  Person object = new Person();
	      object.setFirstName(fName);
	      object.setLastName(lName);
	      object.setGender('M');
	      String name = object.getFirstName();
	      String last = object.getLastName();
	      char gend = object.getGender();
	      Person object2 = new Person(name,last,gend);
		  
	  }
  }
