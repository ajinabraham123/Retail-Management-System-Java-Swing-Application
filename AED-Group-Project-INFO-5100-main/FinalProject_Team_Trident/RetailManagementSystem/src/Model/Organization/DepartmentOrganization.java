/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.EmergencyAgentRole;
import Model.Role.AssistantRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class DepartmentOrganization extends Organization {

    public DepartmentOrganization() {
        super(Organization.Type.LabDepartment.getValue());
    }
     public DepartmentOrganization(String name){
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AssistantRole());
        return roles;
    }

    @Override
    public Type getType(){
        return Organization.Type.LabDepartment;
    } 
}
