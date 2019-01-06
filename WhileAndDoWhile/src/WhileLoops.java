
public class WhileLoops {

	public static void main(String[] args) {
		int count = 1;
		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;
		}

		count = 1;
		while(true) {
			if (count == 6) {
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}
		
		count = 1;
		do {
			System.out.println("Count value is " + count);
			count++;
		} while(count != 6);
		
		int number = 4;
		int finishNumber = 20;
		int numFound = 0;
		
		while (number <= finishNumber) {
			number++;
			if (!(number % 2 == 0)) {
				continue;
			}
			if (numFound >= 5) {
				break;
			}
			numFound++;
			System.out.println("Even number is " + number);
		}
		
		System.out.println("Total even numbers found = " + numFound);
	}
	
	

}
