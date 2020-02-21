
public class DeluxeBurger extends Hamburger{
	private String drink;
	private double drinkPrice;
	private String chips;
	private double chipsPrice;
	
	public DeluxeBurger (String meat, double price, String breadRollType ) {
		super("Deluxe", meat, price, breadRollType);
	}
	
	public void chips(String chips, double chipsPrice) {
		this.chips = chips;
		this.chipsPrice = chipsPrice;
	}
	
	public void drink(String drink, double drinkPrice) {
		this.drink = drink;
		this.drinkPrice = drinkPrice;
	}
	
	@Override
	public double itemizeHamburger() {
		double hamburgerPrice = super.itemizeHamburger();
		
		if(this.drink != null) {
			hamburgerPrice += this.drinkPrice;
			System.out.println("Added " +this.drink + " for an extra: " +this.drinkPrice);
		}
		if(this.chips != null) {
			hamburgerPrice += this.chipsPrice;
			System.out.println("Added " +this.chips +" for an extra: " +this.chipsPrice);
		}
		return hamburgerPrice;
	}

}
