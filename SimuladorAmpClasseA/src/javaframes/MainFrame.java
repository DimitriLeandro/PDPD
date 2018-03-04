package javaframes;

import classes.AnaliseVetorial;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    private float ib;

    public MainFrame() {
        initComponents();
        this.getContentPane().setBackground(new Color(240, 240, 240));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnAnaliseDC = new javax.swing.JButton();
        btnRespostaFrequencia = new javax.swing.JButton();
        txtVcc = new javax.swing.JTextField();
        txtVin = new javax.swing.JTextField();
        txtR1 = new javax.swing.JTextField();
        txtR2 = new javax.swing.JTextField();
        txtR3 = new javax.swing.JTextField();
        txtR4 = new javax.swing.JTextField();
        txtRin = new javax.swing.JTextField();
        txtRl = new javax.swing.JTextField();
        txtC1 = new javax.swing.JTextField();
        txtC2 = new javax.swing.JTextField();
        txtC3 = new javax.swing.JTextField();
        txtQ1 = new javax.swing.JTextField();
        btnAnaliseAC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amplificador Classe A");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(150, 100, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/Classe A.jpg"))); // NOI18N

        jLabel6.setText("Vcc(V):");

        jLabel7.setText("Vin(V):");

        jLabel8.setText("R1(r):");

        jLabel9.setText("R2(r):");

        jLabel10.setText("R3(r):");

        jLabel11.setText("R4(r):");

        jLabel12.setText("Rin(r):");

        jLabel13.setText("RL(r):");

        jLabel14.setText("C1(c):");

        jLabel15.setText("C2(c):");

        jLabel16.setText("C3(c):");

        jLabel17.setText("Q1(ganho):");

        btnAnaliseDC.setText("Análise DC");
        btnAnaliseDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseDCActionPerformed(evt);
            }
        });

        btnRespostaFrequencia.setText("Resposta em Frequência");
        btnRespostaFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespostaFrequenciaActionPerformed(evt);
            }
        });

        txtVcc.setText("12");

        txtVin.setText("0.01");
        txtVin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVinActionPerformed(evt);
            }
        });

        txtR1.setText("12000");
        txtR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtR1ActionPerformed(evt);
            }
        });

        txtR2.setText("2200");

        txtR3.setText("4700");

        txtR4.setText("1200");

        txtRin.setText("50");

        txtRl.setText("12000");
        txtRl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRlActionPerformed(evt);
            }
        });

        txtC1.setText("0.000001");

        txtC2.setText("0.000047");

        txtC3.setText("0.000001");

        txtQ1.setText("100");
        txtQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ1ActionPerformed(evt);
            }
        });

        btnAnaliseAC.setText("Análise AC");
        btnAnaliseAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnaliseDC, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnaliseAC, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRespostaFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtR3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtR4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVcc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnaliseDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btnAnaliseAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRespostaFrequencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtRin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtRl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnaliseDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseDCActionPerformed
        //A análise DC retorna o valor Ie para que seja possível fazer a análise AC.
        AnaliseDCFrame objAnaliseDCFrame = new AnaliseDCFrame(
                this,
                Float.parseFloat(this.txtR1.getText()),
                Float.parseFloat(this.txtR2.getText()),
                Float.parseFloat(this.txtR3.getText()),
                Float.parseFloat(this.txtR4.getText()),
                Float.parseFloat(this.txtVcc.getText()),
                Float.parseFloat(this.txtQ1.getText())
        );

        this.setIb(objAnaliseDCFrame.getIb());

        objAnaliseDCFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnaliseDCActionPerformed

    private void txtRlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRlActionPerformed

    private void txtR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtR1ActionPerformed

    private void txtQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ1ActionPerformed

    private void txtVinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVinActionPerformed

    private void btnAnaliseACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseACActionPerformed
        //System.out.println(""+this.getIe()+"\n"+this.getIc());
        if (this.getIb() == 0.0) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a análise DC primeiro");
        } else {
            AnaliseACFrame objAC = new AnaliseACFrame(
                    this,
                    Float.parseFloat(this.txtVin.getText()),
                    Float.parseFloat(this.txtRin.getText()),
                    Float.parseFloat(this.txtR1.getText()),
                    Float.parseFloat(this.txtR2.getText()),
                    this.getIb(),
                    Float.parseFloat(this.txtR3.getText()),
                    Float.parseFloat(this.txtRl.getText()),
                    Float.parseFloat(this.txtQ1.getText())
            );

            this.setVisible(false);
            objAC.setVisible(true);
        }
    }//GEN-LAST:event_btnAnaliseACActionPerformed

    private void btnRespostaFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespostaFrequenciaActionPerformed
        if (this.getIb() == 0.0) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a análise DC primeiro");
        } else {
            RespostaFrequenciaFrame objRF = new RespostaFrequenciaFrame(
                    this,
                    Float.parseFloat(this.txtVin.getText()),
                    Float.parseFloat(this.txtRin.getText()),
                    Float.parseFloat(this.txtR1.getText()),
                    Float.parseFloat(this.txtR2.getText()),
                    Float.parseFloat(this.txtR3.getText()),
                    Float.parseFloat(this.txtR4.getText()),
                    Float.parseFloat(this.txtRl.getText()),
                    Float.parseFloat(this.txtQ1.getText()),
                    Float.parseFloat(this.txtC1.getText()),
                    Float.parseFloat(this.txtC2.getText()),
                    Float.parseFloat(this.txtC3.getText()),
                    this.getIb()
            );

            this.setVisible(false);
            objRF.setVisible(true);
        }

        //AnaliseVetorial objAV = new AnaliseVetorial();
        /*float xc1[] = objAV.reatanciaCapacitiva(Float.parseFloat(this.txtC1.getText()), 1000);
        float xc2[] = objAV.reatanciaCapacitiva(Float.parseFloat(this.txtC2.getText()), 1000);
        float zeq[] = objAV.impedanciaSerie(xc1, xc2);
        System.out.println("Xc1: " + xc1[0] + "\nXc2: " + xc2[0] + "\nZeq: " + zeq[0] + " " + zeq[1]);

        /*
        float r1[] = {1000, 0};
        float r2[] = {1000, 0};
        float req[] = objAV.impedanciaParalelo(r1, r2);
        System.out.println("Mag: " + req[0] + "\nAng: " + req[1]);
         */

    }//GEN-LAST:event_btnRespostaFrequenciaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public float getIb() {
        return ib;
    }

    public void setIb(float ib) {
        this.ib = ib;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnaliseAC;
    private javax.swing.JButton btnAnaliseDC;
    private javax.swing.JButton btnRespostaFrequencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    private javax.swing.JTextField txtR4;
    private javax.swing.JTextField txtRin;
    private javax.swing.JTextField txtRl;
    private javax.swing.JTextField txtVcc;
    private javax.swing.JTextField txtVin;
    // End of variables declaration//GEN-END:variables
}