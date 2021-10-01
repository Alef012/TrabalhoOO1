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
 * @author USER
 */
public class RegistroDeVendas implements CRUD<Venda>{
    
    private ArrayList<Venda> vendas = new ArrayList<Venda>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private ArrayList<Calcado> calcados = new ArrayList<Calcado>();

    @Override
    public boolean cadastrar(Venda venda) {
        vendas.add(venda);
        return true;
    }

    @Override
    public boolean editar(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remover(Venda venda) {
        vendas.remove(venda);
        return true;
    }
    
     public boolean remover(int indice) {
        vendas.remove(indice);
        return true;
    }
    

    @Override
    public ArrayList listar() {
        return vendas; 
    }
    
    public int tamanho(){
        return vendas.size();
    }
    
    public Venda obter(int i){
        return vendas.get(i);
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Calcado> getCalcados() {
        return calcados;
    }

    public void setCalcados(ArrayList<Calcado> calcados) {
        this.calcados = calcados;
    }
    
     public String retornaNomeDoClientePeloCpf(String cpf){
      for(Cliente cliente : clientes){
          if(cliente.getCpf().equals(cpf)){
              return cliente.getNome();
          }
      }
      
      return null;
    }  
     
      public String retornaNomeDoVendendorPeloCpf(String cpf){
      for(Vendedor vendedor : vendedores){
          if(vendedor.getCpf().equals(cpf)){
              return vendedor.getNome();
          }
      }
      
      return null;
    }  
     
     public String retornaNomeDoCalcadoPeloCodigo(String codigo){
      for(Calcado calcado : calcados){
          if(calcado.getCodigoDoProduto().equals(codigo)){
              return calcado.getModelo();
          }
      }
      
      return null;
    }  
     
     
    public Integer posicaoVendedor(String cpf){
         for(Vendedor vendedor : vendedores){
          if(vendedor.getCpf().equals(cpf)){
              return vendedores.indexOf(vendedor);
          }
      }
        return null;
    }
    
    
    public Integer posicaoCliente(String cpf){
         for(Cliente cliente : clientes){
          if(cliente.getCpf().equals(cpf)){
              return vendedores.indexOf(cliente);
          }
      }
        return null;
    }
    
    public Integer posicaoCalcado(String codigo){
         for(Calcado calcado : calcados){
          if(calcado.getCodigoDoProduto().equals(codigo)){
              return calcados.indexOf(calcado);
          }
      }
      
      return null;
        
    }
    
    public Vendedor retornaVendedor(int indice){
        return this.vendedores.get(indice);
    }
    
    public Calcado retornaCalcado(int indice){
        return this.calcados.get(indice);
    }
    
    public Cliente retornaCliente(int indice){
        return this.clientes.get(indice);
    }
    
    
}
