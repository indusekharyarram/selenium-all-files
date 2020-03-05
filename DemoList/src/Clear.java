import java.util.ArrayList;

public class Clear {
	  public static void main(String []args) {
			ArrayList <String>list1=new ArrayList<>(2);  //list1
			list1.add("sreepriya");
			list1.add("bindu");
			list1.add("anusha");
			list1.add("kavya");
			list1.add("ramya");
			
			
			System.out.println(list1);  
			list1.ensureCapacity(20);
		list1.add("sree");
		list1.add("vemu");
		System.out.println("list1");
	  }
	  
		}
	        
	




