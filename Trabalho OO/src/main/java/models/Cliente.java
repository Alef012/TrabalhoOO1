/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * <p>
 * Classe <b>Cliente </b> </p>
 * <p>
 * Define a estrutura de um Cliente na Aplicação</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */

public class Cliente extends Pessoa {
    
    private int numeroDeCompras;

    /**
     * Construtor sobrecarregado da classe <b>Pessoa</b> <br> <br>
     * @param numeroDeCompras faz referência ao numrro de compras do Cliente
     * @param nome faz referência ao nome da pessoa.
     * @param cpf faz referência ao cpf da pessoa.
     * @param rg faz referência ao rg da pessoa.
     * @param dataNasc faz referência a data de nascimento da pessoa
     */

    public Cliente(int numeroDeCompras, String nome, String cpf, String rg, String dataNasc) {
        super(nome, cpf, rg, dataNasc);
        this.numeroDeCompras = numeroDeCompras;
    }

    public Cliente(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }
    /**
     * Construtor default da classe  <b>Cliente</b> <br><br>
     *
     * */

    public Cliente() {
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }
    /**
     * HashCode da classe Cliente
     *
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numeroDeCompras;
        return hash;
    }
    /**
     * Método equals da classe Cliente.
     * @return boolean
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
        final Cliente other = (Cliente) obj;
        if (this.numeroDeCompras != other.numeroDeCompras) {
            return false;
        }
        return true;
    }
    /**
     * toString da classe Cliente.
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente\n"
                + "Nome: " + this.getNome()+"\n"
                + "CPF: "+ this.getCpf()+"\n"
                + "RG: "+ this.getRg()+"\n"
                ;
    }
    
   
    
}
