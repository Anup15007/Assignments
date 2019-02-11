import java.math.*;
import java.util.*;
public class ClientDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age. ");
		int age = sc.nextInt();
		
        long accNumSmith, accNumKathy;
        accNumSmith= (long)(Math.random()*100000);
		Person smith = new Person("Smith",age);
		accNumKathy = (long)(Math.random()*100000);
		Person kathy = new Person("kathy",age);

		SavingAccount accSmith = new SavingAccount(accNumSmith,2000.0,smith);
		accSmith.withdraw(2000.0);
		
		
		CurrentAccount accKathy = new CurrentAccount(accNumKathy,50000.0,kathy);
		accKathy.withdraw(1000);
		
		System.out.println("After transaction smith balance is:"+accSmith.getBalance());
		System.out.println("After transaction kathy balance is:"+accKathy.getBalance());
		System.out.println(accSmith.toString());
		System.out.println(accKathy.toString());
	}

}
