/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste02;

/**
 *
 * @author Iraildo55882056
 */
public class Tela1 extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Tela1() {
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

        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        botaoSoma = new javax.swing.JButton();
        subtrairN1 = new javax.swing.JTextField();
        multiplicarN1 = new javax.swing.JTextField();
        dividirN1 = new javax.swing.JTextField();
        subtrairN2 = new javax.swing.JTextField();
        multiplicarN2 = new javax.swing.JTextField();
        dividirN2 = new javax.swing.JTextField();
        botaoDividir = new javax.swing.JButton();
        resultado2 = new javax.swing.JTextField();
        resultado3 = new javax.swing.JTextField();
        resultado4 = new javax.swing.JTextField();
        botaoSubtrair = new javax.swing.JButton();
        botaoMultiplicar = new javax.swing.JButton();
        comboBoxOperacoes = new javax.swing.JComboBox<>();
        n1CB = new javax.swing.JTextField();
        n2CB = new javax.swing.JTextField();
        resultadoCB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        botaoSoma.setText("Somar");
        botaoSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSomaMouseClicked(evt);
            }
        });
        botaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomaActionPerformed(evt);
            }
        });

        subtrairN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairN1ActionPerformed(evt);
            }
        });

        botaoDividir.setText("Dividir");
        botaoDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDividirMouseClicked(evt);
            }
        });

        resultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado2ActionPerformed(evt);
            }
        });

        botaoSubtrair.setText("Subtrair");
        botaoSubtrair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSubtrairMouseClicked(evt);
            }
        });

        botaoMultiplicar.setText("Multiplicar");
        botaoMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMultiplicarMouseClicked(evt);
            }
        });

        comboBoxOperacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Somar", "Subtrair", "Multiplicar", "Dividir" }));
        comboBoxOperacoes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxOperacoesItemStateChanged(evt);
            }
        });

        n2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2CBActionPerformed(evt);
            }
        });

        resultadoCB.setText("Resul:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtrairN1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtrairN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplicarN1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(multiplicarN2))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dividirN1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(dividirN2))
                            .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resultado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(n1CB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(n2CB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(resultadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtrairN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicarN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividirN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtrairN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicarN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividirN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSoma)
                    .addComponent(botaoDividir)
                    .addComponent(botaoSubtrair)
                    .addComponent(botaoMultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void botaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomaActionPerformed
        int numero1 = Integer.parseInt(n1.getText());
        int numero2 = Integer.parseInt(n2.getText());
        int soma = numero1 + numero2;
        
        resultado.setText(String.valueOf(soma));
        //resultado.setText(numero1 + numero2);
    }//GEN-LAST:event_botaoSomaActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void subtrairN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtrairN1ActionPerformed

    private void resultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado2ActionPerformed
      
    }//GEN-LAST:event_resultado2ActionPerformed

    private void botaoSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSomaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSomaMouseClicked

    private void botaoSubtrairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSubtrairMouseClicked
        
        int numero1 = Integer.parseInt(subtrairN1.getText());
        int numero2 = Integer.parseInt(subtrairN2.getText());
        int subtracao = numero1 - numero2;
        
        resultado2.setText(String.valueOf(subtracao));
        
    }//GEN-LAST:event_botaoSubtrairMouseClicked

    private void botaoMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMultiplicarMouseClicked

        int n1 = Integer.parseInt(multiplicarN1.getText());
        int n2 = Integer.parseInt(multiplicarN2.getText());
        int multiplicacao = n1 * n2;
        
        resultado3.setText(String.valueOf(multiplicacao));
        
    }//GEN-LAST:event_botaoMultiplicarMouseClicked

    private void botaoDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDividirMouseClicked
        
        int n1 = Integer.parseInt(dividirN1.getText());
        int n2 = Integer.parseInt(dividirN2.getText());
        double divisao = n1 / n2;
        
        resultado4.setText(String.valueOf(divisao));
        
    }//GEN-LAST:event_botaoDividirMouseClicked

    private void comboBoxOperacoesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxOperacoesItemStateChanged
        
        if(comboBoxOperacoes.getSelectedItem().equals("Somar")){
        
            int n1 = Integer.parseInt(n1CB.getText());
            int n2 = Integer.parseInt(n2CB.getText());
            int soma = n1 + n2;
            
            resultadoCB.setText(String.valueOf(soma));
        }
        
        else if (comboBoxOperacoes.getSelectedItem().equals("Subtrair")) {
        
             int n1 = Integer.parseInt(n1CB.getText());
             int n2 = Integer.parseInt(n2CB.getText());
             int sub = n1 - n2;
             
             resultadoCB.setText(String.valueOf(sub));
             
        } //else if (comboBoxOperacoes.getSelectedItem().equals("Subtrair"))
        
        
        else if (comboBoxOperacoes.getSelectedItem().equals("Dividir")) {
         
            double n1 = Integer.parseInt(n1CB.getText());
            double n2 = Integer.parseInt(n2CB.getText());
            double div = n1 / n2;
            
            resultadoCB.setText(String.valueOf(div));
            
        } //else if (comboBoxOperacoes.getSelectedItem().equals("Dividir")) {   
        
        else {
        
            int n1 = Integer.parseInt(n1CB.getText());
            int n2 = Integer.parseInt(n2CB.getText());
            int mult = n1 * n2;
            
            resultadoCB.setText(String.valueOf(mult));
        
        } // else
        
    }//GEN-LAST:event_comboBoxOperacoesItemStateChanged

    private void n2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2CBActionPerformed

   
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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDividir;
    private javax.swing.JButton botaoMultiplicar;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSubtrair;
    private javax.swing.JComboBox<String> comboBoxOperacoes;
    private javax.swing.JTextField dividirN1;
    private javax.swing.JTextField dividirN2;
    private javax.swing.JTextField multiplicarN1;
    private javax.swing.JTextField multiplicarN2;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n1CB;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n2CB;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField resultado2;
    private javax.swing.JTextField resultado3;
    private javax.swing.JTextField resultado4;
    private javax.swing.JTextField resultadoCB;
    private javax.swing.JTextField subtrairN1;
    private javax.swing.JTextField subtrairN2;
    // End of variables declaration//GEN-END:variables
}
