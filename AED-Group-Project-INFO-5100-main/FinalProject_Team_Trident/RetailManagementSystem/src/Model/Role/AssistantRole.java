/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Location.Location;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerServiceUnitAdminArea.CustomerServiceUnitAdminWorkAreaJPanel;
import userinterface.SubDepartmentWorkArea.SubDepartmentAreaJPanel;

/**
 *
 * @author siddhisawant
 */
public class AssistantRole extends Role {

  
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Location network, EcoSystem business) {
         return new SubDepartmentAreaJPanel(userProcessContainer,account,organization,enterprise,network,business);
    }

     @Override
    public String toString(){
        return (RoleType.LabAssistantRole.getValue());
    }
}
