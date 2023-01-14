/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Product.Product;
import Model.HumanResource.HumanR;
import Model.Role.ProductAdmin;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class ProductOrganization extends Organization {
    
    //private ArrayList<Equipment> equipmentList;
    
    public ProductOrganization() {
        super(Organization.Type.ProductDepartment.getValue());
    }

    public ProductOrganization(String name){
        super(name);
    }
    
    
    
    
    
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProductAdmin());
        return roles;
    }
    @Override
    public Type getType() {
        return Organization.Type.ProductDepartment;
    } 

    
}
