package day4;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
       // int num=11;
		
		if(num%2==0)//num%1==0 by using this you will get all even numbers 
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
