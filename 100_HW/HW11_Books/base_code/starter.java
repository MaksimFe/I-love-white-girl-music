/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			// Your code goes here.
			if(choice.equals("file"))
			System.out.println(textFile);
			else if(choice.equals("print"))
			{
				System.out.println(" ");
				printsArray(arr);
			}
			else if(choice.equals("printBack")) 
			{
					printsArrayBack(arr);
			}
			else if(choice.equals("printNum"))
			{
				System.out.println("How many words of the text would you like to print?");
				int number = sc.nextInt();
				System.out.println("------------------------------------Printing"+number+"Number of Words------------------------------------");
				printsNumber(arr,number);
				System.out.println();
				System.out.println("------------------------------------Printing"+number+"Number of Words------------------------------------");
			}
			else if (choice.equals("check"))
			{
				System.out.println("What word/phrase would you like to check? ");
				String input = sc.nextLine();
				checksArray(arr,input);
				System.out.println("There are "+checksArray(arr,input)+" many "+input+" in "+ textFile );
			}
			else if (choice.equals("common"))
			{
				System.out.println("Most common word in the text is: "+mostCommon(arr));
			}
			else if (choice.equals("change"))
			{
				  // This is one of the files in the 'books' folder. It MUST exist.
				 String textFile1 = sc.nextLine();
				 arr = fillArray(textFile1);
				 textFile = textFile1;
			}
			System.out.println("-------------------------------------------");
			}
			
		}
	


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
	int i2 = 0;
	while (i2<arr.length) {
		System.out.print(arr[i2]+" ");
		i2++;
	}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
	System.out.println(arr.length);
	int i2 = arr.length-1;
	while (i2>0) {
		System.out.print(arr[i2]+" ");
		i2--;
	}
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
			int i2 = 0;
			if(num<arr.length)
			{
	while (i2<num) {
		System.out.print(arr[i2]+" ");
		i2++;
	}
			}
			else if (num>=arr.length)
			{
				System.out.println("Too large of a number. Please try again.");
				
			}
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int count = 0;
		int i = 0;
		while (i<arr.length) {
		if(arr[i].equals(check))
		{
			count++;
		}
		i++;
	}
		return count;	// Dummy value, delete when needed.
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		int count;
		String arr2 []= new String[1];
		int i4;
		int i2;
		int max = Integer.MIN_VALUE;
		for(i4 = 0;i4<arr.length-1;i4++) 
	{
		count = 0;
			for(i2=0;i2<arr.length;i2++)
		{
			
		if(arr[i4].equals(arr[i2]))
			{
			//Добавить правильное условие.
			count++;
			if(count>max)
			{
				max = count;
				arr2[0] = arr[i4];
			}
			
			
			}
		}
	}
			
	
		
	
		 return arr2[0];	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}