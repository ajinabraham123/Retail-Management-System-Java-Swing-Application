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
//import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author ajin
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Location network,
            EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    
       //return null;
    }
    
     @Override
    public String toString(){
        return (RoleType.SystemAdminRole.getValue());
    }
    
}
