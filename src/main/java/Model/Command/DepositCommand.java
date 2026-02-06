package Model.Command;

import Model.Entities.Customer;

public class DepositCommand implements Command{
    private final Customer customer;
    private double amount;

    public DepositCommand(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        customer.deposit(amount);
    }
}
