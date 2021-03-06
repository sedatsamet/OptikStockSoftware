
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sedat
 */
public class FrameOperations extends javax.swing.JFrame {
    StokIslemleri islem = new StokIslemleri();
    DatabaseTable islem2 = new DatabaseTable();
    /**
     * Creates new form FrameOperations
     */
    public FrameOperations() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_model = new javax.swing.JComboBox();
        combo_type = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_purchase = new javax.swing.JTextField();
        tf_sale = new javax.swing.JTextField();
        combo_piece = new javax.swing.JComboBox();
        add_product_button = new javax.swing.JButton();
        product_update_button = new javax.swing.JButton();
        delete_product_button = new javax.swing.JButton();
        save_to_db_button = new javax.swing.JButton();
        show_db_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        frame_table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tf_brand = new javax.swing.JTextField();
        message_box = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(450, 200, 0, 0));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Frame Stock Operations");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Frame Type");

        combo_model.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bone Rimmed", "Facet frame", "Metal Frame", "Nile Frame" }));

        combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eyeglasses", "Sunglasses" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Model :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Color:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Purchase Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sale Price");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Piece");

        combo_piece.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        add_product_button.setText("Add Product");
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });

        product_update_button.setText("Product Update");
        product_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_update_buttonActionPerformed(evt);
            }
        });

        delete_product_button.setText("Delete Product");
        delete_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_product_buttonActionPerformed(evt);
            }
        });

        save_to_db_button.setText("Save to Database");
        save_to_db_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_to_db_buttonActionPerformed(evt);
            }
        });

        show_db_button.setText("Show the database");
        show_db_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_db_buttonActionPerformed(evt);
            }
        });

        frame_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Frame Type", "Model", "Brand", "Color", "Piece", "Purchase Price", "Sale Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        frame_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(frame_table);
        if (frame_table.getColumnModel().getColumnCount() > 0) {
            frame_table.getColumnModel().getColumn(0).setResizable(false);
            frame_table.getColumnModel().getColumn(1).setResizable(false);
            frame_table.getColumnModel().getColumn(3).setResizable(false);
            frame_table.getColumnModel().getColumn(5).setResizable(false);
            frame_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Brand :");

        message_box.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(message_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(tf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tf_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(combo_piece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_color)
                                            .addComponent(combo_model, 0, 110, Short.MAX_VALUE)
                                            .addComponent(combo_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_brand)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add_product_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(product_update_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete_product_button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(save_to_db_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(show_db_button)))))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_piece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(message_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_product_button)
                    .addComponent(product_update_button)
                    .addComponent(delete_product_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_to_db_button)
                    .addComponent(show_db_button))
                .addGap(86, 86, 86))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        message_box.setText("");
        DefaultTableModel model = (DefaultTableModel) frame_table.getModel();
        if(tf_brand.getText().trim().equals("") || tf_color.getText().trim().equals("") ||combo_type.getSelectedItem().equals("")||combo_piece.getSelectedItem().equals("")|| combo_model.getSelectedItem().equals("") || tf_purchase.getText().trim().equals("") || tf_sale.getText().trim().equals("")){
            message_box.setText("Please fill all fields.");
        }
        else{
            Object[] eklenecek = {combo_type.getSelectedItem().toString(),combo_model.getSelectedItem().toString(),tf_brand.getText(),tf_color.getText(),combo_piece.getSelectedItem().toString(),tf_purchase.getText(),tf_sale.getText()};

            model.addRow(eklenecek);
        }
    }//GEN-LAST:event_add_product_buttonActionPerformed

    private void product_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_update_buttonActionPerformed
        message_box.setText("");
        DefaultTableModel model = (DefaultTableModel) frame_table.getModel();

        int secili_row = frame_table.getSelectedRow();
        if(secili_row == -1){
            if(frame_table.getRowCount() == 0){
                message_box.setText("Product table is empty.");
            }
            else{
                message_box.setText("Please select a product to update.");
            }
        }
        else{
            model.setValueAt(combo_type.getSelectedItem().toString(),secili_row,0);
            model.setValueAt(combo_model.getSelectedItem().toString(),secili_row,1);
            model.setValueAt(tf_brand.getText(),secili_row,2);
            model.setValueAt(tf_color.getText(),secili_row,3);
            model.setValueAt(combo_piece.getSelectedItem().toString(),secili_row,4);            
            model.setValueAt(tf_purchase.getText(),secili_row,5);
            model.setValueAt(tf_sale.getText(),secili_row,6);
            message_box.setText("The product has been successfully updated.");

        }
    }//GEN-LAST:event_product_update_buttonActionPerformed

    private void delete_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_product_buttonActionPerformed
        message_box.setText("");
        DefaultTableModel model = (DefaultTableModel) frame_table.getModel();

        int secili_row = frame_table.getSelectedRow();
        if(secili_row == -1){
            if(frame_table.getRowCount() == 0){
                message_box.setText("Product table is empty.");
            }
            else{
                message_box.setText("Please select a product to delete.");
            }
        }
        else{
            model.removeRow(secili_row);
            message_box.setText("The product has been successfully deleted.");
        }
    }//GEN-LAST:event_delete_product_buttonActionPerformed

    private void save_to_db_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_to_db_buttonActionPerformed
        message_box.setText("");
        int row = frame_table.getSelectedRow();
        if(row == -1){
            message_box.setText("Please select a row to save to database.");
        }
        else{
        String type = combo_type.getSelectedItem().toString();
        String model = combo_model.getSelectedItem().toString();
        String brand = tf_brand.getText();
        String color = tf_color.getText();
        String piece = combo_piece.getSelectedItem().toString();
        String purchase = tf_purchase.getText();
        String sale = tf_sale.getText();

        islem.cerceveEkle(type, model, brand, color, piece, purchase, sale);
        message_box.setText("Saved to database successfully.");
        }
        
    }//GEN-LAST:event_save_to_db_buttonActionPerformed

    private void show_db_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_db_buttonActionPerformed
        DatabaseTable databaseTable = new DatabaseTable();
        databaseTable.setVisible(true);
        islem2.cerceveGoruntule();

    }//GEN-LAST:event_show_db_buttonActionPerformed

    private void frame_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) frame_table.getModel();
        message_box.setText("");
        int secili_row = frame_table.getSelectedRow();
        combo_type.setSelectedItem(model.getValueAt(secili_row,0).toString());
        combo_model.setSelectedItem(model.getValueAt(secili_row,1).toString());
        tf_brand.setText (model.getValueAt(secili_row,2).toString());
        tf_color.setText (model.getValueAt(secili_row,3).toString());
        combo_piece.setSelectedItem(model.getValueAt(secili_row,4).toString());
        tf_purchase.setText (model.getValueAt(secili_row,5).toString());
        tf_sale.setText (model.getValueAt(secili_row,6).toString());
    }//GEN-LAST:event_frame_tableMouseClicked

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
            java.util.logging.Logger.getLogger(FrameOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product_button;
    private javax.swing.JComboBox combo_model;
    private javax.swing.JComboBox combo_piece;
    private javax.swing.JComboBox combo_type;
    private javax.swing.JButton delete_product_button;
    private javax.swing.JTable frame_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message_box;
    private javax.swing.JButton product_update_button;
    private javax.swing.JButton save_to_db_button;
    private javax.swing.JButton show_db_button;
    private javax.swing.JTextField tf_brand;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_purchase;
    private javax.swing.JTextField tf_sale;
    // End of variables declaration//GEN-END:variables
}
