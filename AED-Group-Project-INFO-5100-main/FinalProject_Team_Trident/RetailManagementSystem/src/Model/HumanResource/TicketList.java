/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.HumanResource;

import java.util.Date;

/**
 *
 * @author ajin
 */
public class TicketList {
     private int NoofTimesInaday;
    private int totalDays;
    private String problem;
    private String Type;

    private Date ticketDate;
    private String networkName;

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }
    
    

    public String getTypeName() {
        return Type;
    }

    public void setTypeName(String Type) {
        this.Type = Type;
    }
    
    

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    

   
    public int getNoofTimesInaday() {
        return NoofTimesInaday;
    }

    public void setNoofTimesInaday(int NoofTimesInaday) {
        this.NoofTimesInaday = NoofTimesInaday;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
    
    
  
    
}
