package Model.Mongo;

import Model.Entities.BuilderClient;
import Model.Entities.Customer;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;




public class Documentation {
    
    public Document customerToDocument(Customer customer){
        return new Document()
            .append("name", customer.getName())
            .append("cedula", customer.getCedula())
            .append("email", customer.getEmail())
            .append("phone", customer.getPhone())
            .append("funds", customer.getFunds())
            .append("username", customer.getUsername())
            .append("password", customer.getPassword());
    }
    
    public Customer documentToCustomer(Document doc) {
        return new BuilderClient()
            .setName(doc.getString("name"))
            .setCedula(doc.getString("cedula"))
            .setEmail(doc.getString("email"))
            .setPhone(doc.getString("phone"))
            .setFunds(doc.getDouble("funds"))
            .setUsername(doc.getString("username"))
            .setPassword(doc.getString("password"))
            .build();
    }
    
    private Object[] customerToObject(Customer customer){
        Object[] object = new Object[7];

        object[0] = customer.getName();
        object[1] = customer.getCedula();
        object[2] = customer.getEmail();
        object[3] = customer.getPhone();
        object[4] = customer.getFunds();
        object[5] = customer.getUsername();
        object[6] = customer.getPassword();

        return object;
    }
    
    
    public List<Object[]> listToCustomers(List<Document> documentos){
        List<Object[]> datos = new ArrayList<>();
        
        for (Document doc : documentos){
            datos.add(customerToObject(documentToCustomer(doc)));
        }
        
        return datos;
    }
    
    public List<Customer> listToListCustomers(List<Document> documentos){
        List<Customer> customer = new ArrayList<>();
        
        for (Document doc : documentos){
            customer.add(documentToCustomer(doc));
        }
        
        return customer;
    }
    
}
