package javalab;
import java.io.IOException;
import java.util.Scanner;
public class TryCatch {
public static void main(String [] args) {
	System.out.println("Program to perform division");
	Scanner sc=new Scanner(System.in);
	char ch='y' ;
	do {
	System.out.println("enter 1st number");
	int num1=sc.nextInt();
	System.out.println("enter 2nd number");
	int num2=sc.nextInt();
	try {
	    int res=num1/num2;
	    System.out.println("result="+res);
	}
	catch(Exception e){
		System.out.println("division by zero");
	}
	finally {
		System.out.println("end of operation");
	}
	System.out.println("do you want to continue?(y/n)");
	ch=sc.next().charAt(0);
	}while(ch=='y');
}
}
