/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int balance = 100;
	Scanner money = new Scanner (System.in);
	
	
	
   while(balance!=0){
   	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("Would you like to play slots? (Select Yes/yes/Y/y) ");
	String ask = money.nextLine();
	if(ask.equals("yes") ||ask.equals("Yes") ||ask.equals("y") || ask.equals("Y"))
	{
	System.out.println("Great let's play!");
	System.out.println("You have: "+balance + "$");
	System.out.print("How much would you like to wager? ");
	int wager = money.nextInt();
	
		if (wager<= balance && wager>= 0)
		{
		int x = (int)(1+ Math.random()* 10);
		int y = (int)(1+ Math.random()* 10);
		int z = (int)(1+ Math.random()* 10);
		System.out.println("Your roles are:");
		System.out.println (x+ " "+ y+ " "+z );
			if ( x == y || y == z || z== x)
			{
				balance = balance + wager ;
				System.out.println("Your balance now is: "+balance+ "$");
			}
			else if ( x == y && x == z)
			{
				balance = balance + (wager * 2);
				System.out.println("Your balance now is: "+balance+ "$");
			}
			else if ( x != y && x != z && y != z  )
			{	System.out.println("You've lost ");
					balance = balance - wager;
				System.out.println("Your balance now is: "+balance + "$");
			}
		}
		 if (wager > balance)
		{
			while(true){
			System.out.print("Enter a lower number: ");
			 wager = money.nextInt();
			 
			 if (wager<= balance && wager>= 0)
		{
		int x = (int)(1+ Math.random()* 10);
		int y = (int)(1+ Math.random()* 10);
		int z = (int)(1+ Math.random()* 10);
		System.out.println("Your roles are:");
		System.out.println (x+ " "+ y+ " "+z );
			if ( x == y || y == z || z== x)
			{
				balance = balance + wager ;
				System.out.println("Your balance now is: "+balance+ "$");
				break;
			}
			else if ( x == y && x == z)
			{
				balance = balance + (wager * 2);
				System.out.println("Your balance now is: "+balance+ "$");
				break;
			}
			else if ( x != y && x != z && y != z  )
			{	System.out.println("You've lost ");
					balance = balance - wager;
				System.out.println("Your balance now is: "+balance + "$");
				break;
			}
		
			}
				else if (balance == 0)
			{
				break;
		}
				
			}
			
		}
}
	   
	   
	  else  if(ask.equals("no") ||ask.equals("No") ||ask.equals("N") || ask.equals("n"))
	  {
	  	System.out.println("Goodluck next time!!!");
	  	break;
	  }
	if (balance == 0)
	{
		
		System.out.println("Unluck.");
		System.out.println("Goodluck next time!!!");
		break;
	}
   }

	
	
	
/*	while (balance != 0){
	
	System.out.println("Would you liek to play slots? (Select Yes/yes/Y/y) ");
	String ask = money.nextLine();
	if(ask.equals("yes") ||ask.equals("Yes") ||ask.equals("y") || ask.equals("Y"))
	{
		
	System.out.println("Great let's play!");
	System.out.println("You have: "+balance1);
	System.out.println("How much would you like to spend?"); 
	int wager = money.nextInt();
	}
		
	}

	
	}*/
}
}




