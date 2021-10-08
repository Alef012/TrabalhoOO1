/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Cliente;

/**
 *
 * <p>
 * <b>Repositório de clientes</b> </p>
 * <p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class RepositorioDeClientes implements CRUD<Cliente>{
    
    private static ArrayList<Cliente> clientes;

    /**
     * Construtor da Classe
     */
    public RepositorioDeClientes() {
        this.clientes= new ArrayList<Cliente>();
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        RepositorioDeClientes.clientes = clientes;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }


    /**
     * Metodo pra adicionar um Cliente no repositório
     * @param cliente
     * @return True
     */
    @Override
    public boolean cadastrar(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }


    @Override
    public boolean editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");     
    }

    /**
     * Remove um cliente do repositório
     * @param cliente
     * @return
     */
    @Override
    public boolean remover(Cliente cliente) {
        clientes.remove(cliente);
        return true;
    }
    /**
     * Remove um cliente do repositório pelo index
     * @param index
     * @return
     */
    public boolean remover(int index){
        this.clientes.remove(index);
        return true;
    }

    /**
     * recupera um cliente pelo index
     * @param index
     * @return
     */
     public Cliente obter(int index){
        return this.clientes.get(index);
    }

    /**
     * retorna a o tamanho do arraylist
     * @return
     */
    public int tamanho(){
        return this.clientes.size();
    }

    /**
     * lista os clientes do repositório
     * @return clientes
     */
    @Override
    public ArrayList listar() {
        return this.clientes;
    }
    
}
