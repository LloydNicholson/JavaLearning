
public class Printer {
	private int tonerLevel = 100;
	private int numberOfPagesPrinted;
	private boolean isDuplexPrinter;
	
	public Printer(int tonerLevel, boolean isDuplexPrinter) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			System.out.println("Toner has reached max level");
		}

		this.numberOfPagesPrinted = 0;
		this.isDuplexPrinter = isDuplexPrinter;
	}
	
	public void printPages(int number) {
		int pagesToPrint = number;
		if (isDuplexPrinter) {
			numberOfPagesPrinted += (pagesToPrint / 2) + (pagesToPrint % 2); // prints a ceiled amount of pages if the number is odd
			System.out.println("Printed an additional " + pagesToPrint + " double sided pages");
		} else {
			numberOfPagesPrinted += pagesToPrint;
			System.out.println("Printed an additional " + pagesToPrint + " single sided pages");
		}
		tonerLevel -= pagesToPrint / 5;

	}
	
	public void refillToner() {
		System.out.println("Toner refilled");
		this.tonerLevel += 100 - this.tonerLevel;

	}
	
	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}
	
	
	
	
}
