/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.EmergencyAgentRole;
import Model.Role.EmergencyAdminRole;
import Model.Role.EmergencyUserRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class EmergencyOrganization extends Organization {

    public EmergencyOrganization() {
        super(Organization.Type.CustomerServiceAdminDepartment.getValue());
        
    }
    
    public EmergencyOrganization(String name){
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       
        roles.add(new EmergencyUserRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.CustomerServiceAdminDepartment;
    } 


}
