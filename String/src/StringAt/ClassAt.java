package StringAt;
import java.util.Scanner;
public class ClassAt {
	public static void main(String args[])
	{
		String a;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String:");
		a=input.nextLine();
		int n;
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter nth Position: ");
		n=input1.nextInt();
		int b=a.length();
		System.out.println("String length is: "+b);
		char ch=a.charAt(n);
		System.out.println("Character at" +n+ " Position is : " +ch);		
		
	}

}
