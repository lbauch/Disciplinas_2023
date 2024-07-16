/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Ponto;

/**
 *
 * @author evand
 */
public class AppUI extends javax.swing.JFrame {

    /**
     * Creates new form AppUI
     */
    public AppUI() {
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

        labelEixoX = new javax.swing.JLabel();
        labelEixoY = new javax.swing.JLabel();
        textFieldX = new javax.swing.JTextField();
        textFieldY = new javax.swing.JTextField();
        buttonAvaliar = new javax.swing.JButton();
        labelPosicao = new javax.swing.JLabel();
        checkboxIncideX = new javax.swing.JCheckBox();
        checkboxIncideY = new javax.swing.JCheckBox();
        checkboxQuadrante1 = new javax.swing.JCheckBox();
        checkboxQuadrante2 = new javax.swing.JCheckBox();
        checkboxQuadrante3 = new javax.swing.JCheckBox();
        checkboxQuadrante4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEixoX.setText("Eixo X:");

        labelEixoY.setText("Eixo Y:");

        buttonAvaliar.setText("Avaliar");
        buttonAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAvaliarActionPerformed(evt);
            }
        });

        labelPosicao.setText("Posição");

        checkboxIncideX.setText("Incide sobre o Eixo X");
        checkboxIncideX.setEnabled(false);

        checkboxIncideY.setText("Incide sobre o Eixo Y");
        checkboxIncideY.setEnabled(false);

        checkboxQuadrante1.setText("No 1º Quadrante");
        checkboxQuadrante1.setEnabled(false);

        checkboxQuadrante2.setText("No 2º Quadrante");
        checkboxQuadrante2.setEnabled(false);

        checkboxQuadrante3.setText("No 3º Quadrante");
        checkboxQuadrante3.setEnabled(false);

        checkboxQuadrante4.setText("No 4º Quadrante");
        checkboxQuadrante4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEixoX)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldX))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEixoY)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAvaliar))
                            .addComponent(labelPosicao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkboxIncideY)
                            .addComponent(checkboxIncideX)
                            .addComponent(checkboxQuadrante1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxQuadrante2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxQuadrante3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxQuadrante4, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEixoX)
                            .addComponent(textFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEixoY)
                            .addComponent(textFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonAvaliar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPosicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkboxIncideX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxIncideY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxQuadrante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxQuadrante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxQuadrante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxQuadrante4)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAvaliarActionPerformed
        // Método para tratar o evento click no botão de avaliar
        Ponto p = new Ponto();
        p.setX(Double.parseDouble(textFieldX.getText()));
        p.setY(Double.parseDouble(textFieldY.getText()));
        
        // desmarcar os checkbox, garantindo que não fique dados antigos
        checkboxIncideX.setSelected(false);
        checkboxIncideY.setSelected(false);
        checkboxQuadrante1.setSelected(false);
        checkboxQuadrante2.setSelected(false);
        checkboxQuadrante3.setSelected(false);
        checkboxQuadrante4.setSelected(false);
        
        // marcar os checklists corretos desta avaliação
        switch (p.identificarQuadrante()) {
            case PRIMEIRO:
                checkboxQuadrante1.setSelected(true);
                break;
            case SEGUNDO:
                checkboxQuadrante2.setSelected(true);
                break;
            case TERCEIRO:
                checkboxQuadrante3.setSelected(true);
                break;
            case QUARTO:
                checkboxQuadrante4.setSelected(true);
                break;
            default:
                if (p.estaIncidindoSobreX()) {
                    checkboxIncideX.setSelected(true);
                }
                if (p.estaIncidindoSobreY()) {
                    checkboxIncideY.setSelected(true);
                }
        }
        
    }//GEN-LAST:event_buttonAvaliarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAvaliar;
    private javax.swing.JCheckBox checkboxIncideX;
    private javax.swing.JCheckBox checkboxIncideY;
    private javax.swing.JCheckBox checkboxQuadrante1;
    private javax.swing.JCheckBox checkboxQuadrante2;
    private javax.swing.JCheckBox checkboxQuadrante3;
    private javax.swing.JCheckBox checkboxQuadrante4;
    private javax.swing.JLabel labelEixoX;
    private javax.swing.JLabel labelEixoY;
    private javax.swing.JLabel labelPosicao;
    private javax.swing.JTextField textFieldX;
    private javax.swing.JTextField textFieldY;
    // End of variables declaration//GEN-END:variables
}
