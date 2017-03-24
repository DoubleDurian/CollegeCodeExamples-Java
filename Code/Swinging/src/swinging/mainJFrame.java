/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinging;

import java.text.NumberFormat;

public class mainJFrame extends javax.swing.JFrame {

    private static final double COFFEE = 1.99D;
    private static final double DONUT = .99D;
    private static final double SPECIAL = 1.49D;

    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    private String valString;
    private int coffeeAmt, donutAmt, specialAmt;
    private double coffeeSubtotal, donutSubtotal, specialSubtotal,totalAmt,tax,finalAmt;

    //====mainJFrame()==========================================================
    public mainJFrame() {
        initComponents();

        valString = nf.format(COFFEE);
        coffPriceLabel.setText(valString);
        valString = nf.format(DONUT);
        donPriceLabel.setText(valString);
        valString = nf.format(SPECIAL);
        specPriceLabel.setText(valString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coffeeLabel = new javax.swing.JLabel();
        donutsLabel = new javax.swing.JLabel();
        specialLabel = new javax.swing.JLabel();
        coffeeTextField = new javax.swing.JTextField();
        donutTextField = new javax.swing.JTextField();
        specialTextField = new javax.swing.JTextField();
        at1Label = new javax.swing.JLabel();
        at2Label = new javax.swing.JLabel();
        at3Label = new javax.swing.JLabel();
        equal1Label = new javax.swing.JLabel();
        equal2Label = new javax.swing.JLabel();
        equal3Label = new javax.swing.JLabel();
        coffPriceLabel = new javax.swing.JLabel();
        donPriceLabel = new javax.swing.JLabel();
        specPriceLabel = new javax.swing.JLabel();
        coffSubtotalLabel = new javax.swing.JLabel();
        donSubtotalLabel = new javax.swing.JLabel();
        specSubtotalLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        calculateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        taxLable = new javax.swing.JLabel();
        totalAmtLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coffeeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coffeeLabel.setText("Coffee:");

        donutsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donutsLabel.setText("Donuts:");

        specialLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        specialLabel.setText("Special:");

        coffeeTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coffeeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        coffeeTextField.setToolTipText("Enter cofee ammount here");
        coffeeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coffeeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffeeTextFieldActionPerformed(evt);
            }
        });

        donutTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donutTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        donutTextField.setToolTipText("Enter donut ammount here");
        donutTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        donutTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donutTextFieldActionPerformed(evt);
            }
        });

        specialTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        specialTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        specialTextField.setToolTipText("Enter special ammount here");
        specialTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        specialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialTextFieldActionPerformed(evt);
            }
        });

        at1Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        at1Label.setText("@");

        at2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        at2Label.setText("@");

        at3Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        at3Label.setText("@");

        equal1Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equal1Label.setText("=");

        equal2Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equal2Label.setText("=");

        equal3Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equal3Label.setText("=");

        coffPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coffPriceLabel.setText("jLabel1");

        donPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donPriceLabel.setText("jLabel1");

        specPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        specPriceLabel.setText("jLabel1");

        coffSubtotalLabel.setBackground(new java.awt.Color(255, 255, 255));
        coffSubtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coffSubtotalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coffSubtotalLabel.setOpaque(true);

        donSubtotalLabel.setBackground(new java.awt.Color(255, 255, 255));
        donSubtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        donSubtotalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        donSubtotalLabel.setOpaque(true);

        specSubtotalLabel.setBackground(new java.awt.Color(255, 255, 255));
        specSubtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        specSubtotalLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        specSubtotalLabel.setOpaque(true);

        buttonPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        calculateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonMouseClicked(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total.setToolTipText("");
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        taxLable.setBackground(new java.awt.Color(255, 255, 255));
        taxLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taxLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        taxLable.setOpaque(true);

        totalAmtLable.setBackground(new java.awt.Color(255, 255, 255));
        totalAmtLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalAmtLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalAmtLable.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specialLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(specialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coffeeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(coffeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(donutsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(donutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(at2Label)
                                .addGap(18, 18, 18)
                                .addComponent(donPriceLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(at3Label)
                                .addGap(18, 18, 18)
                                .addComponent(specPriceLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(at1Label)
                                .addGap(18, 18, 18)
                                .addComponent(coffPriceLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equal1Label)
                            .addComponent(equal2Label)
                            .addComponent(equal3Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coffSubtotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donSubtotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(specSubtotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalAmtLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coffeeLabel)
                    .addComponent(coffeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(at1Label)
                    .addComponent(equal1Label)
                    .addComponent(coffPriceLabel)
                    .addComponent(coffSubtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(donutsLabel)
                        .addComponent(donutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(at2Label)
                        .addComponent(equal2Label)
                        .addComponent(donPriceLabel))
                    .addComponent(donSubtotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialLabel)
                    .addComponent(specialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(at3Label)
                    .addComponent(equal3Label)
                    .addComponent(specPriceLabel)
                    .addComponent(specSubtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(totalAmtLable, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(taxLable, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coffeeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffeeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coffeeTextFieldActionPerformed

    private void donutTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donutTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donutTextFieldActionPerformed

    private void specialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialTextFieldActionPerformed
//====calculateButtonMouseClicked()=============================================
    private void calculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseClicked
        try {
            coffeeAmt = Integer.parseInt(coffeeTextField.getText());
            coffeeSubtotal = coffeeAmt * COFFEE;
            valString = nf.format(coffeeSubtotal);
            coffSubtotalLabel.setText(valString);
            
            donutAmt = Integer.parseInt(donutTextField.getText());
            donutSubtotal = donutAmt * DONUT;
            valString = nf.format(donutSubtotal);
            donSubtotalLabel.setText(valString);
            
            specialAmt = Integer.parseInt(specialTextField.getText());
            specialSubtotal = specialAmt * SPECIAL;
            valString = nf.format(specialSubtotal);
            specSubtotalLabel.setText(valString);
            
            //add up subtotals to get netSaleAmt
            totalAmt = specialSubtotal + donutSubtotal + coffeeSubtotal;
            valString = nf.format(totalAmt);
            totalAmtLable.setText(valString);
            //format and display netSaleAmt
            tax = totalAmt *.08;
            valString = nf.format(tax);
            taxLable.setText(valString);
            
            finalAmt = totalAmt + tax;
            valString = nf.format(finalAmt);
            total.setText(valString);
            //calculate tax at a constant rate of .08 (*%)
            //format and display taxAmt (you can do both local and state if you want_
            //calculate the totalSaleAmt = netSaleAmt + taxAmt
            //format and display totalSaleAmt
            
        } catch (Exception e) {
            clearButtonMouseClicked(evt);
        }
    }//GEN-LAST:event_calculateButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        coffeeTextField.setText(null);
        donutTextField.setText(null);
        specialTextField.setText(null);
        coffeeAmt = 0;
        donutAmt = 0;
        specialAmt = 0;
        coffeeSubtotal = 0;
        donutSubtotal = 0;
        specialSubtotal = 0;
        coffSubtotalLabel.setText(null);
        donSubtotalLabel.setText(null);
        specSubtotalLabel.setText(null);
        
        coffeeTextField.requestFocusInWindow();
        
    }//GEN-LAST:event_clearButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel at1Label;
    private javax.swing.JLabel at2Label;
    private javax.swing.JLabel at3Label;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel coffPriceLabel;
    private javax.swing.JLabel coffSubtotalLabel;
    private javax.swing.JLabel coffeeLabel;
    private javax.swing.JTextField coffeeTextField;
    private javax.swing.JLabel donPriceLabel;
    private javax.swing.JLabel donSubtotalLabel;
    private javax.swing.JTextField donutTextField;
    private javax.swing.JLabel donutsLabel;
    private javax.swing.JLabel equal1Label;
    private javax.swing.JLabel equal2Label;
    private javax.swing.JLabel equal3Label;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel specPriceLabel;
    private javax.swing.JLabel specSubtotalLabel;
    private javax.swing.JLabel specialLabel;
    private javax.swing.JTextField specialTextField;
    private javax.swing.JLabel taxLable;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalAmtLable;
    // End of variables declaration//GEN-END:variables
}
