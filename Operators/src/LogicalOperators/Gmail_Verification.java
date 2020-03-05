package LogicalOperators;
import java.util.Scanner;
public class Gmail_Verification
	{
		public static void main(String args[])
		{
			
			String a="indusekharyarram@gmail.com";
			String b="12345678";
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Username");
			String x = input.nextLine();
			System.out.println("Enter Password");
			String y = input.nextLine();
			if((x.equals(a))&&(y.equals(b)))
			{
				System.out.println("*****Welcome to Gmail*****");
			}
			else
				System.out.println("You entered wrong credentials");
			
		}
	}

