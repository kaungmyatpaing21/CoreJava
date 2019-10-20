package OOP_master_challenge;

public class HealthyBurger extends Hamburger {
    private String healthyName1;
    private double healthyPrice1;

    private String healthyName2;
    private double healthyPrice2;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "white");
    }

    public void addHealthAddition1(String healthyName1, double healthyPrice1){
        this.healthyName1 = healthyName1;
        this.healthyPrice1 = healthyPrice1;
    }

    public void addHealthAddition2(String healthyName2, double healthyPrice2){
        this.healthyName2 = healthyName2;
        this.healthyPrice2 = healthyPrice2;
    }

    @Override
    public double itemizeHamburger(){
        double healthyHamburgerPrice = super.itemizeHamburger();
        if(this.healthyName1 != null){
            healthyHamburgerPrice += this.healthyPrice1;
            System.out.println("Added " + this.healthyName1 + " for an extra " + this.healthyPrice1);
        }
        if(this.healthyName2 != null){
            healthyHamburgerPrice += this.healthyPrice2;
            System.out.println("Added " + this.healthyName2 + " for an extra " + this.healthyPrice2);
        }
        return healthyHamburgerPrice;
    }
}
