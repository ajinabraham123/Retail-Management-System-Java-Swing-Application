/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

//import Business.Customer.CustomerDirectory;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.RetailEmployment.CustomerList;
import Model.Location.Location;

import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author felicia
 * @author siddhisawant
 * @author ajin
 */
public abstract class Role {
    
    public enum RoleType{
         AccountingAdminRole("AccountingAdminRole"),
        AdminRole("AdminRole"),
        QueryType("Query Department"),
        BillingAdminRole("BillingAdminRole"),
        AgentRole("AgentRole"),
        EmergencyAdminRole("EmergencyAdminRole"),
        EmergencyDoctorRole("EmergencyDoctorRole"),
        ServiceAgentRole("CustomerServiceAgentRole"),
        EquipmentAdmin("EquipmentAdmin"),
        LabAssistantRole("LabAssistantRole"),
        ManagementAdminRole("ManagementAdminRole"),
        MedicineAdmin("MedicineAdmin"),
        MedicineUser("MedicineUser"),
        PatientRole("PatientRole"),
        PersonRole("PersonRole"),
        ReceptionistRole("ReceptionistRole"),
        SystemAdminRole("SystemAdminRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,Organization organization,Enterprise enterprise,Location network,
            EcoSystem business);

    @Override
    public String toString() {
       return  this.getClass().getName();
    }
    
    
}