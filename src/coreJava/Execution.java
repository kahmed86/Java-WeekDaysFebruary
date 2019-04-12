package coreJava;

public class Execution {

	public static void main(String[] args) {
		//Object Creation Of A Class
		Computer refVar1 = new Computer();
	//Class Name + reference variable = new Constructor
	refVar1.model = "ASUS";
		System.out.println(refVar1.model);
		
		
		Computer refVar2 = new Computer(2019);
		
		Computer refVar3 = new Computer("Mac");
		
		System.out.println(refVar1.display);
		System.out.println(Computer.keys);
		
		//Math
		Math math = new Math();
		math.getAddress();
		Math.getTime();
		
		//Because of Return Type We Need Another Variable
		int newValue = math.calculator(7, 8);
		System.out.println(newValue);
		
		int newValue2 = Math.calculator2(10, 5);
		System.out.println(newValue2);
	}

}
