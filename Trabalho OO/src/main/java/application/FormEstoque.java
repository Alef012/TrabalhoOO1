
package application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Calcado;


public class FormEstoque extends javax.swing.JFrame {
    
   private ArrayList<Calcado> calcados;
   private static int indice;
           
    public FormEstoque() {
        calcados = new ArrayList<Calcado>();
        this.setCalcados(calcados);
        initComponents();
        this.desabilitarFormulario();
    }

    public ArrayList<Calcado> devolverEstoque() {
        return calcados;
    }

    public void setCalcados(ArrayList<Calcado> calcados) {
        this.calcados = calcados;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelQuantidadeEstoque = new javax.swing.JLabel();
        jTextFieldQuantidadeEstoque = new javax.swing.JTextField();
        jButtonSalvarCalcado = new javax.swing.JButton();
        jButtonCancelarCalcado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSairCalcado = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCalcados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonRefreshEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelQuantidadeEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQuantidadeEstoque.setText("Quantidade:");

        jTextFieldQuantidadeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEstoqueActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSairCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonSairCalcado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                "Categoria", "Tamanho", "Modelo", "Preço", "Cor", "Código", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
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

        jButtonRefreshEstoque.setBackground(new java.awt.Color(0, 153, 255));
        jButtonRefreshEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRefreshEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRefreshEstoque.setText("Refresh");
        jButtonRefreshEstoque.setBorder(null);
        jButtonRefreshEstoque.setBorderPainted(false);
        jButtonRefreshEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelQuantidadeEstoque)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonCancelarCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSalvarCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonRefreshEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantidadeEstoque)
                            .addComponent(jTextFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvarCalcado)
                            .addComponent(jButtonCancelarCalcado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRefreshEstoque)
                        .addGap(22, 22, 22)))
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
    private void editar(){
     
    }

     public void excluir(){
         this.indice = jTableCalcados.getSelectedRow();
        if(indice>=0 && indice<calcados.size()){
            calcados.remove(indice);
        }
        CarregaTabela();
        
        
    }
      public void CarregaTabela() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Categoria", "Tamanho", "Modelo", "Peço", "Cor", "Código","Quantidade"}, 0);

        for (int i = 0; i < calcados.size(); i++) {
            Object linha[] = new Object[]{
                calcados.get(i).getCategoria(),
                calcados.get(i).getTamanho(),
                calcados.get(i).getModelo(),
                calcados.get(i).getPreco(),
                calcados.get(i).getCor(),
                calcados.get(i).getCodigoDoProduto(),
                calcados.get(i).getQuantidade()
            
            };
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

    jTableCalcados.getColumnModel ()
            
    .getColumn(6);   
    
    jTableCalcados.setModel (modelo);

}
    public void habilitarFormulario(){
        this.jTextFieldQuantidadeEstoque.setVisible(true);       
        this.jButtonSalvarCalcado.setVisible(true);
        this.jButtonCancelarCalcado.setVisible(true);
        this.jButtonLimparCampos.setVisible(true);
        this.jLabelQuantidadeEstoque.setVisible(true);
    }
    private void jTableCalcadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCalcadosMouseClicked

        this.indice = jTableCalcados.getSelectedRow();
         this.habilitarFormulario();
      if (indice>=0 && indice<calcados.size())
        {
            Calcado calcado = calcados.get(indice);
            jTextFieldQuantidadeEstoque.setText(String.valueOf(calcado.getQuantidade()));
           
    }
       
    }//GEN-LAST:event_jTableCalcadosMouseClicked
    public void limparCampos(){
        jTextFieldQuantidadeEstoque.setText("");
    }
    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed
 
     public void desabilitarFormulario(){
        this.jTextFieldQuantidadeEstoque.setVisible(false);       
        this.jButtonSalvarCalcado.setVisible(false);
        this.jButtonCancelarCalcado.setVisible(false);
        this.jButtonLimparCampos.setVisible(false);
        this.jLabelQuantidadeEstoque.setVisible(false);
    }
    
    private void sair(){
        this.desabilitarFormulario();
        this.setVisible(false);
    }
    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
        this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed
 private void cancelar(){
        this.limparCampos();
        this.desabilitarFormulario();
    }
    private void jButtonCancelarCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCalcadoActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarCalcadoActionPerformed
private void salvar(){
        Calcado calcado = calcados.get(indice);  
        calcado.setQuantidade(Integer.parseInt(jTextFieldQuantidadeEstoque.getText()));
        this.CarregaTabela();
         this.desabilitarFormulario();
        this.limparCampos();
    }  
    private void jButtonSalvarCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCalcadoActionPerformed
        this.salvar();
    }//GEN-LAST:event_jButtonSalvarCalcadoActionPerformed

    private void jTextFieldQuantidadeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEstoqueActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEstoqueActionPerformed

    private void jButtonRefreshEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshEstoqueActionPerformed
        this.CarregaTabela();
    }//GEN-LAST:event_jButtonRefreshEstoqueActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCalcado;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonRefreshEstoque;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JButton jButtonSalvarCalcado;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelQuantidadeEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCalcados;
    private javax.swing.JTextField jTextFieldQuantidadeEstoque;
    // End of variables declaration//GEN-END:variables
}
