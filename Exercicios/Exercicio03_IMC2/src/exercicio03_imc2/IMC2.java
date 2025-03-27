/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exercicio03_imc2;

/**
 *
 * @author Iraildo55882056
 */
public class IMC2 extends javax.swing.JFrame {

    /**
     * Creates new form IMC2
     */
    public IMC2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoIMC = new javax.swing.JTextArea();
        botaoIMC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peso:");

        jLabel2.setText("Altura:");

        altura.setText(" ");

        resultadoIMC.setEditable(false);
        resultadoIMC.setColumns(20);
        resultadoIMC.setRows(5);
        jScrollPane1.setViewportView(resultadoIMC);

        botaoIMC.setText("IMC");
        botaoIMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIMCMouseClicked(evt);
            }
        });

        jLabel3.setText("Idade:");

        jLabel4.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(altura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome))
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoIMC)
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoIMC)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(478, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIMCMouseClicked
        
        double pesO = Double.parseDouble(peso.getText());
        double alturA = Double.parseDouble(altura.getText());
        double imC = pesO / (alturA * alturA);
        
        if (imC < 18.5 && imC > 0) {
            
            
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nVocê está abaixo do peso! \nIMC: " + imC);
        
        }
        
        else if (imC >= 18.5 && imC < 25) {
        
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nPeso normal. \nIMC: " + imC);
        
        }
       
        
        else if (imC >= 25 && imC < 30) {
        
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nSobrepeso. \nIMC: " + imC);
        
        }
        
        else if (imC >= 30 && imC < 35) {
        
                resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nObesidade grau I. \nIMC: " + imC);
                
        }
        
        else if (imC >= 35 && imC < 40) {
        
                resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nObesidade grau II. \nIMC: " + imC);
        
        }
        
        else if (imC >= 40 && imC < 50) {
        
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nObesidade grau III. \nIMC: " + imC);
        
        }
        
        else if (imC >= 50 && imC < 60) {
        
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "\nObesidade grau IV. \nIMC: " + imC);
        
        }
        
        else if (imC <= 60) {
        
            resultadoIMC.setText("Nome: " + nome.getText() + "\nIdade: " + idade.getText() + "\nPeso: " + peso.getText() + "\nAltura: " + altura.getText() + "Obesidade grau V.  \nIMC: " + imC);
        
        }
        
        
    }//GEN-LAST:event_botaoIMCMouseClicked

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
            java.util.logging.Logger.getLogger(IMC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JButton botaoIMC;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField peso;
    private javax.swing.JTextArea resultadoIMC;
    // End of variables declaration//GEN-END:variables
}
