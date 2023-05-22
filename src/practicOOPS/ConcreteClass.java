package practicOOPS;

public class ConcreteClass extends Abstclass{
	
	public static void main (String[] args) {
		
		ConcreteClass c1 = new ConcreteClass();
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
	}


	public void m1() {
		
		System.out.println("Completed m1 method from ConcreteClass");
		
	}

	public void m2() {
		
		System.out.println("Completed m1 method from ConcreteClass");
		
	}
	
	public static void m4() {
		
		System.out.println("We have change the body of static method");
	}
	

}
