/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
public static boolean isLeapYear(int a)
{
	boolean number = a % 4 == 0;
	
	return number;
	
}
public static int getDigitSum(int a )
{
	int answer = a % 10; //5
	int answer1= (a/10) % 10; //4
	int answer2 = (a/100) % 10; //3
	int answer3 = (a/1000) % 10; //2
	int answer4 =(a/10000); 
	int answer5 = answer + answer1+answer2+answer3+answer4;
	return answer5;
}
public static boolean printIfConsecutive(int a, int b, int c)
{
	boolean nums =  (a < b) &&(b < c) ;
	return nums;
}
	public static void main(String args[]) {
		System.out.println("You will input a year number and it will tell wether it's leap or not.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		//System.out.println("");
		if(isLeapYear(year))
		{
			System.out.println(year + " is a leap year!");
		}
		else
		{
			System.out.println(year + " is not a leap year!");
		}

		System.out.println();
		System.out.println("This programm will tell you the sum of the numbers of the given integer");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("Input 3 numbers and it will tell if they're consecutive or not");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		if (printIfConsecutive(num1, num2, num3))
		{
			System.out.println(num1 +" "+ num2+" " + num3 + " are consecutive");
		}
		else 
		{
			System.out.println((num1) +" " +(num2) +" " +(num3) + " are not consecutive");
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
