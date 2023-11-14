import java.util.Scanner;
public class BankException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		InvalidAmountException amountException = new InvalidAmountException("Invalid Amount");
		InsufficientFundsExceptions fundsException = new InsufficientFundsExceptions("Insufficient Funds");
		System.out.println("Enter number of customers:");
		int noOfCustomers=sc.nextInt();
		Customer[] cu = new Customer[noOfCustomers];
		for (int i=0; i<noOfCustomers; i++) {
			cu[i] = new Customer();
			cu[i].setCustomerDetails();
		}
		int choice=0;
		do {
			System.out.println("1.Display all account details");
			System.out.println("2.Search by account number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amount");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				for (int i=0; i<noOfCustomers; i++) {
					System.out.println("Customer No."+(i+1));
					cu[i].getCustomerDetails();
				}
				break;
			case 2:
				System.out.println("Enter Account Number:");
				int searchNumber=sc.nextInt();
				for (int i=0; i<noOfCustomers; i++) {
					if (searchNumber==cu[i].accountNumber) {
						cu[i].getCustomerDetails();
					}
				}
				break;
			case 3:
				System.out.println("Enter Account Number:");
				searchNumber=sc.nextInt();
				try {
					System.out.println("Enter Amount to deposit:");
					int depositAmount = sc.nextInt();
					if (depositAmount<=0) {
						throw amountException;
					}
					else {
						for (int i=0; i<noOfCustomers; i++) {
							if (searchNumber==cu[i].accountNumber) {
								cu[i].accountBalance+=depositAmount;
								cu[i].getCustomerDetails();
							}
						}
					}
				}
				catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter Account Number:");
				searchNumber=sc.nextInt();
				try {
					System.out.println("Enter Amount to withdraw:");
					int withdrawlAmount = sc.nextInt();
					if (withdrawlAmount<=0) {
						throw amountException;
					}
					else {
						for (int i=0; i<noOfCustomers; i++) {
							if (searchNumber==cu[i].accountNumber) {
								if (withdrawlAmount>cu[i].accountBalance) {
									throw fundsException;
								}
								else {
									cu[i].accountBalance-=withdrawlAmount;
									cu[i].getCustomerDetails();
								}
							}
						}
					}
				}
				catch (InvalidAmountException e){
					System.out.println(e.getMessage());
				}
				catch (InsufficientFundsExceptions e){
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while (choice<5);
	}
}

class Customer {
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc = new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("Enter Account number:");
		accountNumber=sc.nextInt();
		System.out.println("Enter Account type:");
		accountType=sc.next();
		System.out.println("Enter Customer name:");
		customerName=sc.next();
		System.out.println("Enter Account opening balance:");
		accountBalance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("CUSTOMER DETAILS\n");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println("************************");
	}
}

class InvalidAmountException extends Exception {
	InvalidAmountException(String str) {
		super(str);
	}
}

class InsufficientFundsExceptions extends Exception {
	InsufficientFundsExceptions(String str) {
		super(str);
	}
}