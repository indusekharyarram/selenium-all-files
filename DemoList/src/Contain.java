import java.util.ArrayList;

public class Contain {
	public static void main(String []args) {
	ArrayList <String>list1=new ArrayList<>();  //list1
	list1.add("sreepriya");
	list1.add("bindu");
	list1.add("anusha");
	list1.add("kavya");
	list1.add("ramya");
	
	System.out.println(list1.contains("sreepriya"));  //yes
	System.out.println(list1.contains("sree"));     //no

}
}
