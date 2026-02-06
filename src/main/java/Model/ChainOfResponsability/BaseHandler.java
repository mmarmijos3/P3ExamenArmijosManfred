package Model.ChainOfResponsability;

import Model.Entities.Customer;

public abstract class BaseHandler implements LoginHandler{
    private LoginHandler next;
    
    @Override
    public void setNext(LoginHandler next){
        this.next = next;
    }
    
    @Override
    public String validate(Customer customer, String password){
        if(next != null){
            return next.validate(customer, password);
        }
        return null;
    }

}
