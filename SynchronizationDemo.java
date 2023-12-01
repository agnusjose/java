import java.util.Scanner;
class MultiplicationTable{
	synchronized void printMultiplicationTable(int number){
		for(int i=1;i<=10;i++)
		{
		System.out.println(i+"x"+number+"="+i*number);
	}
		
	}
}
	class MyThread1 extends Thread{
		int n1;
		Scanner sc=new Scanner(System.in);
		MultiplicationTable t1;
		MyThread1(MultiplicationTable t){
			this.t1=t;
		}
		public void getNumber() {
			System.out.println("enter the table you want to run by thread1");
		    n1=sc.nextInt();
		}
		public void run() {
			System.out.println("priority of thread 1="+Thread.currentThread().getPriority());
			t1.printMultiplicationTable(n1);
		}
	}

	class MyThread2 extends Thread{
		int n2;
		Scanner sc=new Scanner(System.in);
		MultiplicationTable t2;
		MyThread2(MultiplicationTable t){
			this.t2=t;
		}
		public void getNumber() {
			System.out.println("enter the table you want to run by thread2");
		    n2=sc.nextInt();
		}
		public void run() {
			System.out.println("priority of thread 2="+Thread.currentThread().getPriority());
			t2.printMultiplicationTable(n2);
		}
	}

	
class MyThread3 extends Thread{
	int n3;
	Scanner sc=new Scanner(System.in);
	MultiplicationTable t3;
	MyThread3(MultiplicationTable t){
		this.t3=t;
	}
	public void getNumber() {
		System.out.println("enter the table you want to run by thread3");
	    n3=sc.nextInt();
	}
	public void run() {
		System.out.println("priority of thread 3="+Thread.currentThread().getPriority());
		t3.printMultiplicationTable(n3);
	}
}


public class SynchronizationDemo {
public static void main(String [] args) {
	MultiplicationTable m=new MultiplicationTable();
	MyThread1 t1=new MyThread1(m);
	MyThread2 t2=new MyThread2(m);
	MyThread3 t3=new MyThread3(m);
	t1.getNumber();
	t2.getNumber();
	t3.getNumber();
	t1.start();
	t2.start();
	t3.start();
	}
}