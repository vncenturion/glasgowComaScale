/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author vinic
 */
public class GuiGlasgow extends javax.swing.JFrame {

    /**
     * Creates new form guiGlasglow
     */
    public GuiGlasgow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ocular = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        verbal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        motora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pupilar = new javax.swing.JComboBox<>();
        calcular = new javax.swing.JButton();
        pontuacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentarios = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCALA DE COMA DE GLASGOW (ECG)");
        setLocation(new java.awt.Point(250, 150));

        ocular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " NT: Olhos fechados devido a factor local (não testável)", " 1: Ausência persistente de abertura ocular, sem fatores de interferência (ausente)", " 2: Abertura ocular após estimulação da extremidade dos dedos (à pressão)", " 3: Abertura ocular após ordem em tom de voz normal ou em voz alta (ao som)", " 4: Olhos abertos previamente à estimulação (espontânea)" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ABERTURA OCULAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RESPOSTA VERBAL");

        verbal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " NT: Factor que interfere com a comunicação (não testável)", " 1: Ausência de resposta audível, sem fatores de interferência (ausente)", " 2: Apenas gemidos (sons)", " 3: Palavras isoladas inteligíveis (palavras)", " 4: Resposta não orientada mas comunicação coerente (confusa)", " 5: Resposta adequada relativamente ao nome, local e data (orientada)" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("MELHOR RESPOSTA MOTORA");

        motora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " NT: Fator que limita resposta motora (não testável)", " 1: Ausência de movimentos dos membros superiores/inferiores, sem fatores de interferência (ausente)", " 2: Extensão do membro superior ao nível do cotovelo (extensão)", " 3: Flexão do membro superior ao nível do cotovelo, padrão predominante claramente anormal (flexão anormal)", " 4: Flexão rápida do membro superior ao nível do cotovelo, padrão predominante não anormal (flexão normal)", " 5: Elevação da mão acima do nível da clavícula ao estímulo na cabeça ou pescoço (localizadora)", " 6: Cumprimento de ordens com 2 ações (a ordens)" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("RESPOSTA PUPILAR (atualização 2018)");

        pupilar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 0: Ambas pupilas reagem aoo estímulo de luz", " 1: Uma das pupilas não reage ao estímulo de luz", " 2: Ambas as pupilas não reagem ao estímulo de luz" }));

        calcular.setText("CALCULAR SCORE");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        pontuacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pontuacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pontuacao.setText("SCORE");
        pontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontuacaoActionPerformed(evt);
            }
        });

        comentarios.setColumns(20);
        comentarios.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        comentarios.setLineWrap(true);
        comentarios.setRows(5);
        comentarios.setText("comentários");
        comentarios.setWrapStyleWord(true);
        jScrollPane1.setViewportView(comentarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verbal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(motora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pupilar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(pontuacao))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ocular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(verbal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(motora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pupilar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );

        jTabbedPane1.addTab("ADULTO", jPanel1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/FLEXAO.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/FISICO.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("LOCAIS PARA ESTIMULAÇÃO FÍSICA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("LOCAIS PARA ESTIMULAÇÃO FÍSICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SOBRE", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontuacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pontuacaoActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        int respVerbal, respMotora, respOcular, respPupilar, scoreFinal;
        //calculo do score glasgow
        respOcular = ocular.getSelectedIndex();
        respVerbal = verbal.getSelectedIndex();
        respMotora = motora.getSelectedIndex();
        respPupilar = pupilar.getSelectedIndex();
        scoreFinal = respOcular+respMotora+respVerbal-respPupilar;
        //transformar resultado em cadeia para visualização no painel com set text
        String glasglow = String.valueOf(scoreFinal);
        pontuacao.setText(glasglow);
        
        String resInterpretacao;
        
        switch(scoreFinal){
            case 1:
            case 2:
            case 3:
                resInterpretacao = "Coma profundo, com 85% de probabilidade de morte e em estado vegetativo";
                break;
            case 4:
                resInterpretacao = "Coma profundo";
                break;
            case 5:
            case 6:
            case 7:
                resInterpretacao = "Coma intermediario";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                resInterpretacao = "Coma superficial";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                resInterpretacao = "Normalidade";
                break;
            default:
                resInterpretacao = "Dados invalidos";
                break;
        }
        comentarios.setText(resInterpretacao);
    }//GEN-LAST:event_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(GuiGlasgow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiGlasgow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiGlasgow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiGlasgow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiGlasgow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextArea comentarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> motora;
    private javax.swing.JComboBox<String> ocular;
    private javax.swing.JTextField pontuacao;
    private javax.swing.JComboBox<String> pupilar;
    private javax.swing.JComboBox<String> verbal;
    // End of variables declaration//GEN-END:variables
}
