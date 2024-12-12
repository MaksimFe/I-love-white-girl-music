/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    int numberSpots;
    int moosPerhour;
    String flavor;
    boolean isBeef;
    
    //Constructor
    public Cow(){
        numberSpots = 17;
        flavor = " Waygu ";
        isBeef = true;
        if (isBeef)
        {
            moosPerhour = 0;
        }
        else {
            moosPerhour = 87;
        }
    }
    public Cow (int n , String f, boolean b){
        numberSpots = n;
        flavor =f;
        isBeef=b;
        if(isBeef)
            moosPerhour =0;
        else
        moosPerhour = 87;
    }
    public String getFlavor(){
        return flavor;
    }
    public void moo(){
        if (!isBeef){
            int c =0;
            while(c<moosPerhour){
                System.out.print("MOOO");
                c++;
            }
    }
    else{
                System.out.print("Your"+flavor+ "cow is dead");
            }
}
}