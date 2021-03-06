/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySchool;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SANTOSH
 */
public class PaymentDetail extends javax.swing.JFrame {
    PreparedStatement tab1_pstmt,tab2_pstmt;
    ResultSet tab1_rs,tab2_rs;
    String session="",s_class="";
 

    /**
     * Creates new form PaymentDetail
     */
    public PaymentDetail() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        refreshLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        feeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        classComboBox = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        sessionTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        session1TextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        amtTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        paynowButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        payTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        dateTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FEE DETAIL");

        backLabel.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setText("<< BACK");
        backLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Log Out");
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        refreshLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refreshLabel.setForeground(new java.awt.Color(255, 255, 255));
        refreshLabel.setText("Refresh");
        refreshLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274)
                .addComponent(logoutLabel)
                .addGap(46, 46, 46)
                .addComponent(refreshLabel)
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logoutLabel)
                        .addComponent(refreshLabel)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        feeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Father's Name", "Class", "Paid"
            }
        ));
        jScrollPane3.setViewportView(feeTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Session :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("CLASS :");

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Play Group", "KG-1", "KG-2", "Nursery", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fee Detail");
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sessionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(okButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton)
                    .addComponent(sessionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Id :");

        idTextField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        idTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("Name :");

        nameTextField.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Father's Name :");

        fnameTextField.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Session :");

        session1TextField.setEditable(false);
        session1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Class :");

        classLabel.setBackground(new java.awt.Color(255, 255, 255));
        classLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLabel.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Amount :");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Payment Detail");
        jLabel11.setOpaque(true);

        amtTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Date :");

        DateChooser.setDateFormatString("d MMM, yyyy");

        paynowButton.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        paynowButton.setText("PAY NOW");
        paynowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paynowButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(127, 127, 127))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(amtTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(session1TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel10))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 280, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paynowButton)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(session1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(amtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(paynowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        payTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1 st", "2 nd", "3 rd", "4 th", "5 th", "6 th", "7 th", "8 th", "9 th", "10 th", "11 th", "12 th"
            }
        ));
        jScrollPane6.setViewportView(payTable);

        dateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1 st", "2 nd", "3 rd", "4 th", "5 th", "6 th", "7 th", "8 th", "9 th", "10 th", "11 th", "12 th"
            }
        ));
        jScrollPane7.setViewportView(dateTable);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel18.setText("Corresponding Dates :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel19.setText("Paid fee :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String sid="";
        int paid=0;
        session=sessionTextField.getText().trim();
        s_class=(String)classComboBox.getSelectedItem();
        try{                        
            tab2_pstmt=MyLogin.con.prepareStatement("select * from FEE_DETAIL where SESSION = ? and S_CLASS = ? order by S_ID");
            tab2_pstmt.setString(1, session);
            tab2_pstmt.setString(2, s_class);

            tab2_rs=tab2_pstmt.executeQuery();
            tab2_pstmt.clearParameters();

            DefaultTableModel tm=(DefaultTableModel)feeTable.getModel();
            while(true){
                int c=tm.getRowCount();
                if(c==0)
                    break;
                else
                    tm.removeRow(0);
            }            
            if(tab2_rs.next()){
                sid=tab2_rs.getString("S_ID");
                tab1_pstmt=MyLogin.con.prepareStatement("select SNAME,FNAME from STUDENT where S_ID = ?");
                tab1_pstmt.setString(1, sid);
                tab1_rs=tab1_pstmt.executeQuery();
                tab1_pstmt.clearParameters();
                
                if(tab1_rs.next()){                                  
                    paid+=tab2_rs.getInt("PAY1");
                    paid+=tab2_rs.getInt("PAY2");
                    paid+=tab2_rs.getInt("PAY3");
                    paid+=tab2_rs.getInt("PAY4");
                    paid+=tab2_rs.getInt("PAY5");
                    paid+=tab2_rs.getInt("PAY6");
                    paid+=tab2_rs.getInt("PAY7");
                    paid+=tab2_rs.getInt("PAY8");
                    paid+=tab2_rs.getInt("PAY9");
                    paid+=tab2_rs.getInt("PAY10");
                    paid+=tab2_rs.getInt("PAY11");
                    paid+=tab2_rs.getInt("PAY12");
                    Object kk[]={sid,tab1_rs.getString("SNAME"),tab1_rs.getString("FNAME"),tab2_rs.getString("S_CLASS"),paid};
                    tm.addRow(kk);
                }
            }
        }catch(Exception e){
            System.out.println("Error in ok button "+e);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void idTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyReleased
        // TODO add your handling code here:
        String sid="";        
        DefaultTableModel paytabmod=(DefaultTableModel)payTable.getModel();
        DefaultTableModel dttabmod=(DefaultTableModel)dateTable.getModel();
        while(paytabmod.getRowCount()>0){
            paytabmod.removeRow(0);
        }
        while(dttabmod.getRowCount()>0){
            dttabmod.removeRow(0);
        }
        try{          
            sid=idTextField.getText().trim();                       
           tab1_pstmt=MyLogin.con.prepareStatement("select SNAME,FNAME from STUDENT where S_ID = ? ");
           tab1_pstmt.setString(1, sid);
           tab1_rs=tab1_pstmt.executeQuery();
           if(tab1_rs.next()){
               System.out.println("sid matched in table1");
               tab2_pstmt=MyLogin.con.prepareStatement("select * from FEE_DETAIL where S_ID = ? and SESSION = ? and S_CLASS = ?");
               tab2_pstmt.setString(1, sid);
               tab2_pstmt.setString(2, session);
               tab2_pstmt.setString(3, s_class);
               tab2_rs=tab2_pstmt.executeQuery();
               if(tab2_rs.next()){
                   System.out.println("sid matched in table2");
                   Object pay[]={tab2_rs.getString("PAY1"),tab2_rs.getString("PAY2"),tab2_rs.getString("PAY3"),tab2_rs.getString("PAY4"),tab2_rs.getString("PAY5"),tab2_rs.getString("PAY6"),tab2_rs.getString("PAY7"),tab2_rs.getString("PAY8"),tab2_rs.getString("PAY9"),tab2_rs.getString("PAY10"),tab2_rs.getString("PAY11"),tab2_rs.getString("PAY12")};
                   Object dt[]={tab2_rs.getString("DATE1"),tab2_rs.getString("DATE2"),tab2_rs.getString("DATE3"),tab2_rs.getString("DATE4"),tab2_rs.getString("DATE5"),tab2_rs.getString("DATE6"),tab2_rs.getString("DATE7"),tab2_rs.getString("DATE8"),tab2_rs.getString("DATE9"),tab2_rs.getString("DATE10"),tab2_rs.getString("DATE11"),tab2_rs.getString("DATE12")};
                   paytabmod.addRow(pay);
                   dttabmod.addRow(dt);
                   nameTextField.setText(tab1_rs.getString("SNAME"));
                fnameTextField.setText(tab1_rs.getString("FNAME"));
                session1TextField.setText(session);
                classLabel.setText(s_class);
               }else{System.out.println("data cannot be read from table2");}
               
         /*      nameTextField.setText(tab1_rs.getString("SNAME"));
               fnameTextField.setText(tab1_rs.getString("FNAME"));
               session1TextField.setText(session);
               classLabel.setText(s_class); */
           }else{
               nameTextField.setText("");
               fnameTextField.setText("");
               session1TextField.setText("");
               classLabel.setText("");
           }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid ID", "PAYMENT", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error "+e);
        }
        
    }//GEN-LAST:event_idTextFieldKeyReleased

    private void paynowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paynowButtonMouseClicked
        // TODO add your handling code here:
        String name="";
        int amt=0,checkamt=0;
        String pay="",date="",dt="";
        name=nameTextField.getText().trim();
        if(!(name.equalsIgnoreCase(""))){
            try{
                amt=Integer.parseInt(amtTextField.getText().trim());          
                int i=1;
                do{
                    pay="PAY"+i;
                    date="DATE"+i;
                    checkamt=tab2_rs.getInt(pay);
                    System.out.println(pay+" amount = "+checkamt);
                    i++;
                }while(i<=10&&checkamt!=0);
                System.out.println("after loop pay = "+pay+" and checkamt = "+checkamt);
                if(i<11){
                    DateFormat df;
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
	//	System.out.println("Uk date format Date : " + df.format(date));
                
        dt=df.format(DateChooser.getDate());
                    tab2_pstmt=MyLogin.con.prepareStatement("update FEE_DETAIL set "+pay+" = ?,"+date+" = ? where S_ID = ? and SESSION = ? and S_CLASS = ?");
                    tab2_pstmt.setInt(1, amt);
                    tab2_pstmt.setString(2, dt);
                    tab2_pstmt.setString(3, idTextField.getText().trim());
                    tab2_pstmt.setString(4, session1TextField.getText());
                    tab2_pstmt.setString(5, classLabel.getText());
                    int j=tab2_pstmt.executeUpdate();
                    if(j>0){                                               
                        JOptionPane.showMessageDialog(null, "Payment Completed", "PAYMENT", JOptionPane.INFORMATION_MESSAGE);                        
                        System.out.println("fee updated successfully "+checkamt+" to "+amt);
                        idTextFieldKeyReleased(null);
                        okButtonActionPerformed(null);                        
                    }
                }                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Fill all details carefully", "PAYMENT", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error "+e);
            }            
        }else{JOptionPane.showMessageDialog(null, "Invalid Info", "PAYMENT", JOptionPane.ERROR_MESSAGE);}        
    }//GEN-LAST:event_paynowButtonMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        MainPage ob = new MainPage();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backLabelMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // TODO add your handling code here:
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        try{
            MyLogin.con.close();
        }catch(Exception e){ }

        MyLogin ob=new MyLogin();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        // TODO add your handling code here:
        refreshLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        PaymentDetail ob = new PaymentDetail();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_refreshLabelMouseClicked

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
            java.util.logging.Logger.getLogger(PaymentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField amtTextField;
    private javax.swing.JLabel backLabel;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTable dateTable;
    private javax.swing.JTable feeTable;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JTable payTable;
    private javax.swing.JButton paynowButton;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JTextField session1TextField;
    private javax.swing.JTextField sessionTextField;
    // End of variables declaration//GEN-END:variables
}
