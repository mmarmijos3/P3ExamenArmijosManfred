package Model;

import Model.Entities.BuilderClient;
import Model.Entities.Customer;
import Model.Mongo.Documentation;
import Model.Mongo.OperationsCRUD;
import java.util.List;
import org.bson.Document;

public class CustomerRegistration {
    
    private OperationsCRUD crud;
    private Documentation documentacion;


    public CustomerRegistration(OperationsCRUD crud, Documentation documentacion) {
        this.crud = crud;
        this.documentacion = documentacion;
    }
    

//    public CustomerRegistration() {
//        this.crud = new CRUDClients();
//        this.documentacion = new Documentation();
//        this.builder = new BuilderClient();
//    }


    private Document documentCustomer(Customer customer){
        return documentacion.customerToDocument(customer);
    }
    
    private Customer formToCustomer(String name, String cedula, String email, String phone, double funds){
        return new BuilderClient()
            .setName(name)
            .setCedula(cedula)
            .setEmail(email)
            .setPhone(phone)
            .setFunds(funds)
            .build();
    }
    
    public void saveCustomer(String name, String cedula, String email, String phone, double funds) {
        crud.create(documentacion.customerToDocument(formToCustomer(name, cedula, email, phone, funds)));
    }
    
    public void updateCustomer(String cedulaEdit, String name, String cedula, String email, String phone, double funds) {
        crud.update(cedulaEdit, documentacion.customerToDocument(formToCustomer(name, cedula, email, phone, funds)));
    }
    
    public List<Object[]> getCustomers(){
        return documentacion.listToCustomers(crud.read());
    }
    
    public List<Object[]> searchCustomer(String nombre){
        return documentacion.listToCustomers(crud.find(nombre));
    }
    
    public void deleteCustomer(String nombre){
        crud.delete(nombre);
    }
    
    public void deleteQueue(){
        crud.deleteCollection();
    }
    
    public void deleteDatabase(){
        crud.deleteDatabase();
    }
    
}
