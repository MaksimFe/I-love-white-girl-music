
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		StepTracker ad = new StepTracker(10000);
		
		ad.addDailySteps(10000);
		ad.addDailySteps(10000);
		
		System.out.println(ad.averageSteps());


		
	}
}