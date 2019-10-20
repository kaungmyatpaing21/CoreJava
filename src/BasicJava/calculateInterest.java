package BasicJava;

public class calculateInterest {
    public static void main(String[] args) {
        calculateInterest(10000);
    }

    public static void calculateInterest(double amount){
        for(double i = 8; i >= 2; i--){
            System.out.println(String.format("%.2f", amount * (i / 100)));
        }
    }
}
