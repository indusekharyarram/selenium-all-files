package Inheritance;

public class App 
{
	public static void main(String args[]) 
	{
	Machine a=new Machine();
	a.Start();
	a.Stop();
	Car b=new Car();
	b.Start();
	b.Accelerate();
	b.ShowInfo();
	b.Stop();
    }
}

