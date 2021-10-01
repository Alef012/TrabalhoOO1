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
 * @author USER
 */
public class RepositorioDeClientes implements CRUD<Cliente>{
    
    private static ArrayList<Cliente> clientes;

    public RepositorioDeClientes() {
        this.clientes= new ArrayList<Cliente>();
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        RepositorioDeClientes.clientes = clientes;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    

    @Override
    public boolean cadastrar(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");     
    }

    @Override
    public boolean remover(Cliente cliente) {
        clientes.remove(cliente);
        return true;
    }
    public boolean remover(int index){
        this.clientes.remove(index);
        return true;
    }
    
     public Cliente obter(int index){
        return this.clientes.get(index);
    }
     
    public int tamanho(){
        return this.clientes.size();
    }
    @Override
    public ArrayList listar() {
        return this.clientes;
    }
    
}
