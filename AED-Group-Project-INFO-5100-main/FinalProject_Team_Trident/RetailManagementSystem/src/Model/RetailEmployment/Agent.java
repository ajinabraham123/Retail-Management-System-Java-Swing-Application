/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

import java.util.Date;

/**
 *
 * @author siddhisawant
 */
public class Agent {
    private String customerName;
    private int age;
    private String Gender;
    private String qualification;
    private Date practicingfrom ;
    private String specilizationName;
    private String AgentName;
    private Boolean emergencyAgent;

    public Agent(String AgentName,String qualification, String specilizationName,Boolean emergencyAgent ) {
        this.qualification = qualification;
        this.specilizationName = specilizationName;
        this.AgentName = AgentName;
        this.emergencyAgent = emergencyAgent;
    }

    public Boolean getEmergencyAgent() {
        return emergencyAgent;
    }

    public void setEmergencyAgent(Boolean emergencyDoctor) {
        this.emergencyAgent = emergencyDoctor;
    }

           
    public String getAgentName() {
        return AgentName;
    }

    public void setAgentName(String DocName) {
        this.AgentName = DocName;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    
    public void setCustomerName(String patientName) {
        this.customerName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getPracticingfrom() {
        return practicingfrom;
    }

    public void setPracticingfrom(Date practicingfrom) {
        this.practicingfrom = practicingfrom;
    }

    public String getSpecilizationName() {
        return specilizationName;
    }

    public void setSpecilizationName(String specilizationName) {
        this.specilizationName = specilizationName;
    }
    
    @Override
    public String toString()
    {
        return AgentName;
    }
    
}
