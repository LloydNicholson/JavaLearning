
public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(100);
	}
	
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		
		int originalNumber = number;
		int reversedNumber = reverse(originalNumber);
		int originalNumDigits = getDigitCount(originalNumber);
		int reversedNumDigits = getDigitCount(reversedNumber);
		
		
		for (int i = originalNumber; i < reversedNumber; i++) {
			if (originalNumDigits > reversedNumDigits) {
				reversedNumber *= 10;
			}
		}
		
		
		while (number != 0) {
			int lastDigit = number % 10;
			switch (lastDigit) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;	
			default:
				System.out.println("OTHER");
				break;
			}
			number /= 10;
		}
	}
	
	public static int reverse(int number) {
		int originalNumDigits = getDigitCount(number);
		int reversedNumber = 0;
		while (number != 0) {
			// get last digit
			int lastDigit = number % 10;
			// add last digit to reversed number
			reversedNumber *= 10;
			reversedNumber += lastDigit;
			number /= 10;
			
		}
		
		// Set number to the reverse of the value
		int reversedNumDigits = getDigitCount(number);
		
		System.out.println(reversedNumber);

		return reversedNumber;
	}
	
	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		
		int digitCount = 1;
		for (int i = 0; i < number; i++) {
			number /= 10;
			digitCount++;
		}
		
		return digitCount;
	}

}
