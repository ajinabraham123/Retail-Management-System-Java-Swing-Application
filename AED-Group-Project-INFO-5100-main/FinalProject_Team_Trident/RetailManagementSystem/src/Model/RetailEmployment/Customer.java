/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

import Model.HumanResource.TicketListDir;
import java.util.Date;

/**
 *
 * @author siddhisawant
 */
public class Customer {
    
    private int customerId;
    private String customerName;
    private int age;
    private String Gender;
    private String Test;
    private String agent;
    private CustomerHistory customerHistory;
    private String emailAddress;
    private  String address; 
    private String userName;
    private String phoneNumber;
    private Date birthDate;
    private String bloodGrp;
    private TicketListDir prescriptionlist;
    private static int customerCount=1;
   private String location;
    
    public Customer(String firstName, String email, String phoneNumber, int age, String homeAddress, 
            String userName, Date birthdate,String bloodGrp,String doc,String gender,String location){
        this.customerName = firstName;
        this.emailAddress = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = homeAddress;
        this.userName = userName;
        this.customerId = customerCount;
        this.birthDate = birthdate;
        this.agent = doc;
        this.Gender = gender;
        this.bloodGrp = bloodGrp;
        this.location = location;
        this.prescriptionlist = new TicketListDir();
        customerCount++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TicketListDir getTicketlist() {
        return prescriptionlist;
    }

    public void setTicketlist(TicketListDir prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

  

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomertId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public CustomerHistory getCustomerHistory() {
        return customerHistory;
    }

    public void setCustomerHistory(CustomerHistory CustomerHistory) {
        this.customerHistory = CustomerHistory;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
 
    @Override
     public String toString()
     {
         return this.customerName;
     }
     
     
}
