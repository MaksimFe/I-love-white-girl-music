package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String name;
	public int age;
	public String breed;
	public Dog() {
		name ="Clifford";
		age = 3;
		breed= "big red dog";
	}
	public Dog(String a)
	{
		name = a;
		age=1;
		breed= "dog dog";
	}
	public Dog(String a,String breedy)
	{
		name =a;
		breed = breedy;
		age = 1;
	}
	public Dog(String a,int b)
	{
		name = a;
		age =b;
		breed ="dog dog";
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setAge(int ag)
	{
		age = ag;
	}
	public void setBreed(String br)
	{
		breed = br;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getBreed()
	{
		return breed;
	}
	
	public boolean isSleeping()
	{
		double x = Math.random() *101;
		boolean sleep = x < 50;
		
		return sleep;
	}
	public void bark()
	{
		System.out.println("Dog is called "+ name + " and it barks!");
	}
	
	
	
	
	
	
	
	
}

