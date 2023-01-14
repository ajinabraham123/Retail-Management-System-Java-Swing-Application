/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Location;

import Model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author ajin
 */
public class Location {
     private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Location()
    {
         enterpriseDirectory = new EnterpriseDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
     @Override
    public String toString() {
        return name;
    }
    
}
