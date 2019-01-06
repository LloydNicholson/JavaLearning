
public class Car extends Vehicle {
	
	private int gears;
	private int wheels;
	private int doors;
	private boolean isManual;
	
	private int currentGear;

	public Car(String type, int size, int gears, int wheels, int doors, boolean isManual) {
		// Set up these variables the first time the object is created
		super(type, size);
		this.gears = gears;
		this.wheels = wheels;
		this.doors = doors;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
	}
	
	public void changeSpeed(int speed, int direction) {
		System.out.println("Car.changeSpeed(): Speed is " + speed + " direction " + direction);
		move(speed, direction);
	}
	
	
}
