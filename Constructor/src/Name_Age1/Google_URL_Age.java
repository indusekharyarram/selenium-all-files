package Name_Age1;


public class Google_URL_Age 
{
	int age;
	String url;
	Google_URL_Age()
	{
		this.age=18;
		this.url="www.google.com";
	}
	Google_URL_Age(String n, int a) 
	{
		this.age=a;
		this.url=n;
	}
		
	public static void main(String args[])
	{
		Google_URL_Age p=new Google_URL_Age();
		Google_URL_Age q=new Google_URL_Age("www.google.com",18);
		System.out.println(p.url+" "+q.age);//accessing data through reference
		//accessing data through reference
	}
	}
