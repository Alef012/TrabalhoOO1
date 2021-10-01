
package application;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Cliente;
import models.Pessoa;
import repositorios.RepositorioDeClientes;


public class FormCliente extends javax.swing.JFrame {
    private static RepositorioDeClientes clientes;
    private static int indice;
    public FormCliente() {
        clientes = new RepositorioDeClientes();
        initComponents();
        this.desabilitarFormulario();
        this.cadastrar();
        this.CarregaTabela();
    }
    public ArrayList<Cliente> devolverClientes(){
        return clientes.listar();
    }
    public void desabilitarFormulario(){
        this.jTextFieldNomeCliente.setVisible(false);
        this.jTextFieldCPFCliente.setVisible(false);
        this.jTextFieldRGCliente.setVisible(false);
        this.jTextFieldDataNascCliente.setVisible(false);
        this.jButtonLimparCampos.setVisible(false);
        this.jButtonCancelarCliente.setVisible(false);
        this.jButtonSalvarCliente.setVisible(false);
        this.jLabelCPFCliente.setVisible(false);
        this.jLabelDataNascCliente.setVisible(false);
        this.jLabelNomeCliente.setVisible(false);
        this.jLabelRGCliente.setVisible(false);
    }
    
    public void habilitarFormulario(){
        this.jTextFieldNomeCliente.setVisible(true);
        this.jTextFieldCPFCliente.setVisible(true);
        this.jTextFieldRGCliente.setVisible(true);
        this.jTextFieldDataNascCliente.setVisible(true);
        this.jButtonLimparCampos.setVisible(true);
        this.jButtonCancelarCliente.setVisible(true);
        this.jButtonSalvarCliente.setVisible(true);
        this.jLabelCPFCliente.setVisible(true);
        this.jLabelDataNascCliente.setVisible(true);
        this.jLabelNomeCliente.setVisible(true);
        this.jLabelRGCliente.setVisible(true);
    }
    private void novo(){
         this.habilitarFormulario();
    }
     public void limparCampos(){
        jTextFieldCPFCliente.setText("");
        jTextFieldDataNascCliente.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldRGCliente.setText("");
    }
    private void sair(){
        this.desabilitarFormulario();
        this.setVisible(false);
    }
    
    private void cancelar(){
        this.limparCampos();
        this.desabilitarFormulario();
    }
     private void salvar(){
        Cliente cliente = new Cliente();
        cliente.setCpf(jTextFieldCPFCliente.getText());
        cliente.setDataNasc(jTextFieldDataNascCliente.getText());
        cliente.setNome(jTextFieldNomeCliente.getText());
        cliente.setRg(jTextFieldRGCliente.getText());
        clientes.cadastrar(cliente);
        this.desabilitarFormulario();
        this.CarregaTabela();
        this.limparCampos();
    }
     
     public void CarregaTabela() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "CPF", "RG", "DataNasc"}, 0);

        for (int i = 0; i < clientes.tamanho(); i++) {
            Object linha[] = new Object[]{
                clientes.obter(i).getNome(),
                clientes.obter(i).getCpf(),
                clientes.obter(i).getRg(),
                clientes.obter(i).getDataNasc(),
                };
        modelo.addRow(linha);

    }

    jTableClientes.getColumnModel ()

    .getColumn(0);
    jTableClientes.getColumnModel ()

    .getColumn(1);
    jTableClientes.getColumnModel ()

    .getColumn(2);
    jTableClientes.getColumnModel ()

    .getColumn(3);
    jTableClientes.getColumnModel ();


    jTableClientes.setModel (modelo);

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabelDataNascCliente = new javax.swing.JLabel();
        jTextFieldDataNascCliente = new javax.swing.JTextField();
        jTextFieldCPFCliente = new javax.swing.JTextField();
        jLabelCPFCliente = new javax.swing.JLabel();
        jLabelRGCliente = new javax.swing.JLabel();
        jTextFieldRGCliente = new javax.swing.JTextField();
        jButtonSalvarCliente = new javax.swing.JButton();
        jButtonCancelarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSairCalcado = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonNovoCliente = new javax.swing.JButton();
        jButtonExcluirCliente = new javax.swing.JButton();
        jButtonEditarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeCliente.setText("Nome:");

        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });

        jLabelDataNascCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDataNascCliente.setText("Data de Nascimento:");

        jTextFieldDataNascCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNascClienteActionPerformed(evt);
            }
        });

        jLabelCPFCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPFCliente.setText("CPF:");

        jLabelRGCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRGCliente.setText("RG:");

        jTextFieldRGCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGClienteActionPerformed(evt);
            }
        });

        jButtonSalvarCliente.setBackground(new java.awt.Color(253, 153, 0));
        jButtonSalvarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarCliente.setText("Salvar");
        jButtonSalvarCliente.setBorder(null);
        jButtonSalvarCliente.setBorderPainted(false);
        jButtonSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarClienteActionPerformed(evt);
            }
        });

        jButtonCancelarCliente.setBackground(new java.awt.Color(253, 153, 0));
        jButtonCancelarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCliente.setText("Cancelar");
        jButtonCancelarCliente.setBorder(null);
        jButtonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarClienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(253, 153, 0));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alef Shoes");

        jButtonSairCalcado.setBackground(new java.awt.Color(255, 0, 51));
        jButtonSairCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSairCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSairCalcado.setText("X");
        jButtonSairCalcado.setBorder(null);
        jButtonSairCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCalcadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonSairCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonSairCalcado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jButtonLimparCampos.setBackground(new java.awt.Color(253, 153, 0));
        jButtonLimparCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.setBorder(null);
        jButtonLimparCampos.setBorderPainted(false);
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Tamanho", "Modelo", "Preço", "Cor", "Código"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jButtonNovoCliente.setBackground(new java.awt.Color(253, 153, 0));
        jButtonNovoCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoCliente.setText("Novo");
        jButtonNovoCliente.setBorder(null);
        jButtonNovoCliente.setBorderPainted(false);
        jButtonNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoClienteActionPerformed(evt);
            }
        });

        jButtonExcluirCliente.setBackground(new java.awt.Color(253, 153, 0));
        jButtonExcluirCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirCliente.setText("Excluir");
        jButtonExcluirCliente.setBorder(null);
        jButtonExcluirCliente.setBorderPainted(false);
        jButtonExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirClienteActionPerformed(evt);
            }
        });

        jButtonEditarCliente.setBackground(new java.awt.Color(253, 153, 0));
        jButtonEditarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarCliente.setText("Editar");
        jButtonEditarCliente.setBorder(null);
        jButtonEditarCliente.setBorderPainted(false);
        jButtonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClienteActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(253, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRGCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCPFCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRGCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelDataNascCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonLimparCampos)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNomeCliente)
                                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDataNascCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCPFCliente)
                                    .addComponent(jTextFieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRGCliente)
                                    .addComponent(jTextFieldRGCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonSalvarCliente)
                                    .addComponent(jButtonCancelarCliente)))
                            .addComponent(jTextFieldDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarCliente)
                    .addComponent(jButtonExcluirCliente)
                    .addComponent(jButtonNovoCliente))
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed

    private void jTextFieldDataNascClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNascClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNascClienteActionPerformed

    private void jTextFieldRGClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGClienteActionPerformed

    }//GEN-LAST:event_jTextFieldRGClienteActionPerformed

    private void jButtonSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarClienteActionPerformed
        this.salvar();
    }//GEN-LAST:event_jButtonSalvarClienteActionPerformed

    private void jButtonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarClienteActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarClienteActionPerformed

    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
        this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        //this.habilitarFormulario();
        this.indice = jTableClientes.getSelectedRow();

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoClienteActionPerformed
        this.novo();
    }//GEN-LAST:event_jButtonNovoClienteActionPerformed

    private void jButtonExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirClienteActionPerformed
        this.excluir();
        this.limparCampos();
        this.desabilitarFormulario();
    }//GEN-LAST:event_jButtonExcluirClienteActionPerformed
    public void excluir(){
         this.indice = jTableClientes.getSelectedRow();
        if(indice>=0 && indice<clientes.tamanho()){
            clientes.remover(indice);
        }
        CarregaTabela();
        
        
    }
     private void editar(){
      this.habilitarFormulario();
      if (indice>=0 && indice<clientes.tamanho())
        {
            Pessoa cliente = clientes.obter(indice);
            jTextFieldCPFCliente.setText(cliente.getCpf());
            jTextFieldDataNascCliente.setText(cliente.getDataNasc());
            jTextFieldRGCliente.setText(cliente.getRg());
            jTextFieldNomeCliente.setText(cliente.getNome());           
    }
      this.excluir();  
    }
    private void jButtonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClienteActionPerformed
        this.editar();
    }//GEN-LAST:event_jButtonEditarClienteActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }
    
  
    
    private void cadastrar(){
        
        Cliente a = new Cliente();
        a.setNome("Freddie Mercury");
        a.setCpf("1");
        a.setRg("1");
        a.setDataNasc("05/09/1946");
        clientes.cadastrar(a);
        Cliente b = new Cliente();
        b.setNome("John Lennon");
        b.setCpf("2");
        b.setRg("2");
        b.setDataNasc("09/10/1940");
        clientes.cadastrar(b);
        Cliente c = new Cliente();
        c.setNome("Paul McCartney");
        c.setCpf("3");
        c.setRg("3");
        c.setDataNasc("18/06/1942");
        clientes.cadastrar(c);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCliente;
    private javax.swing.JButton jButtonEditarCliente;
    private javax.swing.JButton jButtonExcluirCliente;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonNovoCliente;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCPFCliente;
    private javax.swing.JLabel jLabelDataNascCliente;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelRGCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCPFCliente;
    private javax.swing.JTextField jTextFieldDataNascCliente;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldRGCliente;
    // End of variables declaration//GEN-END:variables
}
