
package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter1{
 public int zero = 0;
 public int s = 5;
	public int i = 5;
	public int d = 5;
	public int c = 5;
    public String Role = new String();
	
    public myCharacter1()
    {
	 Role = "No role";
	 System.out.println("Your role is "+Role);
		System.out.println("Your stength is: "+zero);
		System.out.println("Your intelligence is: "+zero);
		System.out.println("Your dexterity is: "+ zero);
		System.out.println("Your charisma is: "+zero);
    }
    
    Scanner role = new Scanner(System.in);
    public String Rolein = new String();
    public myCharacter1(String a)
    {
     
     Rolein = role.nextLine();
     if (Rolein.equals("Wizard"))
		{
			System.out.println("How inspiring that you chose to be a Wizard");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
		else if (Rolein.equals("wizard"))
		{
			System.out.println("How inspiring that you chose to be a Wizard");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
	
	
	
	
	
		else if  (Rolein.equals("Warrior"))
		{
			System.out.println("How cunning!");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
		else if (Rolein.equals("warrior"))
		{
			System.out.println("How cunning");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
		
		
		
		
		
		
		
		else if  (Rolein.equals("Rogue"))
		{
			System.out.println("YO-ho-ho-ho");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
		else if (Rolein.equals("rogue"))
		{
			System.out.println("YO-ho-ho-ho");
			System.out.println("Your role is "+Rolein);
		System.out.println("Your stength is: "+s);
		System.out.println("Your intelligence is: "+i);
		System.out.println("Your dexterity is: "+ d);
		System.out.println("Your charisma is: "+c);
		}
		else{
			
		System.out.println("You've decided not to choose a role");
		}
    }
    
}
