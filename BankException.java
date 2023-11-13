package projects;
import java.util.Scanner;
class Customer{
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("enter account number");
		accountNumber=sc.nextInt();
		System.out.println("enter account type");
		accountType=sc.next();
		System.out.println("enter customer name");
		customerName=sc.next();
		System.out.println("enter account opening balance");
		accountBalance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("the customer details are:");
		System.out.println("Account number:"+accountNumber);
		System.out.println("Account type:"+accountType);
		System.out.println("Customer name:"+customerName);
		System.out.println("Account balance:"+accountBalance);
	}
	public void searchAccountNumber(){
		
	}
}
public class BankException {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of customers");
	int noOfCustomers=sc.nextInt();
	Customer [] cu=new Customer[noOfCustomers];
	for(int i=0;i<noOfCustomers;i++) {
		cu[i]=new Customer();
		cu[i].setCustomerDetails();
	}
	for(int i=0;i<noOfCustomers;i++) {
		cu[i].getCustomerDetails();
	}
	int choice;
	do {
		System.out.println("1.Displsy account details");
		System.out.println("2.Search by account number");
		System.out.println("3.Deposit the amount");
		System.out.println("4.Withdraw the amount");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<noOfCustomers;i++) {
				cu[i].getCustomerDetails();
			}
			break;
		case 2:{
		System.out.println("enter the account number");
		int searchAccount=sc.nextInt();
		for(int i=0;i<noOfCustomers;i++) {
			if(cu[i].accountNumber==searchAccount) {
				cu[i].getCustomerDetails();
			}
		}
		}
		break;
		case 3:{
			System.out.println("enter the account number");
			int searchAccount=sc.nextInt();
			System.out.println("enter the amount to deposite");
			int depositeAmount=sc.nextInt();
			for(int i=0;i<noOfCustomers;i++) {
				if(cu[i].accountNumber==searchAccount) {
					cu[i].accountBalance=cu[i].accountBalance+depositeAmount;
				}
				cu[i].getCustomerDetails();
			}
		}
			default:
		}
	}while(choice<5);
}
}
