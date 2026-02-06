package Model.Command;

import Model.Entities.Customer;

public class WithdrawCommand implements Command{
    private final Customer customer;
    private double amount;

    public WithdrawCommand(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        customer.withdraw(amount);
    }
}
