
public class Vehicle {
	private String type;
	private int size;
	
	private int currentSpeed;
	private int currentDirection;
	
	public Vehicle(String type, int size) {
		this.type = type;
		this.size = size;
		
		this.currentDirection = 0;
		this.currentSpeed = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + direction + " degrees");
	}
	
	public void move(int speed, int direction) {
		currentSpeed = speed;
		currentDirection = direction;
		
		System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
	}

	
	public void stop() {
		this.currentSpeed = 0;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getcurrentSpeed() {
		return currentSpeed;
	}

	public void setcurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getcurrentDirection() {
		return currentDirection;
	}

	public void setcurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	
	
	
}