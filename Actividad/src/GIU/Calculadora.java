/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GIU;

/**
 *
 * @author Lenovo
 */
public class Calculadora extends javax.swing.JFrame {

    
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setBackground(new java.awt.Color(55, 62, 55));
        txtResultado.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 51));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setBackground(new java.awt.Color(55, 62, 55));
        btnIgual.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 55, 55));

        btn7.setBackground(new java.awt.Color(55, 62, 55));
        btn7.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 55, 55));

        jButton7.setBackground(new java.awt.Color(55, 62, 55));
        jButton7.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        jButton7.setText("ce");
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 55, 55));

        btnModulo.setBackground(new java.awt.Color(55, 62, 55));
        btnModulo.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnModulo.setText("%");
        btnModulo.setFocusPainted(false);
        btnModulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModulo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnModulo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });
        jPanel2.add(btnModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 55, 55));

        btnDiv.setBackground(new java.awt.Color(55, 62, 55));
        btnDiv.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setFocusPainted(false);
        btnDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnDiv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel2.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 55, 55));

        btnMult.setBackground(new java.awt.Color(55, 62, 55));
        btnMult.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnMult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnMult.setText("×");
        btnMult.setFocusPainted(false);
        btnMult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnMult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        jPanel2.add(btnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 55, 55));

        btnRest.setBackground(new java.awt.Color(55, 62, 55));
        btnRest.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnRest.setText("-");
        btnRest.setFocusPainted(false);
        btnRest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnRest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });
        jPanel2.add(btnRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 55, 55));

        btnSum.setBackground(new java.awt.Color(55, 62, 55));
        btnSum.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnSum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnSum.setText("+");
        btnSum.setFocusPainted(false);
        btnSum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnSum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });
        jPanel2.add(btnSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 55, 55));

        btnC.setBackground(new java.awt.Color(55, 62, 55));
        btnC.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnC.setText("C");
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 55, 55));

        btn9.setBackground(new java.awt.Color(55, 62, 55));
        btn9.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 55, 55));

        btn8.setBackground(new java.awt.Color(55, 62, 55));
        btn8.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 55, 55));

        btn4.setBackground(new java.awt.Color(55, 62, 55));
        btn4.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 55, 55));

        btn5.setBackground(new java.awt.Color(55, 62, 55));
        btn5.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 55, 55));

        btn6.setBackground(new java.awt.Color(55, 62, 55));
        btn6.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 55, 55));

        btn1.setBackground(new java.awt.Color(55, 62, 55));
        btn1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 55, 55));

        btn2.setBackground(new java.awt.Color(55, 62, 55));
        btn2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 55, 55));

        btn3.setBackground(new java.awt.Color(55, 62, 55));
        btn3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 55, 55));

        btn0.setBackground(new java.awt.Color(55, 62, 55));
        btn0.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 55, 55));

        btnPunto.setBackground(new java.awt.Color(55, 62, 55));
        btnPunto.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/normal.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proyecto nuevo.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas oscuro.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 55, 55));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        if(!txtResultado.getText().equals("")){
            num1 = txtResultado.getText();
            operador= "*";
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnMultActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        agregarNumero("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        agregarNumero("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtResultado.setText("");
        num1="0";
        num2="0";
        operador="";
    }//GEN-LAST:event_btnCActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        if(!txtResultado.getText().equals("")){
            num1 = txtResultado.getText();
            operador= "-";
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnRestActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String numero= txtResultado.getText();
        if (numero.length()<=0){
            txtResultado.setText(txtResultado.getText()+"0.");
        }else{
            if (!Operaciones.verificarPunto(txtResultado.getText())){
                txtResultado.setText(txtResultado.getText()+".");
            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        agregarNumero("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        agregarNumero("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        agregarNumero("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        agregarNumero("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        agregarNumero("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        agregarNumero("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        agregarNumero("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        agregarNumero("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String cadena = txtResultado.getText();
        if (cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            txtResultado.setText(cadena);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        if(!txtResultado.getText().equals("")){
            num1 = txtResultado.getText();
            operador= "%";
            txtResultado.setText("");
        }
        
    }//GEN-LAST:event_btnModuloActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        if(!txtResultado.getText().equals("")){
            num1 = txtResultado.getText();
            operador= "/";
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        if(!txtResultado.getText().equals("")){
            num1 = txtResultado.getText();
            operador= "+";
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String resultado;
        num2=txtResultado.getText();
        
        if (num2.equals("0") && operador.equals("/") ){
            txtResultado.setText("Error");
        }else{
            if (num2.equals("")){
               txtResultado.setText(num1);
               }else{
                   resultado = Operaciones.calcular(num1, num2, operador);
                   txtResultado.setText(resultado);
                  }
          }
        
        
        
        
    }//GEN-LAST:event_btnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    String num1;
    String num2;
    String operador;
    
    public void  agregarNumero(String  num){
        if (txtResultado.getText().equals("Error") || txtResultado.getText().equals("0.0")){
            txtResultado.setText("");
            txtResultado.setText(txtResultado.getText()+num);
        }else{
            txtResultado.setText(txtResultado.getText()+num);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnModulo;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSum;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
