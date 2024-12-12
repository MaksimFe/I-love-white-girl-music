/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please enter a number");
Scanner hi = new Scanner(System.in); 
int a = hi.nextInt();
int b = a+1;
int c = a+2;
int d = a+3;
int e = a +4;
int f = a +5;
System.out.print("Here's 5 next numbers: ");
System.out.print(a+" ");
System.out.print(b+ " ");
System.out.print(c+ " ");
System.out.print(d+ " ");
System.out.print(e+ " ");
System.out.println(f+ " ");

System.out.print("Here's multiples of this number: ");
System.out.print(a +" ");
System.out.print(a* 2 +" ");
System.out.print(a*3 +" ");
System.out.print(a*4 +" ");
System.out.print(a*5 +" ");
System.out.println(a*6+ " ");
System.out.println("Here's this number divided by a 100: ");
System.out.println((double) a /100);
System.out.println("Here's this number divided by 10: ");
System.out.println((double ) a/ 10);
	}
}
