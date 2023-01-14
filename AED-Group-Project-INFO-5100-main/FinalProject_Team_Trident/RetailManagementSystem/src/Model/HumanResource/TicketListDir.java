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
public class TicketListDir {
      private ArrayList<TicketList> prescriptionList;
    
    public TicketListDir(){
        prescriptionList=new ArrayList<TicketList>();
    }

    public ArrayList<TicketList> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<TicketList> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
    
    public TicketList addTicket(TicketList prescription){
//        TicketList prescription=new TicketList();
         prescriptionList.add(prescription);
         return prescription;
        
    }
}
