/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Spike");
        greeting("Mortis");
	}
	public static void greeting(String name){
	   
	    System.out.println("Howdy "+ name);
	}
	public static void printAnimal(){
	    System.out.println(" __    __");
	     System.out.println("/  \\../  \\");
	     System.out.println("  ( oo )");
	     System.out.println("   \\__/");
	     
 
	}
}