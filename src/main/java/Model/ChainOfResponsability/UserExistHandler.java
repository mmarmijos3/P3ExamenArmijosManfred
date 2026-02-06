package Model.ChainOfResponsability;

import Model.Entities.Customer;

public class UserExistHandler extends BaseHandler{

    @Override
    public String validate(Customer user, String password) {
        if (user == null){
            return "User not exist";
        }
        
        return super.validate(user, password);
    }
    
}
