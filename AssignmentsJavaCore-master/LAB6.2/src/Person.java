
public class Person extends Account 
{
  public String name;
  public int age;
  public Person(){}
  public Person(String name,int age)
  {
	  setName(name);
	  setAge(age);
	  
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	try{
		if(age>=15)
	    this.age = age;
		else throw new UserDefinedException();
} catch(UserDefinedException e)
	{
	e.printStackTrace();
	}
  
}
}