package Model;

import Model.ChainOfResponsability.LoginHandler;
import Model.ChainOfResponsability.PasswordMatchHandler;
import Model.ChainOfResponsability.UserExistHandler;
import Model.Entities.Customer;
import Model.Mongo.CRUDClients;
import Model.Mongo.Documentation;
import Model.Mongo.OperationsCRUD;
import java.util.List;

/**
 * Handles user login validation logic
 */
public class FacadeLogin {
    // List of users for authentication
    private final List<Customer> customers;
    private OperationsCRUD crud;
    private Documentation documentacion;
    private static Customer currentCustomer;

    // Constructor with custom user list
    public FacadeLogin(List<Customer> customers) {
        this.customers = customers;
    }
    
    // Default constructor uses predefined users
    public FacadeLogin() {
        this.crud = new CRUDClients();
        this.documentacion = new Documentation();
        this.customers = documentacion.listToListCustomers(crud.read());
    }

    public static Customer getCurrentCustomer() {
        return currentCustomer;
    }

    
    // Find user by username in the list
    private Customer findUserByUsername(String username) {
        System.out.println(customers.toString());
        for (Customer user : customers) {
            if (username.equals(user.getUsername())) {
                currentCustomer = user;
                return user;
            }
        }
        return null;
    }
    
    // Validate username and password
    public String validateLogin(String username, String password) {
        Customer user = findUserByUsername(username);
        LoginHandler chain = createChain();
        return chain.validate(user, password);
    }
    
    // Create validation chain (Chain of Responsibility pattern)
    private LoginHandler createChain() {
        LoginHandler existHandler = new UserExistHandler();
        LoginHandler passwordHandler = new PasswordMatchHandler();
        
        existHandler.setNext(passwordHandler);
        
        return existHandler;
    }
}
