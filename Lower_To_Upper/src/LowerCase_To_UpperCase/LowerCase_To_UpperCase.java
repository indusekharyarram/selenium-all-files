package LowerCase_To_UpperCase;
import java.util.Scanner;
public class LowerCase_To_UpperCase 
{
	public static void main(String args[])
	{
		String a,result;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String in Lower_Case:");
		a=input.nextLine();
		result = a.toUpperCase();
		System.out.println(result);
	}

}
