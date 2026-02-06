package Model.Command;

import Model.Entities.Customer;

public class ConsultCommand implements Command{
    private final Customer customer;

    public ConsultCommand(Customer customer) {
        this.customer = customer;
    }
    
    @Override
    public void execute() {
        customer.consultFunds();
    }
}
