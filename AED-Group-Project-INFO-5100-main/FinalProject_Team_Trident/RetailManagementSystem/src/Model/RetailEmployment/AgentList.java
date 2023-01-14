/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddhisawant
 */
public class AgentList {
   private ArrayList<Agent> AgentList;

    public AgentList() {
        this.AgentList = new ArrayList<Agent>() ;
    }
   
      public Agent addNewAgent(String fullName, String qualification, String specilization, Boolean emeDoc)
    {
        Agent doctor = new Agent(fullName,qualification,specilization,emeDoc);
        AgentList.add(doctor);
        return doctor;
    }

    public ArrayList<Agent> getAgentList() {
        return AgentList;
    }

    public void setAgentList(ArrayList<Agent> AgentList) {
        this.AgentList = AgentList;
    }
   
    public void removeAgent(Agent agent)
    {
        AgentList.remove(agent);
    }
   
}
