/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;
import java.awt.Image;
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
public class doctors_ui extends javax.swing.JPanel {

    /**
     * Creates new form session_reporting
     */
    int x = 0;
    Connection con = null;
    ResultSet rs;
    Statement st;
    PreparedStatement pst = null;
    String theReg;
    int count = -3;
    int track = 0;
    String dates[] = new String[1000];
    int getData = 1;
    String sp1 = "";
    String sd1 = "";
    String sc1 = "";
    String sl1 = "";
    String sl2 = "";
    String sl3 = "";
    String sph1 = "";

    public doctors_ui() {
        initComponents();
        UIManager UI = new UIManager();
        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Trebuchet MS", 1, 15)));
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(255, 255, 255));
        prev.setVisible(false);
        close_hist.setVisible(false);
        SimpleDateFormat dwww = new SimpleDateFormat("dd/MM/yyyy");
        Date dtoday = new Date();
        String dnow = dwww.format(dtoday);
        curr.setText("Date : "+dnow);
        Properties properties = new Properties();
        try {
              InputStream inputStream = doctors_ui.class.getResourceAsStream("/store/mrm.properties");
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
        photo = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<String>();
        regNo = new javax.swing.JTextField();
        lB8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextPane();
        lB11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ph1 = new javax.swing.JTextPane();
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
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        c1 = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTextPane();
        curr = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        close_hist = new javax.swing.JButton();
        uL14 = new javax.swing.JLabel();

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

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/avatar - Copy.png"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 150));

        gender.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 180));

        regNo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        regNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        regNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNoActionPerformed(evt);
            }
        });
        jPanel3.add(regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 250, -1));

        lB8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lB8.setText("Fetch >>>");
        lB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lB8ActionPerformed(evt);
            }
        });
        jPanel3.add(lB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 140, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        d1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(d1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 400, 150));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 420, 180));

        lB11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lB11.setText("Update Record");
        lB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lB11ActionPerformed(evt);
            }
        });
        jPanel3.add(lB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 180, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Pharmacy Drugs Prescription", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ph1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ph1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(ph1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 580, 150));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 600, 180));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Laboratory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(l1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 170, 130));

        uL10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL10.setText("Specimen");
        jPanel6.add(uL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        uL12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL12.setText("Tests");
        jPanel6.add(uL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 80, 20));

        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(l2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, 130));

        uL13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL13.setText("Results");
        jPanel6.add(uL13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 80, 20));

        l3.setEditable(false);
        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        l3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane7.setViewportView(l3);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 220, 130));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 600, 180));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Clinic services & description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        c1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(c1);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 580, 150));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 600, 180));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Complains / Problems", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        p1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(p1);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 400, 150));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 180));

        curr.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        curr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(curr, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 200, 30));

        prev.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 153, 153));
        prev.setText("<< Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        jPanel3.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 100, 30));

        close_hist.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        close_hist.setForeground(new java.awt.Color(204, 0, 51));
        close_hist.setText("Exit History");
        close_hist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_histActionPerformed(evt);
            }
        });
        jPanel3.add(close_hist, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 140, 30));

        uL14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        uL14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uL14.setText("Registration Number");
        jPanel3.add(uL14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 30));

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
        if (!theReg.equals("")) {
            int id = 1;
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
                        id = rs.getInt("record_id");
                        break;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }

            try {

                String sql = "Update medical_records set problems='" + p1.getText() + "',diagnosis='" + d1.getText() + "',clinic_services='" + c1.getText() + "',lab_specimen='" + l1.getText() + "',lab_tests='" + l2.getText() + "',pharmacy='" + ph1.getText() + "' where record_id='" + id + "'";
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
        count = -3;
        track = 0;
        String reg = regNo.getText();
        int xp = 1;
        int xq = 1;
        try {
            String sql2 = "SELECT * FROM doctor_session ";
            st = con.createStatement();
            rs = st.executeQuery(sql2);
            while (rs.next()) {
                String regNox = rs.getString("regNo");
                if (regNox.equalsIgnoreCase(reg)) {
                    theReg = regNox;
                    xp = 3;
                    String sql23 = "delete from doctor_session where regNo='" + reg + "'";
                    pst = con.prepareStatement(sql23);
                    pst.executeUpdate();
                    String sql = "INSERT INTO medical_records(regNo)"
                            + "VALUES('" + reg + "')";
                    pst = con.prepareStatement(sql);
                    pst.executeUpdate();
                    break;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
        }
        if (xp == 1) {
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
                        p1.setText(rs.getString("problems"));
                        d1.setText(rs.getString("diagnosis"));
                        c1.setText(rs.getString("clinic_services"));
                        l1.setText(rs.getString("lab_specimen"));
                        l2.setText(rs.getString("lab_tests"));
                        l3.setText(rs.getString("lab_results"));
                        ph1.setText(rs.getString("pharmacy"));
                        xq = 3;
                        theReg = reg;
                        break;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }

        }

        if (xp == 3 || xq == 3) {

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
                    if (regNox.equalsIgnoreCase(reg) && !(theDate.equalsIgnoreCase(dnow))) {
                        dates[track] = theDate;
                        track += 1;
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
            }
            if (track == 0) {
                prev.setVisible(false);
                close_hist.setVisible(false);
            } else {
                prev.setVisible(true);

            }

        }

        if (xp == 1 && xq == 1) {
            photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/avatar - Copy.png")));
            fName.setText("");
            dob2.setText("");
            p1.setText("");
            d1.setText("");
            c1.setText("");
            ph1.setText("");
            l1.setText("");
            l2.setText("");
            l3.setText("");
            prev.setVisible(false);
            close_hist.setVisible(false);
            JOptionPane.showMessageDialog(null, "Session Not Available", "Alert", 1);
            theReg = "";
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_lB8ActionPerformed

    private void regNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNoActionPerformed

    private void dob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob2ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        close_hist.setVisible(true);
        //JOptionPane.showMessageDialog(null, "Error" +track+" "+" | ", "Alert", 1);
        if (getData == 1) {
            getData = 2;
            sp1 = p1.getText();
            sd1 = d1.getText();
            sc1 = c1.getText();
            sl1 = l1.getText();
            sl2 = l2.getText();
            sl3 = l3.getText();
            sph1 = ph1.getText();
        }
        if (count == -3) {
            count = track - 1;
        }

        ph1.setEditable(false);
        p1.setEditable(false);
        d1.setEditable(false);
        c1.setEditable(false);
        l1.setEditable(false);
        l2.setEditable(false);
        lB11.setVisible(false);

        SimpleDateFormat dwww = new SimpleDateFormat("dd/MM/yyyy");

        Date ddate;
        try {
            String sql2 = "SELECT * FROM medical_records ";
            st = con.createStatement();
            rs = st.executeQuery(sql2);
            while (rs.next()) {
                String regNox = rs.getString("regNo");
                ddate = rs.getDate("date");
                String theDate = dwww.format(ddate);
                if (regNox.equalsIgnoreCase(theReg) && theDate.equalsIgnoreCase(dates[count])) {
                    p1.setText(rs.getString("problems"));
                    d1.setText(rs.getString("diagnosis"));
                    c1.setText(rs.getString("clinic_services"));
                    l1.setText(rs.getString("lab_specimen"));
                    l2.setText(rs.getString("lab_tests"));
                    l3.setText(rs.getString("lab_results"));
                    ph1.setText(rs.getString("pharmacy"));
                    curr.setText("Date : "+dates[count]);

                    break;
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e, "Alert", 1);
        }
        count -= 1;

        if (count == -1) {
            prev.setVisible(false);
        }

    }//GEN-LAST:event_prevActionPerformed

    private void close_histActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_histActionPerformed
        close_hist.setVisible(false);
        getData = 1;
        count = -3;
        if (track != 0) {
            prev.setVisible(true);
        }
        p1.setText(sp1);
        d1.setText(sd1);
        c1.setText(sc1);
        l1.setText(sl1);
        l2.setText(sl2);
        l3.setText(sl3);
        ph1.setText(sph1);
        lB11.setVisible(true);
        ph1.setEditable(true);
        p1.setEditable(true);
        d1.setEditable(true);
        c1.setEditable(true);
        l1.setEditable(true);
        l2.setEditable(true);
        SimpleDateFormat dwww = new SimpleDateFormat("dd/MM/yyyy");
        Date dtoday = new Date();
        String dnow = dwww.format(dtoday);
        curr.setText("Date : "+dnow);

// TODO add your handling code here:
    }//GEN-LAST:event_close_histActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane c1;
    private javax.swing.JButton close_hist;
    private javax.swing.JLabel curr;
    private javax.swing.JTextPane d1;
    private javax.swing.JTextField dob2;
    private javax.swing.JTextField fName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane l1;
    private javax.swing.JTextPane l2;
    private javax.swing.JTextPane l3;
    private javax.swing.JButton lB11;
    private javax.swing.JButton lB8;
    private javax.swing.JTextPane p1;
    private javax.swing.JTextPane ph1;
    private javax.swing.JLabel photo;
    private javax.swing.JButton prev;
    private javax.swing.JTextField regNo;
    private javax.swing.JLabel uL10;
    private javax.swing.JLabel uL12;
    private javax.swing.JLabel uL13;
    private javax.swing.JLabel uL14;
    // End of variables declaration//GEN-END:variables
}
