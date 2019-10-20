package Autoboxing_Unboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public void addNewBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
        }
    }

    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, amount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer Details for branch " + branchName);
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                System.out.println("Customer" + ": " + customer.getName() + " [" +(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println((j+1) + ". " + transactions.get(j));
                    }
                }
            }
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch branch = branches.get(i);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Branch> getBranches(){
        return this.branches;
    }
}
