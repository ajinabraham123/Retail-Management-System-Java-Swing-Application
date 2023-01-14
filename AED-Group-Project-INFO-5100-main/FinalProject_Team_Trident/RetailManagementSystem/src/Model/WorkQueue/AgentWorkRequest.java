/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WorkQueue;

import Model.RetailEmployment.Agent;
import Model.RetailEmployment.Customer;
import Model.Location.Location;
import Model.Organization.Organization;
import java.util.Date;

/**
 *
 * @author felicia
 */
public class AgentWorkRequest extends WorkRequest {
    
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Location senderNetwork;
    private Location recieverNetwork;
    private Customer customer  ;
    private String criticality; //MEdium . low . High
    Agent EmergencyAgent ;
    Agent  customerLastAgent ;
    String emergencyRequestId ;
    EmergencyCustomerRequest emergencyCustomerRequest;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    int min = 100;
    int max = 999;

    public AgentWorkRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        emergencyRequestId= "DR"+randomNum;
        
    }

    public EmergencyCustomerRequest getEmergencyCustomerRequest() {
        return emergencyCustomerRequest;
    }

    public void setEmergencyCustomerRequest(EmergencyCustomerRequest emergencyCustomerRequest) {
        this.emergencyCustomerRequest = emergencyCustomerRequest;
    }
    
    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }



    public Agent getEmergencyAgent() {
        return EmergencyAgent;
    }

    public void setEmergencyAgent(Agent EmergencyAgent) {
        this.EmergencyAgent = EmergencyAgent;
    }

    public Agent getCustomerLastAgent() {
        return customerLastAgent;
    }

    public void setCustomerLastAgent(Agent customerLastAgent) {
        this.customerLastAgent = customerLastAgent;
    }

    public String getEmergencyRequestId() {
        return emergencyRequestId;
    }

    public void setEmergencyRequestId(String emergencyRequestId) {
        this.emergencyRequestId = emergencyRequestId;
    }

   
    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Date getAcknowledgeDate() {
        return acknowledgeDate;
    }

    public void setAcknowledgeDate(Date acknowledgeDate) {
        this.acknowledgeDate = acknowledgeDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

    public Organization getRecieverOrganization() {
        return recieverOrganization;
    }

    public void setRecieverOrganization(Organization recieverOrganization) {
        this.recieverOrganization = recieverOrganization;
    }

    public Location getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Location senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Location getRecieverNetwork() {
        return recieverNetwork;
    }

    public void setRecieverNetwork(Location recieverNetwork) {
        this.recieverNetwork = recieverNetwork;
    }
    
    
    @Override
    public String toString() {
        return emergencyRequestId;
    }
    
    
}
