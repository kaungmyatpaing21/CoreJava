package oop_part_1;

public class BankMain {
    public static void main(String[] args) {
        Bank_account bankToken = new Bank_account();
        System.out.println("Account Number: " + bankToken.getAccount_no());
        System.out.println("Balance: " + bankToken.getBalance());
        System.out.println("Email: " + bankToken.getEmail());
        System.out.println("UserName: " + bankToken.getUserName());
        System.out.println("Phone: " + bankToken.getPhone());

        //deposit
        bankToken.deposit(10000);
        bankToken.withdraw(10000);
        bankToken.withdraw(200000);
    }
}
