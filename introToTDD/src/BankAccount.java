
public class BankAccount {

	private int balance;

	public int getBalance(){
		return balance;
	}
	
	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;
	}

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		balance -= i;
	}

}
