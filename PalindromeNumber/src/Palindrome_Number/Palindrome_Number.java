package Palindrome_Number;
import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String args[]) 
	{
		int r, sum=0, temp,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=input.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("it is a Palindrome Number");
			else
				System.out.println("it is not a Palindrome Number");
			
		}
		
	}
