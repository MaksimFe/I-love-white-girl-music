/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		System.out.println("Annual salary is: "+michael.getAnnualSalary());
		Employee dwight = new Employee(1987,"Dwight", "Schrute",4416.66);
		dwight.employeeToString();
		System.out.println("Annual salary is: "+dwight.getAnnualSalary());
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		jim.employeeToString();
		System.out.println("Annual salary is: "+jim.getAnnualSalary());
		Employee pam = new Employee(2011, "Pam", "Beesly",2250);
		pam.raiseSalary(13);
		pam.getAnnualSalary();
		pam.employeeToString();
		System.out.println("Annual salary is: "+pam.getAnnualSalary());
		Employee darush = new Employee(9999, "Darush", "the goat", 0.01);
		//darush.employeeToString();
		darush.raiseSalary(3730);
		darush.employeeToString();
		System.out.println("Annual salary is: "+darush.getAnnualSalary());
	}
}