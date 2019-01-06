
public class SumOddRange {

	public static void main(String[] args) {
		boolean isOddNum = isOdd(-1);
		System.out.println(isOddNum);
		
		System.out.println(sumOdd(10, 5));

	}
	
	public static boolean isOdd(int number) {
		boolean isOdd = false;
		if (number < 0) {
			return false;
		}
		
		if (number % 2 != 0) {
			isOdd = true;
		}
		
		return isOdd;
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start < 0 || end < 0) {
			return -1;
		}
		
		if (start > end) {
			return -1;
		}
		
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		
		
		return sum;
	}

}
