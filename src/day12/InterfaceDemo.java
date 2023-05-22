package day12;

interface Shape
{
	int lenght=10;   // final & static
	int width=20;    // final & static
	
	void circle();   // abstract method- un-implemented
	
	default void sqaure()   // default method
	{
		System.out.println("this is sqaure- defualt method");
	}
	
	static void rectangle()   // static method
	{
		System.out.println("this is rectangle");
	}
	
}
public class InterfaceDemo implements Shape {

	public void circle()
	{
		System.out.println("this is circle ");
	}
	
	
	public static void main(String[] args) 
	{
		InterfaceDemo idobj=new InterfaceDemo();
		
		idobj.circle();
		idobj.sqaure();
		
		Shape.rectangle();   // static method can directly access
		
		//Shape sh=new Shape();   // incorrect
		
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.sqaure();
		
	}
}
