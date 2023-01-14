/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

//import Business.Customer.CustomerDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.RetailEmployment.CustomerList;
import Model.Location.Location;

import Model.Organization.Organization;
//import Business.Restaurant.RestaurantDirectory;
import Model.UserAccount.UserAccount;
//import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.CustomerServiceUnitAdminArea.CustomerServiceUnitAdminWorkAreaJPanel;
import userinterface.CustomerServiceUserWorkArea.CustomerServiceAdminWorkArea;
import userinterface.CustomerServiceUnitAdminArea.CustomerServiceUnitAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author ajin
 */
public class EmergencyAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,Location network, EcoSystem business) {
        return new CustomerServiceUnitAdminWorkAreaJPanel( userProcessContainer,enterprise, business);
        
        //userProcessContainer, business, account,restaurantDirectory
//        return null;
       // return new AdminWorkAreaJPanel(userProcessContainer, business, account,restaurantDirectory);
       
    }

     @Override
    public String toString(){
        return (RoleType.EmergencyAdminRole.getValue());
    }
    
    
}
