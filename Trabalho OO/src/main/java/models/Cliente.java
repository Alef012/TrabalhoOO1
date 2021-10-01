/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Cliente extends Pessoa {
    
    private int numeroDeCompras;

    public Cliente(int numeroDeCompras, String nome, String cpf, String rg, String dataNasc) {
        super(nome, cpf, rg, dataNasc);
        this.numeroDeCompras = numeroDeCompras;
    }

    public Cliente(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }

    public Cliente() {
    }

   
    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numeroDeCompras;
        return hash;
    }

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

    @Override
    public String toString() {
        return "Cliente\n"
                + "Nome: " + this.getNome()+"\n"
                + "CPF: "+ this.getCpf()+"\n"
                + "RG: "+ this.getRg()+"\n"
                ;
    }
    
    
    
}
