
public class MethodOverloading {
	public static void main(String[] args) {
		int newScore = calculateScore("Lloyd", 12);
//		System.out.println("New score is " + newScore);
//		calculateScore(75);
//		calculateScore("Christine", 212);
//		calculateScore();
		
		calcFeetAndInchesToCentimeters(8, 4);
		
		calcFeetAndInchesToCentimeters(100);
		
	}
	
	// Must change the amount of parameters to make methods unique but use the same name
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player: " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}	
	
	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}	
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double centimeters;
		if ((feet >= 0) || (inches >= 0 || inches <= 12)) {
			centimeters = (inches*2.54) + (feet*30.48);
		} else {
			return -1;
		}
		System.out.println(feet + " feet and " + inches + " inches is equal to " + centimeters + " cm");
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		
		System.out.println(inches + " inches is equal to " + feet + " and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
	}
}
