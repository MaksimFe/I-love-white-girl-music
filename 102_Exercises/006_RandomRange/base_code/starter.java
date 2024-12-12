/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Write 2 integers");
	System.out.println("Second number should be bigger than the first one");
	Scanner sc=new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	if (y>x)
	{
		System.out.println("Here's 5 numbers between this range:");
		System.out.println((int)(x+Math.random()*y+1-x));
		System.out.println((int)(x+Math.random()*y+1-x));
		System.out.println((int)(x+Math.random()*y+1-x));
		System.out.println((int)(x+Math.random()*y+1-x));
		System.out.println((int)(x+Math.random()*y+1-x));
	}
	}
}
