/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.me.myimageapp;
import java.util.Random;

/**
 *
 * @author dood
 */
public class ImageDisplay extends javax.swing.JFrame {

    /**
     * Creates new form ImageDisplay
     */
    
    Random r = new Random(); 
    int selected = 0;
    public ImageDisplay() {
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
        jLabel1 = new javax.swing.JLabel();
        bald_button = new javax.swing.JButton();
        emo_button = new javax.swing.JButton();
        explorer_button = new javax.swing.JButton();
        edd_button = new javax.swing.JButton();
        random_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/bald zombie.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        bald_button.setText("bald");
        bald_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bald_buttonActionPerformed(evt);
            }
        });

        emo_button.setText("emo");
        emo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emo_buttonActionPerformed(evt);
            }
        });

        explorer_button.setText("explorer");
        explorer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorer_buttonActionPerformed(evt);
            }
        });

        edd_button.setText("edd");
        edd_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edd_buttonActionPerformed(evt);
            }
        });

        random_button.setText("Randomizer");
        random_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                random_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bald_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emo_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(explorer_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edd_button))
                    .addComponent(random_button))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(random_button)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bald_button)
                    .addComponent(emo_button)
                    .addComponent(explorer_button)
                    .addComponent(edd_button))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edd_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edd_buttonActionPerformed
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/edd zombie.PNG"))); 
    }//GEN-LAST:event_edd_buttonActionPerformed

    private void emo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emo_buttonActionPerformed
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/emo zombie.PNG"))); 
    }//GEN-LAST:event_emo_buttonActionPerformed

    private void explorer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorer_buttonActionPerformed
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/explorer zombie.PNG"))); 
    }//GEN-LAST:event_explorer_buttonActionPerformed

    private void bald_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bald_buttonActionPerformed
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/bald zombie.PNG"))); 
    }//GEN-LAST:event_bald_buttonActionPerformed

    private void random_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_random_buttonActionPerformed
        selected =1 + r.nextInt(4);
        if (selected == 1)
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/edd zombie.PNG")));
        else if (selected == 2)
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/emo zombie.PNG")));
        else if (selected == 3)
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/explorer zombie.PNG")));
        else 
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/pichurs/bald zombie.PNG")));
    }//GEN-LAST:event_random_buttonActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bald_button;
    private javax.swing.JButton edd_button;
    private javax.swing.JButton emo_button;
    private javax.swing.JButton explorer_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton random_button;
    // End of variables declaration//GEN-END:variables
}
