import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		//System.out.println(CVMath.findMid(2,3,1));
		int a = 1;
		int b = 1;
		int sum = 0;
		int [] arr = new int [100000];
		System.out.println("How many magic numbers would you like to see? ");
		System.out.print("The limit is 6: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int allow=0;
		for (int i = 0;i<arr.length;i++)
		{
			if(number>6)
			{
				System.out.println("Try a smaller number");
				break;
			}
			int [] arrsum = new int[100000];
			int [] arrnum = new int[100000];
			int sumnum = 0;
			int count;
			
			
		
		sum = a*b;
	
		for(count = 0; count<arr.length;count++)
		{
			sumnum = count * (count + 1) / 2;
			arrnum[count] = sumnum;
			
		
			if(arrnum[count]==sum)
			{
				System.out.println(sum);
				allow++;
			}
				//System.out.println(arrnum[count]);
		}
		
	//System.out.println(a);
		
	if(allow == number)
	{
		break;
	}
	
			a++;
			b++;
			
		
		}
		
	
	}
}
