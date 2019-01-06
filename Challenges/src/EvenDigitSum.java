
public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(44444678));

	}


	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		
		int evenSum = 0;
		while (number > 0) {
			if (number % 2 == 0) {
				int digit = number % 10;
				evenSum += digit;
			}
			number /= 10;
		}
		
		return evenSum;
	}
}
