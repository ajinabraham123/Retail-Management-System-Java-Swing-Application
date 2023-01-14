/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Product;

import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class ProductList {
    private ArrayList<Product> productList;

    public ProductList() {
        this.productList = new ArrayList();
    }
    
    public Product addNewEquip(String equipmetName, String Desc, String availableQuant, double cost,double totalcost)
    {
        Product equipment = new Product(equipmetName, Desc, availableQuant, cost,totalcost);
        productList.add(equipment);
        return equipment;
        
    }

    public ArrayList<Product> getproductList() {
        return productList;
    }

    public void setproductList(ArrayList<Product> equipmentList) {
        this.productList = equipmentList;
    }
    
    
}
