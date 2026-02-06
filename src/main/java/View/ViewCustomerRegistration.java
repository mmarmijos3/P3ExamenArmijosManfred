package View;

import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

//<editor-fold defaultstate="collapsed" desc="DATA FORM">
    // </editor-fold>

/**
 *
 * @author Manfred Armijos
 */
public class ViewCustomerRegistration extends javax.swing.JFrame {

    /**
     * Creates new form Plantilla
     */
    public ViewCustomerRegistration() {
        initComponents();
        setUndecorated(true);
        setLocationRelativeTo(null);
        tblCustomers.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        tblCustomers.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
        tblCustomers.getTableHeader().setBackground(Color.white);
        tblCustomers.setRowHeight(28);
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="BUTTONS">

    public JButton getBtnCleanForm() {
        return btnCleanForm;
    }

    public JButton getBtnCleanSearch() {
        return btnCleanSearch;
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public JButton getBtnDelCollection() {
        return btnDelCollection;
    }

    public JButton getBtnDelDB() {
        return btnDelDB;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }
    
    public JButton getBtnExit() {
        return btnExit;
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA FORM">
    
    //<editor-fold defaultstate="collapsed" desc="NAME">
    public String getNameForm() {
        return txfName.getText();
    }
    
    public void setNameForm(String name){
        txfName.setText(name);
    }
    
    public void cleanNameForm(){
        setNameForm("");
    }
    
    public void showlErrorName(String error) {
        lblErrorName.setText(error);
    }
    
    public void cleanlErrorName() {
        lblErrorName.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CEDULA">
    public String getCedulaForm() {
        return txfCedula.getText();
    }
    
    public void setCedulaForm(String edad){
        txfCedula.setText(edad);
    }
    
    public void cleanCedulaForm(){
        setCedulaForm("");
    }
    
    public void showlErrorCedula(String error) {
        lblErrorCedula.setText(error);
    }
    
    public void cleanlErrorCedula() {
        lblErrorCedula.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="EMAIL">
    public String getEmailForm() {
        return txfEmail.getText();
    }
    
    public void setEmailForm(String edad){
        txfEmail.setText(edad);
    }
    
    public void cleanEmailForm(){
        setEmailForm("");
    }
    
    public void showlErrorEmail(String error) {
        lblErrorEmail.setText(error);
    }
    
    public void cleanlErrorEmail() {
        lblErrorEmail.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="PHONE">
    public String getPhoneForm() {
        return txfPhone.getText();
    }
    
    public void setPhoneForm(String edad){
        txfPhone.setText(edad);
    }
    
    public void cleanPhoneForm(){
        setPhoneForm("");
    }
    
    public void showlErrorPhone(String error) {
        lblErrorPhone.setText(error);
    }
    
    public void cleanlErrorPhone() {
        lblErrorPhone.setText("");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FUNDS">
    public String getFundsForm() {
        return txfFunds.getText();
    }
    
    public void setFundsForm(String edad){
        txfFunds.setText(edad);
    }
    
    public void cleanFundsForm(){
        setFundsForm("");
    }
    
    public void showlErrorFunds(String error) {
        lblErrorFunds.setText(error);
    }
    
    public void cleanlErrorFunds() {
        lblErrorFunds.setText("");
    }
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DATA TABLE">
    public void loadDataToTable(List<Object[]> data) {
        
        DefaultTableModel tableModel = (DefaultTableModel) tblCustomers.getModel();
        
        tableModel.setRowCount(0);
        
        for(Object[] row : data) {
            tableModel.addRow(row);
        }
    }
    
    public int getSelectedPaciente(){
        return tblCustomers.getSelectedRow();
    }
    
    public void clearPacienteSelection() {
        tblCustomers.clearSelection();
    }
    
    public boolean isAnyPacienteSelected() {
        return tblCustomers.getSelectedRow() != -1;
    }
    
    public Object getInfoSelectedPaciente(int col){
        return tblCustomers.getValueAt(getSelectedPaciente(), col);
    }
    
    public Object getNameToEdit(){
        return getInfoSelectedPaciente(0);
    }
    
    public Object getCedulaToEdit(){
        return getInfoSelectedPaciente(1);
    }
    
    public Object getEmailToEdit(){
        return getInfoSelectedPaciente(2);
    }
    
    public Object getPhoneToEdit(){
        return getInfoSelectedPaciente(3);
    }
    
    public Object getFundsToEdit(){
        return getInfoSelectedPaciente(4);
    }
    
    public void enableTable(boolean state){
        tblCustomers.setEnabled(state);
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CLEAN">
    public void cleanForm(){
        cleanNameForm();
        cleanCedulaForm();
        cleanEmailForm();
        cleanPhoneForm();
        cleanFundsForm();
        cleanlErrorName();
        cleanlErrorCedula();
        cleanlErrorEmail();
        cleanlErrorPhone();
        cleanlErrorFunds();
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SEARCH">
    public String getCedulaToSearch() {
        return txfSearch.getText();
    }
    
    public void cleanCedulaToSearch() {
        txfSearch.setText("");
    }
    
    public void showErrorSearch(String error) {
        lblErrorSearch.setText(error);
    }
    
    public void cleanErrorSearch() {
        lblErrorSearch.setText("");
    }
    
    
    // </editor-fold>
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfName = new javax.swing.JTextField();
        lblErrorName = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        txfCedula = new javax.swing.JTextField();
        lblErrorCedula = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorFunds = new javax.swing.JLabel();
        btnCleanForm = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        txfSearch = new javax.swing.JTextField();
        btnCleanSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelCollection = new javax.swing.JButton();
        btnDelDB = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblErrorSearch = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txfFunds = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        txfPhone = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 20, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfName.setBorder(null);
        txfName.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 128, 390, 50));

        lblErrorName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 330, 30));

        lblErrorPhone.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 330, 30));

        txfCedula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCedula.setBorder(null);
        txfCedula.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 390, 50));

        lblErrorCedula.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorCedula.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblErrorCedula.setToolTipText("");
        jPanel1.add(lblErrorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 330, 30));

        lblErrorEmail.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 330, 30));

        lblErrorFunds.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorFunds.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorFunds.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 330, 30));

        btnCleanForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClean.png"))); // NOI18N
        btnCleanForm.setBorder(null);
        btnCleanForm.setBorderPainted(false);
        btnCleanForm.setContentAreaFilled(false);
        btnCleanForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCleanForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 100, 50));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconUpdate.png"))); // NOI18N
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 100, 50));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconSave.png"))); // NOI18N
        btnCreate.setBorder(null);
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 100, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tblCustomers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Correo", "Telefono", "Fondos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCustomers.setFocusable(false);
        tblCustomers.setOpaque(false);
        tblCustomers.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tblCustomers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCustomers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCustomers.setShowGrid(true);
        tblCustomers.getTableHeader().setResizingAllowed(false);
        tblCustomers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCustomers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 720, 330));

        txfSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSearch.setBorder(null);
        txfSearch.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel1.add(txfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 380, 50));

        btnCleanSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClean.png"))); // NOI18N
        btnCleanSearch.setBorder(null);
        btnCleanSearch.setBorderPainted(false);
        btnCleanSearch.setContentAreaFilled(false);
        btnCleanSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCleanSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, 100, 50));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconEdit.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 100, 50));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDelete.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 100, 50));

        btnDelCollection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconDeleteCollection.png"))); // NOI18N
        btnDelCollection.setBorder(null);
        btnDelCollection.setBorderPainted(false);
        btnDelCollection.setContentAreaFilled(false);
        btnDelCollection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelCollection, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, 100, 50));

        btnDelDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconDeleteDB.png"))); // NOI18N
        btnDelDB.setBorder(null);
        btnDelDB.setBorderPainted(false);
        btnDelDB.setContentAreaFilled(false);
        btnDelDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnDelDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 100, 50));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconSearch.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 100, 50));

        lblErrorSearch.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblErrorSearch.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblErrorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 410, 30));

        btnExit.setBackground(new java.awt.Color(10, 107, 207));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconClose.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setPreferredSize(new java.awt.Dimension(45, 45));
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, -1, -1));

        txfFunds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfFunds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfFunds.setBorder(null);
        txfFunds.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 536, 390, 50));

        txfEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfEmail.setBorder(null);
        txfEmail.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 390, 50));

        txfPhone.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txfPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPhone.setBorder(null);
        txfPhone.setPreferredSize(new java.awt.Dimension(500, 75));
        jPanel1.add(txfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 434, 390, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconBGCR.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
    private javax.swing.JButton btnCleanForm;
    private javax.swing.JButton btnCleanSearch;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelCollection;
    private javax.swing.JButton btnDelDB;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCedula;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFunds;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblErrorSearch;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txfCedula;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfFunds;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPhone;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
