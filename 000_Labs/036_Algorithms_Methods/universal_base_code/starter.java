/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] b)
{
	int i = 0;
	while (i<b.length) {
		System.out.println(b[i]);
		i++;
	}
}
public static int getArrayAverage(int[] c)
	{
		int i = 0;
		int sum = 0;
		int av = 0;
	while (i<c.length-1) {
		 sum =sum+ c[i];
		i++;
		
	}
	av = sum / i;
	return av;
	}
	public static int getArrayMax(int[] d){
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<d.length;i++)
		{
			if(d[i]>max){
				max = d[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] h){
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<h.length;i++)
		{
			if(h[i]<min){
				min = h[i];
			}
		}
		return min;
	}
	public static void main(String args[]) {
	int [] arr = new int[100];
	int i;
	for(i = 0; i<arr.length; i++)
	{
		int x = (int)(Math.random()*100+1);
		arr[i]=x;
		//System.out.println(arr[i]+ " ");
	}
	toStringArray(arr);
	System.out.println("The average of 100 numbers is: "+getArrayAverage(arr));
	System.out.println("The maximum of 100 numbers is: "+getArrayMax(arr));
	System.out.println("The minimum of 100 numbers is: "+getArrayMin(arr));

		
	}
}
