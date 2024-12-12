/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
			
	int x =(int)(1+Math.random()*1000);
	System.out.println("You have to guess a number between 1 and a 1000");
	Scanner sc = new Scanner(System.in);
	
	boolean c = true;
	
	if (c = true)
	{

			int y=sc.nextInt();
			if(x!=y)
			{
				 c = true;
				 
				System.out.println("The number was "+x+", guess again...");
			}
			else
			{
			System.out.println("You've got it");
			c = false;
			}
	}
	
	
	
	
	
	
	
 }
}
