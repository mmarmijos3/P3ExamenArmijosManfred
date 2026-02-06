package Controller;

import Model.ModelTransfer;
import View.ViewTransferencia;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerTransfer {
    private ViewTransferencia view;
    private ModelTransfer model;

    public ControllerTransfer(ViewTransferencia view, ModelTransfer model) {
        this.view = view;
        this.model = model;
        prepareButtons();
    }

    public void iniciar(){
        view.setVisible(true);
        showInfo();
    }
    
    private void prepareButtons(){
        view.getBtnTransfer().addActionListener(e -> confirm());
        view.getBtnExit()   .addActionListener(e -> cerrar());
    }

    private void cerrar() {
        MainController.showContact();
        view.setVisible(false);
        model.resetAll();
    }
    
    private void showInfoBenefied(){
        view.showBenefitName(model.getBenefited().getName());
    }
    
    private void showInfoCustomer(){
        view.showFunds(String.valueOf(model.getCustomer().getFunds()));
    }
    
    private void showInfo(){
        showInfoBenefied();
        showInfoCustomer();
    }
    
    private void confirm(){
        if(validateFunds()){
            model.makeATransfer(Double.parseDouble(view.getAmount()));
            cerrar();
        }
    }

    
//    public void addPacienteInQueue(String type, String category, String name, String imo, int occupancy) {
//        crud.create(documentPaciente(createPaciente(type, category, name, imo, occupancy)));
//    }
    
    private boolean validateFunds() {
        
        String error = Validation.validateFunds(view.getAmount());
        
        if(error != null){
            view.showErrors(error);
            return false;
        }
        
        view.clear();
        return true;
    } 
}
