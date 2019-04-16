package oop;

public class ConcreteClass extends AbstractCar implements InterfaceCar {
//implements -- interface
//extends -- abstract class
//extends first, implements second
	@Override
	public void start() {
		
		
	}

	@Override
	public void stop() {
		
		
	}

	@Override
	public void move() {
		System.out.println("moving functionality -- car interface");
		
	}
	
	public void autoHeadLight() {
		System.out.println("headlight --- concrete class");
		
	}

}
