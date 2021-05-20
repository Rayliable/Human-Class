package codes;

import java.util.Scanner;

public class Main {
	
	public static Scanner input = new Scanner(System.in);

	public static String checkName(Human thisGuy){
		return thisGuy.getName();
	}
	
	public static void birthday(Human thisGuy){
		thisGuy.setAge(thisGuy.getAge()+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human ray = new Human("Ray", 16, true);
		Human pierre = new Human("Pierrot", 16, false);
		/*System.out.println(ray.female);*/
		
		System.out.println(ray.getName() +" says: my age is " +ray.getAge() +". Female is " +ray.isFemale() +"!");
		
		System.out.println(pierre.getName() +" says: my age is " +pierre.getAge() +". Female is " +pierre.isFemale() +"!");
		
		System.out.println(ray.getName() +" says: the sum is " +ray.add(4, 5) +".");
		
		System.out.println(pierre.getName() +" says: the sum is " +pierre.add("five", "six") +".");
		
		System.out.println(checkName(pierre));
		
		System.out.println(ray.getName() +"'s age is: " +ray.getAge());
		birthday(ray);
		System.out.println("Happy Birthday!");
		System.out.println(ray.getName() +"'s age is: " +ray.getAge());
		
		/*
		ray.setName(input.next());
		System.out.println(ray.getName());
		*/
		
		
	}

}
