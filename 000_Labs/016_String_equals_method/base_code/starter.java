/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Would you like to be a Wizard , Warrior. or a Rogue");
		Scanner sc =new Scanner (System.in);
		String a = sc.nextLine();

		if (a.equals("Wizard"))
		{
			System.out.println("How inspiring that you chose to be a Wizard");
		}
		else if (a.equals("wizard"))
		{
			System.out.println("How inspiring that you chose to be a Wizard");
		}
	
		else if  (a.equals("Warrior"))
		{
			System.out.println("How cunning!");
		}
		else if (a.equals("warrior"))
		{
			System.out.println("How cunning");
		}
		
		else if  (a.equals("Rogue"))
		{
			System.out.println("YO-ho-ho-ho");
		}
		else if (a.equals("rogue"))
		{
			System.out.println("YO-ho-ho-ho");
		}
		else{
			
		System.out.println("You've decided not to choose a role");
		}
	}
}
