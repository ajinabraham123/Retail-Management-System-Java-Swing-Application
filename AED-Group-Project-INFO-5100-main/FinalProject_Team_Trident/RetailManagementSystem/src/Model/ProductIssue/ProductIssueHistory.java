/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ProductIssue;

import java.util.ArrayList;

/**
 *
 * @author felicia
 */
public class ProductIssueHistory {
    private ArrayList<ProductIssue> history;
    
    public ProductIssueHistory()
    {
        history = new ArrayList();
    }

    public ArrayList<ProductIssue> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ProductIssue> history) {
        this.history = history;
    }
    
    
}
