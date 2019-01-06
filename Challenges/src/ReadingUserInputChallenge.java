import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		minAndMaxOfNumberAmount(5);
		
	}
	
	public static void sumOfNumberAmount(int amount) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= amount; i++) {
			System.out.println("Enter number #" + i + ":");
			
			boolean isAnInt = scanner.hasNextInt();
			
			if (isAnInt) {
				int number = scanner.nextInt();
				sum += number;
			} else {
				i--;
				System.out.println("Invalid symbol");
			}
			
			scanner.nextLine(); // handle end of line (enter key)
		}
		
		System.out.println("The sum = " + sum);
		scanner.close();
	}
	
	public static void minAndMaxOfNumberAmount(int amount) {
		// Set the values to the extreme opposite of each value - min and max
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		boolean first = true;
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= amount; i++) {
			System.out.println("Enter number:");
			
			boolean isAnInt = scanner.hasNextInt();
			
			if (isAnInt) {
				int number = scanner.nextInt();
				
//				if (first) {
//					first = false;
//					min = number;
//					max = number;
//				}
				
				if (number > max) {
					max = number;
				}
				
				if (number < min) {
					min = number;
				}
			} else {
				i--;
				System.out.println("Invalid symbol");
			}
			
			scanner.nextLine(); // handle end of line (enter key)
		}
		
		System.out.println("The minimun number = " + min);
		System.out.println("The maximum number = " + max);
		scanner.close();
	}
	

}
