/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author G50
 */
public class lab_ui extends javax.swing.JPanel {

    /**
     * Creates new form session_reporting
     */
    int x = 0;
    Connection con = null;
    ResultSet rs;
    Statement st;
    PreparedStatement pst = null;
    String theReg;

    public lab_ui() {
        initComponents();
        UIManager UI = new UIManager();
        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Trebuchet MS", 1, 15)));
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(255, 255, 255));
        Properties properties = new Properties();
        try {
              InputStream inputStream = lab_ui.class.getResourceAsStream("/store/mrm.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error occurred while reading the properties file", "Alert", 1);

        }

        try {
            String dbname = properties.getProperty("db.name");
            String pass = properties.getProperty("db.pass");
            String username = properties.getProperty("db.user");
            String Url = "jdbc:mysql://" + properties.getProperty("db.host") + ":" + properties.getProperty("db.port") + "/";
            String Drivers = "com.mysql.jdbc.Driver";
            Class.forName(Drivers);
            con = DriverManager.getConnection(Url + dbname, username, pass);
        } catch (Exception e) {

            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fName = new javax.swing.JTextField();
        dob2 = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<String>();
        photo = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        lB8 = new javax.swing.JButton();
        lB11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JTextPane();
        uL10 = new javax.swing.JLabel();
        uL12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        l2 = new javax.swing.JTextPane();
        uL13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        l3 = new javax.swing.JTextPane();
        uL11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1100, 700));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName.setEditable(false);
        fName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, -1));

        dob2.setEditable(false);
        dob2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dob2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob2ActionPerformed(evt);
            }
        });
        jPanel2.add(dob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        gender.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, -1));

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/avatar - Copy.png"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 150));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 420, 180));

        regNo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        regNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        regNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNoActionPerformed(evt);
            }
        });
        jPanel3.add(regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 250, -1));

        lB8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lB8.setText("Fetch >>>");
        lB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lB8ActionPerformed(evt);
            }
        });
        jPanel3.add(lB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 140, 30));

        lB11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lB11.setText("Update Record");
        lB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lB11ActionPerformed(evt);
            }
        });
        jPanel3.add(lB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 170, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Laboratory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setEditable(false);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(l1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 170, 150));

        uL10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL10.setText("Specimen");
        jPanel6.add(uL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        uL12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL12.setText("Tests");
        jPanel6.add(uL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 80, 20));

        l2.setEditable(false);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(l2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, 150));

        uL13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL13.setText("Results");
        jPanel6.add(uL13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, 20));

        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane7.setViewportView(l3);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 220, 150));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 600, 210));

        uL11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL11.setText("Registration Number");
        jPanel3.add(uL11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lB11ActionPerformed
       if(!theReg.equals("")){
        int id=1;
                 SimpleDateFormat dwww = new SimpleDateFormat("dd/MM/yyyy");
            Date dtoday = new Date();
            String dnow = dwww.format(dtoday);
            Date ddate;
            try {
                String sql2 = "SELECT * FROM medical_records ";
                st = con.createStatement();
                rs = st.executeQuery(sql2);
                while (rs.next()) {
                    String regNox = rs.getString("regNo");
                    ddate = rs.getDate("date");
                    String theDate = dwww.format(ddate);
                    if (regNox.equalsIgnoreCase(theReg) && theDate.equalsIgnoreCase(dnow)) {       
                        id=rs.getInt("record_id");               
                        break;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }
        
        try {

                String sql = "Update medical_records set lab_results='" + l3.getText()+ "' where record_id='" + id + "'";
                pst = con.prepareStatement(sql);
                pst.executeUpdate();              

                JOptionPane.showMessageDialog(this, "Update Succesful", "Alert", 1);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e, "Alert", 1);
            }  
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_lB11ActionPerformed

    private void lB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lB8ActionPerformed
        String reg = regNo.getText();

        int xq = 1;
       
        if (!reg.equals("")) {
            SimpleDateFormat dwww = new SimpleDateFormat("dd/MM/yyyy");
            Date dtoday = new Date();
            String dnow = dwww.format(dtoday);
            Date ddate;
            try {
                String sql2 = "SELECT * FROM medical_records ";
                st = con.createStatement();
                rs = st.executeQuery(sql2);
                while (rs.next()) {
                    String regNox = rs.getString("regNo");
                    ddate = rs.getDate("date");
                    String theDate = dwww.format(ddate);
                    if (regNox.equalsIgnoreCase(reg) && theDate.equalsIgnoreCase(dnow)) {
                        l1.setText(rs.getString("lab_specimen"));
                        l2.setText(rs.getString("lab_tests"));
                        l3.setText(rs.getString("lab_results"));
                        xq = 3;
                        theReg=reg;
                        break;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }

        }

        if (xq == 3) {

            try {
                String sql2 = "SELECT * FROM students ";
                st = con.createStatement();
                rs = st.executeQuery(sql2);
                while (rs.next()) {
                    String regNox = rs.getString("regNo");
                    if (regNox.equalsIgnoreCase(reg)) {
                        fName.setText("Name : " + rs.getString("firstName") + " " + rs.getString("otherNames"));
                        gender.setSelectedItem(rs.getString("gender"));
                        dob2.setText("DOB : " + rs.getString("dateOfBirth"));
                        byte[] img = rs.getBytes("photo");
                        if (img != null) {
                            ImageIcon image = new ImageIcon(img);
                            Image im = image.getImage();
                            Image myImg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                            ImageIcon newImage = new ImageIcon(myImg);
                            photo.setIcon(newImage);
                        } else {
                            photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/avatar - Copy.png")));
                        }
                        break;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }

        }

        if (xq == 1) {
             photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/avatar - Copy.png")));
            fName.setText("");
             dob2.setText("");
             l1.setText("");
             l2.setText("");
             l3.setText("");
             JOptionPane.showMessageDialog(null, "Session Not Available", "Alert", 1);
            theReg = "";
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lB8ActionPerformed

    private void regNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNoActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void dob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dob2;
    private javax.swing.JTextField fName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane l1;
    private javax.swing.JTextPane l2;
    private javax.swing.JTextPane l3;
    private javax.swing.JButton lB11;
    private javax.swing.JButton lB8;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField regNo;
    private javax.swing.JLabel uL10;
    private javax.swing.JLabel uL11;
    private javax.swing.JLabel uL12;
    private javax.swing.JLabel uL13;
    // End of variables declaration//GEN-END:variables
}
