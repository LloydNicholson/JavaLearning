
public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Normal for loop");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//		}
//		
//		System.out.println("Reversed for loop");
//		// Modified for loop in reverse
//		for (int i = 4; i >= 0; i--) {
//			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//		}
		
		int numFound = 0;
		for (int i = 50; i < 120; i++) {
			if (isPrime(i)) {
				System.out.println("Number " + i + " is a prime number");
				numFound += 1;
				if (numFound == 10) {
					break;
				}
			} 
			

			
			
		}
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int x = 2; x * x <= n; x++) { // Same as this ---> for (int x = 2; x <= Math.sqrt(n); x++) --> This gets the square root or less 
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		
		
		return amount*(interestRate/100);
	}

}
