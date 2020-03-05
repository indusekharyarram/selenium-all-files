package UpperCase_To_LowerCase;
import java.util.Scanner;
public class UpperCase_To_LowerCase 
{
	public static void main(String args[])
		{
			String a;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter String in Upper_Case:");
			a=input.nextLine();
			String result;
			result = a.toLowerCase();
			System.out.println(result);
		}

}