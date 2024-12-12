/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int amount = 20;
int arr[]= new int[amount];

System.out.println("These are 20 random elements:");
int number = 1;
number++;
int i;
int i3;
int count = 0;
		for( i = 0;i<arr.length;i++)
		{
			int x = (int)(Math.random()*11+1);
			arr[i] = x;
			System.out.print(arr[i]+ " ");
			//System.out.println(i);
		}
		
		System.out.println(" ");
		System.out.println("------------------------------");
		int y =(int)(Math.random()*11+1);
		System.out.println("The random number to look for is "+ y);
		for(int i2 = 0;i2<arr.length;i2++)
		{
		//System.out.print(arr[i2] + " ");	
		if(arr[i2]==y){
			System.out.println("Duplicate found at index "+i2);	
			count++;
					}
		}
		System.out.println("Total number of duplicates of " + y + " is " + count);
		System.out.println("--------------------------------");
		System.out.println("Looking for two in a row:");
		int arr2[] = new int [20];
		for( i3 = 1;i3 < arr.length;i3++)
		{
		
			
			arr2[i3]=i3;
			//System.out.print(arr[i3-1] + " "+ arr[arr2[i3]]);
		//	System.out.println(" ");
			
			
		if(arr[i3-1]==arr[arr2[i3]])
			System.out.println("Two in a row found at indexes "+(i3-1)+ " and " + arr2[i3]);
			
		
		}
		
		}
}
