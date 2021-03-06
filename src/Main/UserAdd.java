/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Image;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author danyal
 */
public class UserAdd extends javax.swing.JFrame {

    public static boolean validation_check = true;
    public static int USER_ID;

    public UserAdd() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usr_addr1 = new javax.swing.JTextField();
        usr_fname = new javax.swing.JTextField();
        usr_addr2 = new javax.swing.JTextField();
        usr_city = new javax.swing.JTextField();
        usr_postalcode = new javax.swing.JTextField();
        usr_province = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usr_dob = new com.toedter.calendar.JDateChooser();
        usr_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usr_sin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usr_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usr_lname = new javax.swing.JTextField();
        label_lname = new javax.swing.JLabel();
        label_pc = new javax.swing.JLabel();
        label_sin = new javax.swing.JLabel();
        label_phone = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_fname = new javax.swing.JLabel();
        form_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 205, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Member");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 10, 860, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        usr_addr1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        usr_addr1.setForeground(new java.awt.Color(0, 0, 0));
        usr_addr1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
        getContentPane().add(usr_addr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 470, 40));
        usr_addr1.setBorder(BorderFactory.createCompoundBorder(
            usr_addr1.getBorder(),
            BorderFactory.createEmptyBorder(0, 6, 0, 6)));

    usr_fname.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
    usr_fname.setForeground(new java.awt.Color(0, 0, 0));
    usr_fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
    usr_fname.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            usr_fnameFocusLost(evt);
        }
    });
    getContentPane().add(usr_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 380, 40));
    usr_fname.setBorder(BorderFactory.createCompoundBorder(
        usr_fname.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

usr_addr2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_addr2.setForeground(new java.awt.Color(0, 0, 0));
usr_addr2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
getContentPane().add(usr_addr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 280, 40));
usr_addr2.setBorder(BorderFactory.createCompoundBorder(
    usr_addr2.getBorder(),
    BorderFactory.createEmptyBorder(0, 6, 0, 6)));

    usr_city.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
    usr_city.setForeground(new java.awt.Color(0, 0, 0));
    usr_city.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
    getContentPane().add(usr_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 230, 40));
    usr_city.setBorder(BorderFactory.createCompoundBorder(
        usr_city.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

usr_postalcode.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_postalcode.setForeground(new java.awt.Color(0, 0, 0));
usr_postalcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
usr_postalcode.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusLost(java.awt.event.FocusEvent evt) {
        usr_postalcodeFocusLost(evt);
    }
    });
    getContentPane().add(usr_postalcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 260, 40));
    usr_postalcode.setBorder(BorderFactory.createCompoundBorder(
        usr_postalcode.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

UpperCaseDocument ucd = new UpperCaseDocument();
usr_postalcode.setDocument(ucd);

usr_province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saskatchewan", "Ontario", "British Columbia", "Alberta", "Manitoba", "Quebec", "New Brunswick", "Nova Scotia", "Princ Edward Island", "New Foundland & Labrador" }));
usr_province.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 60)));
getContentPane().add(usr_province, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 220, 40));

jLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel1.setText("Last Name");
getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel3.setText("Email Address");
getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

usr_dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 60)));
usr_dob.setForeground(new java.awt.Color(255, 255, 255));
usr_dob.setDateFormatString("MMM d, yyyy");
usr_dob.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
getContentPane().add(usr_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 40));

usr_email.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_email.setForeground(new java.awt.Color(0, 0, 0));
usr_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
usr_email.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusLost(java.awt.event.FocusEvent evt) {
        usr_emailFocusLost(evt);
    }
    });
    getContentPane().add(usr_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 370, 40));
    usr_email.setBorder(BorderFactory.createCompoundBorder(
        usr_email.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

jLabel4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel4.setText("First Name");
getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

jLabel5.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel5.setText("Date Of Birth");
getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

usr_sin.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_sin.setForeground(new java.awt.Color(0, 0, 0));
usr_sin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
usr_sin.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusLost(java.awt.event.FocusEvent evt) {
        usr_sinFocusLost(evt);
    }
    });
    getContentPane().add(usr_sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 380, 40));
    usr_sin.setBorder(BorderFactory.createCompoundBorder(
        usr_sin.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

jLabel6.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel6.setText("Phone Number");
getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

usr_phone.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_phone.setForeground(new java.awt.Color(0, 0, 0));
usr_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
usr_phone.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusLost(java.awt.event.FocusEvent evt) {
        usr_phoneFocusLost(evt);
    }
    });
    getContentPane().add(usr_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 370, 40));
    usr_phone.setBorder(BorderFactory.createCompoundBorder(
        usr_phone.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

jLabel7.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel7.setText("Postal Code");
getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

jLabel8.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel8.setText("Address Line 1 (Street Number & Name)");
getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

jLabel9.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel9.setText("Address Line 2 (Apt/Suite etc.)");
getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

jLabel10.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel10.setText("SIN ");
getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

jLabel11.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel11.setText("City");
getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

jLabel12.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
jLabel12.setText("Province");
getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
jLabel13.setForeground(new java.awt.Color(255, 205, 60));
jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
jLabel13.setText("Personal Information:");
getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 40));

usr_lname.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
usr_lname.setForeground(new java.awt.Color(0, 0, 0));
usr_lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 205, 60), 1, true));
usr_lname.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusLost(java.awt.event.FocusEvent evt) {
        usr_lnameFocusLost(evt);
    }
    });
    getContentPane().add(usr_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 370, 40));
    usr_lname.setBorder(BorderFactory.createCompoundBorder(
        usr_lname.getBorder(),
        BorderFactory.createEmptyBorder(0, 6, 0, 6)));

label_lname.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_lname.setForeground(new java.awt.Color(255, 2, 0));
label_lname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_lname.setText("Invalid Last Name!");
getContentPane().add(label_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, 20));
label_lname.setVisible(false);

label_pc.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_pc.setForeground(new java.awt.Color(255, 2, 0));
label_pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_pc.setText("Invalid Postal Code!");
getContentPane().add(label_pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 20));
label_pc.setVisible(false);

label_sin.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_sin.setForeground(new java.awt.Color(255, 2, 0));
label_sin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_sin.setText("Invalid SIN!");
getContentPane().add(label_sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));
label_sin.setVisible(false);

label_phone.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_phone.setForeground(new java.awt.Color(255, 2, 0));
label_phone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_phone.setText("Invalid Phone Number!");
getContentPane().add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, 20));
label_phone.setVisible(false);

label_email.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_email.setForeground(new java.awt.Color(255, 2, 0));
label_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_email.setText("Invalid Email Address");
getContentPane().add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 20));
label_email.setVisible(false);

label_fname.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
label_fname.setForeground(new java.awt.Color(255, 2, 0));
label_fname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-high-importance-15-2.png"))); // NOI18N
label_fname.setText("Invalid First Name!");
getContentPane().add(label_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));
label_fname.setVisible(false);

form_submit.setBackground(new java.awt.Color(255, 255, 255));
form_submit.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
form_submit.setForeground(new java.awt.Color(255, 205, 60));
form_submit.setText("Submit");
form_submit.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        form_submitActionPerformed(evt);
    }
    });
    getContentPane().add(form_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 130, 50));

    setSize(new java.awt.Dimension(859, 745));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usr_postalcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_postalcodeFocusLost
        if (General.validateField(usr_postalcode, General.POSTALCODE_REGEX)) {
            usr_postalcode.setText(usr_postalcode.getText().replaceFirst(General.POSTALCODE_REGEX, "$1 $2"));
            General.fieldErrorDisplayOff(usr_postalcode, label_pc);
        } else {
            General.fieldErrorDisplayOn(usr_postalcode, label_pc);
        }
    }//GEN-LAST:event_usr_postalcodeFocusLost

    private void usr_phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_phoneFocusLost
        if (General.validateField(usr_phone, General.PHONENUMBER_REGEX)) {
            usr_phone.setText(usr_phone.getText().replaceFirst(General.PHONENUMBER_REGEX, "($1) $2-$3"));
            General.fieldErrorDisplayOff(usr_phone, label_phone);
        } else {
            General.fieldErrorDisplayOn(usr_phone, label_phone);
        }

    }//GEN-LAST:event_usr_phoneFocusLost

    private void usr_sinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_sinFocusLost
        if (General.validateField(usr_sin, General.SIN_REGEX)) {
            General.fieldErrorDisplayOff(usr_sin, label_sin);
        } else {
            General.fieldErrorDisplayOn(usr_sin, label_sin);
        }
    }//GEN-LAST:event_usr_sinFocusLost

    private void usr_fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_fnameFocusLost
        if (General.validateField(usr_fname, General.TEXT_REGEX)) {
            General.fieldErrorDisplayOff(usr_fname, label_fname);
        } else {
            General.fieldErrorDisplayOn(usr_fname, label_fname);
        }
    }//GEN-LAST:event_usr_fnameFocusLost

    private void usr_lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_lnameFocusLost
        if (General.validateField(usr_lname, General.TEXT_REGEX)) {
            General.fieldErrorDisplayOff(usr_lname, label_lname);
        } else {
            General.fieldErrorDisplayOn(usr_lname, label_lname);
        }
    }//GEN-LAST:event_usr_lnameFocusLost

    private void usr_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usr_emailFocusLost
        if (General.validateField(usr_email, General.EMAIL_REGEX)) {
            General.fieldErrorDisplayOff(usr_email, label_email);
        } else {
            General.fieldErrorDisplayOn(usr_email, label_email);
        }
    }//GEN-LAST:event_usr_emailFocusLost

    private void form_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_submitActionPerformed
        //remove paranthesis from phone number
        int phone = Integer.parseInt(usr_sin.getText().replaceAll("//D", ""));
        //format date approprately
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dob = dateFormat.format(usr_dob.getDate());
        //create the user object
        User user = new User(0L, usr_fname.getText(), usr_lname.getText(), dob, usr_email.getText(), Integer.parseInt(usr_sin.getText()), phone, usr_addr1.getText(), usr_addr2.getText(), usr_postalcode.getText(), usr_city.getText(), usr_province.getSelectedItem().toString(), 0);

        try {
            Connection conn = (Connection) General.getCon();
            conn.setAutoCommit(false);

            //first query to insert into the user table
            PreparedStatement pst = conn.prepareStatement("insert into users values (default, ?)", Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, General.userToString(user));
            int r = pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            while (rs.next()) {
                USER_ID = rs.getInt(1);
            }

            //second query to edit the JSON file to add the user_id in it
            PreparedStatement pst2 = conn.prepareStatement("UPDATE `users` SET `user_data`= (SELECT JSON_REPLACE((SELECT user_data FROM users WHERE user_id= (SELECT LAST_INSERT_ID())), '$.id', (SELECT LAST_INSERT_ID()))) WHERE user_id= (SELECT LAST_INSERT_ID())");
            int r2 = pst2.executeUpdate();

            conn.commit();
            if (r > 0 && r2 > 0) {
                System.out.println("success");
                BarcodeDisplay bd = new BarcodeDisplay();
                bd.setVisible(true);
                bd.setAlwaysOnTop(true);
                this.dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UserAdd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_form_submitActionPerformed

    public static int getID() {
        return USER_ID;
    }

    class UpperCaseDocument extends PlainDocument {

        private boolean upperCase = true;

        public void setUpperCase(boolean flag) {
            upperCase = flag;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attSet)
                throws BadLocationException {
            if (upperCase) {
                str = str.toUpperCase();
            }
            super.insertString(offset, str, attSet);
        }
    }

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
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton form_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_fname;
    private javax.swing.JLabel label_lname;
    private javax.swing.JLabel label_pc;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_sin;
    private javax.swing.JTextField usr_addr1;
    private javax.swing.JTextField usr_addr2;
    private javax.swing.JTextField usr_city;
    private com.toedter.calendar.JDateChooser usr_dob;
    private javax.swing.JTextField usr_email;
    private javax.swing.JTextField usr_fname;
    private javax.swing.JTextField usr_lname;
    private javax.swing.JTextField usr_phone;
    private javax.swing.JTextField usr_postalcode;
    private javax.swing.JComboBox<String> usr_province;
    private javax.swing.JTextField usr_sin;
    // End of variables declaration//GEN-END:variables
}
