package Patterns;

import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//rows
		{
			for(int j=1;j<=n;j++)//columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
