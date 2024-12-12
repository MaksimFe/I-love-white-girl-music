/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sent = scan.nextLine();
		System.out.println("Letter by letter:");
		for(int i= 0;i<sent.length();i++)
		{
			System.out.print(i+" ");
			System.out.println(sent.substring(i,i+1)+" ");
		}
		System.out.println("\n");
		/*for(int i= 0;i<sent.length();i++)
		{
			System.out.println(sent.substring(i,i+1));
		}*/
		


		
	}
}
