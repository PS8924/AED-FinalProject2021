/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Email.Email;
import Business.WorkQueue.DonorOrganWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shah's
 */
public class DonorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorRequestJPanel
     */
    private JPanel RightPanel;
    private DonorOrganWorkRequest request;
    public DonorRequestJPanel(JPanel RightPanel, DonorOrganWorkRequest request) {
        initComponents();
        this.RightPanel= RightPanel;
        this.request=request;
        OrganDonatingtxt.setText(request.getMessage());
        BPTxt.setText(request.getBp());
        sugartxt.setText(request.getSugar());
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
        OrganDonatingtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ResultTxt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        BPTxt = new javax.swing.JTextField();
        sugartxt = new javax.swing.JTextField();
        sugarlabel = new javax.swing.JLabel();
        BPLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Plasma (Blood Group) :");
        add(jLabel1);
        jLabel1.setBounds(72, 100, 212, 31);

        OrganDonatingtxt.setEditable(false);
        OrganDonatingtxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        add(OrganDonatingtxt);
        OrganDonatingtxt.setBounds(288, 100, 315, 31);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RESULT :");
        add(jLabel2);
        jLabel2.setBounds(72, 263, 114, 31);

        ResultTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        add(ResultTxt);
        ResultTxt.setBounds(288, 263, 315, 31);

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(72, 410, 158, 40);

        btnSubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(411, 410, 166, 40);

        BPTxt.setEditable(false);
        BPTxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        add(BPTxt);
        BPTxt.setBounds(288, 213, 315, 31);

        sugartxt.setEditable(false);
        sugartxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        add(sugartxt);
        sugartxt.setBounds(288, 154, 315, 31);

        sugarlabel.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        sugarlabel.setForeground(new java.awt.Color(255, 255, 255));
        sugarlabel.setText("BLOOD SUGAR REPORT :");
        add(sugarlabel);
        sugarlabel.setBounds(72, 150, 212, 40);

        BPLabel.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        BPLabel.setForeground(new java.awt.Color(255, 255, 255));
        BPLabel.setText("BLOOD PRESSURE REPORT :");
        add(BPLabel);
        BPLabel.setBounds(72, 214, 193, 31);

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Request from Donor");
        add(jLabel3);
        jLabel3.setBounds(213, 40, 289, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        Component[] componentArray = RightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        request.setOrgan(ResultTxt.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null,"Results Submitted!!");
        try{
            Email emailConfig= new Email();
            Properties smtpProperties = emailConfig.loadProperties();
            String email = String.valueOf(request.getSender());
            emailConfig.sendEmail(smtpProperties, email, "Request completed", "Your request has being fullfilled please check the applications to get the details");
        }
            catch(Exception ex){
                
            }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPLabel;
    private javax.swing.JTextField BPTxt;
    private javax.swing.JTextField OrganDonatingtxt;
    private javax.swing.JTextField ResultTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel sugarlabel;
    private javax.swing.JTextField sugartxt;
    // End of variables declaration//GEN-END:variables
}