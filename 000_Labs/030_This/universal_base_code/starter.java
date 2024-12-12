/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		 int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
public static String loopName(){
	int b=100;
	int counter = 0;
	PooleDwarf test2 = new PooleDwarf(randName(),0);
	while (b>=0)
	{
		if(test2.name == randName())
		{
		
			counter++;
		}
		
	randName();
	b--;
	}
	System.out.println(test2.name +" was the name with "+counter+ " matches.");
	return randName();
}
	public static void main(String args[]) {
		PooleDwarf test = new PooleDwarf();
		loopName();
		/*System.out.println(randName());*/
	/*	PooleDwarf test1 = new PooleDwarf(randName(),test.age);
		test1.setName(test1.name);
		test1.setAge(test1.age);
		System.out.println(test1.getName());
		System.out.println(test1.getAge());*/
		
	
	}
}
