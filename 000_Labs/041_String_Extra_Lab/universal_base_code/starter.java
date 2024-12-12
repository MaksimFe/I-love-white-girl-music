/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a sentence.");
	String sentence = scan.nextLine();
	String sentence1 = sentence;

int arrlength = 0;
int arrcount = 0;

//First one
	while(true)
	{
		if(sentence.indexOf(" ")== -1)
		{
	//	System.out.println(sentence);
	
	//System.out.println(arrlength);
			break;
		}
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0, space);
		//System.out.println(arrlength);
		arrlength++;
		//System.out.print(word+ " ");
		sentence = sentence.substring(space+1);
	}
String [] arr = new String[arrlength+1];

//Second  one
	while(true)
	{
		if(sentence1.indexOf(" ")== -1)
		{
	//	System.out.println(sentence);
	arr[arrcount]= sentence1;
	//System.out.println(arr[arrcount]);
			break;
		}
		int space1 = sentence1.indexOf(" ");
		String word1 = sentence1.substring(0, space1);
		arr[arrcount]=word1;
		//System.out.println(arr[arrcount]);
		arrcount++;
		//System.out.print(word+ " ");
		sentence1 = sentence1.substring(space1+1);
	}
	
	for(int i = arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+ " ");
	}


	}
}
