package Autoboxing_Unboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }
}
