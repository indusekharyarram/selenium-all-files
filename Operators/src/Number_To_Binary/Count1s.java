package Number_To_Binary;
import java.util.Scanner;
public class Count1s {
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter a number: ");
		Scanner input=new Scanner(System.in);
		number= input.nextInt();
		System.out.println("The Number of One's in:" + " "+number+"("+Integer.toBinaryString(number)+ ") ");
		int result=countOne(number);
		System.out.println("is: "+result);
		input.close();
	}
static int countOne(int n)
{
	int count=0;
	while(n>0)
	{
		n=n&(n-1);
		count++;
	}
return count;
}
}
