package Overriding;

class Parent {
	void methodOfParentClass() {
		System.out.println("Parent's method()");
	}
}
class Child extends Parent {
	void methodOfParentClass() {
		System.out.println("Child's method()");
	}
}
public class Overriding1 {
public static void main(String args[]) 
{
	Parent a=new Parent();
	a.methodOfParentClass();
	Parent b=new Child();
	b.methodOfParentClass(); 
}
}
