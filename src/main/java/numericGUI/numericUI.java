/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package numericGUI;

/**
 *
 * @author Joshua Cappella
 */
public class numericUI extends javax.swing.JFrame {

    /**
     * Creates new form numericUI
     */
    public numericUI() {
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

        GCDDialog = new javax.swing.JDialog();
        GCDLabel = new javax.swing.JLabel();
        GCDScrollPane = new javax.swing.JScrollPane();
        GOutputTextArea = new javax.swing.JTextArea();
        GCloseButton = new javax.swing.JButton();
        GComputeButton = new javax.swing.JButton();
        GInputOne = new java.awt.TextField();
        GInputTwo = new java.awt.TextField();
        FactorialDialog = new javax.swing.JDialog();
        FactorialLabel = new javax.swing.JLabel();
        FactorialScrollPane = new javax.swing.JScrollPane();
        FOutputTextArea = new javax.swing.JTextArea();
        FCloseButton = new javax.swing.JButton();
        FComputeButton = new javax.swing.JButton();
        FInput = new java.awt.TextField();
        MainMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        ExitMenuItem = new javax.swing.JMenuItem();
        ComputeMenu = new javax.swing.JMenu();
        GCDMenuItem = new javax.swing.JMenuItem();
        FactorialMenuItem = new javax.swing.JMenuItem();

        GCDDialog.setBackground(new java.awt.Color(102, 51, 255));
        GCDDialog.setForeground(java.awt.Color.white);

        GCDLabel.setText("Compute Greatest Common Divisor");

        GOutputTextArea.setEditable(false);
        GOutputTextArea.setColumns(20);
        GOutputTextArea.setRows(5);
        GCDScrollPane.setViewportView(GOutputTextArea);

        GCloseButton.setText("Close");
        GCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GCloseButtonActionPerformed(evt);
            }
        });

        GComputeButton.setText("Compute");
        GComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GComputeButtonActionPerformed(evt);
            }
        });

        GInputOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GInputOneActionPerformed(evt);
            }
        });
        GInputOne.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                GInputOneTextValueChanged(evt);
            }
        });

        GInputTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GInputTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GCDDialogLayout = new javax.swing.GroupLayout(GCDDialog.getContentPane());
        GCDDialog.getContentPane().setLayout(GCDDialogLayout);
        GCDDialogLayout.setHorizontalGroup(
            GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GCDDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GCDScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addGroup(GCDDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GComputeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GCDDialogLayout.createSequentialGroup()
                        .addGroup(GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GCDLabel)
                            .addGroup(GCDDialogLayout.createSequentialGroup()
                                .addComponent(GInputOne, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GInputTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GCDDialogLayout.setVerticalGroup(
            GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GCDDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GCDLabel)
                .addGap(53, 53, 53)
                .addGroup(GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GInputOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GInputTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GCDScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(GCDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GCloseButton)
                    .addComponent(GComputeButton))
                .addContainerGap())
        );

        FactorialLabel.setText("Compute Factorial");

        FOutputTextArea.setEditable(false);
        FOutputTextArea.setColumns(20);
        FOutputTextArea.setRows(5);
        FactorialScrollPane.setViewportView(FOutputTextArea);

        FCloseButton.setText("Close");
        FCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCloseButtonActionPerformed(evt);
            }
        });

        FComputeButton.setText("Compute");
        FComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FComputeButtonActionPerformed(evt);
            }
        });
        FComputeButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FComputeButtonKeyPressed(evt);
            }
        });

        FInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FactorialDialogLayout = new javax.swing.GroupLayout(FactorialDialog.getContentPane());
        FactorialDialog.getContentPane().setLayout(FactorialDialogLayout);
        FactorialDialogLayout.setHorizontalGroup(
            FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FactorialDialogLayout.createSequentialGroup()
                .addGroup(FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FactorialDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FComputeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FactorialDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FactorialScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addGroup(FactorialDialogLayout.createSequentialGroup()
                                .addGroup(FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FactorialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FInput, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        FactorialDialogLayout.setVerticalGroup(
            FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FactorialDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FactorialLabel)
                .addGap(60, 60, 60)
                .addComponent(FInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FactorialScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(FactorialDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FCloseButton)
                    .addComponent(FComputeButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FileMenu.setText("File");

        ExitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMenuItem);

        MainMenuBar.add(FileMenu);

        ComputeMenu.setText("Compute");
        ComputeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComputeMenuMouseClicked(evt);
            }
        });

        GCDMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        GCDMenuItem.setText("GCD");
        GCDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GCDMenuItemActionPerformed(evt);
            }
        });
        ComputeMenu.add(GCDMenuItem);

        FactorialMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        FactorialMenuItem.setText("Factorial");
        FactorialMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactorialMenuItemActionPerformed(evt);
            }
        });
        ComputeMenu.add(FactorialMenuItem);

        MainMenuBar.add(ComputeMenu);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComputeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComputeMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ComputeMenuMouseClicked

    private void GInputOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GInputOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GInputOneActionPerformed

    private void GInputOneTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_GInputOneTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_GInputOneTextValueChanged

    private void GInputTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GInputTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GInputTwoActionPerformed

    private void FCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCloseButtonActionPerformed
        FactorialDialog.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_FCloseButtonActionPerformed

    private void FComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FComputeButtonActionPerformed
       try{
            String inString = FInput.getText();
            int omega = Integer.parseInt(inString);
            if(omega < 0){
                throw new IllegalStateException();
            }
            double Fresult = numeric.Factorial.compute(omega);
            FOutputTextArea.setText("The factorial is: " + Fresult);
        }
        catch(IllegalArgumentException i){
            FOutputTextArea.setText("Input a positive integer.");
        }
        catch(IllegalStateException j){
            FOutputTextArea.setText("Negative factorials are undefined.\n"
                    + "Input a positive integer.");
        }
        catch(Exception g){
            FOutputTextArea.setText("You've caught a general exception.");
        }
    }//GEN-LAST:event_FComputeButtonActionPerformed

    private void GCDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GCDMenuItemActionPerformed
        GCDDialog.pack();
        GCDDialog.setVisible(true);
    }//GEN-LAST:event_GCDMenuItemActionPerformed

    private void FactorialMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactorialMenuItemActionPerformed
        FactorialDialog.pack();
        FactorialDialog.setVisible(true);
    }//GEN-LAST:event_FactorialMenuItemActionPerformed

    private void GCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GCloseButtonActionPerformed
        GCDDialog.setVisible(false);
    }//GEN-LAST:event_GCloseButtonActionPerformed

    private void FInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FInputActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void GComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GComputeButtonActionPerformed
        try{
            String inStringOne = GInputOne.getText();
            String inStringTwo = GInputTwo.getText();
            int alpha = Integer.parseInt(inStringOne);
            int beta = Integer.parseInt(inStringTwo);
            int result = numeric.GCD.compute(alpha, beta);
            GOutputTextArea.setText("The GCD is: " + result);
        }
        catch(NumberFormatException f){
            GOutputTextArea.setText("Please enter two integers.");
        }
        catch(Exception z){
            GOutputTextArea.setText("You've caught a generic exception");
        }
    }//GEN-LAST:event_GComputeButtonActionPerformed

    private void FComputeButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FComputeButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FComputeButtonKeyPressed

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
            java.util.logging.Logger.getLogger(numericUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(numericUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(numericUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(numericUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new numericUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ComputeMenu;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JButton FCloseButton;
    private javax.swing.JButton FComputeButton;
    private java.awt.TextField FInput;
    private javax.swing.JTextArea FOutputTextArea;
    private javax.swing.JDialog FactorialDialog;
    private javax.swing.JLabel FactorialLabel;
    private javax.swing.JMenuItem FactorialMenuItem;
    private javax.swing.JScrollPane FactorialScrollPane;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JDialog GCDDialog;
    private javax.swing.JLabel GCDLabel;
    private javax.swing.JMenuItem GCDMenuItem;
    private javax.swing.JScrollPane GCDScrollPane;
    private javax.swing.JButton GCloseButton;
    private javax.swing.JButton GComputeButton;
    private java.awt.TextField GInputOne;
    private java.awt.TextField GInputTwo;
    private javax.swing.JTextArea GOutputTextArea;
    private javax.swing.JMenuBar MainMenuBar;
    // End of variables declaration//GEN-END:variables
}
