package oop_master_challenge;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(){
        super("deluxe", "sausage & bacon", 10.0,"white");
        super.addHamburgerAddition1("chips", 2.0);
        super.addHamburgerAddition2("drinks", 1.5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add additional items to deluxe burger.");
    }

}
