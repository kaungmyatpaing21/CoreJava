package Autoboxing_Unboxing;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("KBZ");

        bank.addNewBranch("Magwe");
        bank.addCustomer("Magwe", "luffy", 100);
        bank.addCustomer("Magwe", "zoro", 80.5);
        bank.addCustomer("Magwe", "sanji", 50.5);

        bank.addNewBranch("Mandalay");
        bank.addCustomer("Mandalay", "nami", 20.5);
        bank.addCustomer("Mandalay", "usop", 35.5);
        bank.addCustomer("Mandalay", "brook", 45.5);

        bank.addCustomerTransaction("Magwe", "luffy", 10.5);

        bank.listCustomers("Magwe", true);
    }
}
