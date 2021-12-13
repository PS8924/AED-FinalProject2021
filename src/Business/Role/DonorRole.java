/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.Organizations.DonorOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Donor.DonorWorkAreaJPanel;



import javax.swing.JPanel;

/**
 *
 * @author heer
 */
public class DonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new DonorWorkAreaJPanel(RightPanel, account, (DonorOrganization)organization,enterprise, business);
    }

//    @Override
//    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
//        return new SelectFunction(RightPanel, account, (DonorOrganization)organization, enterprise);
//    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
