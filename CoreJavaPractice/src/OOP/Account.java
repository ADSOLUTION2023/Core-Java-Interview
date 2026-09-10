package OOP;

public class Account {

	public Double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;

	}
	
	public void Deposit(int amt) {
		System.out.println("Total Bal : "+ balance);
		System.out.println("Deposited Money:"+ amt);
		balance = balance + amt;
		System.out.println("Balance after deposit:" + balance);
	}
	public void Withdrawal(int amt) {
		System.out.println("Total Bal : "+ balance);
		System.out.println("Withdrawn Money:"+ amt);
		balance = balance - amt;
		System.out.println("Balance after Withdraw:" + balance);
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(20000.0);
		a.Deposit(5000);
		a.Withdrawal(2300);
	}

}
