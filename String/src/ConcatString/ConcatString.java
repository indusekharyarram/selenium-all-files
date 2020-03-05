package ConcatString;

import java.util.Scanner;

public class ConcatString {
	public static void main(String args[])
	{
		String a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String a:");
		a=input.nextLine();
		System.out.println("Enter String b:");
		b=input.nextLine();
		a=a.concat(b);
		System.out.println("After Concatenation of a and b the string is: "+a);
	}

}
