package practicColllection;

import java.util.ArrayList;
import java.util.Collections;

public class ClassArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(100);
		
		System.out.println(list.size());
		
		System.out.println(list.set(3, 200));
		
		Collections.reverse(list);
		System.out.println(list);

		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Bus");
		list1.add("Truck");
		list1.add("Tractor");
		list1.add("Bike");
		list1.add("Car");
		list1.add("Train");
		
		Collections.sort(list1);
		
		System.out.println(list1);
	}

}
