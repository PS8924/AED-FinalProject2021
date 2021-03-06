/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Business.EcoSystem;
import Business.Email.Email;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organizations.DoctorOrganization;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonorOrganWorkRequest;
import Business.WorkQueue.PatientOrganWorkRequest;
import Business.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shah's
 */
public class PlasmaDonateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlasmaDonateJPanel
     */
    private JPanel RightPanel;
    private EcoSystem System;
    private UserAccount account;
    private Enterprise enterprise;
    public PlasmaDonateJPanel(JPanel RightPanel, UserAccount account, Enterprise enterprise, EcoSystem System) {
        initComponents();
        this.RightPanel = RightPanel;
        this.account = account;
        this.enterprise = enterprise;
        this.System=System;
        //submitbtn.setEnabled(false);
        populateDonateTable();
        populateLocation();
    }

    

    public void populateDonateTable(){
        DefaultTableModel model = (DefaultTableModel) jTblDonorRequest.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((DonorOrganWorkRequest) request).getOrgan();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }
    
    public void populateLocation(){
        for (Network network : System.getNetworkList()) {
            DonorLocationComboBox.addItem(network);
        }
    }
    
    public void populateTC(Network network){
        DonorTCComboBox.removeAllItems();
        for(Enterprise e: network.getEp().getEnterpriselist())
            if(e instanceof HospitalEnterprise)
                  DonorTCComboBox.addItem(e);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDonorRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        OrganList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        DonorLocationComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        DonorTCComboBox = new javax.swing.JComboBox();
        sugarlabel = new javax.swing.JLabel();
        BPLabel = new javax.swing.JLabel();
        BPTxt = new javax.swing.JTextField();
        sugartxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DONATE Plasma :");

        jTblDonorRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ));
        jScrollPane1.setViewportView(jTblDonorRequest);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        BtnRefresh.setBackground(new java.awt.Color(0, 153, 153));
        BtnRefresh.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        BtnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        BtnRefresh.setText("REFRESH ");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        OrganList.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        OrganList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOCATION  :");

        DonorLocationComboBox.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        DonorLocationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorLocationComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital");

        DonorTCComboBox.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        sugarlabel.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        sugarlabel.setForeground(new java.awt.Color(255, 255, 255));
        sugarlabel.setText("BLOOD SUGAR :");

        BPLabel.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        BPLabel.setForeground(new java.awt.Color(255, 255, 255));
        BPLabel.setText("BLOOD PRESSURE :");

        BPTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        sugartxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Donate Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrganList, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonorLocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sugarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sugartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonorTCComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonorLocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DonorTCComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sugarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // TODO add your handling code here:
        populateDonateTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(((String)OrganList.getSelectedItem()).equalsIgnoreCase("--Select--"))
        {
            JOptionPane.showMessageDialog(null,"Please select the organ you wish to donate");
            return;
        }
        else if(sugarlabel.getText().equals("") ||
                BPTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Please fill all you medical details!!");
                        return;
        }
        else{
            String message = (String)OrganList.getSelectedItem();
            String Sugar=this.sugartxt.getText();
            String BP= this.BPTxt.getText();
            DonorOrganWorkRequest request = new DonorOrganWorkRequest();
            
            request.setMessage(message);
            request.setSender(account);
            request.setStatus("Sent");
            request.setRole("Donor");
            request.setSugar(Sugar);
            request.setBp(BP);
            Organizations org = null;
     
                
          for(Network network: System.getNetworkList()) {
             for(Enterprise enterprise: network.getEp().getEnterpriselist())
             {
                for (Organizations organization : enterprise.getOrganizationdir().getOrganizationList()){
                    if(network.equals(DonorLocationComboBox.getSelectedItem())){
                        if(enterprise.equals(DonorTCComboBox.getSelectedItem())){
                            if (organization instanceof DoctorOrganization){
                                org = organization;
                                break;
                            }
                        }
                
                     }
                 }
           }
        }
        if (org!=null)
        {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Your request has been initiated, please check your status on view details");
            populateDonateTable();
            try{
            Email emailConfig= new Email();
            Properties smtpProperties = emailConfig.loadProperties();
            String email = account.getUsername();
            emailConfig.sendEmail(smtpProperties, email, "Request Initiated", "Your request has being sent to the Transplantation center");
        }
            catch(Exception ex){
                
            }
        }
        if(org==null)
        {
            JOptionPane.showMessageDialog(null,"There was no Doctors Organization in the Transplantation Center  you have Selected !");
            return;
        }
            
        }
        
                        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout)RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void DonorLocationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorLocationComboBoxActionPerformed
        // TODO add your handling code here:
        
         Network network =(Network)DonorLocationComboBox.getSelectedItem();
        
        if (network != null){
            populateTC(network);}
    }//GEN-LAST:event_DonorLocationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField BPTxt;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JComboBox DonorLocationComboBox;
    private javax.swing.JComboBox DonorTCComboBox;
    private javax.swing.JComboBox<String> OrganList;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDonorRequest;
    private javax.swing.JLabel sugarlabel;
    private javax.swing.JTextField sugartxt;
    // End of variables declaration//GEN-END:variables
}
