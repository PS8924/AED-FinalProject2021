/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PharmacyRole;
import javax.swing.*;
/**
 *
 * @author User
 */

public class PharamacyData {
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    PharamacyData()
    {
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("Stocks");
 
        // Data to be displayed in the JTable
        String[][] data = {
            { "Fabiflu", "Pharma", "700","Yes","50" },
            { "Ivermectine", "Cipla", "500","Yes","100" },
              { "Remedevisir", "Veklury", "2000","Yes","10" },
        };
 
        // Column Names
        String[] columnNames = { "Medicine name", "Company", "Price","Avaibility","Stocks available" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
   
}

