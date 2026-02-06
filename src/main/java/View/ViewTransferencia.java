package View;

import javax.swing.JButton;

public class ViewTransferencia extends javax.swing.JFrame {

    /**
     * Creates new form ViewBancaMovil
     */
    public ViewTransferencia() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
    }
    
    public String getAmount() {
        return txfAmount.getText();
    }
    
    public void showBenefitName(String name){
        lblNameBenefit.setText(name);
        lblFLNB.setText(name.substring(0, 1));
    }
   
    public void showFunds(String funds){
        lblFundsCustomer.setText(funds);
    }
    
    public void showErrors(String error){
        lblErrors.setText(error);
    }
    
    public void clear(){
        lblErrors.setText("");
    }
    

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnTransfer() {
        return btnTransfer;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfAmount = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        lblErrors = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblNameBenefit = new javax.swing.JLabel();
        lblFLNB = new javax.swing.JLabel();
        lblFundsCustomer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(414, 896));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfAmount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAmount.setText("0.668");
        txfAmount.setBorder(null);
        txfAmount.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, 50));

        btnTransfer.setBackground(new java.awt.Color(10, 107, 207));
        btnTransfer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTransfer.setBorder(null);
        btnTransfer.setBorderPainted(false);
        btnTransfer.setContentAreaFilled(false);
        btnTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransfer.setFocusPainted(false);
        jPanel1.add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 350, 60));

        lblErrors.setForeground(new java.awt.Color(255, 158, 0));
        lblErrors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblErrors, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 350, 20));

        btnExit.setBackground(new java.awt.Color(10, 107, 207));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        lblNameBenefit.setText("jLabel2");
        jPanel1.add(lblNameBenefit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        lblFLNB.setText("jLabel3");
        jPanel1.add(lblFLNB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        lblFundsCustomer.setText("jLabel4");
        jPanel1.add(lblFundsCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconTransfer.png"))); // NOI18N
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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrors;
    private javax.swing.JLabel lblFLNB;
    private javax.swing.JLabel lblFundsCustomer;
    private javax.swing.JLabel lblNameBenefit;
    private javax.swing.JTextField txfAmount;
    // End of variables declaration//GEN-END:variables
}
