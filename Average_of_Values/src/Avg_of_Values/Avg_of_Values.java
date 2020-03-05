package Avg_of_Values;
import java.util.Scanner;
public class Avg_of_Values 
{
	public static void main(String args[])
	{
		double a[]= {1,2,3,4,5},sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is :" +sum);
		double avg=(sum/a.length);
		System.out.println(avg);
	}
}
