/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import exceptions.EstoqueEsgostadoException;
import models.Calcado;
import models.Cliente;
import models.Vendedor;
import repositorios.RegistroDeVendas;

/**
 *
 * <p>
 * <b>Home </b> </p>
 * <p>
 * Tela principal de Menu</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class Home extends javax.swing.JFrame {
private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
private static ArrayList<Calcado> calcados = new ArrayList<Calcado>();
private static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
private static RegistroDeVendas registroVendas = new RegistroDeVendas();
    
    public Home() {
        initComponents();
    }
  
  private static FormCalcado formCalcado = new FormCalcado();
  private static FormCliente formCliente = new FormCliente();
  private static FormVendedor formVendedor = new FormVendedor();
  private static Relatorio relatorio = new Relatorio();
  private static Buscas busca = new Buscas();
 
  private static FormVenda formVenda = new FormVenda();

    /**
     * código gerado pelo java swing para a interface
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCalcados = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonClientes = new javax.swing.JButton();
        jButtonGerarRelatorio = new javax.swing.JButton();
        jButtonVendedores = new javax.swing.JButton();
        buscas = new javax.swing.JButton();
        jButtonRegistrarVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Calçados\n"));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Calçado"));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Calçados"));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jButtonCalcados.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCalcados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCalcados.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcados.setText("Gerenciar Calçados");
        jButtonCalcados.setBorder(null);
        jButtonCalcados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcadosActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jButtonClientes.setBackground(new java.awt.Color(255, 153, 0));
        jButtonClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setText("Gerenciar Clientes");
        jButtonClientes.setBorder(null);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        jButtonGerarRelatorio.setBackground(new java.awt.Color(255, 153, 0));
        jButtonGerarRelatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGerarRelatorio.setText("Gerar relatório");
        jButtonGerarRelatorio.setBorder(null);
        jButtonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioActionPerformed(evt);
            }
        });

        jButtonVendedores.setBackground(new java.awt.Color(255, 51, 102));
        jButtonVendedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVendedores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVendedores.setText("Gerenciar Vendedores");
        jButtonVendedores.setBorder(null);
        jButtonVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendedoresActionPerformed(evt);
            }
        });

        buscas.setBackground(new java.awt.Color(0, 153, 255));
        buscas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscas.setForeground(new java.awt.Color(255, 255, 255));
        buscas.setText("Buscas");
        buscas.setBorder(null);
        buscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscasActionPerformed(evt);
            }
        });

        jButtonRegistrarVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonRegistrarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarVenda.setText("Registrar Venda");
        jButtonRegistrarVenda.setBorder(null);
        jButtonRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarVendaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\Alef\\src\\main\\java\\application\\felipao.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setText("   Alef Shoes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCalcados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(buscas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buscas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalcados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que direciona para a tela de cadastrar Calçados
     * @param evt
     */
    private void jButtonCalcadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcadosActionPerformed
        //formCalcado.limpar();
        formCalcado.setLocationRelativeTo(this);
        formCalcado.setVisible(true);
    }//GEN-LAST:event_jButtonCalcadosActionPerformed

    /**
     * Botão que direciona para a tela de cadastrar Clientes
     * @param evt
     */

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        formCliente.setLocationRelativeTo(this);
        formCliente.setVisible(true);

    }//GEN-LAST:event_jButtonClientesActionPerformed

    /**
     * Botão que direciona para a tela de Relatório
     * @param evt
     */

    private void jButtonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioActionPerformed
        this.atualizaBaseDeDados();
        if(formVenda.devolveRegistroDeVendas()!=null){
             relatorio.setRegistroDeVendas(formVenda.devolveRegistroDeVendas());
        }
        relatorio.setVisible(true);
       
    }//GEN-LAST:event_jButtonGerarRelatorioActionPerformed

    /**
     * Botão que abre a tela de cadastro de vendedores
     * @param evt
     */
    private void jButtonVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendedoresActionPerformed
        formVendedor.setLocationRelativeTo(this);
        formVendedor.setVisible(true);
    }//GEN-LAST:event_jButtonVendedoresActionPerformed

    /**
     * Botão que abre a tela de buscas
     * @param evt
     */
    private void buscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscasActionPerformed
        this.atualizaBaseDeDados();
        if(formVenda.devolveRegistroDeVendas()!=null){
             busca.setRegistroDeVendas(formVenda.devolveRegistroDeVendas());
        }
        busca.setVisible(true);
        
    }//GEN-LAST:event_buscasActionPerformed

    /**
     * Botão que abre a tela para registro de vendas
     * @param evt
     */

    private void jButtonRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarVendaActionPerformed
        this.atualizaBaseDeDados();
       /* registroVendas.setCalcados(formCalcado.devolverEstoque());
        registroVendas.setClientes(formCliente.devolverClientes());
        registroVendas.setVendedores(formVendedor.devolverVendedor());
        formVenda.setVendas(registroVendas);*/
        formVenda.setVisible(true);
       
        //formVenda.setVendas();
    }//GEN-LAST:event_jButtonRegistrarVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void exportarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
private void atualizaBaseDeDados(){
    registroVendas.setCalcados(formCalcado.devolverEstoque());
    registroVendas.setClientes(formCliente.devolverClientes());
    registroVendas.setVendedores(formVendedor.devolverVendedor());
    formVenda.setVendas(registroVendas);
    try {
        formVenda.refresh();
    } catch (EstoqueEsgostadoException estoqueEsgostadoException) {
        JOptionPane.showMessageDialog(null, "Estoque insuficiente", "ALEF SHOES", JOptionPane.WARNING_MESSAGE);
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscas;
    private javax.swing.JButton jButtonCalcados;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonGerarRelatorio;
    private javax.swing.JButton jButtonRegistrarVenda;
    private javax.swing.JButton jButtonVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
