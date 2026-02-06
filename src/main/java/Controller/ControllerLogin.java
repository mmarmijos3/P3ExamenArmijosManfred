
package Controller;

import Model.FacadeLogin;
import View.ViewBancaMovil;

public class ControllerLogin {
    private ViewBancaMovil viewLogin;
    private FacadeLogin modelLogin;

    public ControllerLogin(ViewBancaMovil viewLogin) {
        this.viewLogin = viewLogin;
        this.modelLogin = new FacadeLogin();
        prepareButtons();
    }

    public void showViewBancaMovil(){
        viewLogin.setVisible(true);
    }
    
    private void prepareButtons(){
        viewLogin.getBtnLogin().addActionListener(e -> login());
        viewLogin.getBtnExit().addActionListener(e -> exit());
    }
    
    
    private boolean isAdmin(){
        if (viewLogin.getUsername().equals("admin") &&
                viewLogin.getPassword().equals("admin")){
            return true;
        }
        return false;
    }
   
    private void login() {
        if (isAdmin()){
            viewLogin.clear();
            goCR();
        }
        if (validateEmptyFields() && validCredentials()){
            viewLogin.clear();
            goContacto();
        }
    }
    
    private void goCR(){
        viewLogin.setVisible(false);
        MainController.showCR();
    }
    
    private void goContacto(){
        viewLogin.setVisible(false);
        MainController.showContact();
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
