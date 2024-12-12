/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfild", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillain("The Vulture");
		
		System.out.println(y.getVIllain());

		Spiderman da = new Spiderman("Tom Holland");
		da.setAge(10);
		da.setVillain("Villain");
		
	}
}
