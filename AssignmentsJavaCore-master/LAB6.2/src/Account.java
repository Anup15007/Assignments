
public class Account 
{  
   private long accNum;
   protected double balance;
   private Person accHolder;
   public Account(){}
   
	   public Account(long accNum,double balance,Person accHolder)
	   {
		   setAccNum(accNum);
		   setBalance(balance);
		   setAccHolder(accHolder);
	   }
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount)
	{   double transfer=amount;
		balance = balance + transfer;
	}
	
	

	@Override
	public String toString() {
		return "Account [accNum=" + getAccNum() + ", balance=" + getBalance()
				+ ", accHolder=" + accHolder.getName() + "]";
	}

	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double transfer = amount;
		   if(balance>transfer)
		   { 
			   balance = balance - transfer;   
			  
		   }
		System.out.println("current balance is:" +getBalance());
		   
	}

	
} 

