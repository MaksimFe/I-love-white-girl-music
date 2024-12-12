/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()* 10);
		int  y = (int)(1 +Math.random()*99);
		double a = (2.5+Math.random()*0.99);
		double b = (14 + Math.random()* 575);
		System.out.println(x + "\n" + y+ "\n"+a + "\n"+ b);
	}
}
