class Car {
	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels;
	
	public Car(int cylinder, String name) {
		this.cylinder = cylinder;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}
	
	public void startEngine(boolean onOrOff) {
		boolean engineOn = onOrOff;
		if (engineOn) {
			System.out.println(getClass().getSimpleName() + " starts engine");
		} 

	}

	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}
	
	
}

class Ferrari extends Car {

	public Ferrari(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine(boolean onOrOff) {
		System.out.println(getClass().getSimpleName() + " starts engine");
	}
	
	
	
}


class Lamborghini extends Car {
	
	public Lamborghini(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public void startEngine(boolean onOrOff) {
		System.out.println(getClass().getSimpleName() + " starts engine");
	}
	
	
}

class Audi extends Car {
	
	public Audi(int cylinders, String name) {
		super(cylinders, name);
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(6, "Car");
		car.startEngine(true);
		
		Ferrari ferrari = new Ferrari(10, "458 Spider");
		ferrari.startEngine(true);
		

		Lamborghini lamborghini = new Lamborghini(12, "Gallardo");
		lamborghini.startEngine(true);
		
		Audi audi = new Audi(8, "R8");
		audi.startEngine(true);
	}

}
