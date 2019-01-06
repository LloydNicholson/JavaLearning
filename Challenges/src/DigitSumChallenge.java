
public class DigitSumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(9999));
		System.out.println(sumDigits(6));
		
		
	}
	
	public static int sumDigits(int number) {
		if (number < 10 || number < 0) {
			return -1;
		}
		
		int sum = 0;
		// 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5
		while (number > 0) {
			// Extract least significant digit: 125 % 10 = 5 
			int digit = number % 10;
			sum += digit;
			// Drop least significant digit: 125/10 = 12
			number /= 10;
		}

		return sum;
	}

}
