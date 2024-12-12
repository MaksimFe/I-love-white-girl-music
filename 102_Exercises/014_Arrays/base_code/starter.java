/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int b=0;
		 for (int i = 0;i<arr.length;i++)
		 {
		 	arr[i] = b;
		 	System.out.print(arr[i]+ " ");
		    b = b+3;
		 	
		 }
		 int y =1000;
		 int [] arr2 =new int[1001];
		 for(int i2=0;i2<arr.length;i2++)
		 {
		 	arr2[i2] = y;
		 	System.out.print(arr2[i2]+ " ");
		 	y--;
		 }
		 
		 
	}
}
