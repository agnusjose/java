/*
 * File         :  StringPalindrome.java
 * Description  :  Java program to find palindrome of a string
 * Author       :  Agnus Jose
 * Version      :  1.0
 * Date         :  29/09/2023
 */
import java.util.Scanner;
public class StringPlindrome {
public static void main(String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string");
			String input=sc.next();
			boolean isPalindrome=check(input);
			if(isPalindrome) {
				System.out.println("The given string is palindrome");
			}
			else{
				System.out.println("The given string is not palndrome");
			}
		}
}


                           
       
//
	private static boolean check(String input)
	{
		char[]charArray=input.toCharArray();
		int length=input.length();
		for(int i=0;i<length/2;i++)
		{
			if(charArray[i]!=charArray[length-i-1])
			{
			return false;	
		}
		}
		return true;
	}
}
		
	
	
	
	
