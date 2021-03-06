/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Users;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author heer
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaJPanel
     */
    private JPanel RightPanel;
    private Enterprise enterprise;
    public UserWorkAreaJPanel(JPanel RightPanel, Enterprise enterprise) {
        initComponents();
        this.RightPanel = RightPanel;
        this.enterprise = enterprise;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMngOrg = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        btnMngOrg.setBackground(new java.awt.Color(0, 153, 153));
        btnMngOrg.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnMngOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnMngOrg.setText("MANAGE ORGANIZATION");
        btnMngOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngOrgActionPerformed(evt);
            }
        });

        btnAddUser.setBackground(new java.awt.Color(0, 153, 153));
        btnAddUser.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("ADD USER ");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnManageUser.setBackground(new java.awt.Color(0, 153, 153));
        btnManageUser.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnManageUser.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUser.setText("MANAGE USER");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMngOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnMngOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngOrgActionPerformed

        ManageUserOrganization manageUOrganization = new ManageUserOrganization(RightPanel, enterprise.getOrganizationdir());
        RightPanel.add("ManageUserOrganization", manageUOrganization);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
    }//GEN-LAST:event_btnMngOrgActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed

        AddUserJPanel addUserJPanel = new AddUserJPanel(RightPanel, enterprise.getOrganizationdir());
        RightPanel.add("AddUserJPanel", addUserJPanel);

        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);

    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        ManageUserJPanel mujp = new ManageUserJPanel(RightPanel, enterprise);
        RightPanel.add("ManageUserJPanel", mujp);

        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.next(RightPanel);
    }//GEN-LAST:event_btnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnMngOrg;
    // End of variables declaration//GEN-END:variables
}
