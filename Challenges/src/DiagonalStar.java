
public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(11);

	}
	
	public static void printSquareStar(int number) {
		if (number < 5) {
			System.out.println("Invalid Value");
		} else {
			for (int numRows = 0; numRows < number; numRows++) {
				for (int numCols = 0; numCols < number; numCols++) {
					if (numRows == 0 || numRows == number - 1) {
						System.out.print("*");
					} else if (numCols == 0 || numCols == number - 1) {
						System.out.print("*");
					} else if (numRows % numCols == 0 && numCols % numRows == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}
		}
	}
}
