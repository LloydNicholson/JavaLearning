

class Hamburger {
	private String breadRollType;
	private String meatType;
	private boolean lettuceAdded;
	private boolean carrotsAdded;
	private boolean tomatoAdded;
	private boolean gerkinsAdded;
	
	private double basePrice = 28;
	private double overallPrice;
	
	public Hamburger(String breadRollType, String meatType, boolean lettuce, boolean carrots, boolean tomato,
			boolean gerkins) {
		this.breadRollType = breadRollType;
		this.meatType = meatType;
		this.lettuceAdded = lettuce;
		this.carrotsAdded = carrots;
		this.tomatoAdded = tomato;
		this.gerkinsAdded = gerkins;
	}
	
	public double getOverallPrice() {
		double price = overallPrice;
		
		price += basePrice;
		
		if (carrotsAdded) {
			price += 10.50;
		}
		
		if (tomatoAdded) {
			price += 8.50;
		}
		
		if (gerkinsAdded) {
			price += 12.50;		
		}
		
		if (lettuceAdded) {
			price += 6.50;
		}
		
		System.out.println("The " + getClass().getSimpleName() + " was R" + price);
		return price;
	}
	
	public String getBreadRollType() {
		return breadRollType;
	}

	public String getMeatType() {
		return meatType;
	}

	public boolean isLettuceAdded() {
		return lettuceAdded;
	}

	public boolean isCarrotsAdded() {
		return carrotsAdded;
	}

	public boolean isTomatoAdded() {
		return tomatoAdded;
	}

	public boolean isGerkinsAdded() {
		return gerkinsAdded;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	
}

class HealthyHamburger extends Hamburger {

	public HealthyHamburger(String meatType, boolean lettuce, boolean carrots, boolean tomato,
			boolean gerkins) {
		super("Rye", meatType, lettuce, carrots, tomato, gerkins);
		
	}

	@Override
	public double getOverallPrice() {
		return super.getOverallPrice();
	}
	
	
	
}

class DeluxeHamburger extends Hamburger {

	private boolean chipsAdded;
	private boolean drinksAdded;
	
	public DeluxeHamburger(String breadRollType, String meatType, boolean lettuce, boolean carrots, boolean tomato,
			boolean gerkins) {
		super(breadRollType, meatType, lettuce, carrots, tomato, gerkins);
		this.chipsAdded = true;
		this.drinksAdded = true;
	}
	
	@Override
	public double getOverallPrice() {
		return super.getOverallPrice();
	}

	public boolean isChipsAdded() {
		return chipsAdded;
	}

	public boolean isDrinksAdded() {
		return drinksAdded;
	}

}

public class Main {

	public static void main(String[] args) {
		Hamburger baseHamburger = new Hamburger("Brown bun", "Beef", true, false, true, true);
		
		HealthyHamburger healthyHamburger = new HealthyHamburger("Chicken", true, true, true, true);
		
		DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Brown bun" ,"Beef", true, true, true, true);

		baseHamburger.setBasePrice(35);
		healthyHamburger.setBasePrice(50);
		deluxeHamburger.setBasePrice(45);
		
		baseHamburger.getOverallPrice();
		System.out.println("Base hamburger price is R" + baseHamburger.getBasePrice());
		healthyHamburger.getOverallPrice();
		deluxeHamburger.getOverallPrice();
	}

}
