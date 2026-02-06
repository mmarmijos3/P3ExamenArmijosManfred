package Model.ChainOfResponsability;

import Model.Entities.Customer;

public class PasswordMatchHandler extends BaseHandler{

    @Override
    public String validate(Customer customer, String password) {
        if (!customer.getPassword().equals(password)){
            System.out.println(customer.getPassword() + password);
            return "Incorrect password";
        }
        
        return super.validate(customer, password);
    }
    
}
