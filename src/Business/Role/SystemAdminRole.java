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
import UserInterface.SysAdminRole.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author heer
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem system) {
        return new SysAdminWorkAreaJPanel(RightPanel, system);
    }
   
}
