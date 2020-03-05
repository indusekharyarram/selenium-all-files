package Fibonacci_Series;
import java.util.Scanner;
public class Fibonacci_Series {
	public static void main(String args[])
	{
		int n1=0,n2=1,count,i,sum;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		count=input.nextInt();
		System.out.println("Fibonacci of first "+count+" numbers:");
		for(i=1;i<=count;i++)
		{
			System.out.printf(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
