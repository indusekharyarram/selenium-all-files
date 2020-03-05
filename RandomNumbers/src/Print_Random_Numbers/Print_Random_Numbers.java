package Print_Random_Numbers;
import java.util.Random;
public class Print_Random_Numbers 
{
		public static void main(String args[]) 
		{
			Random r = new Random();
			int i;
			for(i=1;i<+10;i++)
			{
				System.out.print(r.nextInt(100) + " ");
			}
		}
}		
 