package LeapYear;
import java.util.Scanner;
public class Leap_Year {
	public static void main(String args[])
	{
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Year");
		year=input.nextInt();
		if(year%4==0)
			System.out.println(year+" is a Leap Year");
		else
		System.out.println(year+"is not a Leap Year");
	}

}
