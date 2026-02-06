package Model.Command;

import Model.Entities.Customer;

public class TransferCommand implements Command{
    private final Customer customer;
    private final Customer benefited;
    private double amount;

    public TransferCommand(Customer customer, Customer benefited, double amount) {
        this.customer = customer;
        this.benefited = benefited;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        customer.transfer(benefited, amount);
    }
}
