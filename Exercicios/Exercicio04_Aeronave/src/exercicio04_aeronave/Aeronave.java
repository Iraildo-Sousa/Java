/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exercicio04_aeronave;

import javax.swing.JOptionPane;

/**
 *
 * 
 *    
 * 
 * 
 * 
 * @author Iraildo55882056
 */
public class Aeronave extends javax.swing.JFrame {

    int altitude = 0;
    
    /**
     * Creates new form Aeronave
     */
    public Aeronave() {
        initComponents();
        
        ligar.setEnabled(false);
        autorizarDecolar.setEnabled(false);
        checkList.setEnabled(false);
        subir.setEnabled(false);
        autorizarDescer.setEnabled(false);
        descer.setEnabled(false);
        desligar.setEnabled(false);
        resultado.setEnabled(false);
        
        
        ligar.setText("Desligado");
        autorizarDecolar.setText("Não autorizado a decolar");
        checkList.setText("Sem checklist");
        subir.setText(altitude + " mil pés");
        autorizarDescer.setText("Não autorizado");
        descer.setText(altitude + " mil pés");
        desligar.setText("Desligado");
        
        resultado.setText(String.valueOf(altitude));
        
        atualizarResultado();
        
    }
    
    
    
    public void atualizarResultado(){
    
      resultado.setText("Status da aeronave: " + ligar.getText()+
      "\nDecolar a aeronave: " + autorizarDecolar.getText() + 
      "\nChecklist: " + checkList.getText() + 
      "\nAltitude do avião: " + altitude + 
      "\nPousar avião: " + autorizarDescer.getText() + 
      "\nPousando: " + descer.getText() + 
      "\nDesligar a aeronave: " + desligar.getText());
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        botaoLigar = new javax.swing.JButton();
        botaoAutorizarDecolar = new javax.swing.JButton();
        boataoCheckList = new javax.swing.JButton();
        boatoSubir = new javax.swing.JButton();
        botaoAutorizarDescer = new javax.swing.JButton();
        botaoDescer = new javax.swing.JButton();
        botaoDesligar = new javax.swing.JButton();
        ligar = new javax.swing.JTextField();
        autorizarDecolar = new javax.swing.JTextField();
        subir = new javax.swing.JTextField();
        descer = new javax.swing.JTextField();
        checkList = new javax.swing.JTextField();
        autorizarDescer = new javax.swing.JTextField();
        desligar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        botaoLigar.setText("Ligar");
        botaoLigar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoLigarMouseClicked(evt);
            }
        });

        botaoAutorizarDecolar.setText("Autorizar Decolar");
        botaoAutorizarDecolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAutorizarDecolarMouseClicked(evt);
            }
        });

        boataoCheckList.setText("Check List");
        boataoCheckList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boataoCheckListMouseClicked(evt);
            }
        });

        boatoSubir.setText("Subir");
        boatoSubir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boatoSubirMouseClicked(evt);
            }
        });

        botaoAutorizarDescer.setText("Autorizar Descer");
        botaoAutorizarDescer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAutorizarDescerMouseClicked(evt);
            }
        });

        botaoDescer.setText("Descer");
        botaoDescer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDescerMouseClicked(evt);
            }
        });

        botaoDesligar.setText("Desligar");
        botaoDesligar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDesligarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoAutorizarDecolar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLigar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boataoCheckList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDesligar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDescer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boatoSubir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAutorizarDescer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ligar)
                    .addComponent(autorizarDecolar)
                    .addComponent(checkList)
                    .addComponent(subir)
                    .addComponent(autorizarDescer)
                    .addComponent(descer)
                    .addComponent(desligar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoLigar)
                            .addComponent(ligar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAutorizarDecolar)
                            .addComponent(autorizarDecolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boataoCheckList)
                            .addComponent(checkList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boatoSubir)
                            .addComponent(subir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoAutorizarDescer)
                            .addComponent(autorizarDescer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDescer)
                            .addComponent(descer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoDesligar)
                            .addComponent(desligar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLigarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLigarMouseClicked
        
        if (ligar.getText().equals("Desligado")) {
        
            ligar.setText("Ligado");
            desligar.setText("Ligado");
           
            atualizarResultado();
            
        }
            
    }//GEN-LAST:event_botaoLigarMouseClicked

    private void botaoAutorizarDecolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAutorizarDecolarMouseClicked
        
        if (checkList.getText().equals("Tudo certo para decolagem")) {
        
            autorizarDecolar.setText("Autorizado a decolar");
            
            atualizarResultado();
            
        }
        
        else {
        
            JOptionPane.showMessageDialog(null, "O Cheklist ainda não foi feito");
        
        }
        
    }//GEN-LAST:event_botaoAutorizarDecolarMouseClicked

    private void boataoCheckListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boataoCheckListMouseClicked

        if (ligar.getText().equals("Ligado")) {
        
            checkList.setText("Tudo certo para decolagem");
            
            atualizarResultado();
            
        }
        
        else {
        
            JOptionPane.showMessageDialog(null, "O avião não está ligado.");
        
        }
        
    }//GEN-LAST:event_boataoCheckListMouseClicked

    private void boatoSubirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boatoSubirMouseClicked
        
        if (autorizarDecolar.getText().equals("Autorizado a decolar") && altitude < 40) {
            
            altitude = altitude + 10;
            
            subir.setText(String.valueOf(altitude + " mil pés"));
            descer.setText(String.valueOf(altitude + " mil pés"));
            
            atualizarResultado();
            
        }
        
        else if (altitude <= 0) {
        
            JOptionPane.showMessageDialog(null, "O avião não foi autorizado a decolar");
        
        }
        
        else {
        
            JOptionPane.showMessageDialog(null,"O avião não pode ultrapassar os 40 mil pés.");
            
        }
        
        
        
    }//GEN-LAST:event_boatoSubirMouseClicked

    private void botaoAutorizarDescerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAutorizarDescerMouseClicked
        
        if (altitude > 0) {
        
            autorizarDescer.setText("Autorizado a pousar");
            
            atualizarResultado();
            
        }
        
        else {
        
            JOptionPane.showMessageDialog(null, "O avião em solo");
        
        }
        
    }//GEN-LAST:event_botaoAutorizarDescerMouseClicked

    private void botaoDescerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDescerMouseClicked
        
        if (altitude > 0 && autorizarDescer.getText().equals("Autorizado a pousar")){
        
            altitude = altitude - 10;
            
            subir.setText(String.valueOf(altitude + " mil pés"));
            descer.setText(String.valueOf(altitude + " mil pés"));
            
            atualizarResultado();
            
        }
        
        else if (altitude < 10) {
        
            JOptionPane.showMessageDialog(null, "O avião está em solo");
            
        }
        
        else {
        
            JOptionPane.showMessageDialog(null, "O avião não está autorizado a pousar");
        
        }
        
                    
      
        
    }//GEN-LAST:event_botaoDescerMouseClicked

    private void botaoDesligarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDesligarMouseClicked
        
        if (desligar.getText().equals("Ligado") && altitude == 0){
     
        ligar.setText("Desligado");
        autorizarDecolar.setText("Não autorizado a decolar");
        checkList.setText("Sem checklist");
        subir.setText(altitude + " mil pés");
        autorizarDescer.setText("Não autorizado");
        descer.setText(altitude + " mil pés");
        desligar.setText("Desligado");
            
            atualizarResultado();
            
        }
        
        if (altitude > 0) {
        
            JOptionPane.showMessageDialog(null, "O avião não pode pousar enquanto voa");
            
        }
        
        if (altitude == 0) {
            
            JOptionPane.showMessageDialog(null, "Avião desligado com sucesso!");
            
        }
            
    }//GEN-LAST:event_botaoDesligarMouseClicked

    
        
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
            java.util.logging.Logger.getLogger(Aeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aeronave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aeronave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorizarDecolar;
    private javax.swing.JTextField autorizarDescer;
    private javax.swing.JButton boataoCheckList;
    private javax.swing.JButton boatoSubir;
    private javax.swing.JButton botaoAutorizarDecolar;
    private javax.swing.JButton botaoAutorizarDescer;
    private javax.swing.JButton botaoDescer;
    private javax.swing.JButton botaoDesligar;
    private javax.swing.JButton botaoLigar;
    private javax.swing.JTextField checkList;
    private javax.swing.JTextField descer;
    private javax.swing.JTextField desligar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ligar;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField subir;
    // End of variables declaration//GEN-END:variables
}
