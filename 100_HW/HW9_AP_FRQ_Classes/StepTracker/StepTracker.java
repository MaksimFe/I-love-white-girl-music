import java.util.*;

public class StepTracker{
    
int steps;
int activedays;
int days;
    
    
    
public void addDailySteps(int steps){
     this.steps+=steps;
     days++;
     System.out.println(steps);
     //System.out.println(days);
}
    
    
public StepTracker(int a){
activedays = 0;
days = 0;
if(steps>a)
{
activedays= activedays + 1;
}
}


  
public int activeDays(){
    return activedays;
}

public double averageSteps(){
    double av = steps / days;
    return av;
}    

    
    
    
    
    
}
