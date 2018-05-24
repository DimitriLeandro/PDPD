package javaframes.classea;

import javax.swing.JFrame;
import javaclasses.AnaliseLinearClasseA;

/**
 *
 * @author dimitri
 */
public final class AnaliseACClasseAFrame extends javax.swing.JFrame {

    private JFrame frame;
    private float vin;
    private float rin;
    private float r1;
    private float r2;
    private float ib;
    private float r3;
    private float rl;
    private float q1;

    public AnaliseACClasseAFrame(JFrame frame, float vin, float rin, float r1, float r2, float ib, float r3, float rl, float q1) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.setFrame(frame);
        this.setVin(vin);
        this.setRin(rin);
        this.setR1(r1);
        this.setR2(r2);
        this.setIb(ib);
        this.setR3(r3);
        this.setRl(rl);
        this.setQ1(q1);

        analisarAC();
    }

    public void analisarAC() {
        //primeiro, um objeto da analise linear
        AnaliseLinearClasseA objAC = new AnaliseLinearClasseA();

        //começo achando a impedância de entrada(paralelo entre r1, r2 e rpi), para isso, primeiro achar rpi
        float rpi = (float) (0.025 / this.getIb());
        float zin = objAC.resistorParalelo(rpi, objAC.resistorParalelo(r1, r2));

        //a corrente de saída (Io) é em módulo igual a corrente Ic
        //Ic = gm(transcondutância) * Vbe
        //portanto, para determinar a corrente de saída é preciso achar a transcondutancia e a tensão Vbe
        //gm = Ic(da análise DC) / VT
        float gm = (float) ((float) (this.getIb() * this.getQ1()) / 0.025);

        //agora a tensão Vbe que é uma queda de tensão da impedância de entrada
        float vbe = objAC.quedaTensao(this.getVin(), zin, objAC.resistorSerie(zin, this.getRin()));

        //agora com a transcondutância e com Vbe, é possível calcular Io e ib
        float io = gm * vbe;
        float ib = io / this.getQ1();

        //e a tensão de saída é uma lei de ohm da impedância de saída e a corrente de saída
        float zout = objAC.resistorParalelo(this.getR3(), this.getRl());

        //tensão de saída
        float vout = objAC.leiDeOhm(0, zout, io);

        //com a tensão de saída, calculo o ganho
        float ganho = objAC.calcularGanho(vout, this.getVin());

        //exibindo os resultados na tela
        this.lblGanho.setText("Ganho: " + ganho + " dB");
        this.lblGm.setText("Gm: " + gm);
        this.lblIb.setText("Ib: " + ib);
        this.lblIo.setText("Io: " + io);
        this.lblResistorPi.setText("R'pi: " + rpi);
        this.lblVbe.setText("Vbe: " + vbe);
        this.lblVout.setText("Vout: " + vout);
        this.lblZin.setText("Zin: " + zin);
        this.lblZout.setText("Zout: " + zout);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lblZin = new javax.swing.JLabel();
        lblResistorPi = new javax.swing.JLabel();
        lblIo = new javax.swing.JLabel();
        lblIb = new javax.swing.JLabel();
        lblVout = new javax.swing.JLabel();
        lblGanho = new javax.swing.JLabel();
        lblVbe = new javax.swing.JLabel();
        lblGm = new javax.swing.JLabel();
        lblZout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Análise AC Classe A");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Classe_A_AC.jpg"))); // NOI18N

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblZin.setText("Zin: ");

        lblResistorPi.setText("r'pi: ");

        lblIo.setText("Io:");

        lblIb.setText("Ib:");

        lblVout.setText("Vout:");

        lblGanho.setText("Ganho:");

        lblVbe.setText("Vbe:");

        lblGm.setText("gm: ");

        lblZout.setText("Zout:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZin)
                            .addComponent(lblResistorPi)
                            .addComponent(lblIb)
                            .addComponent(lblIo)
                            .addComponent(lblVout)
                            .addComponent(lblGanho))
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVbe)
                            .addComponent(lblGm)
                            .addComponent(lblZout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblZin)
                            .addGap(18, 18, 18)
                            .addComponent(lblResistorPi)
                            .addGap(18, 18, 18)
                            .addComponent(lblIb)
                            .addGap(18, 18, 18)
                            .addComponent(lblIo)
                            .addGap(18, 18, 18)
                            .addComponent(lblVout)
                            .addGap(18, 18, 18)
                            .addComponent(lblGanho))
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVbe)
                        .addGap(18, 18, 18)
                        .addComponent(lblGm)
                        .addGap(18, 18, 18)
                        .addComponent(lblZout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        this.frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public float getVin() {
        return vin;
    }

    public void setVin(float vin) {
        this.vin = vin;
    }

    public float getRin() {
        return rin;
    }

    public void setRin(float rin) {
        this.rin = rin;
    }

    public float getR1() {
        return r1;
    }

    public void setR1(float r1) {
        this.r1 = r1;
    }

    public float getR2() {
        return r2;
    }

    public void setR2(float r2) {
        this.r2 = r2;
    }

    public float getIb() {
        return ib;
    }

    public void setIb(float ib) {
        this.ib = ib;
    }

    public float getR3() {
        return r3;
    }

    public void setR3(float r3) {
        this.r3 = r3;
    }

    public float getRl() {
        return rl;
    }

    public void setRl(float rl) {
        this.rl = rl;
    }

    public float getQ1() {
        return q1;
    }

    public void setQ1(float q1) {
        this.q1 = q1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGanho;
    private javax.swing.JLabel lblGm;
    private javax.swing.JLabel lblIb;
    private javax.swing.JLabel lblIo;
    private javax.swing.JLabel lblResistorPi;
    private javax.swing.JLabel lblVbe;
    private javax.swing.JLabel lblVout;
    private javax.swing.JLabel lblZin;
    private javax.swing.JLabel lblZout;
    // End of variables declaration//GEN-END:variables
}
