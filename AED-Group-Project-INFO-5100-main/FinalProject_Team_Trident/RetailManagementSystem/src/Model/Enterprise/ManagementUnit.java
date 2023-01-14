/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.HumanResourceAdmin;
import Model.Role.PersonRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class ManagementUnit extends Enterprise {
    public ManagementUnit(String name){
        super(name, Enterprise.EnterpriseType.ManagementUnit);
    }
    
      @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new PersonRole());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
