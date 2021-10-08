/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Calcado;
import models.Venda;
import repositorios.RegistroDeVendas;
import utils.ChaveValor;
/**
 *
 * <p>
 * <b>Relatório</b> </p>
 * <p>
 * Tela que apresenta o Relatório de vendas</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class Relatorio extends javax.swing.JFrame {
    
   private RegistroDeVendas registroDeVendas = new RegistroDeVendas(); 

    public RegistroDeVendas getRegistroDeVendas() {
        return registroDeVendas;
    }

    public void setRegistroDeVendas(RegistroDeVendas registroDeVendas) {
        this.registroDeVendas = registroDeVendas;
    }
    
    
    
    
     
    /**
     * Construtor da classe
     */
    public Relatorio() {
        initComponents();
  
    }
    
    
    
   
    

    /**
     * Geração do swing da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonSairCalcado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldVendedorComVendaMaisCara = new javax.swing.JTextField();
        jTextFieldPrecoMedio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldVendaMaisCara = new javax.swing.JTextField();
        jTextFieldModeloMaisVendido = new javax.swing.JTextField();
        jTextFieldModeloMaisRentavel = new javax.swing.JTextField();
        jTextFieldVendendorQueMaisVendeu = new javax.swing.JTextField();
        jTextFieldVendedorMaisRentavel = new javax.swing.JTextField();
        jTextFieldClienteQueMaisComprou = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSairCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonSairCalcado)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Modelo mais vendido:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Modelo mais rentável:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Preço médio dos calçados:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Vendedor que mais vendeu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Vendedor com a venda mais cara:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Vendedor mais rentável:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Record de venda mais cara:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cliente que mais comprou:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("      RELATÓRIO");

        jTextFieldVendedorComVendaMaisCara.setEditable(false);

        jTextFieldPrecoMedio.setEditable(false);

        jButton1.setBackground(new java.awt.Color(0, 153, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldVendaMaisCara.setEditable(false);

        jTextFieldModeloMaisVendido.setEditable(false);

        jTextFieldModeloMaisRentavel.setEditable(false);

        jTextFieldVendendorQueMaisVendeu.setEditable(false);

        jTextFieldVendedorMaisRentavel.setEditable(false);
        jTextFieldVendedorMaisRentavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVendedorMaisRentavelActionPerformed(evt);
            }
        });

        jTextFieldClienteQueMaisComprou.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*Em caso de empate, uma lista de objetos será retornada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldClienteQueMaisComprou)
                    .addComponent(jTextFieldVendedorMaisRentavel)
                    .addComponent(jTextFieldVendendorQueMaisVendeu)
                    .addComponent(jTextFieldModeloMaisRentavel)
                    .addComponent(jTextFieldPrecoMedio)
                    .addComponent(jTextFieldVendedorComVendaMaisCara)
                    .addComponent(jTextFieldModeloMaisVendido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldVendaMaisCara, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVendedorComVendaMaisCara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModeloMaisRentavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrecoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVendendorQueMaisVendeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModeloMaisVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVendedorMaisRentavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVendaMaisCara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClienteQueMaisComprou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
    this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed
    /**
     * função para fechar a tela
     */
    private void sair(){
        
        this.setVisible(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.vendaMaisCara();
     this.precoMedio();
     this.modeloMaisVendido();
     this.vendedorComAvendaMaisCara();
     this.modeloMaisRentavel();
     this.vendedorQueMaisVendeu();
     this.vendedorMaisRentavel();
     this.clienteQueMaisComprou();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldVendedorMaisRentavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVendedorMaisRentavelActionPerformed
       
    }//GEN-LAST:event_jTextFieldVendedorMaisRentavelActionPerformed
    /**
     * Função que da set no modelo de calçado que mais rendeu dinheiro
     * (1)coloca os modelos de calçado em um arraylist chave
     * (2)soma os valores que cada modelo vendeu na mesma posição de sua chave
     * (3)compara qual dos modelos rendeu mais e pega a posição
     * (4)Faz um StringBuilder que pega mais de um modelo se estiverem empatados com o maior valor
     */
    private void modeloMaisRentavel(){
       ArrayList<ChaveValor> chaves = new ArrayList<ChaveValor>();
       double maior=0;
       for(int i=0;i<registroDeVendas.getCalcados().size();i++){
           ChaveValor chaveValor = new ChaveValor();
           chaveValor.setChave(registroDeVendas.getCalcados().get(i).getModelo());
           chaveValor.setValor(0);
           chaves.add(chaveValor);
       }
      
       
       for(int i=0;i<chaves.size();i++){
           for(int j=0;j<registroDeVendas.getVendas().size();j++){
               if(chaves.get(i).getChave().equals(registroDeVendas.getVendas().get(j).getCalcado().getModelo())){
                   chaves.get(i).setValor(chaves.get(i).getValor()+registroDeVendas.getVendas().get(j).getValor());
               }
           }
       }
       
       int pos=-1;
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()>maior){
               maior =chaves.get(i).getValor();
               pos=i;
           }
       }
       
      
       
       StringBuilder stringBuilder = new StringBuilder();
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()== maior){
               stringBuilder.append(registroDeVendas.getCalcados().get(i).getModelo()).
                       append(" , ");
               
           }
       }
       
       this.jTextFieldModeloMaisRentavel.setText(stringBuilder.toString());
    }
    /**
     * Função que compara qual modelo foi a venda mais cara
     */
    private void vendaMaisCara(){
      DoubleSummaryStatistics sumario = registroDeVendas.getVendas().stream().collect(Collectors.summarizingDouble(Venda :: getValor));
      this.jTextFieldVendaMaisCara.setText(String.valueOf(sumario.getMax()+" R$"));
    }
    /**
     * Função que escreve o vendedor com a venda mais cara
     */
    private void vendedorComAvendaMaisCara(){
         DoubleSummaryStatistics sumario = registroDeVendas.getVendas().stream().collect(Collectors.summarizingDouble(Venda :: getValor));
         double alvo = sumario.getMax();
         StringBuilder stringBuilder = new StringBuilder();
         for(int i=0;i< registroDeVendas.getVendas().size();i++){
             if(registroDeVendas.getVendas().get(i).getValor()==alvo){ 
                  stringBuilder.append(registroDeVendas.getVendas().get(i).getVendedor().getNome()).append(", ");
             }
         }
         
         this.jTextFieldVendedorComVendaMaisCara.setText(stringBuilder.toString());
    }
    /**
     * Função que escreve o preço Médio dos calçados
     */
    private void precoMedio(){
      DoubleSummaryStatistics sumario = registroDeVendas.getCalcados().stream().collect(Collectors.summarizingDouble(Calcado :: getPreco));
      this.jTextFieldPrecoMedio.setText(String.valueOf(sumario.getAverage()+" R$"));
    }
    /**
     * Utiliza o objeto chave-valor para calcular o modelo mais vendido
     */
    public void modeloMaisVendido(){
       ArrayList<ChaveValor> chaves = new ArrayList<ChaveValor>();
       double maior=0;
       for(int i=0;i<registroDeVendas.getCalcados().size();i++){
           ChaveValor chaveValor = new ChaveValor();
           chaveValor.setChave(registroDeVendas.getCalcados().get(i).getModelo());
           chaveValor.setValor(0);
           chaves.add(chaveValor);
       }
      
       
       for(int i=0;i<chaves.size();i++){
           for(int j=0;j<registroDeVendas.getVendas().size();j++){
               if(chaves.get(i).getChave().equals(registroDeVendas.getVendas().get(j).getCalcado().getModelo())){
                   chaves.get(i).setValor(chaves.get(i).getValor()+registroDeVendas.getVendas().get(j).getQuantidadeVendida());
               }
           }
       }
       
       int pos=-1;
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()>maior){
               maior =chaves.get(i).getValor();
               pos=i;
           }
       }
       
      
       
       StringBuilder stringBuilder = new StringBuilder();
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()== maior){
               stringBuilder.append(registroDeVendas.getCalcados().get(i).getModelo()).
                       append(" , ");
               
           }
       }
       
       this.jTextFieldModeloMaisVendido.setText(stringBuilder.toString());
       
       
   }
    /**
     * Utiliza o objeto chave-valor para calcular o cliente que mais comprou
     */
    private void clienteQueMaisComprou(){
        ArrayList<ChaveValor> chaves = new ArrayList<ChaveValor>();
       double maior=0;
       for(int i=0;i<registroDeVendas.getClientes().size();i++){
           ChaveValor chaveValor = new ChaveValor();
           chaveValor.setChave(registroDeVendas.getClientes().get(i).getCpf());
           chaveValor.setValor(0);
           chaves.add(chaveValor);
       }
      
       
       for(int i=0;i<chaves.size();i++){
           for(int j=0;j<registroDeVendas.getVendas().size();j++){
               if(chaves.get(i).getChave().equals(registroDeVendas.getVendas().get(j).getCliente().getCpf())){
                   chaves.get(i).setValor(chaves.get(i).getValor()+registroDeVendas.getVendas().get(j).getQuantidadeVendida());
               }
           }
       }
       
       int pos=-1;
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()>maior){
               maior =chaves.get(i).getValor();
               pos=i;
           }
       }
       
      
       
       StringBuilder stringBuilder = new StringBuilder();
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()== maior){
               stringBuilder.append(registroDeVendas.getClientes().get(i).getNome()).
                       append(" , ");
               
           }
       }
       
       this.jTextFieldClienteQueMaisComprou.setText(stringBuilder.toString());
    }
    /**
     * Utiliza o objeto chave-valor para calcular o vendedor que mais vendeu
     */
    private void vendedorQueMaisVendeu(){
       ArrayList<ChaveValor> chaves = new ArrayList<ChaveValor>();
       double maior=0;
       for(int i=0;i<registroDeVendas.getVendedores().size();i++){
           ChaveValor chaveValor = new ChaveValor();
           chaveValor.setChave(registroDeVendas.getVendedores().get(i).getCpf());
           chaveValor.setValor(0);
           chaves.add(chaveValor);
       }
      
       
       for(int i=0;i<chaves.size();i++){
           for(int j=0;j<registroDeVendas.getVendas().size();j++){
               if(chaves.get(i).getChave().equals(registroDeVendas.getVendas().get(j).getVendedor().getCpf())){
                   chaves.get(i).setValor(chaves.get(i).getValor()+registroDeVendas.getVendas().get(j).getQuantidadeVendida());
               }
           }
       }
       
       int pos=-1;
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()>maior){
               maior =chaves.get(i).getValor();
               pos=i;
           }
       }
       
      
       
       StringBuilder stringBuilder = new StringBuilder();
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()== maior){
               stringBuilder.append(registroDeVendas.getVendedores().get(i).getNome()).
                       append(" , ");
               
           }
       }
       
       this.jTextFieldVendendorQueMaisVendeu.setText(stringBuilder.toString());
        
    }
    /**
     * Utiliza o objeto chave-valor para calcular o vendedor que mais rendeu dinheiro
     */
    private void vendedorMaisRentavel(){
           ArrayList<ChaveValor> chaves = new ArrayList<ChaveValor>();
       double maior=0;
       for(int i=0;i<registroDeVendas.getVendedores().size();i++){
           ChaveValor chaveValor = new ChaveValor();
           chaveValor.setChave(registroDeVendas.getVendedores().get(i).getCpf());
           chaveValor.setValor(0);
           chaves.add(chaveValor);
       }
      
       
       for(int i=0;i<chaves.size();i++){
           for(int j=0;j<registroDeVendas.getVendas().size();j++){
               if(chaves.get(i).getChave().equals(registroDeVendas.getVendas().get(j).getVendedor().getCpf())){
                   chaves.get(i).setValor(chaves.get(i).getValor()+registroDeVendas.getVendas().get(j).getValor());
               }
           }
       }
       
       int pos=-1;
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()>maior){
               maior =chaves.get(i).getValor();
               pos=i;
           }
       }
       
      
       
       StringBuilder stringBuilder = new StringBuilder();
       
       for(int i=0;i<chaves.size();i++){
           if(chaves.get(i).getValor()== maior){
               stringBuilder.append(registroDeVendas.getVendedores().get(i).getNome()).
                       append(" , ");
               
           }
       }
       
       this.jTextFieldVendedorMaisRentavel.setText(stringBuilder.toString());
    }
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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldClienteQueMaisComprou;
    private javax.swing.JTextField jTextFieldModeloMaisRentavel;
    private javax.swing.JTextField jTextFieldModeloMaisVendido;
    private javax.swing.JTextField jTextFieldPrecoMedio;
    private javax.swing.JTextField jTextFieldVendaMaisCara;
    private javax.swing.JTextField jTextFieldVendedorComVendaMaisCara;
    private javax.swing.JTextField jTextFieldVendedorMaisRentavel;
    private javax.swing.JTextField jTextFieldVendendorQueMaisVendeu;
    // End of variables declaration//GEN-END:variables
}
