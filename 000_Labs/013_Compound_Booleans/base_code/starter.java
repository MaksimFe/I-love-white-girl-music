/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter 3 integers: ");
	Scanner hi = new Scanner(System.in);
	int a = hi.nextInt();
	int b = hi.nextInt();
	int c = hi.nextInt();
	
	if(a>b) {
		if (a>c){
			System.out.print("The largest integer is a: ");
		System.out.println(a);
				}
			}
	if(b>c) {
		if (b>a){
			System.out.print("The largest integer is b: ");
		System.out.println(b);
				}
			}		
	if(c>b) {
		if (c>a){
			System.out.print("The largest integer is c: ");
		System.out.println(c);
				}
			}	
	if(a<c) {
		if (a<b){
			System.out.print("The smallest integer is a: ");
		System.out.println(a);
				}
			}
	if(b<c) {
		if (b<a){
			System.out.print("The smallest integer is b: ");
		System.out.println(b);
				}
			}
			
	if(c<a) {
		if (c<b){
			System.out.print("The smallest integer is c: ");
		System.out.println(c);
				}
			}
			
	}
}
