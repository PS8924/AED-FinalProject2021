/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Doctor.DoctorDirectory;
import Business.Donor.DonorDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author heer
 */
public abstract class Organizations {
    
    private String name;
    private WorkQueue workQueue;
    private WorkQueue costEstimation;
    private WorkQueue claimMoney;
    private UserDirectory userDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
     

    public enum Type{
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Donor("Donor Organization"),
        Patient("Patient Organization"),
        Lab("Lab Organization"),
        UserAdmin("UserAdmin Organization"),
        NGOAdmin("NGOAdmin Organization"),
        NGOVolunteer("NGO Volunteer"),
        PharmacyAdmin("Pharmacy");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organizations(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        this.costEstimation =new WorkQueue();
        userDirectory = new UserDirectory();
        this.claimMoney =new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public WorkQueue getClaimMoney() {
        return claimMoney;
    }

    public void setClaimMoney(WorkQueue claimMoney) {
        this.claimMoney = claimMoney;
    }

    public WorkQueue getCostEstimation() {
        return costEstimation;
    }

    public void setCostEstimation(WorkQueue costEstimation) {
        this.costEstimation = costEstimation;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
