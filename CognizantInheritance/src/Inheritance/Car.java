package Inheritance;

public class Car extends Machine {
	public void Start() {
	System.out.println("-----The car has Started-----");
	}
	public void Stop() {
	System.out.println("-----The car has Stopped-----");
	}
	public void Accelerate() {
	System.out.println("-----The car has Accelerated-----");
	}
	public void ShowInfo() {
	System.out.println("----Car Info----"+name);
	}
}
