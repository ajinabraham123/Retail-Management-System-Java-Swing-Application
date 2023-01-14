/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Enterprise.CustomerServiceUnit;
import Model.Role.EmergencyAdminRole;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Organization.Type type,String name) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.CustomerServiceAdminDepartment.getValue())) {
            organization = new EmergencyOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.LabDepartment.getValue())) {
            organization = new DepartmentOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.CustomerAgentDepartment.getValue())){
                    organization=new AgentOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BillingDepartment.getValue())){
                    organization=new BillingOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CustomerServiceDepartment.getValue())){
                    organization=new QueryDepartmentOrganization(name);
                    organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HumanResourceDepartment.getValue())){
                  organization=new HumanResourceOrganization(name);
                  organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CustomertDepartment.getValue())){
                  organization=new CustomerOrganization(name);
                  organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ProductDepartment.getValue())){
                 organization=new ProductOrganization(name);
                 organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PersonDepartment.getValue())){
                 organization=new PersonOrganization(name);
                 organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CustomerQueryDepartment.getValue())){
                 organization=new CustomerQueryOrganization(name);
                 organizationList.add(organization);
        }
        
        return organization;
    }
    
}
