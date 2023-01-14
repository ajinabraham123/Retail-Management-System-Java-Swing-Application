/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.BillingAdminRole;
import Model.Role.HumanResourceAdmin;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class HumanResourceUnit extends Enterprise{

    public HumanResourceUnit(String name) {
        super(name,EnterpriseType.HumanResourceUnit);
    }
    
    @Override    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new HumanResourceAdmin());
       //  roles.add(new PoliceHead());
        return roles;
    }
    
}
