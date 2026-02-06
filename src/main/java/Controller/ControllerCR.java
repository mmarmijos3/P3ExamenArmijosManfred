package Controller;

import Model.FacadeRegistration;
import View.ViewCustomerRegistration;

/**
 *
 * @author Manfred Armijos
 */
public class ControllerCR {
    private ViewCustomerRegistration view;
    private FacadeRegistration model;

    public ControllerCR(ViewCustomerRegistration view, FacadeRegistration model) {
        this.view = view;
        this.model = model;
        prepareButtons();
    }

    public void iniciar(){
        view.setVisible(true);
        sendDataToTable();
    }
    
    private void prepareButtons(){
        view.getBtnCreate()         .addActionListener(e -> savePaciente());
        view.getBtnUpdate()         .addActionListener(e -> updatePaciente());
        view.getBtnDelete()         .addActionListener(e -> deletePaciente());
        view.getBtnDelCollection()  .addActionListener(e -> deleteCollection());
        view.getBtnDelDB()          .addActionListener(e -> deleteDatabase());
        view.getBtnEdit()           .addActionListener(e -> editPaciente());
        view.getBtnCleanForm()      .addActionListener(e -> cleanForm());
        view.getBtnSearch()         .addActionListener(e -> searchPaciente());
        view.getBtnCleanSearch()    .addActionListener(e -> cleanSearch());
        view.getBtnExit()           .addActionListener(e -> cerrar());
    }

    private void cerrar() {
        MainController.showLogin();
        view.setVisible(false);
    }
    
    
    private void savePaciente(){
        if(isFormValid()){
            save();
        }
    }
    
    public void cleanForm() {
        view.cleanForm();
    }
    
//    public void addPacienteInQueue(String type, String category, String name, String imo, int occupancy) {
//        crud.create(documentPaciente(createPaciente(type, category, name, imo, occupancy)));
//    }
    
    private void save(){
        if(isFormValid())
            model.saveCustomer(
                view.getNameForm(),
                view.getCedulaForm(),
                view.getEmailForm(),
                view.getPhoneForm(),
                Double.parseDouble(view.getFundsForm())
            );
        sendDataToTable();
    }
    
    
    public void editPaciente() {
        if (view.getSelectedPaciente()== -1) return;
        
        cleanForm();
        
        view.setNameForm(view.getNameToEdit().toString());
        view.setCedulaForm(view.getCedulaToEdit().toString());
        view.setEmailForm(view.getEmailToEdit().toString());
        view.setPhoneForm(view.getPhoneToEdit().toString());
        view.setFundsForm(view.getFundsToEdit().toString());
        
        editionMode(true);
        
        view.enableTable(false);
        
        //view.showMensajes("Puede realizar los cambios");
    }
    
    
    private void editionMode(boolean edicion){
        view.getBtnUpdate().setEnabled(edicion);
        view.getBtnEdit().setEnabled(!edicion);
        view.getBtnCreate().setEnabled(!edicion);
        view.getBtnDelete().setEnabled(!edicion);
        view.getBtnDelCollection().setEnabled(!edicion);
        view.getBtnDelDB().setEnabled(!edicion);
        view.getBtnSearch().setEnabled(!edicion);
        view.getBtnCleanSearch().setEnabled(!edicion);
    }
    
    public void updatePaciente(){
        if(isFormValid()){
            model.updateCustomer(
                view.getCedulaToEdit().toString(),
                view.getNameForm(),
                view.getCedulaForm(),
                view.getEmailForm(),
                view.getPhoneForm(),
                Double.parseDouble(view.getFundsForm())
            );

            editionMode(false);
            
            view.enableTable(true);
            
            sendDataToTable();
            //view.showMensajes("Datos actualizados");
        }
    }
    
    private void deletePaciente(){
        if(view.isAnyPacienteSelected()){
            model.deleteCustomer(view.getCedulaToEdit().toString());
            sendDataToTable();
            view.clearPacienteSelection();
        }
        
    }
    
    private void deleteCollection() {
        model.deleteQueue();
        sendDataToTable();
    }
    
    private void deleteDatabase(){
        model.deleteDatabase();
        sendDataToTable();
    }
    
    public void searchPaciente(){
        sendFindToTable();
    }
    
    private void cleanSearch() {
        view.cleanErrorSearch();
        view.cleanCedulaToSearch();
        sendDataToTable();
    }
    
    private void sendDataToTable(){
        view.loadDataToTable(model.getCustomers());
    }
    
    private void sendFindToTable(){
        view.loadDataToTable(model.searchCustomer(view.getCedulaToSearch()));
    }
    
    
    private boolean isFormValid(){
        return (
                validateName()& 
                validateUniqueCedula()&
                validateEmail()&
                validatePhone()&
                validateFunds()
                );
    }
    
    private boolean isCedulaRegistered(String cedula){
        return !model.searchCustomer(cedula).isEmpty();
    }
    
    private boolean isCedulaChange(){
        if(view.getSelectedPaciente()== -1){
            return true;
        }
        return !view.getNameForm().equals(view.getNameToEdit().toString());
    }
    
    private boolean validateUniqueCedula() {

        if(!validateCedula()){
            return false;
        }
        if(isCedulaChange()&& isCedulaRegistered(view.getCedulaForm())){
            view.showlErrorCedula("Cliente ya registrado");
            return false;
        }
        
        view.cleanlErrorCedula();
        return true;
    }

    private boolean validateName() {
        
        String error = Validation.validateName(view.getNameForm());
        
        if(error != null){
            view.showlErrorName(error);
            return false;
        }
        
        view.cleanlErrorName();
        return true;
    }
    
    private boolean validateCedula() {
        
        String error = Validation.validateCedula(view.getCedulaForm());
        
        if(error != null){
            view.showlErrorCedula(error);
            return false;
        }
        
        view.cleanlErrorCedula();
        return true;
    }
    
    private boolean validateEmail() {
        
        String error = Validation.validateEmail(view.getEmailForm());
        
        if(error != null){
            view.showlErrorEmail(error);
            return false;
        }
        
        view.cleanlErrorEmail();
        return true;
    }
    
    private boolean validatePhone() {
        
        String error = Validation.validatePhone(view.getPhoneForm());
        
        if(error != null){
            view.showlErrorPhone(error);
            return false;
        }
        
        view.cleanlErrorPhone();
        return true;
    }
    
    private boolean validateFunds() {
        
        String error = Validation.validateFunds(view.getFundsForm());
        
        if(error != null){
            view.showlErrorFunds(error);
            return false;
        }
        
        view.cleanlErrorFunds();
        return true;
    }

 
    
}
