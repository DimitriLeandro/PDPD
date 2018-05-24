package javaframes.classea;

import javaclasses.AnaliseVetorialClasseA;
import javax.swing.JFrame;

/**
 *
 * @author dimitri
 */
public final class RespostaFrequenciaClasseAFrame extends javax.swing.JFrame {

    private JFrame frame;
    private float[] vin = new float[2];
    private float[] rin = new float[2];
    private float[] r1 = new float[2];
    private float[] r2 = new float[2];
    private float[] r3 = new float[2];
    private float[] r4 = new float[2];
    private float[] rl = new float[2];
    private float q1;
    private float c1;
    private float c2;
    private float c3;
    private float[] ib = new float[2];
    private AnaliseVetorialClasseA objAV;
    private float gm;
    private float[] rpi = new float[2];

    public RespostaFrequenciaClasseAFrame(JFrame frame, float vin, float rin, float r1, float r2, float r3, float r4, float rl, float q1, float c1, float c2, float c3, float ib) {
        initComponents();
        this.setLocationRelativeTo(null);

        //o objeto vai ser da classe toda
        this.objAV = new AnaliseVetorialClasseA();

        //colocando as magnitudes na posição 0 de cada vetor
        this.frame = frame;
        this.vin[0] = vin;
        this.rin[0] = rin;
        this.r1[0] = r1;
        this.r2[0] = r2;
        this.r3[0] = r3;
        this.r4[0] = r4;
        this.rl[0] = rl;
        this.q1 = q1;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.ib[0] = ib;

        //calculando as constantes transcondutância e r'pi
        this.gm = (float) ((ib * q1) / 0.025); //transcondutância = Ic(DC) / VT;
        this.rpi[0] = (float) (0.025 / ib); //r'pi = VT / Ib;

        //exibindo os ganhos para váris frequências
        for (int i = 0; i <= 100; i = i + 10) {
            if (i != 0) {
                this.jTextArea1.append(i + "Hz: " + this.ganho(i) + " dB" + "\n");
            }
        }
        for (int i = 100; i <= 1000; i = i + 100) {
            if (i != 100) {
                this.jTextArea1.append(i + "Hz: " + this.ganho(i) + " dB" + "\n");
            }
        }
        for (int i = 1000; i <= 20000; i = i + 1000) {
            if (i != 1000) {
                this.jTextArea1.append(i + "Hz: " + this.ganho(i) + " dB" + "\n");
            }
        }
    }

    public float ganho(float freq) {
        //começo calculando as reatâncias capacitivas 
        float xc1[] = this.objAV.reatanciaCapacitiva(this.c1, freq);
        float xc2[] = this.objAV.reatanciaCapacitiva(this.c2, freq);
        float xc3[] = this.objAV.reatanciaCapacitiva(this.c3, freq);

        //calculando a impedância de entrada
        float zin[] = objAV.impedanciaSerie(xc1, objAV.impedanciaParalelo(r1, objAV.impedanciaParalelo(r2, objAV.impedanciaSerie(rpi, objAV.impedanciaParalelo(r4, xc2)))));

        //vbe -> queda de tensão com a tensão de entrada, impedância de entrada e a tensão do paralelo R1, R2 e Rpi
        float vbe[] = objAV.multiplicar(vin, objAV.dividir(objAV.impedanciaParalelo(rpi, objAV.impedanciaParalelo(r1, r2)), zin));

        //a transcondutância já foi calculada, portanto, agora é só achar Io
        float io[] = new float[2];
        io[0] = this.gm * vbe[0];
        io[1] = vbe[1];

        //agora a impedância de saída
        float zout[] = new float[2];
        zout = objAV.impedanciaParalelo(r3, objAV.impedanciaSerie(xc3, rl));

        //agora é possível achar a tensão no nó de r3 com o capacitor c3. Com essa tensão, é possível fazer a queda de tensão em Rl
        float vno[] = objAV.multiplicar(io, zout); //tensão no nó

        //com essa tensão é possível fazer a queda de tensão em RL
        float vrl[] = this.objAV.multiplicar(vno, this.objAV.dividir(this.rl, this.objAV.impedanciaSerie(xc3, this.rl)));

        //ganho
        float ganho = (float) (20 * Math.log10(vrl[0] / vin[0]));

        return ganho;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resposta em Frequência Classe A");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
