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
import Model.ProductIssue.ProductIssue;
import java.util.Date;

/**
 *
 * @author felicia
 */
public class AgentCheckWorkRequest extends WorkRequest {
    private ProductIssue checkUp;
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Location senderNetwork;
    private Location recieverNetwork;
    private Customer customer  ;
    private Agent agent;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    String checkupRequestId ;
      int min = 100;
    int max = 999;

    public AgentCheckWorkRequest() {
        checkUp = new ProductIssue();
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        checkupRequestId= "CHK"+randomNum;
    }

    public String getCheckupRequestId() {
        return checkupRequestId;
    }

    public void setCheckupRequestId(String checkupRequestId) {
        this.checkupRequestId = checkupRequestId;
    }

    
    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    
    public ProductIssue getCheckUp() {
        return checkUp;
    }

    public void setCheckUp(ProductIssue checkUp) {
        this.checkUp = checkUp;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
    
    
}
