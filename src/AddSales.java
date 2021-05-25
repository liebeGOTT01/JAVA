
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raven Torres
 */
public class AddSales extends javax.swing.JFrame {
    private String Order_id = "";
    private Connection conn;
    private PreparedStatement pstmt;

    /**
     * Creates new form AddSales
     */
    public AddSales() {
        initComponents();
        getMenu();
        getPrice();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        addOrderBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tableDropdown = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuDropdown = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        quantity = new javax.swing.JSpinner();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MENU", "QUANTITY", "PRICE", "AMOUNT"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 400, 190));

        addOrderBtn.setBackground(new java.awt.Color(0, 204, 51));
        addOrderBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        addOrderBtn.setText("ADD");
        addOrderBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 51), 1, true));
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 110, 50));

        jButton5.setBackground(new java.awt.Color(0, 51, 255));
        jButton5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton5.setText("PAY");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 90, 40));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 110, 50));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 110, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDropdown.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5" }));
        tableDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableDropdownActionPerformed(evt);
            }
        });
        jPanel3.add(tableDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 43));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Table No.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 26, 88, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Price:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Quantity:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 96, 44));

        menuDropdown.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        menuDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDropdownMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuDropdownMouseEntered(evt);
            }
        });
        menuDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDropdownActionPerformed(evt);
            }
        });
        menuDropdown.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menuDropdownPropertyChange(evt);
            }
        });
        jPanel3.add(menuDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 43));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setText("Menu:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 62, -1));
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 44));
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 260, 260));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount Tendered:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 140, 20));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 770));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 380, 130));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Customer Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 120, 30));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Subtotal:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 70, 20));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 90, 30));

        jButton6.setBackground(new java.awt.Color(0, 51, 255));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton6.setText("EDIT");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 110, 50));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 280, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("ORDER");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-small.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 290, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed
        
        Int price = this.price.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = (Statement) conn.createStatement(); //get the connection stream(connection port)
            String query = "INSERT INTO `order_table`(`table_name`,`product_namne`, `product_price`, `product_quantity`, `amount`) VALUES ('" + this.tableDropdown.getSelectedItem() + "','" + this.menuDropdown.getSelectedItem() + "','" + this.price.getText() + "','" + this.quantity.getName() + "','" + this.quantity.getName() + "')";
            stmt.executeUpdate(query);
            conn.close();
            JOptionPane.showMessageDialog(this, "Successfully Added.");
            orderTable();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_addOrderBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDropdownActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDropdownActionPerformed

    private void menuDropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseEntered
        getPrice();
    }//GEN-LAST:event_menuDropdownMouseEntered

    private void menuDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDropdownMouseClicked
        // TODO add your handling code here:
        getPrice();
    }//GEN-LAST:event_menuDropdownMouseClicked

    private void menuDropdownPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menuDropdownPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuDropdownPropertyChange

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
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> menuDropdown;
    private javax.swing.JTextField price;
    private javax.swing.JSpinner quantity;
    private javax.swing.JComboBox<String> tableDropdown;
    // End of variables declaration//GEN-END:variables

    private void getMenu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM product_table");
            while (rs.next()) {
                String product = rs.getString("product_name");
                menuDropdown.addItem(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
       private void getPrice() {
         Object menu = menuDropdown.getSelectedItem();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/torresjavarms", "root", "");
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT product_price FROM product_table WHERE product_name='"+menu.toString()+"'");
            if (rs.next()) {
                System.out.println(rs.getString("product_price"));
                price.setText(rs.getString("product_price"));
                price.setEditable(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void orderTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
