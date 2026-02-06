
package Controller;

import Model.FacadeRegistration;
import Model.ModelContacto;
import Model.ModelTransfer;
import Model.Mongo.CRUDClients;
import Model.Mongo.Documentation;
import View.*;

/**
 *
 * @author Manfred Armijos
 */
public class MainController {
    private static ViewBancaMovil viewLogin;
    private static ViewCustomerRegistration  viewCR;
    private static ViewContacto viewContacto;
    private static ViewTransferencia viewTransferencia;

    public MainController() {
    }

    
    public static void showLogin(){
        if (viewLogin == null){
            viewLogin = new ViewBancaMovil();
            new ControllerLogin(viewLogin).showViewBancaMovil();
        }
        viewLogin.setVisible(true);
    }
    
    public static void showCR(){
        if (viewCR == null){
            viewCR = new ViewCustomerRegistration();
            new ControllerCR(viewCR, new FacadeRegistration(new CRUDClients(), new Documentation())).iniciar();
        }
        viewCR.setVisible(true);
    }
    
    public static void showContact(){
        if (viewContacto == null){
            viewContacto = new ViewContacto();
            new ControllerContact(viewContacto, new ModelContacto()).iniciar();
        }
        viewContacto.setVisible(true);
    }
    
    public static void showTransfer(){
        if (viewTransferencia == null){
            viewTransferencia = new ViewTransferencia();
            new ControllerTransfer(viewTransferencia, new ModelTransfer()).iniciar();
        }
        viewTransferencia.setVisible(true);
    }
    
}
