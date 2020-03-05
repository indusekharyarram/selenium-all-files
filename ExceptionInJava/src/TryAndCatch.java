import java.util.Scanner;

public class TryAndCatch {
public static void main(String []args) {
	float num,r,d;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	num = sc.nextInt();
	System.out.println("Enter the d");
	d=sc.nextInt();
	sc.close();
	try
	{
		r=num%d;
		System.out.println("the remainder is "+r);
	}
	catch                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            (.0Exception e)
	{
		System.out.println("cant define");
	}
	
}

}
