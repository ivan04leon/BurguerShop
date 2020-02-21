
public class Main {

	public static void main(String[] args) {
		Hamburger burger = new Hamburger("Basic","Sausage", 3.56, "White");
		double price= burger.itemizeHamburger();
		
		burger.addHamburguer1("Tomato", 0.27);
		burger.addHamburguer2("Lettuce", 0.75);
		burger.addHamburguer3("Mustard", 1.13);
		burger.addHamburguer4("Cheese", 0.14);
		System.out.println("Total burger price is " +burger.itemizeHamburger());
		
		//second exercise, a healthy burger
		HealthyBurger healthy = new HealthyBurger("Tofuu", 6.78);
		healthy.addHamburguer1("egg", 0.34);
		healthy.addHealthAddition1("lentils", 0.80);
		System.out.println("Total Healthy burger prices is: " +healthy.itemizeHamburger());

		//tird exercise, a deluxe burguer with come with chips and drinks, but no extra addition are allowed
		// you have a to find a way to automactically add these new asddition at the time the deluxe is created
		DeluxeBurger deluxe = new DeluxeBurger("Bacon", 5.54, "Garlic bread");
		deluxe.addHamburguer1("Pineapple", 0.22);
		deluxe.addHamburguer2("Avocado", 0.44);
		deluxe.chips("Big chips", 0.22);
		deluxe.drink("Coke", 0.12);
		System.out.println("Total Deluxe burger price is: "+deluxe.itemizeHamburger());
	}

}
