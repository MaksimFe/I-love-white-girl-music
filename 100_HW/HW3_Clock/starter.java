/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("What weekday it is  0 - 6:");
	System.out.println("0 = Sunday,1=Mon,2=Tues,3=Wed,4=Thurs,5=Fri,6=Sat.");
	int x = sc.nextInt();
	if(x==0)
	{
		System.out.println("It's a weekend.Wake up at 10:00");
	}
	else if(x==6)
	{
		System.out.println("It's a weekend.Wake up at 10:00");
	}
   else if(x==1)
	{
		System.out.println("It's a weekday.Wake up at 10:00");
	}
 else if(x==2)
	{
		System.out.println("It's a weekday.Wake up at 10:00");
	}
	else if(x==3)
	{
		System.out.println("It's a weekday.Wake up at 10:00");
	}
else 	if(x==4)
	{
		System.out.println("It's a weekday.Wake up at 10:00");
	}
else 	if(x==5)
	{
		System.out.println("It's a weekday.Wake up at 10:00");
	}
	else{
		System.out.println("You've decided not to choose");
	}
	}
}
