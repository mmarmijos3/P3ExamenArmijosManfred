
package Controller;

import Model.ModelLogin;
import View.ViewBancaMovil;

public class ControllerLogin {
    private ViewBancaMovil viewLogin;
    private ModelLogin modelLogin;

    public ControllerLogin(ViewBancaMovil viewLogin) {
        this.viewLogin = viewLogin;
        this.modelLogin = new ModelLogin();
        prepareButtons();
    }

    public void showViewBancaMovil(){
        viewLogin.setVisible(true);
    }
    
    private void prepareButtons(){
        viewLogin.getBtnLogin().addActionListener(e -> login());
        viewLogin.getBtnExit().addActionListener(e -> exit());
    }
    
    
    
   
    private void login() {
        if (validateEmptyFields() && validCredentials()){
            viewLogin.clear();
            goCR();
        }
    }
    
    private void goCR(){
        viewLogin.setVisible(false);
        MainController.showCR();
    }
    
    private boolean  validCredentials(){
        String errorMessage = modelLogin.validateLogin(
                viewLogin.getUsername(), 
                viewLogin.getPassword());
        
        if (errorMessage != null){
            viewLogin.showErrors(errorMessage);
            return false;
        }
        
        return true;
    }
    
    private boolean validateEmptyFields(){
        if(viewLogin.getUsername().isEmpty() || viewLogin.getPassword().isEmpty()){
            viewLogin.showErrors("Complete both fields");
            return false;
        }
        return true;
    }
    
    private void exit() {
        System.exit(0);
    }
}
