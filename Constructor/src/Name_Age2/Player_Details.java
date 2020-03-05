package Name_Age2;
public class Player_Details {
		int age,hun,fif;
		String PlayerName,DoB;
		Player_Details()  
		{
			this.age=18;
			this.hun=2;
			this.fif=1;
			this.DoB="18Jan2000";
			this.PlayerName="Raju";
		}
		Player_Details(String m, String n,int a,int b,int c) 
		{
			this.age=a;
			this.hun=b;
			this.fif=c;
			this.DoB=m;
			this.PlayerName=n;
		}
			
		public static void main(String args[])
		{
			Player_Details p=new Player_Details();
			Player_Details q=new Player_Details();
			Player_Details r=new Player_Details();
			Player_Details s=new Player_Details();
			Player_Details t=new Player_Details();
			System.out.println("PlayerName:		"+t.PlayerName);
			System.out.println("Age: 			"+p.age);
			System.out.println("Number of Hundreds: 	"+q.hun);
			System.out.println("Number of Fifties: 	"+r.fif);
			System.out.println("Date of Birth:		"+s.DoB);
		}
		}

