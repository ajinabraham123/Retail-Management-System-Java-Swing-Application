/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.DepartmentRole;
import Model.Role.EmergencyAgentRole;
import Model.Role.Role;
import java.util.ArrayList;
import Model.Role.EmergencyAdminRole;
import Model.Role.AssistantRole;
import Model.Role.CustomerRole;
import Model.Role.CustomerQueryRole;

/**
 *
 * @author siddhisawant
 */
public class CustomerServiceUnit extends Enterprise {
    
    public CustomerServiceUnit(String name) {
        super(name, Enterprise.EnterpriseType.CustomerServiceUnit);
    }

    @Override
    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new EmergencyAdminRole());
        roles.add(new EmergencyAgentRole());
        roles.add(new DepartmentRole());
        roles.add(new CustomerRole());
        roles.add(new AssistantRole());
        roles.add(new CustomerQueryRole());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
