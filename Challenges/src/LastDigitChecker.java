
public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(45, 347, 986));

	}
	
	public static boolean hasSameLastDigit(int x, int y, int z) {
		boolean hasSameLastDigit = false;
		if (x < 10 || y < 10 || z < 10 || x > 999 || y > 999 || z > 999) {
			return false;
		}
		
		int xLastDigit = x % 10;
		int yLastDigit = y % 10;
		int zLastDigit = z % 10;
		
		if (xLastDigit == yLastDigit || yLastDigit == zLastDigit || xLastDigit == zLastDigit) {
			hasSameLastDigit = true;
		}
		
		return hasSameLastDigit;
	}

}
