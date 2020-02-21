
public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String aditionName1;
	private double aditionPrice1;
	
	private String aditionName2;
	private double aditionPrice2;
	
	private String aditionName3;
	private double aditionPrice3;
	
	private String aditionName4;
	private double aditionPrice4;
	
	
	public Hamburger (String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	
	public void addHamburguer1(String name, double price) {
		this.aditionName1 = name;
		this.aditionPrice1 = price;
	}
	
	public void addHamburguer2(String name, double price) {
		this.aditionName2 = name;
		this.aditionPrice2 = price;
	}
	
	public void addHamburguer3(String name, double price) {
		this.aditionName3 = name;
		this.aditionPrice3 = price;
	}
	
	public void addHamburguer4(String name, double price) {
		this.aditionName4 = name;
		this.aditionPrice4 = price;
	}
	
	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburguer on a "+this.breadRollType + " roll"
				+ " with "  +this.meat + ", price is: " +this.price);
		
		if(this.aditionName1 != null) {
			hamburgerPrice += this.aditionPrice1;
			System.out.println("Added " +this.aditionName1 + " for an extra " + this.aditionPrice1);
		}
		
		if(this.aditionName2 != null) {
			hamburgerPrice += this.aditionPrice2;
			System.out.println("Added " +this.aditionName2 + " for an extra " + this.aditionPrice2);
		}
		
		if(this.aditionName3 != null) {
			hamburgerPrice += this.aditionPrice3;
			System.out.println("Added " +this.aditionName3 + " for an extra " + this.aditionPrice3);
		}
		
		if(this.aditionName4 != null) {
			hamburgerPrice += this.aditionPrice4;
			System.out.println("Added " +this.aditionName4 + " for an extra " + this.aditionPrice4);
		}
		
		return hamburgerPrice;
	}
	
}
