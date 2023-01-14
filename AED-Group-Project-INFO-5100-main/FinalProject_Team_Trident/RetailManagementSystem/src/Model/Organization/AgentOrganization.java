/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.HumanResource.TicketList;
import Model.Role.AgentRole;
import Model.Role.EmergencyAgentRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class AgentOrganization extends Organization {

    private ArrayList<TicketList> ticketlist;
    
    
    public AgentOrganization() {
        super(Organization.Type.CustomerAgentDepartment.getValue());
        ticketlist=new ArrayList<TicketList>();
    }
     public AgentOrganization(String name){
        super(name);
    }

     public ArrayList<TicketList> getTicketList() {
        return ticketlist;
    }

    public void setPrescriptionlist(ArrayList<TicketList> prescriptionlist) {
        this.ticketlist = prescriptionlist;
    }
    
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyAgentRole());
        roles.add(new AgentRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return Organization.Type.CustomerAgentDepartment;
    } 
    
    public void addPrescription(TicketList prescription){
        
         ticketlist.add(prescription);
         
        
    }


}
