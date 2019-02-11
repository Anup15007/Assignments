  

 import java.util.*;

 public class PersonMain
  {
	  
	  public static void main(String...args)
	  {   
	      
	      
		  Person object = new Person();
	      object.setFirstName("Vidya");
	      object.setLastName("Bharathi");
	      object.setGender('F');
	      String name = object.getFirstName();
	      String last = object.getLastName();
	      char gend = object.getGender();
	      Person object2 = new Person(name,last,gend);
		  object2.toString();
	  }
  }
