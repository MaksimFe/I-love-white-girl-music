/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your dog's age");
		int dogsage = scan.nextInt();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input your dog's name");	
		String dogsname = input.nextLine();
		
		Dog Max = new Dog(dogsname,dogsage);
		System.out.println("Here's your dog's name and age");
		System.out.println(Max.getName());
		System.out.println(Max.getAge());
		Max.isSleeping();
		if (Max.isSleeping()== true)
		{
			System.out.println("Your dog is sleeping");
		}
		else
		Max.bark();
		
		
		
		
		System.out.println("Create your next dog");
		
		System.out.println("Input your dog's age");
		int darushage =scan.nextInt();
		
		System.out.println("Input your dog's name");
		String darushname = input.nextLine();
		
		System.out.println("This is your dog's name and age:");
	
		Dog Darush = new Dog(darushname, darushage);
		System.out.println(Darush.getName());
		System.out.println(Darush.getAge());
		
		if(Max.isSleeping() == false && Darush.isSleeping()==true){
		Darush.bark();
		}
		else if (Max.isSleeping()==false && Darush.isSleeping()==false){
		Darush.bark();
		}
	

	}
}
