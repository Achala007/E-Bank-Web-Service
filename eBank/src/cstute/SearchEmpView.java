/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cstute;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Achala Piyarathna
 */
public class SearchEmpView extends javax.swing.JFrame {

    SearchEmpView(boolean flag){
        
    }
    
    public static void start(String model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmpView().setVisible(true);
            }
        });
        new SearchEmpView(true).display(model);
/
    }
    
    public void display(String model) {
//        System.out.println("Hei "+model);
        initComponents();
        lable1.setText(model.split("&")[0]);
        lable2.setText(model.split("&")[1]);
        lable3.setText(model.split("&")[2]);
        lable4.setText(model.split("&")[3]);
        lable5.setText(model.split("&")[4]);
        lable6.setText(model.split("&")[5]);
        lable7.setText(model.split("&")[6]);
        lable8.setText(model.split("&")[7]);
        lable9.setText(model.split("&")[8]);
        lable10.setText(model.split("&")[9]);
    }

    /**
     * Creates new form SearchEmpView
     */
    public SearchEmpView() {
        initComponents();
//        getContentPane().setBackground(Color.DARK_GRAY);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lable1 = new javax.swing.JLabel();
        lable8 = new javax.swing.JLabel();
        lable7 = new javax.swing.JLabel();
        lable6 = new javax.swing.JLabel();
        lable5 = new javax.swing.JLabel();
        lable4 = new javax.swing.JLabel();
        lable3 = new javax.swing.JLabel();
        lable2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lable9 = new javax.swing.JLabel();
        lable10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name :");

        jLabel2.setText("Sort code :");

        jLabel3.setText("DOB : ");

        jLabel4.setText("Address : ");

        jLabel5.setText("Mobile :");

        jLabel6.setText("Email :");

        jLabel7.setText("Account type :");

        jLabel8.setText("Account number :");

        lable1.setText("Mohamed Ramzan");

        lable8.setText("w565676");

        lable7.setText("4556871128");

        lable6.setText("current");

        lable5.setText("ramzandieze35@gmail.com");

        lable4.setText("0778988587");

        lable3.setText("66/A, St.Lazarus road,Negombo");

        lable2.setText("01/15/1997");

        jButton1.setText("Edit Customer");
        jButton1.setPreferredSize(new java.awt.Dimension(109, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DeleteCustomer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.setPreferredSize(new java.awt.Dimension(71, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Cutomer Details");

        jLabel18.setText("Balance :");

        lable9.setText("24524545");

        lable10.setText("45671267");

        jLabel21.setText("Card :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable8)
                            .addComponent(lable2)
                            .addComponent(lable3)
                            .addComponent(lable4)
                            .addComponent(lable5)
                            .addComponent(lable6)
                            .addComponent(lable7)
                            .addComponent(lable1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable9)
                            .addComponent(lable10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lable1)
                        .addGap(26, 26, 26)
                        .addComponent(lable2)
                        .addGap(26, 26, 26)
                        .addComponent(lable3)
                        .addGap(27, 27, 27)
                        .addComponent(lable4)
                        .addGap(27, 27, 27)
                        .addComponent(lable5)
                        .addGap(26, 26, 26)
                        .addComponent(lable6)
                        .addGap(26, 26, 26)
                        .addComponent(lable7)
                        .addGap(26, 26, 26)
                        .addComponent(lable8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lable9))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lable10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CustomerUp.startCust();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CustomerUp.startCust();
        dispose();tList();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login.start();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JLabel lable1;
    private static javax.swing.JLabel lable10;
    private static javax.swing.JLabel lable2;
    private static javax.swing.JLabel lable3;
    private static javax.swing.JLabel lable4;
    private static javax.swing.JLabel lable5;
    private static javax.swing.JLabel lable6;
    private static javax.swing.JLabel lable7;
    private static javax.swing.JLabel lable8;
    private static javax.swing.JLabel lable9;
    // End of variables declaration//GEN-END:variables
}
