
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Items extends javax.swing.JFrame {
    Connection con = null;
    
    public Items() {
        
        initComponents();
        connect();
    }
    public void  connect (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list", "root", "");
            System.out.println("connect");
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }  
    }
    public void show_table(){
        int count;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list","root","");
            Statement st = con.createStatement();
            
            String str = "select * from items_list";
            ResultSet rs = st.executeQuery(str);
            ResultSetMetaData D = rs.getMetaData();
            count = D.getColumnCount();
            DefaultTableModel tblmodel = (DefaultTableModel)tbl.getModel();
            tblmodel.setRowCount(0);
            while (rs.next()){
                Vector v1 = new Vector();
                for(int i =1;i<=count;i++){
                    v1.add(rs.getString("P_ID"));
                    v1.add(rs.getString("P_Name"));
                    v1.add(rs.getString("Category"));
                    v1.add(rs.getString("MFG"));
                    v1.add(rs.getString("EXP"));     
            }
                tblmodel.addRow(v1);
            } 
        }    
        catch(Exception e){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        MFG = new javax.swing.JFormattedTextField();
        EXP = new javax.swing.JFormattedTextField();
        id = new javax.swing.JTextField();
        P_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        soft_del = new javax.swing.JButton();

        P_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_IDActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "P_ID", "Product ", "Category", "MFG date", "EXP date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Products Items");

        jLabel2.setText("Product Category");

        jLabel3.setText("Product Name");

        jLabel4.setText("MFG Date");

        jLabel5.setText("EXP Date");

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clothing", "Music", "Posters", "Shoes", "Food", "Supplies", "Cosmetic", "Skin Care" }));

        MFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFGActionPerformed(evt);
            }
        });

        EXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        P_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_NameActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        soft_del.setText("Soft_Delete");
        soft_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soft_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(soft_del, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_Name)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addComponent(MFG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show)
                                .addGap(8, 8, 8)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MFG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soft_del, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list","root","");
            String val="insert into items_list (P_Name,Category,MFG_date,EXP_date,Soft_Delete) values (?,?,?,?,0)";
            PreparedStatement pat = con.prepareStatement(val);
            //pat.setString(1, id.getText());
             pat.setString(1, P_Name.getText());
            String value=Category.getSelectedItem().toString();
            pat.setString(2, value);
            pat.setString(3, MFG.getText());
            pat.setString(4, EXP.getText());
            pat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Inserted");
            con.close();
            id.setText("");
            P_Name.setText("");
            P_ID.setText("");
            MFG.setText("");
            EXP.setText("");  
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        show_table();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list","root","");
            String val="update items_list set P_Name=?,Category=?,MFG_date=?,EXP_Date=? where P_ID=?";
            PreparedStatement pat = con.prepareStatement(val);
            pat.setString(5, id.getText());
            pat.setString(1, P_Name.getText());
            String value=Category.getSelectedItem().toString();
            pat.setString(2, value);
            pat.setString(3, MFG.getText());
            pat.setString(4, EXP.getText());
            pat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated Successfully");
            con.close();
            id.setText("");
            P_ID.setText("");
            MFG.setText("");
            EXP.setText(""); 
            P_Name.setText(""); 
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }        
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void P_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_IDActionPerformed

    private void MFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MFGActionPerformed

    private void EXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXPActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
       
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list","root","");
           
           String str = "select * from items_list ";
           PreparedStatement pat = con.prepareStatement(str);
           ResultSet rs = pat.executeQuery(str);
           tbl.setModel(DbUtils.resultSetToTableModel(rs));
          
      }
      catch(Exception ex){
          
      }
        
     
    }//GEN-LAST:event_showActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list","root","");
            String val="delete from items_list where P_ID=?";
            PreparedStatement pat = con.prepareStatement(val);
            pat.setString(1, id.getText());
            pat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
            id.setText("");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
      

        
    }//GEN-LAST:event_deleteActionPerformed

    private void P_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_NameActionPerformed

    private void soft_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft_delActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        int selectedIndex = tbl.getSelectedRow();

        if (selectedIndex != -1) {
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_list", "root", "")) {
                String sql = "UPDATE items_list SET Soft_Delete = 1 WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

                model.removeRow(selectedIndex);

            } catch (SQLException e) 
            {
                      
            }
        }
           
    }//GEN-LAST:event_soft_delActionPerformed

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JFormattedTextField EXP;
    private javax.swing.JFormattedTextField MFG;
    private javax.swing.JTextField P_ID;
    private javax.swing.JTextField P_Name;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton show;
    private javax.swing.JButton soft_del;
    private javax.swing.JTable tbl;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
