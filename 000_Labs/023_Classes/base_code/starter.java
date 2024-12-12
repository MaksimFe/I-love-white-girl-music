/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
 class Character{
	String Role = new String("Warrior");
	int s = 5;
	int i =5;
	int d = 5;
	int c = 5;
}
public class starter {
	public static void main(String args[]) {
		
		Character war = new Character();
		
		System.out.println("Your role is "+war.Role);
		System.out.println("Your stength is: "+war.s);
		System.out.println("Your intelligence is: "+war.i);
		System.out.println("Your dexterity is: "+ war.d);
		System.out.println("Your charisma is: "+war.c);
	}
}
