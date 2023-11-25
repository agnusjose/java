import java.util.StringTokenizer;
public class TokenString {
	public static void main(String [] args) {
String input=("this is a string");
StringTokenizer sr=new StringTokenizer(input," ");
while(sr.hasMoreTokens())
System.out.println(sr.nextToken());
}
}