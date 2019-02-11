
public class SavingAccount extends Account
{
    final float minimumBalance=1000.0F;
   
    public SavingAccount(){}
    public SavingAccount(long accNum,double balance, Person accHolder)
    {
    	super(accNum,balance,accHolder);
    }
   
    public void withdraw(double amount)
    {   
    	if((balance-amount)>=minimumBalance)
    	{
    		balance = balance-amount;
    		
    	}
    	
    	else System.out.println("Insufficient funds for saving account number "
    	      +super.getAccNum()+" and for name: "+super.getAccHolder().getName());
    }
    
    
}
