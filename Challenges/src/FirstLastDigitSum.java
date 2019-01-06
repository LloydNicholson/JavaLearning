
public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumFirstAndLastDigit(9));
	}
	
	public static int sumFirstAndLastDigit(int number) {
		int sum = 0;
		if (number < 0) {
			return -1;
		}
		
		// find last digit
		int lastDigit = number % 10;
		while (number >= 10) {
			number /= 10;
		}
		// find first digit calculation
		int firstDigit =  number;
		sum = firstDigit + lastDigit;
		
		return sum;
	}

}
