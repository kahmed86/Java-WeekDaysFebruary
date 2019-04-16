package oop;

public class Polymorphism extends ConcreteClass {
	//Method Overloading
	//Same Method, different parameters
	
public void calculator(int a, int b) {
	int c = a+b;
	System.out.println(c);
}
public void calculator(int a, int b, int d) {
	int c = a+b;
	int g = c/d;
	System.out.println(g);
}

//Method Overrriding
@Override
public void autoHeadLight() {
	System.out.println("headlight --- polymorphism class");
}
public static void main(String [] args) {
	Polymorphism polymorphism = new Polymorphism();
	polymorphism.calculator(10, 9);
	polymorphism.calculator(9, 6, 4);
	polymorphism.autoHeadLight();
}
}
