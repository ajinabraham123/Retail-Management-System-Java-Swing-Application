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
public class DeoartmentWorkRequest extends WorkRequest {
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Location senderNetwork;
    private Location recieverNetwork;
    private String LabTestRequestId;
    private Customer patient;
    private Agent doctor;
    private String specimenType;
    private String patientId;
    private String labTestName;
    private String labTestAdminFeedback;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String status;
    int min = 100;
    int max = 999;
    
    public DeoartmentWorkRequest(){
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        LabTestRequestId= "LR"+randomNum;
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

    public String getDepartmentRequestId() {
        return LabTestRequestId;
    }

    public void setLabTestRequestId(String LabTestRequestId) {
        this.LabTestRequestId = LabTestRequestId;
    }

    public Customer getCustomer() {
        return patient;
    }

    public void setCustomer(Customer patient) {
        this.patient = patient;
    }

    public Agent getDoctor() {
        return doctor;
    }

    public void setAgent(Agent doctor) {
        this.doctor = doctor;
    }

    

    public String getSpecialType() {
        return specimenType;
    }

    public void setSpecialType(String specimenType) {
        this.specimenType = specimenType;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getLDepartmentTestName() {
        return labTestName;
    }

    public void setDepartmentName(String labTestName) {
        this.labTestName = labTestName;
    }

    public String getDepartmentAdminFeedback() {
        return labTestAdminFeedback;
    }

    public void setLabTestAdminFeedback(String labTestAdminFeedback) {
        this.labTestAdminFeedback = labTestAdminFeedback;
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return LabTestRequestId;
    }
}
