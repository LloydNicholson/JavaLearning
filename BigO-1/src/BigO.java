import java.lang.*;

public class BigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] array1 = {1, 2, 14};
//		foo(array1);
//		
//		int[] array2 = {21, 12, 32, 89, 45, 98};
//		printPairs(array2);
		
//		printUnorderedPairs2(array1, array2);
		
//		printUnorderedPairs3(array1, array2);
		
//		reverse(array2);
		
		boolean isPrime = isPrime(6);
		System.out.println(isPrime);
		

		
	}
	
//	public static void foo(int[] array) {
//		int sum = 0;
//		int product = 1;
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		for (int i = 0; i < array.length; i++) {
//			product *= array[i];
//		}
//		System.out.println(sum + ", "+ product);
//	}
//	
//	public static void printPairs(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i] + ", " + array[j]);
//			}
//		}
//	}
//	
//	public static void printUnorderedPairs(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i+1; j < array.length; j++) {
//				System.out.println(array[i] + ", " + array[j]);
//			}
//		}
//	}

//	public static void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
//		for (int i = 0; i < arrayA.length; i++) {
//			for (int j = 0; j < arrayB.length; j++) {
//				if (arrayA[i] < arrayB[j]) {
//					System.out.println(arrayA[i] + ", " + arrayB[j]);
//				}
//			}
//		}
//	}
//	
//	public static void printUnorderedPairs3(int[] arrayA, int[] arrayB) {
//		for (int i = 0; i < arrayA.length; i++) {
//			for (int j = 0; j < arrayB.length; j++) {
//				for (int k = 0; k < 100000; k++) {
//					System.out.println(arrayA[i] + ", " + arrayB[j]);
//				}
//			}
//		}
//	}
//	
//	public static void reverse(int[] array) {
//		for (int i = 0; i < array.length/2; i++) {
//			int other = array.length - i -1;
//			int temp = array[i];
//			array[i] = array[other];
//			array[other] = temp;
//			System.out.println(temp);
//		}
//	}
	
	public static boolean isPrime(int n) {
		for (int x = 2; x * x <= n; x++) { // Same as this ---> for (int x = 2; x <= Math.sqrt(n); x++) --> This gets the square root or less 
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}
	

	
	
}
