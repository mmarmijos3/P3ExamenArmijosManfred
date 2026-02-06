package Model.ChainOfResponsability;

import Model.Entities.Customer;

public interface LoginHandler {
    public String validate(Customer user, String password);
    public void setNext(LoginHandler next);
}
