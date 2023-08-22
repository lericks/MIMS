/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author G50
 */
public class ClinicMenu extends javax.swing.JFrame {

    /**
     * Creates new form login_sign_window
     */
    Connection con = null;
    ResultSet rs;
    Statement st;
    PreparedStatement pst = null;
    public static String theUser = "";
    public static String user;

    public static String names;

    public ClinicMenu() {

        initComponents();
        jDP.setPreferredSize(new java.awt.Dimension(1100, 700)); 
        jLP.setPreferredSize(new java.awt.Dimension(150, 700)); 
        UIManager UI = new UIManager();
        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Trebuchet MS", 1, 15)));
        UI.put("OptionPane.background", new ColorUIResource(0, 250, 253));
        UI.put("Panel.background", new ColorUIResource(255,255,255));
        ImageIcon img = new ImageIcon(getClass().getResource("/store/326.png"));
        this.setIconImage(img.getImage());
        File dir = new File("C:\\mims_report\\");
        if (dir.exists()) {
        } else {
            dir.mkdirs();
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

        jLP = new javax.swing.JLayeredPane();
        lt = new javax.swing.JLabel();
        ll = new javax.swing.JLabel();
        sll = new javax.swing.JLabel();
        stt = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        dl = new javax.swing.JLabel();
        jDP = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLP.setBackground(new java.awt.Color(255, 255, 255));
        jLP.setMaximumSize(new java.awt.Dimension(150, 700));
        jLP.setMinimumSize(new java.awt.Dimension(150, 700));
        jLP.setOpaque(true);

        lt.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        lt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lt.setText("Log Out");
        jLP.add(lt);
        lt.setBounds(30, 480, 80, 20);

        ll.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        ll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/l2.png"))); // NOI18N
        ll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                llMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                llMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                llMouseReleased(evt);
            }
        });
        jLP.add(ll);
        ll.setBounds(30, 410, 80, 70);

        sll.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        sll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/s2.png"))); // NOI18N
        sll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sllMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sllMouseReleased(evt);
            }
        });
        jLP.add(sll);
        sll.setBounds(30, 220, 80, 70);

        stt.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        stt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stt.setText("Settings");
        jLP.add(stt);
        stt.setBounds(30, 290, 80, 20);

        dt.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        dt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dt.setText("Home");
        jLP.add(dt);
        dt.setBounds(30, 100, 80, 20);

        dl.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        dl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/h2.png"))); // NOI18N
        dl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dlMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dlMouseReleased(evt);
            }
        });
        jLP.add(dl);
        dl.setBounds(30, 30, 80, 70);

        getContentPane().add(jLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 700));

        jDP.setBackground(new java.awt.Color(255, 255, 255));
        jDP.setMaximumSize(new java.awt.Dimension(1100, 700));
        jDP.setMinimumSize(new java.awt.Dimension(1100, 700));
        jDP.setName(""); // NOI18N
        jDP.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1100, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 this.setTitle(names);
 jDP.removeAll();
        jDP.repaint();
        clinic_ui frame = new clinic_ui();
        Dimension screenSize = jDP.getSize();
        frame.setSize(screenSize.width, screenSize.height);
        jDP.add(frame);
        int width = frame.getWidth();
        int height = frame.getHeight();
        frame.setBounds(((screenSize.width / 2) - (width / 2)), ((screenSize.height / 2) - (height / 2)), width, height);
        frame.setVisible(true);
        // TODO add your handling code here:
      


    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logIn bob = new logIn();
        this.dispose();
        bob.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void llMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseEntered
        ll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/l1.png"))); // NOI18N
        lt.setForeground(new java.awt.Color(52, 152, 219));        // TODO add your handling code here:
    }//GEN-LAST:event_llMouseEntered

    private void llMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseExited
        ll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/l2.png"))); // NOI18N
        lt.setForeground(new java.awt.Color(0, 0, 0));
        // TODO add your handling code here:
    }//GEN-LAST:event_llMouseExited

    private void llMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseReleased
        logIn bob = new logIn();
        this.dispose();
        bob.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_llMouseReleased

    private void sllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sllMouseEntered
       sll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/s1.png"))); // NOI18N
        stt.setForeground(new java.awt.Color(52, 152, 219));        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_sllMouseEntered

    private void sllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sllMouseExited
          sll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/s2.png"))); // NOI18N
        stt.setForeground(new java.awt.Color(0, 0, 0));
        // TODO add your handling code here:
    }//GEN-LAST:event_sllMouseExited

    private void sllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sllMouseReleased
jDP.removeAll();
        jDP.repaint();
        Dsettings frame = new Dsettings();
        Dimension screenSize = jDP.getSize();
        frame.setSize(screenSize.width, screenSize.height);
        jDP.add(frame);
        int width = frame.getWidth();
        int height = frame.getHeight();
        frame.setBounds(((screenSize.width / 2) - (width / 2)), ((screenSize.height / 2) - (height / 2)), width, height);
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_sllMouseReleased

    private void dlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlMouseEntered
      dl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/h1.png"))); // NOI18N
        dt.setForeground(new java.awt.Color(52, 152, 219));        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_dlMouseEntered

    private void dlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlMouseExited
         dl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/h2.png"))); // NOI18N
        dt.setForeground(new java.awt.Color(0, 0, 0));
        // TODO add your handling code here:
    }//GEN-LAST:event_dlMouseExited

    private void dlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlMouseReleased
jDP.removeAll();
        jDP.repaint();
        clinic_ui frame = new clinic_ui();
        Dimension screenSize = jDP.getSize();
        frame.setSize(screenSize.width, screenSize.height);
        jDP.add(frame);
        int width = frame.getWidth();
        int height = frame.getHeight();
        frame.setBounds(((screenSize.width / 2) - (width / 2)), ((screenSize.height / 2) - (height / 2)), width, height);
        frame.setVisible(true);
    }//GEN-LAST:event_dlMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClinicMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dl;
    private javax.swing.JLabel dt;
    private javax.swing.JDesktopPane jDP;
    private javax.swing.JLayeredPane jLP;
    private javax.swing.JLabel ll;
    private javax.swing.JLabel lt;
    private javax.swing.JLabel sll;
    private javax.swing.JLabel stt;
    // End of variables declaration//GEN-END:variables
}