/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagepanelprojectss;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author forever
 */
public class StartForm extends javax.swing.JFrame {

    /**
     * Creates new form StartForm
     */
     ImagePanel im;
    public StartForm() {
        initComponents();
        im = new ImagePanel();
        this.add(im);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        makepizza = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        riceflour = new javax.swing.JRadioButton();
        yeast = new javax.swing.JRadioButton();
        oliveoil = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        garlic = new javax.swing.JCheckBox();
        gum = new javax.swing.JCheckBox();
        sugar = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        soybean = new javax.swing.JComboBox<>();
        onion = new javax.swing.JComboBox<>();
        beef = new javax.swing.JComboBox<>();
        subtotaltf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        taxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totaltf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calculate = new javax.swing.JToggleButton();
        exit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        makepizza.setText("make");
        makepizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makepizzaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("pizza maker");

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        riceflour.setText("riceflour 2$");
        riceflour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riceflourActionPerformed(evt);
            }
        });

        yeast.setText("yeast 4$");
        yeast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeastActionPerformed(evt);
            }
        });

        oliveoil.setText("olive oil 1$");
        oliveoil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oliveoilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(riceflour, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeast, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oliveoil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(riceflour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yeast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(oliveoil)
                .addGap(30, 30, 30))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        garlic.setText("garlic $7");

        gum.setText("gum $5");

        sugar.setText("sugar 6$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(garlic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sugar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(garlic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sugar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        soybean.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "soybean 0.20$" }));
        soybean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soybeanActionPerformed(evt);
            }
        });

        onion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "onion 0.10$" }));
        onion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionActionPerformed(evt);
            }
        });

        beef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "beef 0.30$" }));
        beef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soybean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(beef, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(onion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soybean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(onion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel2.setText("subtotal");

        jLabel3.setText("tax");

        jLabel4.setText("total");

        calculate.setText("calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(makepizza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(calculate)
                                        .addGap(30, 30, 30)
                                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(exit)))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taxtf, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(subtotaltf)
                            .addComponent(totaltf))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(makepizza)
                            .addComponent(reset)
                            .addComponent(calculate)
                            .addComponent(exit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotaltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taxtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totaltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makepizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makepizzaActionPerformed
        // TODO add your handling code here:
        im.setImage(new ImageIcon(this.getClass().getResource("BACK.jpg")).getImage());
        im.setSize(200,300);
        im.setVisible(true);
        im.repaint();
        this.repaint();
        
        
    }//GEN-LAST:event_makepizzaActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        riceflour.setSelected(false);
        yeast.setSelected(false);
        oliveoil.setSelected(false);
        
        garlic.setSelected(false);
        gum.setSelected(false);
       
        sugar.setSelected(false);
        subtotaltf.setText("");
        taxtf.setText("");
        totaltf.setText("");
      
    }//GEN-LAST:event_resetActionPerformed

    private void riceflourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riceflourActionPerformed
        // TODO add your handling code here:
        if(riceflour.isSelected())
            yeast.setSelected(false);
        oliveoil.setSelected(false);
        
       
            
    }//GEN-LAST:event_riceflourActionPerformed

    private void yeastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeastActionPerformed
        // TODO add your handling code here:
        if(yeast.isSelected())
          riceflour.setSelected(false);
        oliveoil.setSelected(false);
        
            
    }//GEN-LAST:event_yeastActionPerformed

    private void oliveoilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oliveoilActionPerformed
        // TODO add your handling code here:
        if(oliveoil.isSelected())
            riceflour.setSelected(false);
       yeast.setSelected(false);
         
        
    }//GEN-LAST:event_oliveoilActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        double total;
        double subtotal = 0;
        final double TAXRATE = .06;
        double tax;
        if(riceflour.isSelected())
        {
            subtotal = subtotal + 2.00;
        }
        else if(yeast.isSelected())
        {
            subtotal = subtotal + 4.00;
        }
        else if(oliveoil.isSelected())
        {
            subtotal = subtotal +1.00;
        }
     if(soybean.getSelectedItem().equals(soybean))
     {
         subtotal = subtotal+ 0.20;
     }
     else if(onion.getSelectedItem().equals(onion))
     {
         subtotal = subtotal+ 0.10;
     }
     else if(beef.getSelectedItem().equals(beef))
     {
         subtotal = subtotal + 0.30;
     }
        
        
       if(garlic.isSelected())
       {
           subtotal = subtotal + 7.00;
       }
        if(gum.isSelected())
       {
           subtotal = subtotal + 5.00;
        }
        if (sugar.isSelected())
       {
           subtotal = subtotal + 6.00;
           
          subtotaltf.setText(Double.toString(subtotal));
          
          subtotal = Double.parseDouble(subtotaltf.getText());
          tax = subtotal * TAXRATE;
          total = tax + subtotal;
          taxtf.setText(Double.toString(tax));
          totaltf.setText(Double.toString(total));
       }
    }//GEN-LAST:event_calculateActionPerformed

    private void soybeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soybeanActionPerformed
        // TODO add your handling code here:
       String s = (String ) soybean.getSelectedItem();
        JOptionPane.showMessageDialog(this,"you have selected" +s);    
       
                                            
    }//GEN-LAST:event_soybeanActionPerformed

    private void onionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionActionPerformed
        // TODO add your handling code here:
        String s = (String ) onion.getSelectedItem();
        JOptionPane.showMessageDialog(this,"you have selected" +s);
                                            
    }//GEN-LAST:event_onionActionPerformed

    private void beefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefActionPerformed
        // TODO add your handling code here:
        String s = (String ) beef.getSelectedItem();
        JOptionPane.showMessageDialog(this,"you have selected" +s);
                                            
    }//GEN-LAST:event_beefActionPerformed

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
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> beef;
    private javax.swing.JToggleButton calculate;
    private javax.swing.JToggleButton exit;
    private javax.swing.JCheckBox garlic;
    private javax.swing.JCheckBox gum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton makepizza;
    private javax.swing.JRadioButton oliveoil;
    private javax.swing.JComboBox<String> onion;
    private javax.swing.JToggleButton reset;
    private javax.swing.JRadioButton riceflour;
    private javax.swing.JComboBox<String> soybean;
    private javax.swing.JTextField subtotaltf;
    private javax.swing.JCheckBox sugar;
    private javax.swing.JTextField taxtf;
    private javax.swing.JTextField totaltf;
    private javax.swing.JRadioButton yeast;
    // End of variables declaration//GEN-END:variables
}
