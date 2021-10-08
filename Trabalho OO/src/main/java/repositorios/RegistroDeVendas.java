/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import java.util.stream.Stream;
import models.*;

/**
 *
 * <p>
 * <b>Repositório de Vendas</b> </p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class RegistroDeVendas implements CRUD<Venda>{
    
    private ArrayList<Venda> vendas = new ArrayList<Venda>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private ArrayList<Calcado> calcados = new ArrayList<Calcado>();

    /**
     * Adiciona uma nova venda na lista
     * @param venda
     * @return True
     */
    @Override
    public boolean cadastrar(Venda venda) {
        vendas.add(venda);
        return true;
    }

    /**
     *
     * @param venda
     * @return
     */
    @Override
    public boolean editar(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove uma venda do repositório
     * @param venda
     * @return True
     */

    @Override
    public boolean remover(Venda venda) {
        vendas.remove(venda);
        return true;
    }

    /**
     * Remove uma venda do repositório
     * @param indice
     * @return True
     */
    
     public boolean remover(int indice) {
        vendas.remove(indice);
        return true;
    }

    /**
     * lista as Vendas registradas
     * @return lista de vendas
     */

    @Override
    public ArrayList listar() {
        return vendas; 
    }

    /**
     * Retorna o tamanho do arraylist de vendas
     * @return tamanho
     */
    public int tamanho(){
        return vendas.size();
    }

    /**
     * retorna a Venda selecionada
     * @param i
     * @return 
     */
    
    public Venda obter(int i){
        return vendas.get(i);
    }

    /**
     *
     * @return
     */
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    /**
     *
     * @param vendas
     */
    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     *
     * @param clientes
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    /**
     *
     * @param vendedores
     */
    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    /**
     *
     * @return
     */
    public ArrayList<Calcado> getCalcados() {
        return calcados;
    }

    /**
     *
     * @param calcados
     */
    public void setCalcados(ArrayList<Calcado> calcados) {
        this.calcados = calcados;
    }

    /**
     * Retorna nome do Cliente pelo cpf
     * @param cpf cpf do cliente
     * @return 
     */
     public String retornaNomeDoClientePeloCpf(String cpf){
      for(Cliente cliente : clientes){
          if(cliente.getCpf().equals(cpf)){
              return cliente.getNome();
          }
      }
      
      return null;
    }
    /**
     * Retorna nome do Vendedor pelo cpf
     * @param cpf do vendedor
     * @return vendedor
     */
     
      public String retornaNomeDoVendendorPeloCpf(String cpf){
      for(Vendedor vendedor : vendedores){
          if(vendedor.getCpf().equals(cpf)){
              return vendedor.getNome();
          }
      }
      
      return null;
    }

    /**
     * Retorna o modelo do calçado pelo código
     * @param codigo codigo do produto
     * @return modelo do calçado
     */
     public String retornaNomeDoCalcadoPeloCodigo(String codigo){
      for(Calcado calcado : calcados){
          if(calcado.getCodigoDoProduto().equals(codigo)){
              return calcado.getModelo();
          }
      }
      
      return null;
    }

    /**
     * retorna a posição do vendedor no repositório pelo cpf
      * @param cpf cpf do vendedor
     * @return posição do vendedor
     */
     
    public Integer posicaoVendedor(String cpf){
         for(Vendedor vendedor : vendedores){
          if(vendedor.getCpf().equals(cpf)){
              return vendedores.indexOf(vendedor);
          }
      }
        return null;
    }

    /**
     * Retorna a posição do cliente pelo cpf
     * @param cpf do vendedor
     * @return posição cliente
     */
    
    public Integer posicaoCliente(String cpf){
         for(Cliente cliente : clientes){
          if(cliente.getCpf().equals(cpf)){
              return vendedores.indexOf(cliente);
          }
      }
        return null;
    }

    /**
     * Retorna a posição do calçado pelo codigo
     * @param codigo do calçado
     * @return posição calçado
     */
    
    public Integer posicaoCalcado(String codigo){
         for(Calcado calcado : calcados){
          if(calcado.getCodigoDoProduto().equals(codigo)){
              return calcados.indexOf(calcado);
          }
      }
      
      return null;
        
    }

    /**
     * recupera o vendedor pelo posição
     * @param indice posição
     * @return vendedor 
     */
    
    public Vendedor retornaVendedor(int indice){
        return this.vendedores.get(indice);
    }

    /**
     * recupera a o calçado pelo indice
     * @param indice posição
     * @return calçado
     */
    
    public Calcado retornaCalcado(int indice){
        return this.calcados.get(indice);
    }

    /**
     * retorna cliente pelo indice
     * @param indice posição
     * @return cliente
     */
    
    public Cliente retornaCliente(int indice){
        return this.clientes.get(indice);
    }

    /**
     * toString da classe
     * @return string
     */
    @Override
    public String toString() {
        return "RegistroDeVendas{" + "vendas=" + vendas + ", clientes=" + clientes + ", vendedores=" + vendedores + ", calcados=" + calcados + '}';
    }
    
    
    
}
