/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		int i;
		Donkey donkey = new Donkey();
		 Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			String statement = new String(shrek.name + " IS UGLY!");
			System.out.println(statement);
		}
		
		donkey.interact(shrek.name);
		
		for( i = 0; i < 5; i++){
			shrek.interact(donkey.name);
			
		}
		System.out.println("That printed out " + i + " times");
	

	}
}
