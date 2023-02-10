/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Database.DBConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Selitha Sasmitha
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    static String userRole; /*Created static variable to access from other jframs*/
    static String Uemail;
    
    
    public Login() {
        
           initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btn_login = new rojerusan.RSMaterialButtonCircle();
        jLabel17 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        btn_minimize = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/signup Rental Management System_1.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 700));

        jPanel3.setBackground(new java.awt.Color(84, 109, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login here");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Role :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/Role (40 × 40 px).png"))); // NOI18N
        jLabel7.setText("User Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 60));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/Email (40 × 40 px).png"))); // NOI18N
        jLabel8.setText("User Name:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 60));

        txtEmail.setBackground(new java.awt.Color(84, 109, 229));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setPhColor(new java.awt.Color(255, 255, 255));
        txtEmail.setPlaceholder("Enter your email");
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 230, 30));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        cmbRole.setBackground(new java.awt.Color(84, 109, 229));
        cmbRole.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbRole.setForeground(new java.awt.Color(255, 255, 255));
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Operator" }));
        cmbRole.setBorder(null);
        jPanel3.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, 30));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel3.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 210, 60));

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/Password (40 × 40 px).png"))); // NOI18N
        jLabel17.setText("User Name:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_close.setBackground(new java.awt.Color(84, 109, 229));
        btn_close.setForeground(new java.awt.Color(240, 240, 240));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/Close Set 27 px.png"))); // NOI18N
        btn_close.setAlignmentY(0.0F);
        btn_close.setBorder(null);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 30));

        btn_minimize.setBackground(new java.awt.Color(84, 109, 229));
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons used in this project/icons/Minimize Set 27px.png"))); // NOI18N
        btn_minimize.setBorder(null);
        btn_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, 30));

        txtPass.setBackground(new java.awt.Color(84, 109, 229));
        txtPass.setToolTipText("");
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 230, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 320, 700));

        setSize(new java.awt.Dimension(809, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // Login button codes
       userRole = String.valueOf(cmbRole.getSelectedItem()); //To identify the user type for set visibility
       Uemail = String.valueOf(txtEmail.getText()); //To identify the user type for set visibility 
        
        
       PreparedStatement st;
       ResultSet rs; 
       String role = cmbRole.getSelectedItem().toString();
       String email = txtEmail.getText();
       String pass = String.valueOf(txtPass.getPassword());
       
       
       String expression2 = "[A-Za-z0-9]+@+[A-Za-z]+\\.+[A-Za-z]{2,4}+$";
       Pattern p3 = Pattern.compile(expression2);
       Matcher m3 = p3.matcher(txtEmail.getText());  // Email validation
       
       
       if(!m3.matches())
        {
            JOptionPane.showMessageDialog(null, "Invalid email address");
        
        }else {
       String query = "SELECT * FROM `user_registration` WHERE `role` =? AND `email`=? AND `password`=?";
        
        try {
            st = DBConnector.getConnection().prepareStatement(query);
            
            st.setString(1,role);
            st.setString(2,email);
            st.setString(3,pass);
            
            
            rs = st.executeQuery();
            
            if(rs.next())
            {
                ManagerMainMenu mm = new ManagerMainMenu();
                mm.setVisible(true);
                mm.pack();
                mm.lblwelcome.setText(role );
                mm.lbluser.setText(email );
                
                this.dispose();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Email,Password or role");
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
        
        
   
       
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // Close button
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        // Minimize button
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private rojerusan.RSMaterialButtonCircle btn_login;
    private javax.swing.JButton btn_minimize;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private app.bolivia.swing.JCTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
