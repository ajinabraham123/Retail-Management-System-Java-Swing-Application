/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.RetailEmployment;

/**
 *
 * @author siddhisawant
 */
public class Department {
    String agentName;
    String departmentNumber;
    String location;
    private double longitude;
    private double latitude;

    
    public Department(String driverName,String ambulanceNumber,String location)
    {
        this.departmentNumber = ambulanceNumber;
        this.agentName = driverName;
        this.location = location;
    }
    
    public String getagentName() {
        return agentName;
    }

    public void setagentName(String driverName) {
        this.agentName = driverName;
    }

    public String getdepartmentNumber() {
        return departmentNumber;
    }

    public void setdepartmentNumber(String ambulanceNumber) {
        this.departmentNumber = ambulanceNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    @Override
    public String toString()
    {
        return departmentNumber;
    }
    
}
