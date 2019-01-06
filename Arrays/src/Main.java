import java.util.*;

public class Main {
	// Create input area with Scanner
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int[] myIntArray = new int[16];// {1,2,3,4,5,6,7,8,9,10};
//		printArray(myIntArray);
		
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		
		System.out.println(getAverage(myIntegers));

	}
	// Get integers entered in from scanner
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values. \r");
		int[] values = new int[number];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		double average = (double) sum / (double) array.length;
		
		return average;
	}
	
	
//	public static void printArray(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i * 10;
//			System.out.println("Element " + i + " is " + array[i]);
//		}
//	}

}
