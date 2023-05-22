package practicOOPS;

public class RunPolymorphism2 extends RunPolymorphism1{
		
		public void mobile() {
			
			System.out.println("Mobile : I phone 14 pro max");
		}

		public static void main(String[]args){
			
			RunPolymorphism2 s = new RunPolymorphism2();
			
			s.home();
			s.mony();
			s.car();
			s.mobile();
			
			//Method Over-riding
			

	}

}
