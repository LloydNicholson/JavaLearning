
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(150, 4567));

	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}
		
		// not right!!!!
		int greatestDivisor = 0;
		for (int i = 1; i <= first; i++) {
			if (first % i == 0 && second % i == 0) {
				greatestDivisor = i;
			}
		}
	
		return greatestDivisor;
		
	}

}
