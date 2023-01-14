/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.HumanResource.HumanR;
import Model.Role.AssistantRole;
import Model.Role.HumanResourceAdmin;
import Model.Role.HRUser;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class HumanResourceOrganization extends Organization{
    private ArrayList<HumanR> empList;
    
    public HumanResourceOrganization() {
        super(Organization.Type.HumanResourceDepartment.getValue());
    }
    public HumanResourceOrganization(String name){
        super(name);
          empList=new ArrayList<HumanR>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       // roles.add(new HumanResourceAdmin());
        roles.add(new HRUser());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.HumanResourceDepartment;
    } 

     public ArrayList<HumanR> getHRList() {
        return empList;
    }

    public void setMedList(ArrayList<HumanR> empList) {
        this.empList = empList;
    }
    
     public void addDepartment(HumanR mi)
    {
       
        empList.add(mi);
        
    }
}
