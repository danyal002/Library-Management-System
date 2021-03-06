/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Types;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author danyal
 */
public class BookCheckout extends javax.swing.JFrame {

    ArrayList<Long> book_serials = new ArrayList<>();

    public BookCheckout() throws SQLException {
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

        book_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        book_search = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        confirm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user_search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        user_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_id.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        book_id.setText("2000000000000");
        getContentPane().add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 410, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 205, 60));
        jLabel1.setText("Enter Book Serial Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 40));

        book_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_search.setText("add");
        book_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_searchMouseClicked(evt);
            }
        });
        getContentPane().add(book_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, 40));

        user_id.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        user_id.setText("1000000000");
        getContentPane().add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 410, 40));

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 205, 60)));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 205, 60));
        jLabel3.setFont(new java.awt.Font("Courier", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 205, 60));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirm");
        confirm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 50));

        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 140, 50));

        jPanel2.setBackground(new java.awt.Color(255, 205, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Courier", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check Out A Book");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 205, 60));
        jLabel5.setText("Enter User ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, 40));

        user_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_search.setText("search");
        user_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_searchMouseClicked(evt);
            }
        });
        getContentPane().add(user_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 40, 40));

        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Due Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cart);
        if (cart.getColumnModel().getColumnCount() > 0) {
            cart.getColumnModel().getColumn(0).setResizable(false);
            cart.getColumnModel().getColumn(1).setResizable(false);
        }
        if (cart.getColumnModel().getColumnCount() > 0) {
            cart.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.LEFT);
        cart.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 680, 150));

        user_name.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 310, 40));

        setSize(new java.awt.Dimension(860, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        try {
            Connection conn = General.getCon();
            conn.setAutoCommit(false);

            //Inserting into Transactions table.
            PreparedStatement pst = conn.prepareStatement("insert into transactions values (?,?,?,?,?)");
            long id = Long.parseLong(user_id.getText());
            for (Long serial : book_serials) {
                pst.setLong(1, id);
                pst.setLong(2, serial);
                pst.setString(3, General.getFormattedTimestamp());
                pst.setNull(4, Types.NULL);
                pst.setNull(5, Types.NULL);
                pst.addBatch();
            }
            int[] r = pst.executeBatch();

            //Updating Book_Status table
            PreparedStatement pst2 = conn.prepareStatement("update book_status set book_status=? where book_id=?");
            for (Long serial : book_serials) {
                pst2.setBoolean(1, false);
                pst2.setLong(2, serial);
                pst2.addBatch();
            }
            int[] r2 = pst2.executeBatch();

            //committing everything
            conn.commit();

            if (r2.length == book_serials.size() && r.length == book_serials.size()) {
                System.out.println("SUCCESS");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_confirmMouseClicked

    private void user_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_searchMouseClicked
        User user = null;
        try {
            PreparedStatement pst = General.getCon().prepareStatement("Select user_data from users where user_id=?");
            pst.setLong(1, Long.parseLong(user_id.getText()));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user = General.stringToUser(rs.getString("user_data"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
        user_name.setText("Name: " + user.getFirstName() + " " + user.getLastName());

    }//GEN-LAST:event_user_searchMouseClicked

    private void book_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_searchMouseClicked
        try {
            Connection conn = General.getCon();
            conn.setAutoCommit(false);

            long book_isbn = 0L;
            String jsonFile = "";

            PreparedStatement pst = conn.prepareStatement("Select book_isbn from book_status where book_id=?");
            pst.setLong(1, Long.parseLong(book_id.getText()));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                book_isbn = rs.getLong("book_isbn");
                book_serials.add(Long.parseLong(book_id.getText()));
            }

            PreparedStatement pst2 = conn.prepareStatement("Select book_data from book_data where book_isbn=?");
            pst2.setLong(1, book_isbn);
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                jsonFile = rs2.getString("book_data");
            }

            conn.commit();

            String book_name = General.getValueFJ("name", jsonFile);
            DefaultTableModel dtm = (DefaultTableModel) cart.getModel();
            dtm.addRow(new Object[]{book_name, General.getDatePlusDays(30)});

        } catch (SQLException ex) {
            Logger.getLogger(BookCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_book_searchMouseClicked

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
            java.util.logging.Logger.getLogger(BookCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookCheckout().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BookCheckout.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField book_id;
    private javax.swing.JLabel book_search;
    private javax.swing.JTable cart;
    private javax.swing.JPanel confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField user_id;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel user_search;
    // End of variables declaration//GEN-END:variables
}
