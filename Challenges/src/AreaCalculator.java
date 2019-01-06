
public class AreaCalculator {

	public static void main(String[] args) {
		double circleArea = area(3);
		double rectangleArea = area(4, 42);
		
		System.out.println(circleArea);
		System.out.println(rectangleArea);

	}
	
	public static double area(double radius) {
		double circleArea;
		
		if (radius < 0) {
			return -1;
		}
		
		circleArea = radius*radius*3.14159;
		
		return circleArea;
	}
	
	public static double area(double x, double y) {
		double rectangleArea;
		
		if (x < 0 || y < 0) {
			return -1;
		}
		
		rectangleArea = x * y;
		
		return rectangleArea;
	}

}
