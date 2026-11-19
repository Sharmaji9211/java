package OOPs;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private int balance;

	
	
	public BankAccount(int accountNumber, String accountHolderName, int balance) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getAccount_number() {
		return accountNumber;
	}

	public void setAccount_number(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccount_holder_name() {
		return accountHolderName;
	}

	public void setAccount_holder_name(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}


	public void withdraw(int withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
		    balance = balance - withdrawAmount;
		} else {
		    System.out.println("Invalid withdrawal amount");
		}

	}
	public void deposite(int depositAmount) {
		if (depositAmount > 0) {
		    balance = balance + depositAmount;
		} else {
		    System.out.println("Invalid deposit amount");
		}
		
	}
	 public void displayBalance() {
		 System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Available Balance: " + balance);
	 }
	
	public static void main(String[] args) {
	   BankAccount Acc1 = new BankAccount(123,"Shivam",10000);
	   Acc1.displayBalance();
	  Acc1.deposite(5000);
	  Acc1.displayBalance();
	   Acc1.withdraw(3000);
	   Acc1.displayBalance();

	}

}
