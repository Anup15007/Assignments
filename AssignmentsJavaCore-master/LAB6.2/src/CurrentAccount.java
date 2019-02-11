
public class CurrentAccount extends Account 
{
	final float overDraftLimit=10000.0F;
	   
    public CurrentAccount(){}
    public CurrentAccount(long accNum,double balance, Person accHolder)
    {
    	super(accNum,balance,accHolder);
    }
    
    public void withdraw(double amount)
    {   boolean check=false;
    	if(amount<overDraftLimit && amount<balance)
    	{
    		balance = balance-amount;
    		check = true;
    		System.out.println(check);
    	}
    	
    	else System.out.println(check);
    }
    
}
