/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
   
public static void main(String args[]) {
    System.out.println(Math.max(13-6*11, 30%7*(-2)));
    System.out.println(Math.sqrt(3*8+31%7));
    System.out.println(Math.pow(37/3, 35%21));
    System.out.println(Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
    System.out.println("");
System.out.println("EXTRA");
System.out.println("Please enter 2 doubles");
Scanner scan = new Scanner(System.in);
double x = scan.nextDouble();	
double y = scan.nextDouble();
System.out.println(" ");
System.out.print("The square root of the second number is: ");
System.out.println(Math.sqrt(y));

System.out.print("The biggest of this 2 numbers is: ");
System.out.println(Math.max(x,y));

System.out.print("First number to the power of second one is: ");
System.out.println(Math.pow(x,y));

	}
}
