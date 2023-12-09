package day1;

public class Demo1 {

	public static void main(String[] args) {
		
		int num[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		
		for (int i = 0; i < num.length; i++)
		{
			for (int j = i+1; j < num.length; j++)
			{
				if (num[i]==num[j])
				{
					System.out.println("Duplicate element found"+num[i]);
				}
			}
		}
		
	}

}
