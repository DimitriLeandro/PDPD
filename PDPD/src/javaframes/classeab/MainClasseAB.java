package javaframes.classeab;

import javaframes.MainPDPD;
import javax.swing.JOptionPane;

/**
 *
 * @author dimi
 */
public class MainClasseAB extends javax.swing.JFrame {

    private MainPDPD objMainFramePDPD;

    public MainClasseAB(MainPDPD obj) {
        initComponents();
        this.setLocationRelativeTo(null);
        objMainFramePDPD = obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPotPre = new javax.swing.JTextField();
        txtImpSaida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRL = new javax.swing.JTextField();
        txtIc = new javax.swing.JTextField();
        btnAnalisar = new javax.swing.JButton();
        txtVDiodo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Análise Classe AB");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Classe_AB.jpeg"))); // NOI18N

        jLabel1.setText("Potência Pretendida (W): ");

        jLabel2.setText("Impedância de Saída (Ohms): ");

        txtPotPre.setText("5");

        txtImpSaida.setText("8");

        jLabel3.setText("Resistência da Carga RL (Ohms):");

        jLabel4.setText("Corrente de coletor (A):");

        txtRL.setText("8");

        txtIc.setText("0.010");

        btnAnalisar.setText("Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        txtVDiodo.setText("0.65");

        jLabel5.setText("Tensão aproximada dos diodos (V):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPotPre)
                    .addComponent(txtImpSaida)
                    .addComponent(txtRL)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIc)
                    .addComponent(btnAnalisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVDiodo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPotPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImpSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVDiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnAnalisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        objMainFramePDPD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarActionPerformed
        //pegando as informações dadas pelo usuário
        double rl = Double.parseDouble(txtRL.getText());
        double potPre = Double.parseDouble(txtPotPre.getText());
        double ic = Double.parseDouble(txtIc.getText());
        double zout = Double.parseDouble(txtImpSaida.getText());
        double vDiodo = Double.parseDouble(txtVDiodo.getText());

        //calculando VCC
        double vcc = Math.sqrt(zout * rl * potPre);

        //calculando os valores dos resistores (Tensão no diodo = 0,65 e também considerando que os resistores são iguais)
        double vr1 = (vcc - (2 * vDiodo)) / 2;

        //calculando o valor dos resistores com a lei de ohm (espelho de corrente)
        double r1 = vr1 / ic;

        //potência da fonte
        double potFonte = ((Math.pow(vcc, 2)) / (2 * Math.PI * rl));

        //rendimento da fonte
        double n = 100 * (potPre / potFonte);

        //potencia dissipada transistores
        double potQ1 = ((Math.pow(vcc, 2)) / (4 * (Math.pow(Math.PI, 2)) * rl));

        //exibindo
        String resultado
                = "Vcc: " + String.format("%.3f", vcc) + " V"
                + "\nVr1: " + String.format("%.3f", vr1) + " V"
                + "\nVr2: " + String.format("%.3f", vr1) + " V"
                + "\nR1: " + String.format("%.3f", r1) + " Ohms"
                + "\nR2: " + String.format("%.3f", r1) + " Ohms"
                + "\nPotência dissipada pela fonte: " + String.format("%.3f", potFonte) + " W"
                + "\nRendimento da fonte: " + String.format("%.3f", n) + "%" 
                + "\nPotência dissipada pelos transistores: " + String.format("%.3f", potQ1) + " W";
        JOptionPane.showMessageDialog(null, resultado, "Resultados", 1);
    }//GEN-LAST:event_btnAnalisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtIc;
    private javax.swing.JTextField txtImpSaida;
    private javax.swing.JTextField txtPotPre;
    private javax.swing.JTextField txtRL;
    private javax.swing.JTextField txtVDiodo;
    // End of variables declaration//GEN-END:variables
}
