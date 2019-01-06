import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);

		int[] sortedArray = sortArray(myIntegers);
		printArray(sortedArray);
		
	}
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integers: \r");
		int[] values = new int[number];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " is " + array[i]);
		}
	}
	
	
	public static int[] sortArray(int[] array) {
//		int[] sortedArray = new int[array.length];
//		for (int i = 0; i < array.length; i++) {
//			sortedArray[i] = array[i];
//		}
		
		// Built in methods Arrays.whateveryouwant
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			
			// e.g.
			// Element 0     50
			// Element 1     40
			// Element 2     180
			for (int i = 0; i < sortedArray.length-1; i++) {
				if (sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i +1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
	}
	
	
	
	
	
}
