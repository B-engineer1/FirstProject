package day7;

public class Stringcontains {

	public static void main(String[] args) {
		
		String s1 = "India is Leading Superpower";
		String s2 = "Leading";
		String s3 = "Superpower";
		String s4 = "INDIA IS LEADING SUPERPOWER";
		
		System.out.println(s1.contains(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contains(s2));
		System.out.println(s2.contains(s3));
		System.out.println(s2.contains(s1));
		System.out.println(s1.contains(s3));
		System.out.println(s3.contains(s1));

	}

}
