package Model;

import Model.Command.OperationInvoker;
import Model.Command.TransferCommand;
import Model.Entities.Customer;
import Model.Mongo.CRUDClients;
import Model.Mongo.Documentation;
import Model.Mongo.OperationsCRUD;

/**
 *
 * @author espe
 */
public class ModelTransfer {
    private OperationsCRUD crud;
    private OperationInvoker invoker;
    private Documentation documentacion;
    private Customer currentCustomer;
    private Customer benefited;
    
    // Default constructor uses predefined users
    public ModelTransfer() {
        this.crud = new CRUDClients();
        this.documentacion = new Documentation();
        this.currentCustomer = FacadeLogin.getCurrentCustomer();
        this.benefited = ModelContacto.getBenefited();
        this.invoker = new OperationInvoker();
        System.out.println("El usuario: " + FacadeLogin.getCurrentCustomer().toString());
        System.out.println("El contacto: " + ModelContacto.getBenefited().toString());
        
    }
    
    public void makeATransfer(double amount){
        TransferCommand transfer = new TransferCommand(currentCustomer, benefited, amount);
        invoker.addCommand(transfer);
        invoker.executeCommands();
        updateCustomers();
    }
    
    public void resetAll(){
        FacadeLogin.resetCurrentCustomer();
        ModelContacto.resetBenefited();
    }
    
    private void updateCustomers(){
        crud.update(currentCustomer.getCedula(), documentacion.customerToDocument(currentCustomer));
        crud.update(benefited.getCedula(), documentacion.customerToDocument(benefited));
    }

    public Customer getBenefited() {   
        return benefited;
    }
    
    public Customer getCustomer() {   
        return currentCustomer;
    }
    
}
