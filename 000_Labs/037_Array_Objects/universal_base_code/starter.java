/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int i = 0;
		int b = 0;
		int amount = 100;
		Wizard[] w = new Wizard[amount];
		w[i] = new Wizard();
		Warrior[] wa = new Warrior[amount];
		wa[b] = new Warrior();
		int count = 0;
		int c = 0;
		 
		for( int num = 0;w[c]!=w[99];num++){
		
		if (wa[count] == wa[99])
{
if (count > c) 
{
	System.out.println("Warriors won with "+(count-c)+" left in their army");
	System.out.println("Congrats");
	break;
}
else if (c>count)
{
	System.out.println("Wizards won with " + (c-count) + " left in their army" );
	System.out.println("Congrats");
	break;
}
}

		if(c<1)
		{
			w[c].attack(wa[count]);
		}
		
		else if(c>0)
		{
			w[c].attack(wa[count]);
		}
	    if(wa[count].isDead()==true)
	    {
	    	count++;
	    	wa[count] = new Warrior();
	    	wa[count].attack(w[c]);
	    }
	    else if (wa[count].isDead()==false)
	    {
	    	wa[count].attack(w[c]);
	    }
	    if (w[c].isDead()==true)
	    {
	    c++;
	    w[c] = new Wizard();
	    }
	    
		}
		
 if (c>count)
{
	System.out.println("Wizards won with " + (c-count) + " left in their army" );
	System.out.println("Congrats");
}
else if ( c == count)
{
	System.out.println("The war result in everyone's death. Nobody won");
	System.out.println("Congrats");
}
 
	}
}
