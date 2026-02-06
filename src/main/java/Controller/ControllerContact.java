package Controller;

import Model.ModelContacto;
import View.ViewContacto;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerContact {
    private ViewContacto view;
    private ModelContacto model;

    public ControllerContact(ViewContacto view, ModelContacto model) {
        this.view = view;
        this.model = model;
        prepareButtons();
    }

    public void iniciar(){
        view.setVisible(true);
    }
    
    private void prepareButtons(){
        view.getBtnValidate()   .addActionListener(e -> validate());
        view.getBtnContinue()   .addActionListener(e -> confirm());
        view.getBtnExit()       .addActionListener(e -> cerrar());
    }

    private void cerrar() {
        MainController.showLogin();
        view.setVisible(false);
    }
    
    
    private void validate(){
        if(validBenefiet()){
            view.getBtnContinue().setEnabled(true);
        }
    }
    
    private void confirm(){
        MainController.showTransfer();
        view.setVisible(false);
    }

    
//    public void addPacienteInQueue(String type, String category, String name, String imo, int occupancy) {
//        crud.create(documentPaciente(createPaciente(type, category, name, imo, occupancy)));
//    }
    
    private boolean validBenefiet(){
        model.findUserByCedula(view.getCedula());
        if(ModelContacto.getBenefited() != null){
            view.showErrors(ModelContacto.getBenefited().getName());
            System.out.println(ModelContacto.getBenefited().getName());
            return  true;
        }
        view.showErrors("NO encontrado");
        
        return false;
    }  
}
