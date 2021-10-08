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
 * Classe abstrata<b>Pessoa </b> </p>
 * <p>
 * Define a estrutura de uma pessoa na Aplicação</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String dataNasc;
    /**
     * Construtor sobrecarregado da classe <b>Pessoa</b> <br> <br>
     *
     * @param nome faz referência ao nome da pessoa.
     * @param cpf faz referência ao cpf da pessoa.
     * @param rg faz referência ao rg da pessoa.
     * @param dataNasc faz referência a data de nascimento da pessoa
     */

    public Pessoa(String nome, String cpf, String rg, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }
    /**

     * Construtor default da classe  <b>Pessoa</b> <br><br>
     * <b> uso:</b> <br>
     * Acesso acesso = new Acesso();
     */
    public Pessoa() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * HashCode da classe Pessoa
     *
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * Método <b>equals</b> da classe Pessoa
     *
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
        return true;
    }

    /**
     * toString da classe Pessoa
     *
     */
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNasc=" + dataNasc + '}';
    }
    
    
}
