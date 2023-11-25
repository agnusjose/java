import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokens {
	public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter integers:");
String data=sc.nextLine();
int sum=0;
StringTokenizer sr=new StringTokenizer(data,",");
while(sr.hasMoreTokens()) {
	String token=sr.nextToken();
	int num=Integer.parseInt(token);
		sum+=num;
	}System.out.println("sum="+sum);
}
}