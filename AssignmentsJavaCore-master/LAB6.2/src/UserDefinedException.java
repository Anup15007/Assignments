
public class UserDefinedException extends Exception {

	public UserDefinedException()
	   {
		   System.out.println("Age must be greater than 15.");
		   System.exit(0);
	   }
}
