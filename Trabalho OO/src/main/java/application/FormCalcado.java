
package application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Calcado;
import repositorios.Estoque;


public class FormCalcado extends javax.swing.JFrame {
    private static Estoque calcados;
    private static int indice;
    public FormCalcado() {
        calcados = new Estoque();
        initComponents();
       
        this.cadastrar();
         CarregaTabela();
        this.desabilitarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCategoriaCalcado = new javax.swing.JLabel();
        jTextFieldCategoriaCalcado = new javax.swing.JTextField();
        jLabelPrecoCalcado = new javax.swing.JLabel();
        jTextFieldPrecoCalcado = new javax.swing.JTextField();
        jTextFieldTamanhoCalcado = new javax.swing.JTextField();
        jLabelTamanhoCalcado = new javax.swing.JLabel();
        jLabelModeloCalcado = new javax.swing.JLabel();
        jTextFieldModeloCalcado = new javax.swing.JTextField();
        jButtonSalvarCalcado = new javax.swing.JButton();
        jButtonCancelarCalcado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSairCalcado = new javax.swing.JButton();
        jLabelCorCalcado = new javax.swing.JLabel();
        jTextFieldCorCalcado = new javax.swing.JTextField();
        jLabelCodigoCalcado = new javax.swing.JLabel();
        jTextFieldCodigoDoProdutoCalcado = new javax.swing.JTextField();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCalcados = new javax.swing.JTable();
        jButtonNovoCalcado = new javax.swing.JButton();
        jButtonExcluirCalcado = new javax.swing.JButton();
        jButtonEditarCalcado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelQuantidadeCalcado = new javax.swing.JLabel();
        jTextFieldQuantidadeCalcado = new javax.swing.JTextField();
        jButtonRefreshCalcado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCategoriaCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCategoriaCalcado.setText("Categoria:");

        jTextFieldCategoriaCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaCalcadoActionPerformed(evt);
            }
        });

        jLabelPrecoCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPrecoCalcado.setText("Preço:");

        jTextFieldPrecoCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoCalcadoActionPerformed(evt);
            }
        });

        jLabelTamanhoCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTamanhoCalcado.setText("Tamanho:");

        jLabelModeloCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelModeloCalcado.setText("Modelo:");

        jTextFieldModeloCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloCalcadoActionPerformed(evt);
            }
        });

        jButtonSalvarCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSalvarCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarCalcado.setText("Salvar");
        jButtonSalvarCalcado.setBorder(null);
        jButtonSalvarCalcado.setBorderPainted(false);
        jButtonSalvarCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCalcadoActionPerformed(evt);
            }
        });

        jButtonCancelarCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCancelarCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCalcado.setText("Cancelar");
        jButtonCancelarCalcado.setBorder(null);
        jButtonCancelarCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCalcadoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

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

        jLabelCorCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCorCalcado.setText("Cor:");

        jTextFieldCorCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorCalcadoActionPerformed(evt);
            }
        });

        jLabelCodigoCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCodigoCalcado.setText("Código do produto:");

        jButtonLimparCampos.setBackground(new java.awt.Color(0, 153, 255));
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

        jTableCalcados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCalcados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCalcadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCalcados);
        if (jTableCalcados.getColumnModel().getColumnCount() > 0) {
            jTableCalcados.getColumnModel().getColumn(0).setResizable(false);
            jTableCalcados.getColumnModel().getColumn(1).setResizable(false);
            jTableCalcados.getColumnModel().getColumn(2).setResizable(false);
            jTableCalcados.getColumnModel().getColumn(3).setResizable(false);
            jTableCalcados.getColumnModel().getColumn(4).setResizable(false);
            jTableCalcados.getColumnModel().getColumn(5).setResizable(false);
        }

        jButtonNovoCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonNovoCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoCalcado.setText("Novo");
        jButtonNovoCalcado.setBorder(null);
        jButtonNovoCalcado.setBorderPainted(false);
        jButtonNovoCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCalcadoActionPerformed(evt);
            }
        });

        jButtonExcluirCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonExcluirCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirCalcado.setText("Excluir");
        jButtonExcluirCalcado.setBorder(null);
        jButtonExcluirCalcado.setBorderPainted(false);
        jButtonExcluirCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCalcadoActionPerformed(evt);
            }
        });

        jButtonEditarCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonEditarCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarCalcado.setText("Editar");
        jButtonEditarCalcado.setBorder(null);
        jButtonEditarCalcado.setBorderPainted(false);
        jButtonEditarCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCalcadoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

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

        jLabelQuantidadeCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQuantidadeCalcado.setText("Quantidade:");

        jButtonRefreshCalcado.setBackground(new java.awt.Color(0, 153, 255));
        jButtonRefreshCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRefreshCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefreshCalcado.setText("Refresh");
        jButtonRefreshCalcado.setBorder(null);
        jButtonRefreshCalcado.setBorderPainted(false);
        jButtonRefreshCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshCalcadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRefreshCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelarCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvarCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelModeloCalcado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelCategoriaCalcado)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldCategoriaCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelTamanhoCalcado)
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldTamanhoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldModeloCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCorCalcado)
                                                    .addComponent(jLabelPrecoCalcado))
                                                .addGap(81, 81, 81)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldCorCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldPrecoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCodigoCalcado)
                                                    .addComponent(jLabelQuantidadeCalcado))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldQuantidadeCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldCodigoDoProdutoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButtonEditarCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExcluirCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimparCampos)
                            .addComponent(jButtonRefreshCalcado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCategoriaCalcado)
                            .addComponent(jTextFieldCategoriaCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecoCalcado)
                            .addComponent(jTextFieldPrecoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTamanhoCalcado)
                            .addComponent(jTextFieldTamanhoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorCalcado)
                            .addComponent(jTextFieldCorCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelModeloCalcado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldModeloCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCodigoCalcado)
                                .addComponent(jTextFieldCodigoDoProdutoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidadeCalcado))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelarCalcado)
                            .addComponent(jButtonSalvarCalcado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExcluirCalcado)
                    .addComponent(jButtonEditarCalcado)
                    .addComponent(jButtonNovoCalcado))
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
    public ArrayList<Calcado> devolverEstoque(){
        return this.calcados.listar();
    }
    
    
    private void jButtonEditarCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCalcadoActionPerformed
       this.editar();
    }//GEN-LAST:event_jButtonEditarCalcadoActionPerformed
    private void editar(){
      this.habilitarFormulario();
      if (indice>=0 && indice<calcados.tamanho())
        {
            Calcado calcado = calcados.obter(indice);
            jTextFieldCategoriaCalcado.setText(calcado.getCategoria());
            jTextFieldCodigoDoProdutoCalcado.setText(calcado.getCodigoDoProduto());
            jTextFieldCorCalcado.setText(calcado.getCor());
            jTextFieldModeloCalcado.setText(calcado.getModelo());
            jTextFieldPrecoCalcado.setText(String.valueOf(calcado.getPreco()));    
            jTextFieldTamanhoCalcado.setText(String.valueOf(calcado.getTamanho()));
            jTextFieldQuantidadeCalcado.setText(String.valueOf(calcado.getQuantidade()));
           
    }
      this.excluir();  
    }
    private void jButtonExcluirCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCalcadoActionPerformed
     this.excluir();
     this.limparCampos();
     this.desabilitarFormulario();
    }//GEN-LAST:event_jButtonExcluirCalcadoActionPerformed
   
    public void excluir(){
         this.indice = jTableCalcados.getSelectedRow();
        if(indice>=0 && indice<calcados.tamanho()){
            calcados.remover(indice);
        }
        CarregaTabela();
        
        
    }
    public void CarregaTabela() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Categoria", "Tamanho", "Modelo", "Peço", "Cor", "Código","Quantidade"}, 0);

        for (int i = 0; i < calcados.tamanho(); i++) {
            Object linha[] = new Object[]{
                calcados.obter(i).getCategoria(),
                calcados.obter(i).getTamanho(),
                calcados.obter(i).getModelo(),
                calcados.obter(i).getPreco(),
                calcados.obter(i).getCor(),
                calcados.obter(i).getCodigoDoProduto(),
                calcados.obter(i).getQuantidade()};
        modelo.addRow(linha);

    }

    jTableCalcados.getColumnModel ()

    .getColumn(0);
    jTableCalcados.getColumnModel ()

    .getColumn(1);
    jTableCalcados.getColumnModel ()

    .getColumn(2);
    jTableCalcados.getColumnModel ()

    .getColumn(3);
    jTableCalcados.getColumnModel ()

    .getColumn(4);
    
     jTableCalcados.getColumnModel ()

    .getColumn(5);
    
    
    
    jTableCalcados.setModel (modelo);

}
    
    public void desabilitarFormulario(){
        this.jTextFieldCategoriaCalcado.setVisible(false);
        this.jTextFieldModeloCalcado.setVisible(false);
        this.jTextFieldCorCalcado.setVisible(false);
        this.jTextFieldPrecoCalcado.setVisible(false);
        this.jTextFieldCodigoDoProdutoCalcado.setVisible(false);
        this.jTextFieldTamanhoCalcado.setVisible(false);  
        this.jTextFieldQuantidadeCalcado.setVisible(false);
        this.jButtonSalvarCalcado.setVisible(false);
        this.jButtonCancelarCalcado.setVisible(false);
        this.jButtonLimparCampos.setVisible(false);
        this.jLabelCategoriaCalcado.setVisible(false);
        this.jLabelCodigoCalcado.setVisible(false);
        this.jLabelCorCalcado.setVisible(false);
        this.jLabelModeloCalcado.setVisible(false);
        this.jLabelPrecoCalcado.setVisible(false);
        this.jLabelTamanhoCalcado.setVisible(false);
        this.jLabelQuantidadeCalcado.setVisible(false);
    }
    
    public void habilitarFormulario(){
        this.jTextFieldCategoriaCalcado.setVisible(true);
        this.jTextFieldModeloCalcado.setVisible(true);
        this.jTextFieldCorCalcado.setVisible(true);
        this.jTextFieldPrecoCalcado.setVisible(true);
        this.jTextFieldCodigoDoProdutoCalcado.setVisible(true);
        this.jTextFieldTamanhoCalcado.setVisible(true);
        this.jTextFieldQuantidadeCalcado.setVisible(true);
        this.jButtonSalvarCalcado.setVisible(true);
        this.jButtonCancelarCalcado.setVisible(true);
        this.jButtonLimparCampos.setVisible(true);
        this.jLabelCategoriaCalcado.setVisible(true);
        this.jLabelCodigoCalcado.setVisible(true);
        this.jLabelCorCalcado.setVisible(true);
        this.jLabelModeloCalcado.setVisible(true);
        this.jLabelPrecoCalcado.setVisible(true);
        this.jLabelTamanhoCalcado.setVisible(true);
        this.jLabelQuantidadeCalcado.setVisible(true);
        
    }
    private void jButtonNovoCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCalcadoActionPerformed
         this.novo();
    }//GEN-LAST:event_jButtonNovoCalcadoActionPerformed
    private void novo(){
         this.habilitarFormulario();
    }
    public void limparCampos(){
        jTextFieldCategoriaCalcado.setText("");
        jTextFieldCodigoDoProdutoCalcado.setText("");
        jTextFieldCorCalcado.setText("");
        jTextFieldModeloCalcado.setText("");
        jTextFieldPrecoCalcado.setText("");
        jTextFieldTamanhoCalcado.setText("");
        jTextFieldQuantidadeCalcado.setText("");
    }
    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jTextFieldCorCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorCalcadoActionPerformed

    }//GEN-LAST:event_jTextFieldCorCalcadoActionPerformed

    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
        this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed
    private void sair(){
        this.desabilitarFormulario();
        this.setVisible(false);
    }
    private void jButtonCancelarCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCalcadoActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarCalcadoActionPerformed
    private void cancelar(){
        this.limparCampos();
        this.desabilitarFormulario();
    }
    private void jButtonSalvarCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCalcadoActionPerformed
        try{
             this.salvar();
        }
        catch(NumberFormatException numberFormatException){
             JOptionPane.showMessageDialog(null,"Input com formato inválido","ALEF SHOES", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_jButtonSalvarCalcadoActionPerformed
    private void salvar(){
        Calcado calcado = new Calcado();
        calcado.setCategoria(jTextFieldCategoriaCalcado.getText());
        calcado.setTamanho(Integer.parseInt(jTextFieldTamanhoCalcado.getText()));
        calcado.setModelo(jTextFieldModeloCalcado.getText());
        calcado.setPreco(Double.parseDouble(jTextFieldPrecoCalcado.getText()));
        calcado.setCor(jTextFieldCorCalcado.getText());
        calcado.setCodigoDoProduto(jTextFieldCodigoDoProdutoCalcado.getText());
        calcado.setQuantidade(Integer.parseInt(jTextFieldQuantidadeCalcado.getText()));
        calcados.cadastrar(calcado);
        this.desabilitarFormulario();
        this.CarregaTabela();
        this.limparCampos();
    }
    private void jTextFieldModeloCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloCalcadoActionPerformed

    }//GEN-LAST:event_jTextFieldModeloCalcadoActionPerformed

    private void jTextFieldPrecoCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoCalcadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoCalcadoActionPerformed

    private void jTextFieldCategoriaCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaCalcadoActionPerformed

    }//GEN-LAST:event_jTextFieldCategoriaCalcadoActionPerformed

    private void jTableCalcadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCalcadosMouseClicked
        //this.habilitarFormulario();
        this.indice = jTableCalcados.getSelectedRow();
        
    }//GEN-LAST:event_jTableCalcadosMouseClicked

    private void refresh(){
        this.CarregaTabela();
    }
    private void jButtonRefreshCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshCalcadoActionPerformed
      this.refresh();
    }//GEN-LAST:event_jButtonRefreshCalcadoActionPerformed
    
    private void cadastrar(){
        Calcado a = new Calcado();
        a.setCategoria("esporte");
        a.setTamanho(41);
        a.setModelo("Nike Mercurial");
        a.setPreco(200.50);
        a.setCor("Salmão");
        a.setCodigoDoProduto("1");
        a.setQuantidade(5);
        calcados.cadastrar(a);
        Calcado b = new Calcado();
        b.setCategoria("social");
        b.setTamanho(41);
        b.setModelo("Sapatênis do Kaká");
        b.setPreco(200.50);
        b.setCor("Creme");
        b.setCodigoDoProduto("2");
        b.setQuantidade(5);
        calcados.cadastrar(b);
        Calcado c = new Calcado();
        c.setCategoria("casual");
        c.setTamanho(41);
        c.setModelo("Adidas samba");
        c.setPreco(200.50);
        c.setCor("Branco couro");
        c.setCodigoDoProduto("3");
        c.setQuantidade(5);
        calcados.cadastrar(c);
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
            java.util.logging.Logger.getLogger(FormCalcado.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalcado.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCalcado;
    private javax.swing.JButton jButtonEditarCalcado;
    private javax.swing.JButton jButtonExcluirCalcado;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonNovoCalcado;
    private javax.swing.JButton jButtonRefreshCalcado;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JButton jButtonSalvarCalcado;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCategoriaCalcado;
    private javax.swing.JLabel jLabelCodigoCalcado;
    private javax.swing.JLabel jLabelCorCalcado;
    private javax.swing.JLabel jLabelModeloCalcado;
    private javax.swing.JLabel jLabelPrecoCalcado;
    private javax.swing.JLabel jLabelQuantidadeCalcado;
    private javax.swing.JLabel jLabelTamanhoCalcado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCalcados;
    private javax.swing.JTextField jTextFieldCategoriaCalcado;
    private javax.swing.JTextField jTextFieldCodigoDoProdutoCalcado;
    private javax.swing.JTextField jTextFieldCorCalcado;
    private javax.swing.JTextField jTextFieldModeloCalcado;
    private javax.swing.JTextField jTextFieldPrecoCalcado;
    private javax.swing.JTextField jTextFieldQuantidadeCalcado;
    private javax.swing.JTextField jTextFieldTamanhoCalcado;
    // End of variables declaration//GEN-END:variables
}
