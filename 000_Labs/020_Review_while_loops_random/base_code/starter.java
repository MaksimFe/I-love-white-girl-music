/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Please guess a number between 1 and 1000: ");
	 int secret =(int)(1 + Math.random()*1000);
	 int guess = scan.nextInt();
	
	while(guess!=secret)
	{
		if(guess!=secret)
		{
			if (guess<secret)
			{
				System.out.println("The number is too low!");
			}
			else if (guess>secret)
			{
				System.out.println("The number is too high!");
			}
			guess = scan.nextInt();
		}
	}
	if (guess == secret)
	{
		System.out.println("You've guessed it!!!");
	}
	}
}
