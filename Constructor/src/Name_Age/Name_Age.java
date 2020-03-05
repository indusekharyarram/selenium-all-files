package Name_Age;

public class Name_Age
{
		int age;
	    String name;
	    Name_Age(){
			this.age=20;
			this.name="Raju";
		}
	    Name_Age(String n, int a) 
				{
				this.age=a;
				this.name=n;
				}
			public static void main(String args[])
			{
				Name_Age obj1=new Name_Age();
				Name_Age obj2=new Name_Age("Raju",20);
				System.out.println(obj1.name+" "+obj1.age);//accessing data through reference
				System.out.println(obj2.name+" "+obj2.age);//accessing data through reference
			}
	}

