
package Controller;

import Model.CustomerRegistration;
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
            new ControllerCR(viewCR, new CustomerRegistration(new CRUDClients(), new Documentation())).iniciar();
        }
        viewCR.setVisible(true);
    }
    
}
