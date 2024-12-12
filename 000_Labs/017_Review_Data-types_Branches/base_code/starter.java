/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner hello = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = hello.nextLine();
		System.out.println("Enter your title");
		String title =hello.nextLine();
		int hi = 20;
///////////////////////////////////////////////////////////////////////
		System.out.println("Now you have to choose your role: ");
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
///////////////////////////////////////////////////////////////////////////////
		String strength = new String("Strength");
		String dexterity = new String("Agility");
		String intelligence = new String("Intelligence");
		String charisma = new String("Charisma");
		System.out.println("Now you have 20 points and you need to spend them on 4 following trats:strength, dexterity,intelligence, and charisma ");
		System.out.println("You can spend maximum of 10 on each one");
		System.out.println(strength + " - Buff and able to carry larger items (1-10)");
		Scanner scan = new Scanner(System.in);
		int g = scan.nextInt();
		int answer = hi-g ;
		
		if (answer>=0 && g<=10)
		{
			System.out.println("You have this much points left: " + answer);
		}
		else if  (g>10)
		{
		System.out.println("Please enter a smaller number");
		int g1 = scan.nextInt();
		answer = hi-g1;
		System.out.println("You have this much points left: " + answer);
		}
		
		System.out.println(dexterity + " - Agile and moves quickly ");
		Scanner scan1 = new Scanner(System.in);
		int d = scan1.nextInt();
		int answer1 = answer-d;
		if (answer1>=0 && d<=10)
		{
			System.out.println("You have this much points left: " + answer1);
		}
		else if  (d>10)
		{
		System.out.println("Please enter a smaller number");
		int d1 = scan.nextInt();
		answer1 = answer-d1;
		System.out.println("You have this much points left: " + answer1);
		}
	
		System.out.println(intelligence + " - Better at magic spells ");
		Scanner scans = new Scanner(System.in);
		int m = scans.nextInt();
		int answer2 = answer1-m;
		if (answer2>=0 && m<=10)
		{
			System.out.println("You have this much points left: " + answer2);
		}
		else if  (m>10)
		{
		System.out.println("Please enter a smaller number");
		int m1 = scan.nextInt();
		answer2 = answer1-m1;
		System.out.println("You have this much points left: " + answer2);
		}
	
		System.out.println(charisma + " - How personable ");
		Scanner scanss = new Scanner(System.in);
		int v = scanss.nextInt();
		int answer3 = answer2-v;
		if (answer3>=0 && v<=10)
		{
			System.out.println("You have this much points left: " + answer3);
		}
		else if  (v>10 && answer3 <0)
		{
		System.out.println("Please enter a smaller number");
		int v1 = scanss.nextInt();
		answer3 = answer2-v1;
		System.out.println("You have this much points left: " + answer3);
		}
		
		int o= hi-answer;
		int big = -1*(answer1 - answer);
		int big1 = -1 *(answer2-answer1);
		int big2 = -1 * (answer3-answer2);
		
			System.out.println('\n'+"Your name is: "+name);
			System.out.println("You're title is: "+ title);
			System.out.println("You've spent: "+ o+ " on Strength");
			System.out.println("You've spent: " + big + " on Agility");
			System.out.println("You've spent: "+ big1+ " on Dexterity ");
			System.out.println("You've spent: "+ big2+ " on Charisma ");
		
	}
}
