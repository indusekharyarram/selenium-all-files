import java.util.ArrayList;

public class Clone {
	 public static void main(String []args) {
			ArrayList <String>list1=new ArrayList<>();  //list1
			list1.add("sreepriya");
			list1.add("bindu");
			list1.add("anusha");
			list1.add("kavya");
			list1.add("ramya");
			
			ArrayList<String> list2=new ArrayList<>();  //list2
			list2.add("riya");
			list1.clone();
			System.out.println(list1);
			ArrayList<String> arrayListClone =  (ArrayList<String>)list2.clone();
			System.out.println(list1);
	         //combined list
		}
		}
	        




