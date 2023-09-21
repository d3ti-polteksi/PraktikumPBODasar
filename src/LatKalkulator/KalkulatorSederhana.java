/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatKalkulator;

/**
 *
 * @author lenovo
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class KalkulatorSederhana extends javax.swing.JFrame {  
    private double firstOperand;
    private double secondOperand;
    private String operator;
    private boolean isOperatorClicked;
      
    public KalkulatorSederhana() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHasil = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR SEDERHANA");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        setLocation(new java.awt.Point(500, 250));
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 250));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHasil.setEditable(false);
        txtHasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 180, 50));

        btn7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        btn8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        btn9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btn5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1.setText("1");
        btn1.setName(""); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Btn0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btnSamaDengan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSamaDengan.setText("=");
        btnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaDenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnSamaDengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, -1));

        btnKurang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 40, -1));

        btnKali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKali.setText("*");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, -1));

        btnBagi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 40, -1));

        btnBersih.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBersih.setText("C");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });
        getContentPane().add(btnBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Ketika tombol "+" diklik, tambahkan "+" ke dalam kotak teks.
    txtHasil.setText(txtHasil.getText() + "+");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // Ketika tombol "0" diklik, tambahkan "0" ke dalam kotak teks.
           txtHasil.setText(txtHasil.getText() + "0");

    }//GEN-LAST:event_Btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // Ketika tombol "1" diklik, tambahkan "1" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // Ketika tombol "2" diklik, tambahkan "2" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // Ketika tombol "3" diklik, tambahkan "3" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // Ketika tombol "4" diklik, tambahkan "4" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // Ketika tombol "5" diklik, tambahkan "5" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // Ketika tombol "6" diklik, tambahkan "6" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       // Ketika tombol "7" diklik, tambahkan "7" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       // Ketika tombol "8" diklik, tambahkan "8" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // Ketika tombol "9" diklik, tambahkan "9" ke dalam kotak teks.
        txtHasil.setText(txtHasil.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // Ketika tombol "C" diklik, hapus isi kotak teks.
        txtHasil.setText("");
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamaDenganActionPerformed
        // Dapatkan teks dari kotak teks txtHasil
    String ekspresi = txtHasil.getText();

    try {
        // Evaluasi ekspresi matematika menggunakan JavaScript engine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(ekspresi);

        // Tampilkan hasil perhitungan di kotak teks
        txtHasil.setText(result.toString());
    } catch (Exception e) {
        // Tangani jika terjadi kesalahan dalam ekspresi matematika
        txtHasil.setText("Error");
    }
    }//GEN-LAST:event_btnSamaDenganActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // Ketika tombol "-" diklik, tambahkan "-" ke dalam kotak teks.
    txtHasil.setText(txtHasil.getText() + "-");
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        // Ketika tombol "*" diklik, tambahkan "*" ke dalam kotak teks.
    txtHasil.setText(txtHasil.getText() + "*");
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // Ketika tombol "/" diklik, tambahkan "/" ke dalam kotak teks.
    txtHasil.setText(txtHasil.getText() + "/");
    }//GEN-LAST:event_btnBagiActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField txtHasil;
    // End of variables declaration//GEN-END:variables
}
