/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

import java.util.ArrayList;

/**
 *
 * @author siddhisawant
 */
public class AssistantList {
    
    private  ArrayList<Assistant> assistantList;

    public AssistantList() {
        this.assistantList = new ArrayList<Assistant>() ;
    }
    
    

    public ArrayList<Assistant> getAssistantList() {
        return assistantList;
    }

    public void setAssistantList(ArrayList<Assistant> assistantList) {
        this.assistantList = assistantList;
    }
    
    
    
}
