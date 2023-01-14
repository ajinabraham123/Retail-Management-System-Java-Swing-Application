/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.ProductAdmin;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class ProductUnit extends Enterprise {
   public ProductUnit(String name) {
    super(name, Enterprise.EnterpriseType.LogisticUnit);
   }
    @Override
    
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new ProductAdmin());
       //  roles.add(new PoliceHead());
        return roles;
    }
}
