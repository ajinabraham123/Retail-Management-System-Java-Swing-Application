/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddhisawant
 */
public class DepartmentList {
     private ArrayList<Department> departmentList;

    public DepartmentList() {
        this.departmentList = new ArrayList<Department>() ;
    }
    
     public Department addNewDepartment(String name,  String number, String homeAddress)
    {
        Department department = new Department(name,number,homeAddress);
        departmentList.add(department);
        return department;
    }
   
   

    public ArrayList<Department> getdepartmentList() {
        return departmentList;
    }

    public void setdepartmentList(ArrayList<Department> ambulanceList) {
        this.departmentList = ambulanceList;
    }
   
}
