package day5;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)  //1  2   3
		{
			if(i==5)
			{
				break;//terminates the loop immediately, and the control of the program moves to the next statement following the loop
			}
			System.out.println(i);  //1  2
		}


	}

}
