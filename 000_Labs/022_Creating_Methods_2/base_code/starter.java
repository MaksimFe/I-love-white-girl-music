/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a,int b)
	{   
		
	int y = b;
	int c = 0;
	int sum = 1;
	
    while(y!=c) 
    {
        sum =sum*a;
         c=c+1;
    }
    
    return sum;
	}
	public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	System.out.println("What's your base number?");
	int first =scan.nextInt();
	System.out.println("What's your exponent number?");
	int second =scan.nextInt();
	System.out.println("Your answer is:");
	System.out.println(pow(first,second));



		
	}
}
