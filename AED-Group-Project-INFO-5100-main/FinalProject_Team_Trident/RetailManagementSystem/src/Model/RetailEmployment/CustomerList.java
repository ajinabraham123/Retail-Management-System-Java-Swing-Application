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
public class CustomerList {
    private ArrayList<Customer> customerList;

    public CustomerList() {
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
      public Customer addNewCustomer(String fullName, String email, String phoneNumber, int age, String homeAddress, 
              String userName, Date birthdate,String bloodGrp,String doctor,String gender,String location)
    {
        Customer customer = new Customer(fullName,email,phoneNumber,age, homeAddress,userName,birthdate,bloodGrp,
                doctor,gender,location);
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer customer)
    {
        customerList.remove(customer);
    }

    
    
    
}
