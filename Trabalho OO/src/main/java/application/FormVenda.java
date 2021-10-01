/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.*;
import repositorios.RegistroDeVendas;

/**
 *
 * @author USER
 */
public class FormVenda extends javax.swing.JFrame {

    /**
     * Creates new form FormVenda
     */
   
    private static RegistroDeVendas vendas;
    private static int indice=0;
    private static int contador;
    public FormVenda() {
        vendas = new RegistroDeVendas();
        initComponents();
        this.desabilitarFormulario();
        
        
    }

    public static RegistroDeVendas getVendas() {
        return vendas;
    }

    public void setVendas(RegistroDeVendas vendas) {
        FormVenda.vendas = vendas;
    }

   
    
    

    
    
     public void CarregaTabela() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Id", "Vendedor", "Cliente", "Produto", "Quantidade", "Preço","Data e Hora"}, 0);

        for (int i = 0; i < vendas.tamanho(); i++) {
            Object linha[] = new Object[]{
                i,
                vendas.obter(i).getVendedor().getNome(),
                vendas.obter(i).getCliente().getNome(),
                vendas.obter(i).getCalcado().getModelo(),
                vendas.obter(i).getCalcado().getQuantidade(),
                (vendas.obter(i).getCalcado().getPreco())*(vendas.obter(i).getQuantidade()),
                vendas.obter(i).getDataHora()
                
            
            };
        modelo.addRow(linha);
    }

    jTableVendas.getColumnModel ()

    .getColumn(0);
    jTableVendas.getColumnModel ()

    .getColumn(1);
    jTableVendas.getColumnModel ()

    .getColumn(2);
    jTableVendas.getColumnModel ()

    .getColumn(3);
    jTableVendas.getColumnModel ()

    .getColumn(4);
    jTableVendas.getColumnModel ()
            
    .getColumn(5);   

    jTableVendas.getColumnModel ()
            
    .getColumn(6);   
    
    jTableVendas.setModel (modelo);

}
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelQuantidadeVenda = new javax.swing.JLabel();
        jTextFieldClienteVenda = new javax.swing.JTextField();
        jLabelCalcadoVenda = new javax.swing.JLabel();
        jTextFieldCalcadoVenda = new javax.swing.JTextField();
        jButtonSalvarVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSairCalcado = new javax.swing.JButton();
        jLabelClienteVenda = new javax.swing.JLabel();
        jTextFieldQuantidadeVenda = new javax.swing.JTextField();
        jLabelVendedorVenda = new javax.swing.JLabel();
        jTextFieldVendendorVenda = new javax.swing.JTextField();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jButtonNovoVenda = new javax.swing.JButton();
        jButtonExcluirVenda = new javax.swing.JButton();
        jButtonEditarVenda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonRefreshVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelQuantidadeVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQuantidadeVenda.setText("Quantidade :");

        jTextFieldClienteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteVendaActionPerformed(evt);
            }
        });

        jLabelCalcadoVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCalcadoVenda.setText("Código de calçado:");

        jTextFieldCalcadoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalcadoVendaActionPerformed(evt);
            }
        });

        jButtonSalvarVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonSalvarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarVenda.setText("Salvar");
        jButtonSalvarVenda.setBorder(null);
        jButtonSalvarVenda.setBorderPainted(false);
        jButtonSalvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVendaActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonCancelarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarVenda.setText("Cancelar");
        jButtonCancelarVenda.setBorder(null);
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

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

        jLabelClienteVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelClienteVenda.setText("CPF do Cliente:");

        jTextFieldQuantidadeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeVendaActionPerformed(evt);
            }
        });

        jLabelVendedorVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVendedorVenda.setText("CPF do Vendedor :");

        jButtonLimparCampos.setBackground(new java.awt.Color(255, 51, 102));
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

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Vendedor", "Cliente", "Produto", "Quantidade", "Preço", "Data e Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendas);

        jButtonNovoVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonNovoVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoVenda.setText("Novo");
        jButtonNovoVenda.setBorder(null);
        jButtonNovoVenda.setBorderPainted(false);
        jButtonNovoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoVendaActionPerformed(evt);
            }
        });

        jButtonExcluirVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonExcluirVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirVenda.setText("Excluir");
        jButtonExcluirVenda.setBorder(null);
        jButtonExcluirVenda.setBorderPainted(false);
        jButtonExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirVendaActionPerformed(evt);
            }
        });

        jButtonEditarVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonEditarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarVenda.setText("Editar");
        jButtonEditarVenda.setBorder(null);
        jButtonEditarVenda.setBorderPainted(false);
        jButtonEditarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarVendaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 51, 102));

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

        jButtonRefreshVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonRefreshVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRefreshVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefreshVenda.setText("Refresh");
        jButtonRefreshVenda.setBorder(null);
        jButtonRefreshVenda.setBorderPainted(false);
        jButtonRefreshVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jTextFieldVendendorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendedorVenda)
                            .addComponent(jLabelCalcadoVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCalcadoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelClienteVenda)
                                    .addComponent(jLabelQuantidadeVenda))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jButtonEditarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButtonExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRefreshVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRefreshVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluirVenda)
                            .addComponent(jButtonEditarVenda)
                            .addComponent(jButtonNovoVenda))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonLimparCampos)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendedorVenda)
                            .addComponent(jTextFieldVendendorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelClienteVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidadeVenda)
                            .addComponent(jLabelCalcadoVenda)
                            .addComponent(jTextFieldCalcadoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvarVenda)
                            .addComponent(jButtonCancelarVenda))
                        .addGap(111, 209, Short.MAX_VALUE)))
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

    private void jTextFieldClienteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteVendaActionPerformed

    private void jTextFieldCalcadoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalcadoVendaActionPerformed

    }//GEN-LAST:event_jTextFieldCalcadoVendaActionPerformed

    private void jButtonSalvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVendaActionPerformed
        this.salvar();
    }//GEN-LAST:event_jButtonSalvarVendaActionPerformed

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
        this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed

    private void jTextFieldQuantidadeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeVendaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeVendaActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jTableVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasMouseClicked
      
     this.indice = jTableVendas.getSelectedRow();
    }//GEN-LAST:event_jTableVendasMouseClicked
private void salvar(){
        Venda venda = new Venda();  
        
        Vendedor vendedor = retornaVendedorPorCPF(jTextFieldVendendorVenda.getText());
        venda.setVendedor(vendedor);
        
        Calcado calcado = retornaCalcadoPorCodigo(jTextFieldCalcadoVenda.getText()); 
        venda.setCalcado(calcado);
        
        Cliente cliente = retornaClientePorCPF(jTextFieldClienteVenda.getText());
        venda.setCliente(cliente);
        
      
        venda.setDataHora(LocalDateTime.now());
        
        venda.setQuantidade(Integer.parseInt(jTextFieldQuantidadeVenda.getText()));
        vendas.cadastrar(venda);
        this.CarregaTabela();
         this.desabilitarFormulario();
        this.limparCampos();
    }  
    private void jButtonNovoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoVendaActionPerformed
        this.habilitarFormulario();
    }//GEN-LAST:event_jButtonNovoVendaActionPerformed
 public void excluir(){
         this.indice = jTableVendas.getSelectedRow();
        if(indice>=0 && indice<vendas.tamanho()){
            vendas.remover(indice);
        }
        CarregaTabela();
        
        
    }
    private void jButtonExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirVendaActionPerformed
        this.excluir();
        this.limparCampos();
        this.desabilitarFormulario();
    }//GEN-LAST:event_jButtonExcluirVendaActionPerformed
   private void editar(){
         this.habilitarFormulario();
      if (indice>=0 && indice<vendas.tamanho())
        {
            Venda venda = vendas.obter(indice);
            jTextFieldVendendorVenda.setText(venda.getVendedor().getCpf());
            jTextFieldClienteVenda.setText(venda.getCliente().getCpf());
            jTextFieldQuantidadeVenda.setText(String.valueOf(venda.getQuantidade()));
            jTextFieldCalcadoVenda.setText(venda.getCalcado().getCodigoDoProduto());
                     
    }
      this.excluir();  

   }
    private void jButtonEditarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarVendaActionPerformed
         this.editar();
    }//GEN-LAST:event_jButtonEditarVendaActionPerformed
    private void refresh(){
        if(contador==0){
           this.cadastrar();  
           contador++;
        }
       
        this.CarregaTabela();
    }
    private void jButtonRefreshVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshVendaActionPerformed
        this.refresh();
    }//GEN-LAST:event_jButtonRefreshVendaActionPerformed

    
    private Cliente retornaClientePorCPF(String cpf){
        for(int i=0;i<this.vendas.getClientes().size();i++){
            if(vendas.getClientes().get(i).getCpf().equals(cpf)){
                return vendas.getClientes().get(i);
            }
        }
        
        return null;
    }
    
    
     private Vendedor retornaVendedorPorCPF(String cpf){
        for(int i=0;i<this.vendas.getVendedores().size();i++){
            if(vendas.getVendedores().get(i).getCpf().equals(cpf)){
                return vendas.getVendedores().get(i);
            }
        }
        
        return null;
    }
     
     private Calcado retornaCalcadoPorCodigo(String codigo){
          for(int i=0;i<this.vendas.getCalcados().size();i++){
            if(vendas.getCalcados().get(i).getCodigoDoProduto().equals(codigo)){
                return vendas.getCalcados().get(i);
            }
        }
        
        return null;
     }
      public void desabilitarFormulario(){
        this.jTextFieldCalcadoVenda.setVisible(false);
        this.jTextFieldClienteVenda.setVisible(false);
        this.jTextFieldQuantidadeVenda.setVisible(false);
        this.jTextFieldVendendorVenda.setVisible(false);
        this.jButtonLimparCampos.setVisible(false);
        this.jButtonCancelarVenda.setVisible(false);
        this.jButtonSalvarVenda.setVisible(false);
        this.jLabelCalcadoVenda.setVisible(false);
        this.jLabelClienteVenda.setVisible(false);
        this.jLabelQuantidadeVenda.setVisible(false);
        this.jLabelVendedorVenda.setVisible(false);
    }
      
    public void habilitarFormulario(){
        this.jTextFieldCalcadoVenda.setVisible(true);
        this.jTextFieldClienteVenda.setVisible(true);
        this.jTextFieldQuantidadeVenda.setVisible(true);
        this.jTextFieldVendendorVenda.setVisible(true);
        this.jButtonLimparCampos.setVisible(true);
        this.jButtonCancelarVenda.setVisible(true);
        this.jButtonSalvarVenda.setVisible(true);
        this.jLabelCalcadoVenda.setVisible(true);
        this.jLabelClienteVenda.setVisible(true);
        this.jLabelQuantidadeVenda.setVisible(true);
        this.jLabelVendedorVenda.setVisible(true);
    }
      
    public void limparCampos(){
           this.jTextFieldCalcadoVenda.setText("");
        this.jTextFieldClienteVenda.setText("");
        this.jTextFieldQuantidadeVenda.setText("");
        this.jTextFieldVendendorVenda.setText("");
    }
    
     private void sair(){
        this.desabilitarFormulario();
        this.setVisible(false);
    }
     
    private void cancelar(){
        this.limparCampos();
        this.desabilitarFormulario();
    }
    /**
     * @param args the command line arguments
     */
    public void cadastrar(){
        Venda a = new Venda();
        a.setVendedor(this.retornaVendedorPorCPF("4"));
        a.setCalcado(this.retornaCalcadoPorCodigo("3"));
        a.setCliente(this.retornaClientePorCPF("1"));
        a.setDataHora(LocalDateTime.now());
        a.setQuantidade(1);
        vendas.cadastrar(a);
        Venda b = new Venda();
        b.setVendedor(this.retornaVendedorPorCPF("5"));
        b.setCalcado(this.retornaCalcadoPorCodigo("2"));
        b.setCliente(this.retornaClientePorCPF("2"));
        b.setDataHora(LocalDateTime.now());
        b.setQuantidade(1);
        vendas.cadastrar(b);
        Venda c = new Venda();
        c.setVendedor(this.retornaVendedorPorCPF("6"));
        c.setCalcado(this.retornaCalcadoPorCodigo("1"));
        c.setCliente(this.retornaClientePorCPF("3"));
        c.setDataHora(LocalDateTime.now());
        c.setQuantidade(1);
        vendas.cadastrar(c);
        
    }
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonEditarVenda;
    private javax.swing.JButton jButtonExcluirVenda;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonNovoVenda;
    private javax.swing.JButton jButtonRefreshVenda;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JButton jButtonSalvarVenda;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCalcadoVenda;
    private javax.swing.JLabel jLabelClienteVenda;
    private javax.swing.JLabel jLabelQuantidadeVenda;
    private javax.swing.JLabel jLabelVendedorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldCalcadoVenda;
    private javax.swing.JTextField jTextFieldClienteVenda;
    private javax.swing.JTextField jTextFieldQuantidadeVenda;
    private javax.swing.JTextField jTextFieldVendendorVenda;
    // End of variables declaration//GEN-END:variables
}
