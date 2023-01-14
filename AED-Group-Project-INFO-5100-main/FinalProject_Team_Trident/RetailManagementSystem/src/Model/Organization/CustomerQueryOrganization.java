/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.EmergencyAgentRole;
import Model.Role.AssistantRole;
import Model.Role.CustomerQueryRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class CustomerQueryOrganization extends Organization {

    public CustomerQueryOrganization() {
        super(Organization.Type.CustomerQueryDepartment.getValue());
    
    }  
    public CustomerQueryOrganization(String name) {
            super(name);
    }
        

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerQueryRole());
        return roles;
    }
    
     @Override
    public Type getType() {
        return Organization.Type.CustomerQueryDepartment;
    } 

}
