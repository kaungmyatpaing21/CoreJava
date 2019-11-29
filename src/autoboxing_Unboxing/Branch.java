package autoboxing_Unboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String newCustomerName, double amount){
        if(findCustomer(newCustomerName) == null){
            this.customers.add(new Customer(newCustomerName, amount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.getTransactions().add(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            Customer customer = customers.get(i);
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }
}

