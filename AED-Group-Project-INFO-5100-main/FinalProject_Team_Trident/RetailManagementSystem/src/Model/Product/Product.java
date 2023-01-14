/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Product;

/**
 *
 * @author siddhisawant
 */
public class Product {
    
    private String productID;
    private String productName;
    private String availableQuant;
    private String desc;
    private double cost;
    private double TotalCost;
     int min = 100;
    int max = 999;

    public Product(String equipmetName, String desc, String availableQuant, double cost, double totalcost) {
        this.productID = productID;
        this.productName = equipmetName;
        this.availableQuant = availableQuant;
        this.cost = cost;
        this.desc = desc;
        this.TotalCost = totalcost;
          int randomNum = (int)(Math.random() * (max - min + 1) + min);
        productID= "EQ-"+randomNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
    
    public String getproductID() {
        return productID;
    }

    public void setproductID(String equipmentID) {
        this.productID = equipmentID;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String equipmetName) {
        this.productName = equipmetName;
    }

    public String getAvailableQuant() {
        return availableQuant;
    }

    public void setAvailableQuant(String availableQuant) {
        this.availableQuant = availableQuant;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString()
    {
        return this.productName;
    }
    
    
}
