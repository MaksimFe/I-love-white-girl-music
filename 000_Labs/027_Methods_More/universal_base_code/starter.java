/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Character2 test = new Character2();
	
	test.setRole("No role");
		System.out.println("Now you''ll have to input your role.");
		System.out.println("Your choice is wizard, rogue, warrior");
 String input = new String();
	Scanner scan = new Scanner(System.in);
	input = scan.nextLine();
		if (test.setAll(input,5,5,5,5) == true)
		{
			System.out.println("You role and stats are: "+ input);
		test.setStrength(5);
		test.setDexterity(5);
		test.setIntelligence(5);
		test.setCharisma(5);
		}
		else if (test.setAll(input,5,5,5,5)==false)
		{
			System.out.println("You role and stats are: No Role");
		test.setStrength(0);
		test.setDexterity(0);
		test.setIntelligence(0);
		test.setCharisma(0);
		}
	}
}
