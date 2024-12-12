/*
   * Author:
   * Date:
   * Collaborator(s):
*/import java.util.*;

class starter {
	/*public static String[] sentence(String a)
	{
		
		return arr;
	}*/
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String input = scan.nextLine();
		String con = new String("qwrtypsdfghjklzxcvbnm");
		String [] arrc = new String[21];
		String [] arrv = new String[input.length()];
		
		String [] arr = new String[input.length()+1];
		
     	
   
    	int i = 0;
    	
		
			
		
		while(true)
     {
     	boolean truth = false;
		boolean truth1 = false;
    if(input.indexOf(" ") == -1)
    {
    	for( i = 0;i<input.length();i++)
		{
			arr[i]=input.substring(i,i+1);
		}
		
		for(int i2 = 0;i2<arrc.length;i2++){
    	arrc[i2] = con.substring(i2,i2+1);
			if(arrc[i2].equals(arr[0]))
			{
				truth = true;
			}
			else if(arrc[i2].equals(arr[1]))
			{
				truth1 = true;
			}
		}
    	if(truth && truth1)
    	{
    		if(input.length()==2)
    		{
    			System.out.print(arr[0]+arr[1]+"-"+"ay");
    		}
    		else{
    		System.out.print(input.substring(2,input.length())+ "-" +input.substring(0,2)+"ay");
    			}
    	}
	else if(truth)
    	{
    		System.out.print(input.substring(1,input.length())+ "-" +input.substring(0,1)+"ay");
    	}
    	else{
    		System.out.print(input.substring(0,input.length())+ "-" +"way"+ " ");
    	}
        break;
    }
    /////////////////////////////////////
    	
	/////////////////////////////////////
        int space = input.indexOf(" ");
        String word = input.substring(0, space);
        for( i = 0;i<word.length();i++)
		{
			arr[i]=word.substring(i,i+1);
		}
		
		for(int i2 = 0;i2<arrc.length;i2++){
    	arrc[i2] = con.substring(i2,i2+1);
			if(arrc[i2].equals(arr[0]))
			{
				truth = true;
			}
			else if(arrc[i2].equals(arr[1]))
			{
				truth1 = true;
			}
		}
    	if(truth && truth1)
    	{
    		if(word.length()==2)
    		{
    			System.out.print(arr[0]+arr[1]+"-"+"ay"+ " ");
    		}
    		else{
    		System.out.print(input.substring(2,space)+ "-" +input.substring(0,2)+"ay"+ " ");
    			}
    	}
    	else if(truth)
    	{
    		System.out.print(input.substring(1,space)+ "-" +input.substring(0,1)+"ay"+ " ");
    	}
    	else{
    		System.out.print(input.substring(0,space)+ "-" +"way"+ " ");
    	}
        input = input.substring(space+1);
     }
     
     
     
     
	}
}






