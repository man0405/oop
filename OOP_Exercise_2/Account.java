package OOP_Exercise_2;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance;
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        balance = 0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return customer.toString() + " balance=" + df.format(balance) ;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit( double amount ) {
        this.balance += amount;
        return this;
    }
    public Account withdraw( double amount ) {
        if (amount <= balance) {
            this.balance -= amount;
        } else System.out.println("amount withdraw exceeds the current balance");

        return this;

    }


    

    
    
}
