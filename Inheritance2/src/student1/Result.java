package student1;

public class Result {

	public void result() 
	{
		int Marks_Obtained;
		System.out.println("Obtained_Marks: ");
		Scanner input=new Scanner(System.in);
		Marks_Obtained= input.nextInt();
		input.close();
		if(Marks_Obtained>=60)
		System.out.println("Student Passed");
		else
		System.out.println("Student Failed");

	}
	}
