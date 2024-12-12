import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
      count = 0;
      average = 0.0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        double num = newVal;
      double newaverage = (average+num)/(count+1);

    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        int b = 0;
        int num1 = 0;
       while(b<=num)
       {
           double x = 10-Math.random()*10;
           if(x<0)
           {
               num1++;
           }
           else if(x>=0)
           {
               updateAverage(x);
           }
           b++;
       }
        return num1;
       
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        double rating = average / count;
        return rating;
    }
}
