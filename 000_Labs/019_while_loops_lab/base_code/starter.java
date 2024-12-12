/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner scan= new Scanner(System.in);
System.out.println("Please enter your name: ");
String name = scan.nextLine();
System.out.println("How many times you want it to be repeated: ");
int a  = scan.nextInt();
System.out.println("");
int b = 1;
while(b<=a)
{
	System.out.println(name);
	b = b+1;
}

		
	}
}
