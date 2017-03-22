package cstute;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramzan Dieze
 */
public class EmployeeUp extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public EmployeeUp() {
        initComponents();
//        getContentPane().setBackground(Color.GRAY);
        setTitle("eBank");
        ImageIcon img = new ImageIcon("src/icon.png");
        this.setLocationRelativeTo(null);
//        updateEmpBtn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        empUserNameTextField = new javax.swing.JTextField();
        empPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empNameTextField = new javax.swing.JTextField();
        createEmpButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        empPositionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();
        logoutBtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        empNameTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empPositionTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        empUserNameTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        empPasswordField1 = new javax.swing.JPasswordField();
        backBtn2 = new javax.swing.JButton();
        updateEmpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        deleteAcntButton = new javax.swing.JButton();
        deleteAcntTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoutBtn3 = new javax.swing.JButton();
        backBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Position : ");

        jLabel5.setText("Username : ");

        createEmpButton.setText("Add Employee");
        createEmpButton.setPreferredSize(new java.awt.Dimension(97, 23));
        createEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmpButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name : ");

        jLabel6.setText("Password : ");

        backBtn1.setText("Back");
        backBtn1.setPreferredSize(new java.awt.Dimension(97, 23));
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        logoutBtn1.setText("Log Out");
        logoutBtn1.setPreferredSize(new java.awt.Dimension(97, 23));
        logoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(58, 58, 58)
                                .addComponent(empNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(createEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(empNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(empPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(empPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("Create", jPanel1);

        jLabel7.setText("Name : ");

        empNameTextField1.setEditable(false);

        jLabel8.setText("Position : ");

        empPositionTextField1.setEditable(false);

        jLabel9.setText("Username : ");

        empUserNameTextField1.setEditable(false);
        empUserNameTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empUserNameTextField1MousePressed(evt);
            }
        });

        jLabel10.setText("Password : ");

        empPasswordField1.setEditable(false);

        backBtn2.setText("Back");
        backBtn2.setPreferredSize(new java.awt.Dimension(97, 23));
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        updateEmpBtn.setText("Update");
        updateEmpBtn.setPreferredSize(new java.awt.Dimension(97, 23));
        updateEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmpBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Click on any text field to edit ");

        logoutBtn2.setText("Log Out");
        logoutBtn2.setPreferredSize(new java.awt.Dimension(97, 23));
        logoutBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(empPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empPositionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empUserNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(updateEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(empUserNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(empNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(empPositionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(empPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("Edit", jPanel2);

        deleteAcntButton.setText("Delete");
        deleteAcntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAcntButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("User Name");

        label1.setText("Enter  the username for delete a employee.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Delete employee");

        logoutBtn3.setText("Log Out");
        logoutBtn3.setPreferredSize(new java.awt.Dimension(97, 23));
        logoutBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtn3ActionPerformed(evt);
            }
        });

        backBtn3.setText("Back");
        backBtn3.setPreferredSize(new java.awt.Dimension(97, 23));
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(deleteAcntButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(deleteAcntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(deleteAcntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteAcntButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("Delete", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAcntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAcntButtonActionPerformed
        // TODO add your handling code here:
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ebank", "root", "");
//            
//            int ans = JOptionPane.showConfirmDialog(null, "Are you sure that you want to permanently delete this customer details?", "Confirm",
//                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//
//            String query = "DELETE FROM employeedata WHERE userName = '" + deleteAcntTextField.getText() + "' ";
//            PreparedStatement preparedStmt = con.prepareStatement(query);
//            
//            if (ans == JOptionPane.YES_OPTION) {
//                
//                preparedStmt.execute();
//                deleteAcntTextField.setText("");
//                JOptionPane.showMessageDialog(null,"Successfully deleted","TITLE",JOptionPane.WARNING_MESSAGE);
//                
//            }
//            
//
//            con.close();
//        } catch (Exception ex) {
//
//        }

        int ans = JOptionPane.showConfirmDialog(null, "Are you sure that you want to permanently delete this customer details?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (ans == JOptionPane.YES_OPTION) {
            String reply = deleteEmployee(deleteAcntTextField.getText());
            deleteAcntTextField.setText("");
            JOptionPane.showMessageDialog(null, reply, "TITLE", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_deleteAcntButtonActionPerformed

    private void createEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmpButtonActionPerformed

        String result = null;

        if (empNameTextField.getText().equals("") || empPositionTextField.getText().equals("") || empUserNameTextField.getText().equals("")
                || new String(empPasswordField.getPassword()).equals("")) {
            result = "You should fill out all the fields";
        } else {
            result = createEmployee(empNameTextField.getText(), empPositionTextField.getText(), empUserNameTextField.getText(),
                    new String(empPasswordField.getPassword()));

            if (result.equals("This user name is already taken")) {
                empUserNameTextField.setText("");
            } else {
                empNameTextField.setText("");
                empPositionTextField.setText("");
                empUserNameTextField.setText("");
                empPasswordField.setText("");
            }
        }
        JOptionPane.showMessageDialog(null, result);

    }//GEN-LAST:event_createEmpButtonActionPerformed

    private void updateEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmpBtnActionPerformed
        // TODO add your handling code here:
        String result = updateEmp(empNameTextField1.getText(), empPositionTextField1.getText(), empUserNameTextField1.getText(),
                new String(empPasswordField1.getPassword()));

        JOptionPane.showMessageDialog(null, result);
        
        empNameTextField1.setText("");
        empPositionTextField1.setText("");
        empUserNameTextField1.setText("");
        empPasswordField1.setText("");
    }//GEN-LAST:event_updateEmpBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        Selections.startSelection(true);
                dispose();
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void empUserNameTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empUserNameTextField1MousePressed
        String userName = JOptionPane.showInputDialog(null, "Enter the username", "Prompt username", HEIGHT);
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/ebank", "root", "");
//            PreparedStatement statement = con.prepareStatement("select * from employeeData where userName = ?");
//            statement.setString(1, userName);
//            ResultSet rs = statement.executeQuery();
//            rs.next();
//            if (rs.getString(3).equals(userName)) {
//                empNameTextField1.setText(rs.getString(1));
//                empPasswordField1.setText(rs.getString(4));
//                empUserNameTextField1.setText(rs.getString(3));
//                empPositionTextField1.setText(rs.getString(2));
//                empNameTextField1.setEditable(true);
//                empPasswordField1.setEditable(true);
//                empPositionTextField1.setEditable(true);
//            }
//            con.close();
//        }catch(SQLException  e){
//            System.out.println("Username not found, please check the username.");
//        } catch (ClassNotFoundException e) {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//        }
//if (rs.getString(3).equals(userName)) {
//                empNameTextField1.setText(rs.getString(1));
//                empPasswordField1.setText(rs.getString(4));
//                empUserNameTextField1.setText(rs.getString(3));
//                empPositionTextField1.setText(rs.getString(2));
//                empNameTextField1.setEditable(true);
//                empPasswordField1.setEditable(true);
//                empPositionTextField1.setEditable(true);
//            }

        String details = findempdata(userName);
        try {
            String[] detailsArr = details.split("&");
            empNameTextField1.setText(detailsArr[0]);
            empPositionTextField1.setText(detailsArr[1]);
            empUserNameTextField1.setText(detailsArr[2]);
            empPasswordField1.setText(detailsArr[3]);
            empUserNameTextField1.setEditable(false);
            empPositionTextField1.setEditable(true);
            empNameTextField1.setEditable(true);
            empPasswordField1.setEditable(true);
            updateEmpBtn.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "User not found.");
        }

    }//GEN-LAST:event_empUserNameTextField1MousePressed

    private void logoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn1ActionPerformed
        // TODO add your handling code here:
        Login.start();
        dispose();
    }//GEN-LAST:event_logoutBtn1ActionPerformed

    private void logoutBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn2ActionPerformed
        // TODO add your handling code here:
        Login.start();
        dispose();
    }//GEN-LAST:event_logoutBtn2ActionPerformed

    private void logoutBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtn3ActionPerformed
        // TODO add your handling code here:
        Login.start();
        dispose();
    }//GEN-LAST:event_logoutBtn3ActionPerformed

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        // TODO add your handling code here:
        Selections.startSelection(true);
                dispose();
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        // TODO add your handling code here:
        Selections.startSelection(true);
                dispose();
    }//GEN-LAST:event_backBtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void startEmp() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton backBtn2;
    private javax.swing.JButton backBtn3;
    private javax.swing.JButton createEmpButton;
    private javax.swing.JButton deleteAcntButton;
    private javax.swing.JTextField deleteAcntTextField;
    private javax.swing.JTextField empNameTextField;
    private javax.swing.JTextField empNameTextField1;
    private javax.swing.JPasswordField empPasswordField;
    private javax.swing.JPasswordField empPasswordField1;
    private javax.swing.JTextField empPositionTextField;
    private javax.swing.JTextField empPositionTextField1;
    private javax.swing.JTextField empUserNameTextField;
    private javax.swing.JTextField empUserNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.Label label1;
    private javax.swing.JButton logoutBtn1;
    private javax.swing.JButton logoutBtn2;
    private javax.swing.JButton logoutBtn3;
    private javax.swing.JButton updateEmpBtn;
    // End of variables declaration//GEN-END:variables

    private static String createEmployee(java.lang.String name, java.lang.String position, java.lang.String userName, java.lang.String password) {
        ebank.ManageEmpData_Service service = new ebank.ManageEmpData_Service();
        ebank.ManageEmpData port = service.getManageEmpDataPort();
        return port.createEmployee(name, position, userName, password);
    }

    private static String deleteEmployee(java.lang.String userName) {
        ebank.ManageEmpData_Service service = new ebank.ManageEmpData_Service();
        ebank.ManageEmpData port = service.getManageEmpDataPort();
        return port.deleteEmployee(userName);
    }

    private static String updateEmp(java.lang.String name, java.lang.String position, java.lang.String username, java.lang.String pass) {
        ebank.ManageEmpData_Service service = new ebank.ManageEmpData_Service();
        ebank.ManageEmpData port = service.getManageEmpDataPort();
        return port.updateEmp(name, position, username, pass);
    }

    private static String findempdata(java.lang.String userName) {
        ebank.ManageEmpData_Service service = new ebank.ManageEmpData_Service();
        ebank.ManageEmpData port = service.getManageEmpDataPort();
        return port.findempdata(userName);
    }

}
