
public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-52125));

	}
	
	public static boolean isPalindrome(int number) {
		boolean isPal = false;
		int startingNum = number;
		int reverseNum = 0;
		
		while (number != 0) {
			// get last digit
			int lastDigit = number % 10;
			// add last digit to reversed number
			reverseNum *= 10;
			reverseNum += lastDigit;
			number /= 10;
		}
		
		System.out.println(reverseNum);
		
		if (reverseNum == startingNum) {
			isPal = true;
		}
		
		return isPal;
	}

}
