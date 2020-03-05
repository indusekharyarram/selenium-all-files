package String1;
import java.util.Scanner;
public class String1 
{
	public static void main(String args[])
	{
		String a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String:");
		a=input.nextLine();
		int len=a.length();
		System.out.println("Number of characters in the string:" +len);
	}

}
