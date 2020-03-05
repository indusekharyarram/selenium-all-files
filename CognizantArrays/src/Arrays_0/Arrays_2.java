package Arrays_0;

public class Arrays_2 
{
	int E_Number;
	String E_Name;
	Arrays_2(int E_Number,String E_Name)
	{
		this.E_Number=E_Number;
		this.E_Name=E_Name;		
	}
	public static void main(String args[])
	{
		Arrays_2[] a;
		a=new Arrays_2[5];
		a[0]=new Arrays_2(1,"abcde");
		a[1]=new Arrays_2(2,"bcdea");
		a[2]=new Arrays_2(3,"cdeab");
		a[3]=new Arrays_2(4,"deabc");
		a[4]=new Arrays_2(5,"eabcd");

	for(int i=0;i<a.length;i++)
	{
		System.out.println("employee at " + i+ " : "+ a[i].E_Number+" "+a[i].E_Name);
	}
	
}
}
