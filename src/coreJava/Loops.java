package coreJava;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
//Loops
//For Loop
		//Write value of x 5 times
		//s = 0 means this is where my condition starts
		//s <6 means this is where my condition ends
		//s++ means incremental
		//s-- means decremental
		
		for(int s = 0; s<=4; s++) {
		System.out.println("I don't love java : And the value of s is = "+s);
		}
		
//While Loop
		int a = 0;
		while (a<5) {
			System.out.println("I don't love java : And the value of s is ="+a);
			a++;
		}
//Enhanced for loop
		//we need an array for enhanced for loop
	     //create an array and insert 3 names
		String array[] = {"Khaled", "Ahmed", "Max"};
		
		System.out.println("lenght of array is "+array.length);
		
		for(String s : array) {
			System.out.println("my name is "+s);
		}
		
//do while
		int z = 10;
		do {
			System.out.println("my number is "+z);
			z++;
		}
		while (z<20);
		
		ArrayList <String> arrayList = new ArrayList<>();
		arrayList.add("Apu");
		//System.out.println(arrayList.size());
		//System.out.println(arrayList.get(0));
		for(int b = 0; b < 5; b++) {
			arrayList.add("Apu");
			
		}
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(4));
	}

}
