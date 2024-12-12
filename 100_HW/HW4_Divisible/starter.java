/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your first integer: ");
	int f = scan.nextInt();
	System.out.println("Please enter your second integer: ");
	int s = scan.nextInt();
	
	if(f%2 == 0)
	{
		System.out.println('\n'+"The number "+ f+ " is even");
	}
	else if (f%2 != 0)
	{
		System.out.println('\n'+"The number "+f+ " is odd");
	}
	if(f%3==0)
	{
		System.out.println("It's divisible by 3");
	}
	if(f%4==0)
	{
	System.out.println("It's divisible by 4");	
	}
	if(f%5==0)
	{
		System.out.println("It's divisible by 5");
	}
	else if (f%3 != 0 && f%4 != 0 && f%5 != 0)
	{
		System.out.println("It's not divisible by 3,4,5.");
	}
	
	if(s%2 == 0)
	{
		System.out.println('\n'+"The number "+ s+ " is even");
	}
	else if (s%2 != 0)
	{
		System.out.println('\n'+"The number "+s+ " is odd");
	}
	
	
	
	if(s%3==0)
	{
		System.out.println("It's divisible by 3");
	}
	if(s%4==0)
	{
	System.out.println("It's divisible by 4");	
	}
	if(s%5==0)
	{
		System.out.println("It's divisible by 5");
	}
	else if (s%3 != 0 && s%4 != 0 && s%5 != 0)
	{
		System.out.println("It's not divisible by 3,4,5.");
	}
	
	
	}
}
