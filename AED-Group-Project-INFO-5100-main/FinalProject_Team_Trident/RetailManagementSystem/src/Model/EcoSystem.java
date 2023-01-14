/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


//import Business.Customer.CustomerDirectory;
//import Business.DeliveryMan.DeliveryManDirectory;
//import Business.Restaurant.RestaurantDirectory;
import Model.Enterprise.Enterprise;
import Model.Product.ProductList;
import Model.RetailEmployment.AgentList;
import Model.RetailEmployment.CustomerList;
import Model.RetailEmployment.DepartmentList;
import Model.Location.Location;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ajin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
     private ArrayList<Location> networkList;
     private CustomerList patientDirectory;
     private AgentList doctroDirectory;
     private DepartmentList ambulanceDirectory;
     private ProductList equipmentList;
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
    public EcoSystem(String name) {
        
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        networkList = new ArrayList<Location>();
        patientDirectory = new CustomerList();
        doctroDirectory = new AgentList();
        ambulanceDirectory = new DepartmentList();
        equipmentList = new ProductList();

       
    }

    public Location createAndAddNetwork() {
        Location network = new Location();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Location> getLocationList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Location> networkList) {
        this.networkList = networkList;
    }

    
    public boolean checkIfUserIsUnique(String userName){
         if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }

        for (Location network : this.getLocationList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
    
//     public boolean checkIfUserIsUnique(String userName, EcoSystem ecoSys){
//        if(ecoSys==null){
//            System.out.println("BUSINESS IS NULL");
//        }
//        for (Location network : ecoSys.getLocationList()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    if (ua.getUsername().equalsIgnoreCase(userName)) {
//                        return false;
//                    }
//                }
//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                        if (ua.getUsername().equalsIgnoreCase(userName)) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
//
//        return true;
//        
//    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public AgentList getAgentDirectory() {
        return doctroDirectory;
    }

    public void setDoctroDirectory(AgentList doctroDirectory) {
        this.doctroDirectory = doctroDirectory;
    }

    public DepartmentList getDepartmentDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(DepartmentList ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public ProductList getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(ProductList equipmentList) {
        this.equipmentList = equipmentList;
    }



    public CustomerList getCustomerDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(CustomerList patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
}
