package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)  
		{
if(i==4 || i==9) //i==4 && i==4 in this case except 4 you will get all numbers Why? Condation is true by using && operator  
			{
				continue;// observe output
			}
			System.out.println(i);  
		}
		

	}

}
