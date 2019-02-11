
public class UserDefinedException extends Exception
{
   public UserDefinedException()
   {
	   System.out.println("Please enter a valid name.");
	   System.exit(0);
   }
}
