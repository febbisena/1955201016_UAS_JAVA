/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_1955201016_MULTICAL;

import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class MultiCal_3x3MatrixCalculator extends javax.swing.JFrame {

    /**
     * Creates new form MultiCal_3x3MatrixCalculator
     */
    public MultiCal_3x3MatrixCalculator() {
        initComponents();
        this.setTitle("MultiCal - 3x3 Matrix Calculator");
        this.setLocationRelativeTo(this);
        ImageIcon icon = new ImageIcon("src/UAS_1955201016_MULTICAL/calculator logo.png");
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bG_matrix3x3 = new javax.swing.ButtonGroup();
        singleres = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C21 = new javax.swing.JLabel();
        C22 = new javax.swing.JLabel();
        C23 = new javax.swing.JLabel();
        C31 = new javax.swing.JLabel();
        C32 = new javax.swing.JLabel();
        C33 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        kurung = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        B11 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B31 = new javax.swing.JTextField();
        B32 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        B13 = new javax.swing.JTextField();
        B23 = new javax.swing.JTextField();
        B33 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        A13 = new javax.swing.JTextField();
        A23 = new javax.swing.JTextField();
        A33 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        A32 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A11 = new javax.swing.JTextField();
        A31 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        transpose = new javax.swing.JRadioButton();
        jB_clear = new javax.swing.JButton();
        sum = new javax.swing.JRadioButton();
        subtract = new javax.swing.JRadioButton();
        determinan = new javax.swing.JRadioButton();
        multiply = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jB_calculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jB_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singleres.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        singleres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(singleres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 140, 110));

        C12.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 40, 30));

        C13.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 40, 30));

        C21.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 40, 30));

        C22.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 40, 30));

        C23.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 40, 30));

        C31.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 40, 30));

        C32.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 40, 30));

        C33.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 40, 30));

        C11.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        C11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 30));

        kurung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/kurung siku 2.png"))); // NOI18N
        getContentPane().add(kurung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("RESULT");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 70, 20));

        B11.setBackground(new java.awt.Color(153, 204, 255));
        B11.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 40, 30));

        B21.setBackground(new java.awt.Color(153, 204, 255));
        B21.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 40, 30));

        B31.setBackground(new java.awt.Color(153, 204, 255));
        B31.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 40, 30));

        B32.setBackground(new java.awt.Color(153, 204, 255));
        B32.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 40, 30));

        B22.setBackground(new java.awt.Color(153, 204, 255));
        B22.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 40, 30));

        B12.setBackground(new java.awt.Color(153, 204, 255));
        B12.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 30));

        B13.setBackground(new java.awt.Color(153, 204, 255));
        B13.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 40, 30));

        B23.setBackground(new java.awt.Color(153, 204, 255));
        B23.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 40, 30));

        B33.setBackground(new java.awt.Color(153, 204, 255));
        B33.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        B33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(B33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/kurung siku 2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 220, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("MATRIX B");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 90, 20));

        A13.setBackground(new java.awt.Color(153, 204, 255));
        A13.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 40, 30));

        A23.setBackground(new java.awt.Color(153, 204, 255));
        A23.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, 30));

        A33.setBackground(new java.awt.Color(153, 204, 255));
        A33.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 40, 30));

        A12.setBackground(new java.awt.Color(153, 204, 255));
        A12.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 40, 30));

        A22.setBackground(new java.awt.Color(153, 204, 255));
        A22.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 40, 30));

        A32.setBackground(new java.awt.Color(153, 204, 255));
        A32.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 40, 30));

        A21.setBackground(new java.awt.Color(153, 204, 255));
        A21.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 30));

        A11.setBackground(new java.awt.Color(153, 204, 255));
        A11.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 40, 30));

        A31.setBackground(new java.awt.Color(153, 204, 255));
        A31.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        A31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(A31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 40, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/kurung siku 2.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, -1));

        bG_matrix3x3.add(transpose);
        transpose.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        transpose.setText("TRANSPOSE");
        transpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transposeActionPerformed(evt);
            }
        });
        getContentPane().add(transpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, -1));

        jB_clear.setBackground(new java.awt.Color(101, 134, 177));
        jB_clear.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jB_clear.setText("CLEAR");
        jB_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearActionPerformed(evt);
            }
        });
        getContentPane().add(jB_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 80, 40));

        bG_matrix3x3.add(sum);
        sum.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        sum.setText("SUM");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        getContentPane().add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 60, 23));

        bG_matrix3x3.add(subtract);
        subtract.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        subtract.setText("SUBTRACT");
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });
        getContentPane().add(subtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 90, 23));

        bG_matrix3x3.add(determinan);
        determinan.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        determinan.setText("DETERMINAN");
        determinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                determinanActionPerformed(evt);
            }
        });
        getContentPane().add(determinan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 110, -1));

        bG_matrix3x3.add(multiply);
        multiply.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        multiply.setText("MULTIPLY");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        getContentPane().add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 90, 23));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Which One?");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 150, 40));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("MATRIX A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, 20));

        jB_calculate.setBackground(new java.awt.Color(101, 134, 177));
        jB_calculate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jB_calculate.setText("CALCULATE");
        jB_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_calculateActionPerformed(evt);
            }
        });
        getContentPane().add(jB_calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MULTICAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 26));

        jB_back.setBackground(new java.awt.Color(53, 80, 177));
        jB_back.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jB_back.setText("BACK");
        jB_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_backActionPerformed(evt);
            }
        });
        getContentPane().add(jB_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, 31));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("3x3 MATRIX CALCULATOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 340, 26));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/calculator logo.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("By FEBBI SENA LESTARI / 1955201016 - ILKOM 2A");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/bg_darkblue.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/6815250_preview.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 470));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_1955201016_MULTICAL/bg_darkblue.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 520, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_backActionPerformed
        new MultiCal_Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jB_backActionPerformed

    private void jB_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_calculateActionPerformed
        int matrixA[][] = new int[3][3];
        matrixA[0][0] = Integer.parseInt(A11.getText());
        matrixA[0][1] = Integer.parseInt(A12.getText());
        matrixA[0][2] = Integer.parseInt(A13.getText());
        matrixA[1][0] = Integer.parseInt(A21.getText());
        matrixA[1][1] = Integer.parseInt(A22.getText());
        matrixA[1][2] = Integer.parseInt(A23.getText());
        matrixA[2][0] = Integer.parseInt(A31.getText());
        matrixA[2][1] = Integer.parseInt(A32.getText());
        matrixA[2][2] = Integer.parseInt(A33.getText());

        int matrixB[][] = new int[3][3];
        matrixB[0][0] = Integer.parseInt(B11.getText());
        matrixB[0][1] = Integer.parseInt(B12.getText());
        matrixB[0][2] = Integer.parseInt(B13.getText());
        matrixB[1][0] = Integer.parseInt(B21.getText());
        matrixB[1][1] = Integer.parseInt(B22.getText());
        matrixB[1][2] = Integer.parseInt(B23.getText());
        matrixB[2][0] = Integer.parseInt(B31.getText());
        matrixB[2][1] = Integer.parseInt(B32.getText());
        matrixB[2][2] = Integer.parseInt(B33.getText());

        int matrixC[][] = new int[3][3];

        if (sum.isSelected()) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else if (subtract.isSelected()) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
        } else if (multiply.isSelected()) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA.length; j++) {
                    matrixC[i][j] = 0;
                    for (int k = 0; k < matrixA.length; k++) {
                        matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        } else if (determinan.isSelected()) {
            float det;
            det = (matrixA[0][0] * matrixA[1][1] * matrixA[2][2]) + (matrixA[0][1] * matrixA[1][2] * matrixA[2][0])
                    + (matrixA[0][2] * matrixA[1][0] * matrixA[2][1]) - (matrixA[2][0] * matrixA[1][1] * matrixA[0][2])
                    - (matrixA[2][1] * matrixA[1][2] * matrixA[0][0]) - (matrixA[2][2] * matrixA[1][0] * matrixA[0][1]);
            singleres.setText(String.valueOf(det));
        } else if (transpose.isSelected()) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[j][i] = matrixA[i][j];
                }
            }
        }
        C11.setText(String.valueOf(matrixC[0][0]));
        C12.setText(String.valueOf(matrixC[0][1]));
        C13.setText(String.valueOf(matrixC[0][2]));
        C21.setText(String.valueOf(matrixC[1][0]));
        C22.setText(String.valueOf(matrixC[1][1]));
        C23.setText(String.valueOf(matrixC[1][2]));
        C31.setText(String.valueOf(matrixC[2][0]));
        C32.setText(String.valueOf(matrixC[2][1]));
        C33.setText(String.valueOf(matrixC[2][2]));
    }//GEN-LAST:event_jB_calculateActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        B11.setEnabled(true);
        B12.setEnabled(true);
        B13.setEnabled(true);
        B21.setEnabled(true);
        B22.setEnabled(true);
        B23.setEnabled(true);
        B31.setEnabled(true);
        B32.setEnabled(true);
        B33.setEnabled(true);

        kurung.setVisible(true);
        C11.setVisible(true);
        C12.setVisible(true);
        C13.setVisible(true);
        C21.setVisible(true);
        C22.setVisible(true);
        C23.setVisible(true);
        C31.setVisible(true);
        C32.setVisible(true);
        C33.setVisible(true);
        singleres.setVisible(false);
    }//GEN-LAST:event_sumActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        B11.setEnabled(true);
        B12.setEnabled(true);
        B13.setEnabled(true);
        B21.setEnabled(true);
        B22.setEnabled(true);
        B23.setEnabled(true);
        B31.setEnabled(true);
        B32.setEnabled(true);
        B33.setEnabled(true);

        kurung.setVisible(true);
        C11.setVisible(true);
        C12.setVisible(true);
        C13.setVisible(true);
        C21.setVisible(true);
        C22.setVisible(true);
        C23.setVisible(true);
        C31.setVisible(true);
        C32.setVisible(true);
        C33.setVisible(true);
        singleres.setVisible(false);
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        B11.setEnabled(true);
        B12.setEnabled(true);
        B13.setEnabled(true);
        B21.setEnabled(true);
        B22.setEnabled(true);
        B23.setEnabled(true);
        B31.setEnabled(true);
        B32.setEnabled(true);
        B33.setEnabled(true);

        kurung.setVisible(true);
        C11.setVisible(true);
        C12.setVisible(true);
        C13.setVisible(true);
        C21.setVisible(true);
        C22.setVisible(true);
        C23.setVisible(true);
        C31.setVisible(true);
        C32.setVisible(true);
        C33.setVisible(true);
        singleres.setVisible(false);
    }//GEN-LAST:event_multiplyActionPerformed

    private void determinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_determinanActionPerformed
        B11.setEnabled(false);
        B12.setEnabled(false);
        B13.setEnabled(false);
        B21.setEnabled(false);
        B22.setEnabled(false);
        B23.setEnabled(false);
        B31.setEnabled(false);
        B32.setEnabled(false);
        B33.setEnabled(false);

        kurung.setVisible(false);
        C11.setVisible(false);
        C12.setVisible(false);
        C13.setVisible(false);
        C21.setVisible(false);
        C22.setVisible(false);
        C23.setVisible(false);
        C31.setVisible(false);
        C32.setVisible(false);
        C33.setVisible(false);
        singleres.setVisible(true);
        singleres.setText("");
    }//GEN-LAST:event_determinanActionPerformed

    private void transposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transposeActionPerformed
        B11.setEnabled(false);
        B12.setEnabled(false);
        B13.setEnabled(false);
        B21.setEnabled(false);
        B22.setEnabled(false);
        B23.setEnabled(false);
        B31.setEnabled(false);
        B32.setEnabled(false);
        B33.setEnabled(false);

        kurung.setVisible(true);
        C11.setVisible(true);
        C12.setVisible(true);
        C13.setVisible(true);
        C21.setVisible(true);
        C22.setVisible(true);
        C23.setVisible(true);
        C31.setVisible(true);
        C32.setVisible(true);
        C33.setVisible(true);
        singleres.setVisible(false);
    }//GEN-LAST:event_transposeActionPerformed

    private void jB_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearActionPerformed
        A11.setText("");
        A12.setText("");
        A13.setText("");
        A21.setText("");
        A22.setText("");
        A23.setText("");
        A31.setText("");
        A32.setText("");
        A33.setText("");
        B11.setText("");
        B12.setText("");
        B13.setText("");
        B21.setText("");
        B22.setText("");
        B23.setText("");
        B31.setText("");
        B32.setText("");
        B33.setText("");
        C11.setText("");
        C12.setText("");
        C13.setText("");
        C21.setText("");
        C22.setText("");
        C23.setText("");
        C31.setText("");
        C32.setText("");
        C33.setText("");
        singleres.setText("");
    }//GEN-LAST:event_jB_clearActionPerformed

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
            java.util.logging.Logger.getLogger(MultiCal_3x3MatrixCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiCal_3x3MatrixCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiCal_3x3MatrixCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiCal_3x3MatrixCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiCal_3x3MatrixCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A13;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField A23;
    private javax.swing.JTextField A31;
    private javax.swing.JTextField A32;
    private javax.swing.JTextField A33;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B13;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField B23;
    private javax.swing.JTextField B31;
    private javax.swing.JTextField B32;
    private javax.swing.JTextField B33;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C13;
    private javax.swing.JLabel C21;
    private javax.swing.JLabel C22;
    private javax.swing.JLabel C23;
    private javax.swing.JLabel C31;
    private javax.swing.JLabel C32;
    private javax.swing.JLabel C33;
    private javax.swing.ButtonGroup bG_matrix3x3;
    private javax.swing.JRadioButton determinan;
    private javax.swing.JButton jB_back;
    private javax.swing.JButton jB_calculate;
    private javax.swing.JButton jB_clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel kurung;
    private javax.swing.JRadioButton multiply;
    private javax.swing.JLabel singleres;
    private javax.swing.JRadioButton subtract;
    private javax.swing.JRadioButton sum;
    private javax.swing.JRadioButton transpose;
    // End of variables declaration//GEN-END:variables
}
