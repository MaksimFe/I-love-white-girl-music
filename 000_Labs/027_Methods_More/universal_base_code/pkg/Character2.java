
package pkg;
import java.util.Scanner;
import java.util.Random;


public class Character2{
public int s;
public int d;
public int c;
public int i;
public String Role =new String();

public Character2()
{
    
    Role = "No Role";
    s = 0;
    i = 0;
    d = 0;
    c = 0;
}
public String setRole(String a)
{
  Role = a;
  System.out.println("Your role is: "+ a);
  System.out.println("Your strength level is: "+s);
  System.out.println("Your dexterity level is: "+d);
  System.out.println("Your charisma level is: "+c);
  System.out.println("Your intelligence level is: "+i);
  return a;
}

public int setStrength(int s1)
{
System.out.println("Your strength level is: "+s1);
  return s1;
}


public int setCharisma(int b)
{
    System.out.println("Your charisma level is: "+b);
    return b;
}

public int setIntelligence(int i)
{
    System.out.println("Your intelligence level is: "+i);
   return i; 
}

public int setDexterity(int d)
{
    System.out.println("Your dexterity level is: "+d);
    return d;
}

public boolean setAll(String a , int s1,int b, int i, int d )
{
   
   return (s1<=5) && (a.equals("wizard")||(a.equals("rogue")||(a.equals("warrior"))));
}



}
