package oop_part_1;

import java.sql.SQLOutput;

public class Bank_account {
    private long account_no;
    private double balance;
    private String userName;
    private String email;
    private String phone;

    public Bank_account(){
        this(123456, 0.1, "default Name", "default email", "default Phone");
        //make sure the statement of calling another constructor to the first line
        System.out.println("Constructor without parameters called.");
    }

    public Bank_account(long account_no, double balance, String userName, String email, String phone){
        this.account_no = account_no;
        this.balance = balance;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        System.out.println("Constructor with parameters called.");
    }

    public void setAccount_no(long account_no){
        this.account_no = account_no;
    }

    public long getAccount_no(){
        return account_no;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setUserName(String userName){
        String validUserName = userName.strip();
        this.userName = validUserName;
    }

    public String getUserName(){
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public void deposit(double balance){
        this.balance += balance;
        System.out.println("You have successfully deposited. Now you have " + this.balance + " dollars.");
    }

    public void withdraw(double balance){
        if (this.balance > balance){
            this.balance -= balance;
            System.out.println("Successfully withdrawed. Now you have "+ this.balance + " dollars.");
        }else{
            System.out.println("Insufficient funds. You have only " + this.balance + " dollars.");
        }
    }
}
