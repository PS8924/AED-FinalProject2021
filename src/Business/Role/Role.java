/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author krishnamayavat
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        UserAdmin("UserAdmin"),
        Doctor("Doctor"),
        Donor("Donor"),
        Patient("Patient"),
        NGOAdminRole("NGO"),
        NGOVolunteer("NGO Volunteer"),
        PharmacyAdminRole("Pharmacy");
      
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel RightPanel, 
            UserAccount account, 
            Organizations organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
