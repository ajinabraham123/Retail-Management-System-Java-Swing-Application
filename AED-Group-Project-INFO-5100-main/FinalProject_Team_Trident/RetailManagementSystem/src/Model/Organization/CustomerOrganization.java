/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.EmergencyAdminRole;
import Model.Role.CustomerRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class CustomerOrganization extends Organization{

    public CustomerOrganization() {
        super(Organization.Type.CustomertDepartment.getValue());
    }
      public CustomerOrganization(String name) {
        super(name);
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        return roles;
    }
    
     @Override
    public Type getType() {
        return Organization.Type.CustomertDepartment;
    } 
    
}
