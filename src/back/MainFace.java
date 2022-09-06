package back;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
add the notification that the product will be expired today 
when the user will open the application
 */
public class MainFace extends javax.swing.JFrame {

    /**
     * Creates new form MainFace
     *
     */
    public MainFace() {

        double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 40;
        double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 40;
        initComponents();

        setSize((int) w, (int) h);

        // trainer.setVisible(true);
        setLocationRelativeTo(null);

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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AddProd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        addProdMar = new javax.swing.JButton();
        notificationBTN = new javax.swing.JButton();
        Background bg = new Background();
        backgroundPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        trainer = new javax.swing.JMenu();
        addEmployee = new javax.swing.JMenuItem();
        updateEmployee = new javax.swing.JMenuItem();
        colleage1 = new javax.swing.JMenu();
        addProduct = new javax.swing.JMenuItem();
        editProduct = new javax.swing.JMenuItem();
        addProduct2 = new javax.swing.JMenuItem();
        colleage2 = new javax.swing.JMenu();
        addProduct1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market Application");
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(163, 216, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(114, 197, 252));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Add Market");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("Search Market");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        AddProd.setBackground(new java.awt.Color(204, 204, 204));
        AddProd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AddProd.setForeground(new java.awt.Color(0, 0, 102));
        AddProd.setText("Add Product");
        AddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("Search Product");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 102));
        jButton7.setText("Best Price");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        addProdMar.setBackground(new java.awt.Color(204, 204, 204));
        addProdMar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addProdMar.setForeground(new java.awt.Color(0, 0, 102));
        addProdMar.setText("Add Product to market");
        addProdMar.setActionCommand("Add Product to Market");
        addProdMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdToMarkt(evt);
            }
        });

        notificationBTN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        notificationBTN.setText("expired  products  today");
        notificationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificationBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addProdMar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificationBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addProdMar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        backgroundPanel = bg;

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        trainer.setText("Market");
        trainer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        addEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addEmployee.setText("Add Market");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        trainer.add(addEmployee);

        updateEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        updateEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateEmployee.setText("Edit Market");
        updateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeActionPerformed(evt);
            }
        });
        trainer.add(updateEmployee);

        jMenuBar1.add(trainer);

        colleage1.setBackground(new java.awt.Color(204, 204, 255));
        colleage1.setText("Products");
        colleage1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        addProduct.setBackground(new java.awt.Color(204, 204, 255));
        addProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addProduct.setText("Add Product");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        colleage1.add(addProduct);

        editProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editProduct.setText("Edit Product");
        editProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductActionPerformed(evt);
            }
        });
        colleage1.add(editProduct);

        addProduct2.setBackground(new java.awt.Color(204, 204, 255));
        addProduct2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addProduct2.setText("Add To Market");
        addProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduct2ActionPerformed(evt);
            }
        });
        colleage1.add(addProduct2);

        jMenuBar1.add(colleage1);

        colleage2.setBackground(new java.awt.Color(204, 204, 255));
        colleage2.setText("Reports");
        colleage2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        addProduct1.setBackground(new java.awt.Color(204, 204, 255));
        addProduct1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addProduct1.setText("Best Price");
        addProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduct1ActionPerformed(evt);
            }
        });
        colleage2.add(addProduct1);

        jMenuBar1.add(colleage2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SearchMarket e = new SearchMarket(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddMarket e;

        e = new AddMarket(this);

        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        AddMarket e = new AddMarket(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void updateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeActionPerformed
        SearchMarket tm = new SearchMarket(this);
        tm.setLocationRelativeTo(MainFace.this);
        tm.setVisible(true);

    }//GEN-LAST:event_updateEmployeeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SearchProduct e = new SearchProduct(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);

        // TODO add your handling code here:
//        BookCourse b = new BookCourse(this);
//        b.setLocationRelativeTo(MainFace.this);
//        b.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void editProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductActionPerformed
        SearchProduct tm = new SearchProduct(this);
        tm.setLocationRelativeTo(MainFace.this);
        tm.setVisible(true);
    }//GEN-LAST:event_editProductActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed

        AddProduct e = new AddProduct(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
    }//GEN-LAST:event_addProductActionPerformed

    private void AddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdActionPerformed
        AddProduct e = new AddProduct(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
    }//GEN-LAST:event_AddProdActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        BestPriceReport e = new BestPriceReport(MainFace.this);
        e.setLocationRelativeTo(this);
        e.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void addProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduct1ActionPerformed
        // TODO add your handling code here:
        BestPriceReport e = new BestPriceReport(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
    }//GEN-LAST:event_addProduct1ActionPerformed

    private void addProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduct2ActionPerformed
        AddtoMarket e = new AddtoMarket(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
        // TODO add your handling code here:

    }//GEN-LAST:event_addProduct2ActionPerformed

    private void addProdToMarkt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdToMarkt
        // TODO add your handling code here:
        AddtoMarket e = new AddtoMarket(this);
        e.setLocationRelativeTo(MainFace.this);
        e.setVisible(true);
    }//GEN-LAST:event_addProdToMarkt

    private void notificationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBTNActionPerformed
        // TODO add your handling code here:

        ExpiredProducts exp_prod;
        try {
            exp_prod = new ExpiredProducts(this);
            exp_prod.getExpiredProducts();
            exp_prod.setLocationRelativeTo(MainFace.this);
            exp_prod.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFace.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_notificationBTNActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProd;
    private javax.swing.JMenuItem addEmployee;
    private javax.swing.JButton addProdMar;
    private javax.swing.JMenuItem addProduct;
    private javax.swing.JMenuItem addProduct1;
    private javax.swing.JMenuItem addProduct2;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JMenu colleage1;
    private javax.swing.JMenu colleage2;
    private javax.swing.JMenuItem editProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notificationBTN;
    private javax.swing.JMenu trainer;
    private javax.swing.JMenuItem updateEmployee;
    // End of variables declaration//GEN-END:variables
}
