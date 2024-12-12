/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		BaseClass test = new BaseClass();
		myCharacter test1 = new myCharacter();
		
		System.out.println("Your role is "+test1.Role);
		System.out.println("Your stength is: "+test1.s);
		System.out.println("Your intelligence is: "+test1.i);
		System.out.println("Your dexterity is: "+ test1.d);
		System.out.println("Your charisma is: "+test1.c);
		
	}
}
