
public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(16, 67));

	}
	
	public static boolean hasSharedDigit(int x, int y) {
		boolean hasSharedDigit = false;
		if (x < 10 || x > 99 || y < 10 || y > 99) {
			return false;
		}

		int xFirstDigit = (x / 10) % 10;
		int xLastDigit = x % 10;
		
		int yFirstDigit = (y / 10) % 10;
		int yLastDigit = y % 10;
		
		System.out.println(xFirstDigit);
		System.out.println(yFirstDigit);
		
		if (xFirstDigit == yLastDigit || xLastDigit == yFirstDigit || xFirstDigit == yFirstDigit || xLastDigit == yLastDigit) {
			hasSharedDigit = true;
		}
		
		
		return hasSharedDigit;
	}

}
