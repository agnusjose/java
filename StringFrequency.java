/*
 * File         :  StringPalindrome.java
 * Description  :  Java program to find frequency of a charecter in a string
 * Author       :  Agnus Jose
 * Version      :  1.0
 * Date         :  29/09/2023
 */
import java.util.Scanner;                     
public class StringFrequency {
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string");
			String input=sc.nextLine();
			System.out.println("Enter a character");
			char checkMe=sc.next().charAt(0);
			int charCount=checkFreq(input,checkMe);
			System.out.println("The number of occurence of character="+charCount);
		}
	}
	static int checkFreq(String input ,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++)
		{
			if(charArray[i]==checkMe)
			{
				charCount++;
			}
			
		}
		return charCount;
}
}