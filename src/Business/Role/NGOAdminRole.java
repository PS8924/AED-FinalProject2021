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
import NGO.NGOAdminWorkAreaJPanel;

/**
 *
 * @author Shah's
 */
public class NGOAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new NGOAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
}
