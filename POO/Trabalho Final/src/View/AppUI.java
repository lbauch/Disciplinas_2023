package View;

import Model.Lugar;
import Model.Personagem;
import Model.Termo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppUI extends javax.swing.JFrame {

    /**
     * Creates new form App
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

        bt_ConsultaTermo = new javax.swing.JButton();
        lb_Introducao = new javax.swing.JLabel();
        bt_InsereTermo = new javax.swing.JButton();
        bt_ConsultaLugares = new javax.swing.JButton();
        bt_ConsultaPersonagens = new javax.swing.JButton();
        bt_ConsultaTermos = new javax.swing.JButton();
        bt_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_ConsultaTermo.setText("Consultar/Remover Termo");
        bt_ConsultaTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsultaTermoActionPerformed(evt);
            }
        });

        lb_Introducao.setText("SELECIONE A AÇÃO QUE DESEJA EXECUTAR");

        bt_InsereTermo.setText("Inserir Termo");
        bt_InsereTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_InsereTermoActionPerformed(evt);
            }
        });

        bt_ConsultaLugares.setText("Consultar Lugares");
        bt_ConsultaLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsultaLugaresActionPerformed(evt);
            }
        });

        bt_ConsultaPersonagens.setText("Consultar Personagens");
        bt_ConsultaPersonagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsultaPersonagensActionPerformed(evt);
            }
        });

        bt_ConsultaTermos.setText("Consultar Termos");
        bt_ConsultaTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ConsultaTermosActionPerformed(evt);
            }
        });

        bt_Fechar.setText("Encerrar Programa");
        bt_Fechar.setToolTipText("");
        bt_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Introducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_ConsultaLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_ConsultaTermos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_ConsultaPersonagens, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_InsereTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_ConsultaTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Introducao)
                .addGap(18, 18, 18)
                .addComponent(bt_InsereTermo)
                .addGap(12, 12, 12)
                .addComponent(bt_ConsultaTermo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ConsultaTermos)
                .addGap(12, 12, 12)
                .addComponent(bt_ConsultaPersonagens)
                .addGap(12, 12, 12)
                .addComponent(bt_ConsultaLugares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Termo> todosTermos = new ArrayList<>();

    private void bt_InsereTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_InsereTermoActionPerformed
        TermoUI termoUI = new TermoUI(this, true);
        termoUI.setVisible(true);
        todosTermos.add(termoUI.getTermo());
    }//GEN-LAST:event_bt_InsereTermoActionPerformed

    private void bt_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_FecharActionPerformed

    private void bt_ConsultaTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConsultaTermoActionPerformed
        ConsultaUI consultaUI = new ConsultaUI(this, true);
        consultaUI.setVisible(true);
        try {
            if (consultaUI.getAcaoTermo().equalsIgnoreCase("Remover")) {
                int cont = -1;
                for (int i = 0; i < todosTermos.size(); i++) {
                    Termo t = todosTermos.get(i);
                    if (t.getNome().equalsIgnoreCase(consultaUI.getJDialogTermo().getNome())
                            && ((t instanceof Personagem && consultaUI.getTipoTermo().equalsIgnoreCase("Personagem"))
                            || (t instanceof Lugar && consultaUI.getTipoTermo().equalsIgnoreCase("Lugar"))
                            || consultaUI.getTipoTermo().equalsIgnoreCase("Termo"))) {

                        cont = i;
                        break;
                    }
                }
                if (cont >= 0) {
                    todosTermos.remove(todosTermos.get(cont));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum item encontrado");
                }
            } else {
                String dados = "";
                for (Termo t : todosTermos) {
                    if (t.getNome().equalsIgnoreCase(consultaUI.getJDialogTermo().getNome())) {
                        if (t instanceof Personagem) {
                            dados += "Personagem\nNome: "
                                    + t.getNome() + "\nDescrição: " + t.getDescricao() + "\nCaracterísticas: "
                                    + ((Personagem) t).getCaracteristicas() + "\nFeitos: " + ((Personagem) t).getFeitos() + "\n";
                        } else if (t instanceof Lugar) { //*****
                            dados += "Lugar\nNome: "
                                    + t.getNome() + "\nDescrição: " + t.getDescricao() + "\nCaracterísticas: "
                                    + ((Lugar) t).getHistoria() /*lugar.getHistoria()*/ + "\n";
                        } else {
                            dados += "Termo Comum\nNome: "
                                    + t.getNome() + "\nDescrição: " + t.getDescricao() + "\n";
                        }
                        break;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Algo deu errado");
        }
    }//GEN-LAST:event_bt_ConsultaTermoActionPerformed

    private void bt_ConsultaTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConsultaTermosActionPerformed
        String saidaJPane = "";
        for (Termo t : todosTermos) {
            saidaJPane += t.getNome() + ": " + t.getDescricao() + "\n";
        }
        if (todosTermos == null) {
            JOptionPane.showMessageDialog(null, "Sem termos inseridos");
        } else {
            JOptionPane.showMessageDialog(null, saidaJPane);
        }
    }//GEN-LAST:event_bt_ConsultaTermosActionPerformed

    private void bt_ConsultaPersonagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConsultaPersonagensActionPerformed
        String saidaJPane = "";
        for (Termo t : todosTermos) {
            if (t instanceof Personagem) { //*****
                saidaJPane += t.getNome() + ": " + ((Personagem) t).getCaracteristicas()
                        /*personagem.getCaracteristicas()*/ + "\n";
            }
        }

        if (saidaJPane.equals("")) {
            JOptionPane.showMessageDialog(null, "Sem personagens inseridos");
        } else {
            JOptionPane.showMessageDialog(null, saidaJPane);
        }
    }//GEN-LAST:event_bt_ConsultaPersonagensActionPerformed

    private void bt_ConsultaLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ConsultaLugaresActionPerformed
        String saidaJPane = "";
        for (Termo t : todosTermos) {
            if (t instanceof Lugar) { //*****
                saidaJPane += t.getNome() + ": " + t.getDescricao() /*lugar.getDescricao()*/ + "\n";
            }
        }

        if (saidaJPane.equals("")) {
            JOptionPane.showMessageDialog(null, "Sem lugares inseridos");
        } else {
            JOptionPane.showMessageDialog(null, saidaJPane);
        }
    }//GEN-LAST:event_bt_ConsultaLugaresActionPerformed

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
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ConsultaLugares;
    private javax.swing.JButton bt_ConsultaPersonagens;
    private javax.swing.JButton bt_ConsultaTermo;
    private javax.swing.JButton bt_ConsultaTermos;
    private javax.swing.JButton bt_Fechar;
    private javax.swing.JButton bt_InsereTermo;
    private javax.swing.JLabel lb_Introducao;
    // End of variables declaration//GEN-END:variables
}
