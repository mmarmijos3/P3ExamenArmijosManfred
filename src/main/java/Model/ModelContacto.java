package Model;

import Model.Entities.Customer;
import Model.Mongo.CRUDClients;
import Model.Mongo.Documentation;
import Model.Mongo.OperationsCRUD;
import java.util.List;

/**
 *
 * @author espe
 */
public class ModelContacto {
    private final List<Customer> customers;
    private OperationsCRUD crud;
    private Documentation documentacion;
    private Customer currentCustomer;
    private static Customer benefited;


    // Constructor with custom user list
    public ModelContacto(List<Customer> customers) {
        this.customers = customers;
    }
    
    // Default constructor uses predefined users
    public ModelContacto() {
        this.crud = new CRUDClients();
        this.documentacion = new Documentation();
        this.customers = documentacion.listToListCustomers(crud.read());
        System.out.println("Le llega al contacto: " + FacadeLogin.getCurrentCustomer().toString());
        this.currentCustomer = FacadeLogin.getCurrentCustomer();
    }
    
    // Find user by username in the list
    public Customer findUserByCedula(String cedula) {
        System.out.println("busqueda osbre: " + customers.toString());
        for (Customer user : customers) {
            System.out.println("cedula buscada : " + cedula);
            System.out.println("buscando en: " + user.toString());
            if (cedula.equals(user.getCedula())) {
                System.out.println("encontro a : " + user.toString());
                benefited = user;
                return user;
            }
        }
        return null;
    }

    public static Customer getBenefited() {
        
        return benefited;
    }
    
}
