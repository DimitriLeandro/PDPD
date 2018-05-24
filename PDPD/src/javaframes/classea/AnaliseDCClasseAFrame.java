package javaframes.classea;

import javax.swing.JFrame;
import javaclasses.AnaliseLinearClasseA;

public final class AnaliseDCClasseAFrame extends javax.swing.JFrame {

    private float r1;
    private float r2;
    private float r3;
    private float r4;
    private float vcc;
    private float q1;
    private JFrame mainFrameClasseA;
    private float ib;

    public AnaliseDCClasseAFrame(JFrame frame, float r1, float r2, float r3, float r4, float vcc, float q1) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.setMainFrameClasseA(frame); //aqui é só pra voltar no frame anterior
        this.setR1(r1);
        this.setR2(r2);
        this.setR3(r3);
        this.setR4(r4);
        this.setVcc(vcc);
        this.setQ1(q1);

        //começando a análise
        analisarDC();
    }

    public void analisarDC() {
        AnaliseLinearClasseA objDC = new AnaliseLinearClasseA();

        //iniciando com a tensão e resistencia de thevenin
        float vth = objDC.tensaoThevenin(this.getVcc(), this.getR2(), this.getR1());
        float rth = objDC.resistenciaThevenin(this.getR1(), this.getR2());

        //a tensão de thevenin é a mesma de R2
        this.lblVR2.setText("V(R2): " + vth);

        //e a tensão de r1 é o que sobrar de vcc
        float vr1 = this.getVcc() - vth;
        this.lblVR1.setText("V(R1): " + vr1);

        //com a tensão e resistência de thevenin é possível achar a tensão de r4, 
        //lembrando que do ponto de vista da base, esse resistor é (beta + 1) x maior
        //lembrar de deixar 0,75v no diodo do transistor
        float vr4 = objDC.quedaTensao(
                (float) (vth - 0.75),
                (this.getR4() * (this.getQ1() + 1)),
                objDC.resistorSerie(rth, (this.getR4() * (this.getQ1() + 1)))
        );
        this.lblVR4.setText("V(R4): " + vr4);

        //corrente da base -> lei de ohm no resistor de thevenin
        //o método lei de ohm responde o que estiver = 0, porntanto, se eu quero a corrente, é só mandar i = 0 
        this.setIb(objDC.leiDeOhm((float) (vth - 0.75 - vr4), rth, 0));
        this.lblIb.setText("I(b): " + ib);

        //com a corrente de base, eu acho ic e ie
        float ic = ib * this.getQ1();
        float ie = this.getIb() + ic;
        this.lblIc.setText("I(c): " + ic);
        this.lblIe.setText("I(e): " + ie);

        //com a corrente ic e resistencia r3, acho a tensão em r3
        float vr3 = objDC.leiDeOhm(0, this.getR3(), ic);
        this.lblVR3.setText("V(R3): " + vr3);

        //completando a corrente nos resistores
        float ir1 = objDC.leiDeOhm(vr1, r1, 0);
        float ir2 = objDC.leiDeOhm(vth, r2, 0);
        float ir3 = objDC.leiDeOhm(vr3, r3, 0);
        float ir4 = objDC.leiDeOhm(vr4, r4, 0);
        this.lblIR1.setText("I(R1): " + ir1);
        this.lblIR2.setText("I(R2): " + ir2);
        this.lblIR3.setText("I(R3): " + ir3);
        this.lblIR4.setText("I(R4): " + ir4);

        //completando as tensões do transistor
        float vc = this.getVcc() - vr3;
        this.lblVb.setText("V(b): " + vth);
        this.lblVc.setText("V(c): " + vc);
        this.lblVe.setText("V(e): " + vr4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblVR1 = new javax.swing.JLabel();
        lblVR2 = new javax.swing.JLabel();
        lblVR3 = new javax.swing.JLabel();
        lblVR4 = new javax.swing.JLabel();
        lblIR1 = new javax.swing.JLabel();
        lblIR2 = new javax.swing.JLabel();
        lblIR3 = new javax.swing.JLabel();
        lblIR4 = new javax.swing.JLabel();
        lblVb = new javax.swing.JLabel();
        lblVc = new javax.swing.JLabel();
        lblVe = new javax.swing.JLabel();
        lblIb = new javax.swing.JLabel();
        lblIc = new javax.swing.JLabel();
        lblIe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Análise DC Classe A");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Classe_A_DC.jpg"))); // NOI18N

        lblVR1.setText("V(R1): ");

        lblVR2.setText("V(R2): ");

        lblVR3.setText("V(R3): ");

        lblVR4.setText("V(R4): ");

        lblIR1.setText("I(R1): ");

        lblIR2.setText("I(R2): ");

        lblIR3.setText("I(R3): ");

        lblIR4.setText("I(R4): ");

        lblVb.setText("V(b): ");

        lblVc.setText("V(c): ");

        lblVe.setText("V(e): ");

        lblIb.setText("I(b): ");

        lblIc.setText("I(c): ");

        lblIe.setText("I(e): ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVR1)
                    .addComponent(lblVR2)
                    .addComponent(lblVR3)
                    .addComponent(lblVR4)
                    .addComponent(lblIR1)
                    .addComponent(lblIR2)
                    .addComponent(lblIR3)
                    .addComponent(lblIR4)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVb)
                    .addComponent(lblIe)
                    .addComponent(lblIc)
                    .addComponent(lblVc)
                    .addComponent(lblVe)
                    .addComponent(lblIb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVR3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVR4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIR2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIR3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIR4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIb)
                        .addGap(12, 12, 12)
                        .addComponent(lblIc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        this.mainFrameClasseA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void setR1(float r1) {
        this.r1 = r1;
    }

    public void setR2(float r2) {
        this.r2 = r2;
    }

    public void setR3(float r3) {
        this.r3 = r3;
    }

    public void setR4(float r4) {
        this.r4 = r4;
    }

    public void setVcc(float vcc) {
        this.vcc = vcc;
    }

    public void setQ1(float q1) {
        this.q1 = q1;
    }

    public void setMainFrameClasseA(JFrame mainFrameClasseA) {
        this.mainFrameClasseA = mainFrameClasseA;
    }

    public float getR1() {
        return r1;
    }

    public float getR2() {
        return r2;
    }

    public float getR3() {
        return r3;
    }

    public float getR4() {
        return r4;
    }

    public float getVcc() {
        return vcc;
    }

    public float getQ1() {
        return q1;
    }

    public JFrame getMainFrameClasseA() {
        return mainFrameClasseA;
    }

    public float getIb() {
        return ib;
    }

    public void setIb(float ib) {
        this.ib = ib;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIR1;
    private javax.swing.JLabel lblIR2;
    private javax.swing.JLabel lblIR3;
    private javax.swing.JLabel lblIR4;
    private javax.swing.JLabel lblIb;
    private javax.swing.JLabel lblIc;
    private javax.swing.JLabel lblIe;
    private javax.swing.JLabel lblVR1;
    private javax.swing.JLabel lblVR2;
    private javax.swing.JLabel lblVR3;
    private javax.swing.JLabel lblVR4;
    private javax.swing.JLabel lblVb;
    private javax.swing.JLabel lblVc;
    private javax.swing.JLabel lblVe;
    // End of variables declaration//GEN-END:variables
}
