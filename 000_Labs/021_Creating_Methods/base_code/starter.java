/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static String toString(String a)
	{
		String first = new String();
		first = a;
		return first;
	}
	
	public static String toStringCombined(String a,String b)
	{
	String first = new String();
		first = a;
	String second = new String();
		second = b;
		String sum = new String(first+" "+second);
		return sum;
	}
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Write a sentence!");
	String high = scan.nextLine();
	System.out.println("Write a sentence!");
	String low = scan.nextLine();
	
	System.out.println("This is what you wrote:");
	System.out.println(toString(high));
	System.out.println(toStringCombined(high,low));
	
		
	}
}
