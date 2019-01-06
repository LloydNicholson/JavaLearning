import java.util.*;

public class Main {

	public static void main(String[] args) {
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		anotherIntValue++;
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);
		
		// Reference types relate to a single array in memory - we only have one array 
		// in the following code even though it looks like two arrays
		int[] myIntArray = new int[5];
		myIntArray[4] = 9;
		int[] anotherArray = myIntArray;
		anotherArray[3] = 3;
		
		int[] newArrayWithNewReference = new int[6];
		newArrayWithNewReference[4] = 5;
 		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		
		System.out.println("myIntArray array id is " + myIntArray);
		System.out.println("anotherArray array id is " + anotherArray);
		System.out.println("newArrayWithNewReference array id is " + newArrayWithNewReference);
		
		modifyArray(myIntArray);
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("anotherArray = " + Arrays.toString(anotherArray));
		
		
	}
	
	public static void modifyArray(int[] array) {
		array[0] = 2;
		array = new int[] {1,2,3,4,5};
	}

	
	
	
	
	
}
