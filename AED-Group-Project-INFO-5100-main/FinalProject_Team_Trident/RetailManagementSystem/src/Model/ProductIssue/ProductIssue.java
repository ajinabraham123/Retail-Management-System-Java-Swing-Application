/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ProductIssue;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author felicia
 */
public class ProductIssue {
    
     private String packageDamage;
    private String productDamage;
    private String productLost;
    private String refundInitiate;
    private Date date;
    
    public String getPackageDamage() {
        return packageDamage;
    }

    public void setPackageDamage(String packageDamage) {
        this.packageDamage = packageDamage;
    }

    public String getProductDamage() {
        return productDamage;
    }

    public void setProductDamage(String productDamage) {
        this.productDamage = productDamage;
    }

    public String getLostPackage() {
        return productLost;
    }

    public void setLostPackage(String lostpackage) {
        this.productLost = lostpackage;
    }

    public String getRefund() {
        return refundInitiate;
    }

    public void setHRefund(String Refund) {
        this.refundInitiate = Refund;
    }

    public Date getDate() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return date;
    }

    public void setDate(Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(date);
    }
}
