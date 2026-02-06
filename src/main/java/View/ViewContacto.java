package View;

import javax.swing.JButton;

public class ViewContacto extends javax.swing.JFrame {

    /**
     * Creates new form ViewBancaMovil
     */
    public ViewContacto() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
    }
    

    public String getCedula() {
        return txfCedula.getText();
    }
    
    public void showErrors(String error){
        lblErrors.setText(error);
    }
    
    public void clear(){
        lblErrors.setText("");
        txfCedula.setText("");
    }
    

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnContinue() {
        return btnContinue;
    }
    
    public JButton getBtnValidate() {
        return btnValidate;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfCedula = new javax.swing.JTextField();
        btnContinue = new javax.swing.JButton();
        lblErrors = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnValidate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(414, 896));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfCedula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCedula.setBorder(null);
        txfCedula.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, 50));

        btnContinue.setBackground(new java.awt.Color(10, 107, 207));
        btnContinue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnContinue.setBorder(null);
        btnContinue.setBorderPainted(false);
        btnContinue.setContentAreaFilled(false);
        btnContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinue.setEnabled(false);
        btnContinue.setFocusPainted(false);
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 350, 60));

        lblErrors.setForeground(new java.awt.Color(255, 158, 0));
        lblErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblErrors, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 350, 20));

        btnExit.setBackground(new java.awt.Color(10, 107, 207));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 40));

        btnValidate.setBackground(new java.awt.Color(10, 107, 207));
        btnValidate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnValidate.setBorder(null);
        btnValidate.setBorderPainted(false);
        btnValidate.setContentAreaFilled(false);
        btnValidate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidate.setFocusPainted(false);
        jPanel1.add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconSelect.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JTextField txfCedula;
    // End of variables declaration//GEN-END:variables
}
