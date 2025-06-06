
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class NewJFrame extends javax.swing.JFrame implements DocumentListener {
private void updateValidation() {
    String login = jTextField1.getText();
    String pass = new String(jPasswordField1.getPassword());

    // Check minimum 5 characters
    if (login.length() < 5 || pass.length() < 5) {
        jLabel5.setText("Login and password must be at least 5 characters.");
    } else {
        jLabel5.setText("Correct.");
    }

    // Check for at least 3 digits in password
    int digitCount = 0;
    for (int i = 0; i < pass.length(); i++) {
        if (Character.isDigit(pass.charAt(i))) {
            digitCount++;
        }
    }
    if (digitCount < 3) {
        jLabel6.setText("Password must contain at least 3 digits.");
    } else {
        jLabel6.setText("Correct.");
    }
}
@Override
public void insertUpdate(DocumentEvent de) {
    updateValidation();
}

@Override
public void removeUpdate(DocumentEvent de) {
    updateValidation();
}

@Override
public void changedUpdate(DocumentEvent de) {
    updateValidation();
}

//    @Override
//    public void insertUpdate(DocumentEvent de) {
//         String login = jTextField1.getText();
//        String pass = new String(jPasswordField1.getPassword());
//
//        // Check minimum 5 characters
//        if (login.length() < 5 || pass.length() < 5) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Login and password must be at least 5 characters.");
//            jLabel5.setText("Login and password must be at least 5 characters.");
//            //return;
//        }
//        else if(login.length() >= 5 || pass.length() >= 5){
//            jLabel5.setText("Correct.");
//        }
//
//        // Check for at least 3 digits in password
//        int digitCount = 0;
//        for (int i = 0; i < pass.length(); i++) {
//            if (Character.isDigit(pass.charAt(i))) {
//                digitCount++;
//            }
//        }
//
//        if (digitCount < 3) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Password must contain at least 3 digits.");
//        jLabel6.setText("Password must contain at least 3 digits.");
//        
//            //return;
//        }
//        else if(digitCount>=3){
//            jLabel6.setText("Correct.");
//        }//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        
//    }
//
//    @Override
//    public void removeUpdate(DocumentEvent de) {
//         String login = jTextField1.getText();
//        String pass = new String(jPasswordField1.getPassword());
//
//        // Check minimum 5 characters
//        if (login.length() < 5 || pass.length() < 5) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Login and password must be at least 5 characters.");
//            jLabel5.setText("Login and password must be at least 5 characters.");
//            //return;
//        }
//        else if(login.length() >= 5 || pass.length() >= 5){
//            jLabel5.setText("Correct.");
//        }
//
//        // Check for at least 3 digits in password
//        int digitCount = 0;
//        for (int i = 0; i < pass.length(); i++) {
//            if (Character.isDigit(pass.charAt(i))) {
//                digitCount++;
//            }
//        }
//
//        if (digitCount < 3) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Password must contain at least 3 digits.");
//        jLabel6.setText("Password must contain at least 3 digits.");
//        
//            //return;
//        }
//        else if (digitCount < 3){
//            jLabel6.setText("Correct.");
//        }//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void changedUpdate(DocumentEvent de) {
//         String login = jTextField1.getText();
//        String pass = new String(jPasswordField1.getPassword());
//
//        // Check minimum 5 characters
//        if (login.length() < 5 || pass.length() < 5) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Login and password must be at least 5 characters.");
//            jLabel5.setText("Login and password must be at least 5 characters.");
//            //return;
//        }
//        else if(login.length() >= 5 || pass.length() >= 5){
//            jLabel5.setText("Correct.");
//        }
//
//        // Check for at least 3 digits in password
//        int digitCount = 0;
//        for (int i = 0; i < pass.length(); i++) {
//            if (Character.isDigit(pass.charAt(i))) {
//                digitCount++;
//            }
//        }
//
//        if (digitCount < 3) {
////            javax.swing.JOptionPane.showMessageDialog(this,
////                "Password must contain at least 3 digits.");
//        jLabel6.setText("Password must contain at least 3 digits.");
//        
//            //return;
//        }
//        else if (digitCount < 3){
//            jLabel6.setText("Correct.");
//        }//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    /**
//     * Creates new form NewJFrame
    // */
      // Store registered login and password
    public String registeredLogin = "";
    public String registeredPassword = "";
    private void validateLoginFields() {
    String login = jTextField2.getText();
    String pass = new String(jPasswordField2.getPassword());

    if (login.isEmpty() || pass.isEmpty()) {
        jLabel7.setText("Fields cannot be empty.");
    } else {
        jLabel7.setText("Correct.");
    }
}

    public NewJFrame() {
        initComponents();
        jPanel2.setVisible(false); // hide login panel at startup
        jTextField1.getDocument().addDocumentListener(this);
        //jTextField2.getDocument().addDocumentListener(this);
        jPasswordField2.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        validateLoginFields();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        validateLoginFields();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        validateLoginFields();
    }
});
    }

    // Event handler for "Register" button
   
        


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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration"));

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(jPasswordField1))
                            .addComponent(jLabel6))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel3.setText("Login");

        jLabel4.setText("Passwrod");

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jTextField2))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String login = jTextField1.getText();
        String pass = new String(jPasswordField1.getPassword());

        // Check minimum 5 characters
        if (login.length() < 5 || pass.length() < 5) {
//            javax.swing.JOptionPane.showMessageDialog(this,
//                "Login and password must be at least 5 characters.");
            jLabel5.setText("Login and password must be at least 5 characters.");
            return;
        }

        // Check for at least 3 digits in password
        int digitCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                digitCount++;
            }
        }

        if (digitCount < 3) {
//            javax.swing.JOptionPane.showMessageDialog(this,
//                "Password must contain at least 3 digits.");
        jLabel6.setText("Password must contain at least 3 digits.");
        
            return;
        }

        // Save registered values
        registeredLogin = login;
        registeredPassword = pass;

        // Show registration success and switch to login panel
        javax.swing.JOptionPane.showMessageDialog(this, "Registration successful!");

        //jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String login = jTextField2.getText();
        String pass = new String(jPasswordField2.getPassword());

        if (login.equals(registeredLogin) && pass.equals(registeredPassword)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login successful!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Login failed. Try again.");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
