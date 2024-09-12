/**1)	Create a base class BankAccount with methods like deposit() and withdraw(). 
 * Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the 
 * withdrawal amount. Write a program that demonstrates the use of overridden methods and proper 
 * access modifiers & return the details.*/

package in.assignmet5.Quest1;

class BankAccount {
	
    double balance;
	 double withDraw;
	 double deposite;
	
	public BankAccount() {
		
	}
	
	public void withDraw() {
		//balance = balance - withDraw;
	}
	
	public void deposite() {
		
	}
	
	public void setWithDraw(double withDraw) {
		this.withDraw = withDraw;
	}
	
	public double getWithDraw() {
		return withDraw;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

}

class SavingAccount extends BankAccount{
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withDraw() {
		if(this.balance>this.withDraw) {
			this.balance = this.balance - this.withDraw;
			
			System.out.println(this.getWithDraw() +" the amout withdraw ");
			System.out.println("Balance remaing :"+this.getBalance());
		}else {
			System.out.println("Insufficent balance");
		}
	}
}

public class Program1 {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		
		System.out.println("1st senario :");
		sa.setBalance(10000);
		sa.setWithDraw(4000);
		sa.withDraw();
		
		System.out.println("\n\n2nd senario :");
		sa.setBalance(4000);
		sa.setWithDraw(10000);
		sa.withDraw();
	}

}
