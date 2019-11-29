package oop_master_challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("lettuce", 0.21);
        hamburger.addHamburgerAddition2("Tomato", 0.3);
        hamburger.addHamburgerAddition3("Cheese", 0.21);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 3.1);
        healthyBurger.addHealthAddition1("Egg", 1.1);
        healthyBurger.addHealthAddition2("lentils", 2.1);
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeHamburger db = new DeluxeHamburger();
        System.out.println("Deluxe burger price : "+ db.itemizeHamburger());
        db.addHamburgerAddition1("Egg", 2);
    }
}
