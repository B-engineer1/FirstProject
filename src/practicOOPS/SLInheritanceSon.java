package practicOOPS;

public class SLInheritanceSon extends SLInheritanceFather {
	
	public void mobile() {
		
		System.out.println("Mobile");
	}

	public static void main(String[]args){
		
		SLInheritanceSon s = new SLInheritanceSon();
		
		s.car();
		s.home();
		s.mobile();
		s.mony();
		
	}
	
}
