package day6;

public class TwoDimArray {

	public static void main(String[] args) {
		
		//declaration
		
				// approach1
				
				/*int a[][]=new int[3][2];
				//int [][]a=new int[3][2];
				//int []a[]=new int[3][2];
				                    0     1        0 1 2
				a[0][0]=100;     0 100  200    0   2 4 5
				a[0][1]=200;     1 300  400    1   3 4 7 
				                 2 500  600 
				a[1][0]=300;
				a[1][1]=400;
				
				a[2][0]=500;
				a[2][1]=600;*/
				
				//appraoch2
				int a[][]= { {100,200},
							 {300,400},
							 {500,600} 
							};
				
				
				//length of array
				
				System.out.println(a.length); //3
				System.out.println(a[0].length); //2
				
				//read specific value
				//System.out.println(a[2][0]); //500
				

				//reading data from array using classic for loop
				
				/*for(int r=0;r<a.length;r++)//3  r=0 1 2 3
				{
					for(int c=0;c<a[r].length;c++) //2 c=0 1 2
					{
						System.out.print(a[r][c]+"   "); //100  200  300 400 500 600
					}
					
					System.out.println();
				}*/
				
				
				//reading data from 2d array using enhanced for loop
				
				for(int x[]:a)
				{
					for(int v:x)
					{
						System.out.print(v+"   ");
					}
					System.out.println();
				}
				

	}

}
