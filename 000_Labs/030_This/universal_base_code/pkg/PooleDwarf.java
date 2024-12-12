/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	public String name;
	public int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
	this.name = name;
	this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
	
	return age;
	}

	/*	Mutator Methods	*/
	public void setName(String n){
		this.name = n;
	}
	
	public void setAge(int a){
		this.age = a;
	}

	public boolean isSameName(String name){
		// Complete this method
		this.name = name;
		return (name==name);
	}
}

