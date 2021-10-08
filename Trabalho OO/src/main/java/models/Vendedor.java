/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * <p>
 * Classe <b>Vendedor </b> </p>
 * <p>
 * Define a estrutura de um Vendedor na Aplicação</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class Vendedor extends Pessoa{
    
    private int numeroDeVendas;
    private String codigoVendedor;
    /**
     * Construtor default da classe  <b>Vendedor</b> <br><br>
     *
     * */
    public Vendedor() {
    }

    /**
     * Construtor sobrecarregado da classe <b>Vendedor</b> 
     * @param numeroDeVendas numero de vendas do vendedor   
     * @param codigoVendedor codigo do vendedor
     * @param nome nome do vendedor
     * @param cpf cpf do vendedor
     * @param rg rg do vendedor
     * @param dataNasc data de nascimento do vendedor
     */
    public Vendedor(int numeroDeVendas, String codigoVendedor, String nome, String cpf, String rg, String dataNasc) {
        super(nome, cpf, rg, dataNasc);
        this.numeroDeVendas = numeroDeVendas;
        this.codigoVendedor = codigoVendedor;
    }

    /**
     * Construutor sobrecarregado da classe <b>Vendedor</b>
     * @param numeroDeVendas
     * @param codigoVendedor
     */
    public Vendedor(int numeroDeVendas, String codigoVendedor) {
        this.numeroDeVendas = numeroDeVendas;
        this.codigoVendedor = codigoVendedor;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    /**
     * hashCode da classe Vendedor
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numeroDeVendas;
        hash = 71 * hash + Objects.hashCode(this.codigoVendedor);
        return hash;
    }

    /**
     * Método equals da classe Vendedor
     * @param obj
     * @return True or False
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.numeroDeVendas != other.numeroDeVendas) {
            return false;
        }
        if (!Objects.equals(this.codigoVendedor, other.codigoVendedor)) {
            return false;
        }
        return true;
    }

    /**
     *
     * toString da classe Vendedor
     * @return String
     */

    @Override
    public String toString() {
        return 
                "Vendedor\n" +  "CodigoVendedor=" + codigoVendedor +"\nNome: " + this.getNome()+"\n"
                + "CPF: "+ this.getCpf()+"\n"
                + "RG: "+ this.getRg()+"\n";
    }
   
   
    
}
