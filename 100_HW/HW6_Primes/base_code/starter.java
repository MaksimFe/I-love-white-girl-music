/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;



class starter {
	public static boolean checkPrime(int a)
{
	
	int  c = a;
	int b = c;
	int counter = 0;
	int num = 0;
	
	while (b>0&& counter<=2)
	{
			if ( c % b == 0)
			{
				/*System.out.println(b);*/
				counter++;
			}
		b--;
	}

	if(counter==2)
	{
		System.out.println(c);
		
	}
	/*else if ( counter != 2)
	{
		System.out.println("The number is not prime "+c);
		
	}*/
	return true;
}
public static int printPrimes(int b)
{
	
	int c = b;
	
	while (c>1)
	{
		checkPrime(c);
		c--;
	}
	return c;
}
	public static void main(String args[]) {
		Scanner word = new Scanner (System.in);
		System.out.println("Input an integer: ");
		System.out.println("The program will list every prime number before that integer.");
		int input = word.nextInt();
		System.out.println(" ");
		printPrimes(input);
		/*2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.*/
	}
}
