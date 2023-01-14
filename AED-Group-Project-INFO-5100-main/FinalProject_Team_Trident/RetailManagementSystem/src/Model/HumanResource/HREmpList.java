/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.HumanResource;

import java.util.ArrayList;

/**
 *
 * @author ajin
 */
public class HREmpList {
    
     private ArrayList<HumanR> HRList;

    public HREmpList() {
        HRList=new ArrayList<>();
        }

    public ArrayList<HumanR> HREmpList() {
        return HRList;
    }

    public void setHRList(ArrayList<HumanR> HREmpList) {
        this.HRList = HREmpList;
    }
    
     public HumanR addHR()
    {
        HumanR mi = new HumanR();
        HRList.add(mi);
        return mi;
    }
    
    public void deleteHR(HumanR mi){
     HRList.remove(mi);
    }
}
