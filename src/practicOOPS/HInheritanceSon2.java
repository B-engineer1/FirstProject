package practicOOPS;

public class HInheritanceSon2 extends HInheritanceMother {

	public void older() {
		
		System.out.println("Older");
		
	}
	
	public void responsible() {
		
		System.out.println("Responsible");
		
	}
	
	public static void main (String[] args) {
		
		HInheritanceSon1 s1 = new HInheritanceSon1();
		
		s1.bike();
		s1.mony();
		s1.petrol();
		s1.home();
		s1.flat();
		
		HInheritanceSon2 s2 = new HInheritanceSon2();
		
		s2.bike();
		s2.mony();
		s2.petrol();
		s2.older();
		s2.responsible();
	}
}
