 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WorkQueue;

import Model.Product.Product;
import Model.RetailEmployment.Agent;
import Model.RetailEmployment.Customer;
import Model.Location.Location;
import Model.Organization.Organization;
import java.util.Date;

/**
 *
 * @author felicia
 */
public class BillingWorkRequest extends WorkRequest {
    
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Location senderNetwork;
    private Location recieverNetwork;
    private String billingRequestId;
    private String ProductId;
    private String ProductName;
    private int noOfUnits;
    private double fundsAvailable;
    private double equipmentPrice;
    private double totalEquipmentCost;
    private Product product;
    private double fundAllocated;
    private String status;
    Date requestdate;
    Date acknowledgeDate;
    Date resolveDate;
    String Status ;
    int min = 100;
    int max = 999;

    public BillingWorkRequest () {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        billingRequestId= "BR"+randomNum;
        
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getBillingRequestId() {
        return billingRequestId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String EquipmentId) {
        this.ProductId = EquipmentId;
    }

    public void setBillingRequestId(String billingRequestId) {
        this.billingRequestId = billingRequestId;
    }

    public double getFundAllocated() {
        return fundAllocated;
    }

    public void setFundAllocated(double fundAllocated) {
        this.fundAllocated = fundAllocated;
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

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public double getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(double fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public double getProductPrice() {
        return equipmentPrice;
    }

    public void setProductPrice(double productPrice) {
        this.equipmentPrice = productPrice;
    }

    public double getTotalProductCost() {
        return totalEquipmentCost;
    }

    public void setTotalProductCost(double totalProductCost) {
        this.totalEquipmentCost = totalProductCost;
    }
    
    
    @Override
    public String toString() {
        return billingRequestId;
    }
    
    
}
