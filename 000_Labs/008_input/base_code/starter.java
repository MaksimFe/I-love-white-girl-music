/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
public static void main(String args[]) {
	Scanner a = new Scanner (System.in);
	Scanner z = new Scanner (System.in);
	System.out.println("Write you name,age,birthday month, birthday day, birthday year, and how much is a buck fifty in this order.");
	String b = z.nextLine();
	int num = a.nextInt();
	String c = z.nextLine();
	int num1 = a.nextInt();
	int num2 = a.nextInt();
	double num3 = a.nextDouble();
	System.out.println("So your name is "+ b+ " and you're " + num+ ". Your birthday month is "+ c + ", while the day is "+num1+" and the year is "+ num2+". Finally you think the buck fifty is "+ num3 );
	}
}
