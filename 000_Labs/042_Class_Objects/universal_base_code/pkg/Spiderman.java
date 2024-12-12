/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	String villain;
	int age;
	public Spiderman() {
	name = "Miles Morales";
	age = 13;
	villain = "King Pin";
	}
	public Spiderman(String name)
	{
		this.name = name;
	}
	public Spiderman(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Spiderman (String name, String villain)
	{
		this.name = name;
		this.villain = villain;
	}
	public void print()
	{
		System.out.println("The actor "+name+" is "+ age+" years old");
		if(villain == null)
		{
		villain = "None";
		System.out.println("The play Spiderman who's villain is "+ villain);
		}
		 else if(villain!= null)
		{
			System.out.println("The play Spiderman who's villain is "+ villain);
		}
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setVillain(String villain)
	{
		this.villain = villain;
	}
}
