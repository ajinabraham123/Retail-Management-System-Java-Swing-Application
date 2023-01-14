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
////import Business.Restaurant.RestaurantDirectory;
import Model.UserAccount.UserAccount;
//import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import userinterface.EmergencyCustomerService.EmergencyCustomerServiceJPanel;

/**
 *
 * @author ajin
 */
public class DepartmentRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Location network,
            EcoSystem business) {
        return new EmergencyCustomerServiceJPanel(userProcessContainer, account,organization,enterprise,network,business);
        //return null;
        //return new CustomerAreaJPanel(userProcessContainer, account,business);
    }
    
     @Override
    public String toString(){
        return (RoleType.QueryType.getValue());
    }
}
