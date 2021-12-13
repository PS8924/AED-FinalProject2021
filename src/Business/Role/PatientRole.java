/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.Organizations.PatientOrganization;
import Business.UserAccount.UserAccount;
//import UserInterface.Donor.SelectFunction;



import UserInterface.Patient.PatientWorkAreaJPanel;


import javax.swing.JPanel;

/**
 *
 * @author krishnamayavat
 */
public class PatientRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {

        //return new PatientWorkAreaJPanel(RightPanel, account, (PatientOrganization)organization, enterprise, business);

       return new PatientWorkAreaJPanel(RightPanel, account, (PatientOrganization)organization, enterprise, business);

       
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
