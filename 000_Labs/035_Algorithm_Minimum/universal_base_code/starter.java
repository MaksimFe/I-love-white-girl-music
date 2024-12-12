/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		
		
		int b = 0;
		int x = (int)(Math.random()*150+51);
		int [] arr = new int[x];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int av = 0;
		
		for (int i = 0; i<arr.length; i++)
		{
			int y = (int)(1+Math.random()*100);
			arr[b]=y;
			b++;
			//System.out.print(arr[i]+ " ");
			sum +=y;
			//System.out.println(sum);
			if(arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
		}
		System.out.println("There are "+x+" of elements.");
        System.out.print("The minimum of "+x+ " numbers is: ");
		System.out.println(min);
		System.out.print("The maximum of "+x+ " numbers is: ");
		System.out.println(max);
		System.out.print("The average of "+x+" numbers is: ");
		System.out.println(sum/x);
		
	}		
	}

