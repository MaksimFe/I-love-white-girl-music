
package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
 public int zero;
 public int s ;
	public int i ;
	public int d ;
	public int c ;

    public String Role = new String();
	
    public myCharacter()
    {
        Role = "No Role";
        s = 0;
        i = 0;
        d = 0;
        c = 0;
        
    }
    public void myToString()
    {
	    System.out.println("Your role is "+Role);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
    }
}