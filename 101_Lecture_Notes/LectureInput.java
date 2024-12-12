/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter your name ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);
        Scanner hi = new Scanner (System.in);
        System.out.println("Please enter 2 integers ");
        int y = hi.nextInt();
        int x = hi.nextInt();
        System.out.println("Sum of this 2 numbers is "+ (x+y));
        Scanner bolder = new Scanner (System.in);
        System.out.println("What's you favorite food?");
        String food = bolder.nextLine();
        System.out.println("You favorite food is "+ food);
}
}