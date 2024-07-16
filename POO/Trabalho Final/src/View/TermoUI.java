package View;

import Model.Categoria;
import Model.Lugar;
import Model.Obra;
import Model.Personagem;
import Model.Termo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TermoUI extends javax.swing.JDialog {

    /**
     * Creates new form Termo
     */
    public TermoUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_Importantes = new javax.swing.JPanel();
        panel_Termo = new javax.swing.JPanel();
        lb_Nome = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_Descricao = new javax.swing.JLabel();
        tf_Descricao = new javax.swing.JTextField();
        check_Termo = new javax.swing.JRadioButton();
        check_Lugar = new javax.swing.JRadioButton();
        check_Personagem = new javax.swing.JRadioButton();
        panel_Obra = new javax.swing.JPanel();
        lb_Titulo = new javax.swing.JLabel();
        tf_Titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_Ano = new javax.swing.JTextField();
        lb_Categoria = new javax.swing.JLabel();
        bt_AdicionaObra = new javax.swing.JButton();
        bt_RemoveObra = new javax.swing.JButton();
        cb_Categoria = new javax.swing.JComboBox<>();
        bt_SalvaTermo = new javax.swing.JButton();
        panel_Especifico = new javax.swing.JPanel();
        panel_Lugar = new javax.swing.JPanel();
        lb_Historia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Historia = new javax.swing.JTextArea();
        panel_Personagem = new javax.swing.JPanel();
        lb_Caracteristicas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_Caracteristicas = new javax.swing.JTextArea();
        lb_Feitos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_Feitos = new javax.swing.JTextArea();
        panel_Atores = new javax.swing.JPanel();
        bt_AdicionaAtor = new javax.swing.JButton();
        lb_NomeAtor = new javax.swing.JLabel();
        tf_NomeAtor = new javax.swing.JTextField();
        bt_RemoveAtor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_Importantes.setBorder(javax.swing.BorderFactory.createTitledBorder("*Preenchimento obrigatório"));

        panel_Termo.setBorder(javax.swing.BorderFactory.createTitledBorder("Termo"));

        lb_Nome.setText("Nome:");

        lb_Descricao.setText("Descrição:");

        buttonGroup1.add(check_Termo);
        check_Termo.setText("Termo Comum");

        buttonGroup1.add(check_Lugar);
        check_Lugar.setText("Lugar");

        buttonGroup1.add(check_Personagem);
        check_Personagem.setText("Personagem");

        javax.swing.GroupLayout panel_TermoLayout = new javax.swing.GroupLayout(panel_Termo);
        panel_Termo.setLayout(panel_TermoLayout);
        panel_TermoLayout.setHorizontalGroup(
            panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TermoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_Descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(check_Termo))
                .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_TermoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(tf_Nome)))
                    .addGroup(panel_TermoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(check_Lugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check_Personagem)
                        .addGap(16, 16, 16)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_TermoLayout.setVerticalGroup(
            panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TermoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nome)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Descricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_TermoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_Termo)
                    .addComponent(check_Lugar)
                    .addComponent(check_Personagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Obra.setBorder(javax.swing.BorderFactory.createTitledBorder("Obra"));

        lb_Titulo.setText("Título");

        jLabel1.setText("Ano de Lançamento:");

        lb_Categoria.setText("Categoria:");

        bt_AdicionaObra.setText("Adicionar Obra");
        bt_AdicionaObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AdicionaObraActionPerformed(evt);
            }
        });

        bt_RemoveObra.setText("Remover Obra");
        bt_RemoveObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RemoveObraActionPerformed(evt);
            }
        });

        cb_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "FILME", "LIVRO", "SERIE", "DOCUMENTARIO", "JOGO" }));

        javax.swing.GroupLayout panel_ObraLayout = new javax.swing.GroupLayout(panel_Obra);
        panel_Obra.setLayout(panel_ObraLayout);
        panel_ObraLayout.setHorizontalGroup(
            panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ObraLayout.createSequentialGroup()
                        .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_Categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Ano)
                            .addComponent(tf_Titulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_ObraLayout.createSequentialGroup()
                        .addComponent(bt_AdicionaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(bt_RemoveObra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_ObraLayout.setVerticalGroup(
            panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Titulo)
                    .addComponent(tf_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Categoria)
                    .addComponent(cb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panel_ObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_AdicionaObra)
                    .addComponent(bt_RemoveObra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_SalvaTermo.setText("Salvar Termo");
        bt_SalvaTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvaTermoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ImportantesLayout = new javax.swing.GroupLayout(panel_Importantes);
        panel_Importantes.setLayout(panel_ImportantesLayout);
        panel_ImportantesLayout.setHorizontalGroup(
            panel_ImportantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImportantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ImportantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ImportantesLayout.createSequentialGroup()
                        .addGroup(panel_ImportantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_Obra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_Termo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ImportantesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_SalvaTermo)
                        .addGap(129, 129, 129))))
        );
        panel_ImportantesLayout.setVerticalGroup(
            panel_ImportantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImportantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Termo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Obra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(bt_SalvaTermo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Especifico.setBorder(javax.swing.BorderFactory.createTitledBorder("Preencher caso seja termo específico"));

        panel_Lugar.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar"));

        lb_Historia.setText("História:");

        ta_Historia.setColumns(20);
        ta_Historia.setRows(5);
        jScrollPane1.setViewportView(ta_Historia);

        javax.swing.GroupLayout panel_LugarLayout = new javax.swing.GroupLayout(panel_Lugar);
        panel_Lugar.setLayout(panel_LugarLayout);
        panel_LugarLayout.setHorizontalGroup(
            panel_LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LugarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_LugarLayout.setVerticalGroup(
            panel_LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LugarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Historia)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Personagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Personagem"));

        lb_Caracteristicas.setText("Características:");

        ta_Caracteristicas.setColumns(20);
        ta_Caracteristicas.setRows(5);
        jScrollPane2.setViewportView(ta_Caracteristicas);

        lb_Feitos.setText("Feitos:");

        ta_Feitos.setColumns(20);
        ta_Feitos.setRows(5);
        jScrollPane3.setViewportView(ta_Feitos);

        panel_Atores.setBorder(javax.swing.BorderFactory.createTitledBorder("Ator (Se o termo é personagem)"));

        bt_AdicionaAtor.setText("Adicionar Ator");
        bt_AdicionaAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AdicionaAtorActionPerformed(evt);
            }
        });

        lb_NomeAtor.setText("Nome:");

        bt_RemoveAtor.setText("Remover Ator");
        bt_RemoveAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RemoveAtorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_AtoresLayout = new javax.swing.GroupLayout(panel_Atores);
        panel_Atores.setLayout(panel_AtoresLayout);
        panel_AtoresLayout.setHorizontalGroup(
            panel_AtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AtoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_AtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_AtoresLayout.createSequentialGroup()
                        .addComponent(lb_NomeAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_NomeAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_AtoresLayout.createSequentialGroup()
                        .addComponent(bt_AdicionaAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_RemoveAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_AtoresLayout.setVerticalGroup(
            panel_AtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_AtoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_AtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_NomeAtor)
                    .addComponent(tf_NomeAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_AtoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_AdicionaAtor)
                    .addComponent(bt_RemoveAtor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_PersonagemLayout = new javax.swing.GroupLayout(panel_Personagem);
        panel_Personagem.setLayout(panel_PersonagemLayout);
        panel_PersonagemLayout.setHorizontalGroup(
            panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PersonagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Atores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_PersonagemLayout.createSequentialGroup()
                        .addGroup(panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Caracteristicas)
                            .addComponent(lb_Feitos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        panel_PersonagemLayout.setVerticalGroup(
            panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PersonagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Caracteristicas)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_PersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Feitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Atores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_EspecificoLayout = new javax.swing.GroupLayout(panel_Especifico);
        panel_Especifico.setLayout(panel_EspecificoLayout);
        panel_EspecificoLayout.setHorizontalGroup(
            panel_EspecificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EspecificoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_EspecificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Lugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Personagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panel_EspecificoLayout.setVerticalGroup(
            panel_EspecificoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EspecificoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Personagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Importantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Especifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Especifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Importantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Obra> obras = new ArrayList<>();
    private ArrayList<String> atores = new ArrayList<>();
    private Termo termo;
    
    public Termo getTermo(){
        return termo;
    }
    
    private Obra criarObra(){
        String titulo = tf_Titulo.getText();
        int ano;
        Categoria categoria;
        try{
            ano = Integer.parseInt(tf_Ano.getText());
            try{
            categoria = Categoria.valueOf(cb_Categoria.getSelectedItem().toString());
            Obra obra = new Obra(titulo, ano, categoria);
            return (obra);
            }
            catch(java.lang.IllegalArgumentException ex){
                JOptionPane.showMessageDialog(null, "Categoria deve ser selecionada");
            }
        }
        catch(java.lang.IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, "Ano deve ser um número inteiro. Obra não criada.");
        }
        return null;
    }
    
    private String criarAtor(){
        String ator;
        if(ta_Caracteristicas.getText()== null || ta_Caracteristicas.getText().isBlank()
                || ta_Feitos.getText()== null || ta_Feitos.getText().isBlank()){
            return null;
        }
        else{
            ator = tf_NomeAtor.getText();
        }
        return ator;
    }
    
    private void bt_AdicionaObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AdicionaObraActionPerformed
        Obra obra = criarObra();

        for(Obra obraTeste: obras){
            if(obra.getTitulo().equalsIgnoreCase(obraTeste.getTitulo()) && obra.getAnoLancamento() == obraTeste.getAnoLancamento()){
                JOptionPane.showMessageDialog(null, "Obra já existe. Não adicionada.");
                obra = null;
                break;
            }
        }
        
        if(obra != null){
            obras.add(obra);
            JOptionPane.showMessageDialog(null, "Obra adicionada.");
        }
        tf_Titulo.setText("");
        tf_Ano.setText("");
        cb_Categoria.setSelectedIndex(0);
    }//GEN-LAST:event_bt_AdicionaObraActionPerformed

    private void bt_RemoveObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RemoveObraActionPerformed
        Obra obra = criarObra();
        if(obra != null){
            obras.remove(obra);
            JOptionPane.showMessageDialog(null, "Obra removida.");
        }
        tf_Titulo.setText("");
        tf_Ano.setText("");
        cb_Categoria.setSelectedIndex(0);
    }//GEN-LAST:event_bt_RemoveObraActionPerformed

    private void bt_RemoveAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RemoveAtorActionPerformed
        String ator = criarAtor();
        if(ator != null){
            atores.remove(ator);
            JOptionPane.showMessageDialog(null, "Ator Removido");
            tf_NomeAtor.setText("");
        }
    }//GEN-LAST:event_bt_RemoveAtorActionPerformed

    private void bt_AdicionaAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AdicionaAtorActionPerformed
        String ator = criarAtor();
        if(ator != null){
            atores.add(ator);
            JOptionPane.showMessageDialog(null, "Ator Adicionado");
            tf_NomeAtor.setText("");            
        }
    }//GEN-LAST:event_bt_AdicionaAtorActionPerformed

    private void bt_SalvaTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvaTermoActionPerformed
        String nome = tf_Nome.getText();
        String descricao = tf_Descricao.getText();
        
        if(obras.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma obra adicionada. Deve possuir pelo menos uma.");
        }
        else{
                    
            if(check_Lugar.isSelected()){
                String historia = ta_Historia.getText();
                try{
                    termo = new Lugar(nome, descricao, historia);    
                    for(Obra o: obras){
                        termo.incluirObra(o);
                    }
                    JOptionPane.showMessageDialog(null, "Lugar Adicionado.");
                }catch(java.lang.IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, "Todos os campos de lugar devem ser adicionados."); 
                }
                finally{
                     check_Lugar.setSelected(false) ;
                    ta_Historia.setText("");
                    tf_Nome.setText("");
                    tf_Descricao.setText("");   
                    dispose();
                }
            }
            else { 
                if(check_Personagem.isSelected()){
                    String caracteristicas = ta_Caracteristicas.getText();
                    String feitos = ta_Feitos.getText();
                    if(atores.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum ator Adicionado. Deve possuir ao menos um.");                    
                    }
                    else{
                        try{
                            termo = new Personagem(nome, descricao, caracteristicas, feitos);
                            
                            for(String s: atores){
                                ((Personagem)termo).incluirAtores(s);
                            }
      
                            for(Obra o: obras){
                                termo.incluirObra(o);
                            }
                            JOptionPane.showMessageDialog(null, "Personagem Adicionado.");
                        }
                        catch(java.lang.IllegalArgumentException ex){
                            JOptionPane.showMessageDialog(null, "Todos os campos de personagem devem ser adicionados."); 
                        }
                        finally{
                            check_Personagem.setSelected(false) ;
                            ta_Caracteristicas.setText("");
                            ta_Feitos.setText("");
                            tf_Nome.setText("");
                            tf_Descricao.setText("");
                            dispose();
                        }                            
                    }
                }
                else{
                    try{
                        termo = new Termo(nome, descricao);      
                        for(Obra o: obras){
                            termo.incluirObra(o);
                        }
                        JOptionPane.showMessageDialog(null, "Termo comum adicionado.");                    
                        dispose();
                    }catch(java.lang.IllegalArgumentException ex){
                        JOptionPane.showMessageDialog(null, "Todos os campos de termo devem ser adicionados."); 
                    }
                    finally{
                        check_Termo.setSelected(false) ;
                        tf_Nome.setText("");
                        tf_Descricao.setText(""); 
                    }
                }
            }

        }
    }//GEN-LAST:event_bt_SalvaTermoActionPerformed

    
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
            java.util.logging.Logger.getLogger(TermoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TermoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TermoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TermoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TermoUI dialog = new TermoUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AdicionaAtor;
    private javax.swing.JButton bt_AdicionaObra;
    private javax.swing.JButton bt_RemoveAtor;
    private javax.swing.JButton bt_RemoveObra;
    private javax.swing.JButton bt_SalvaTermo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_Categoria;
    private javax.swing.JRadioButton check_Lugar;
    private javax.swing.JRadioButton check_Personagem;
    private javax.swing.JRadioButton check_Termo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_Caracteristicas;
    private javax.swing.JLabel lb_Categoria;
    private javax.swing.JLabel lb_Descricao;
    private javax.swing.JLabel lb_Feitos;
    private javax.swing.JLabel lb_Historia;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_NomeAtor;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JPanel panel_Atores;
    private javax.swing.JPanel panel_Especifico;
    private javax.swing.JPanel panel_Importantes;
    private javax.swing.JPanel panel_Lugar;
    private javax.swing.JPanel panel_Obra;
    private javax.swing.JPanel panel_Personagem;
    private javax.swing.JPanel panel_Termo;
    private javax.swing.JTextArea ta_Caracteristicas;
    private javax.swing.JTextArea ta_Feitos;
    private javax.swing.JTextArea ta_Historia;
    private javax.swing.JTextField tf_Ano;
    private javax.swing.JTextField tf_Descricao;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_NomeAtor;
    private javax.swing.JTextField tf_Titulo;
    // End of variables declaration//GEN-END:variables
}
