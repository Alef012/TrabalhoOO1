/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Objects;

/**
 *
 * <p>
 * Classe <b>Calcado </b> </p>
 * <p>
 * Define a estrutura de um Calçado na Aplicação</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */

public class Calcado {
    private String categoria;
    private int tamanho;
    private String modelo;
    private double preco;
    private String cor;
    private String codigoDoProduto;
    private int quantidade;

    /**
     * Construtor default da classe  <b>Calcado</b> <br><br>
     *
     * */

    public Calcado() {
    
    }
        /**
         * Construtor sobrecarregado da classe <b>Calcado</b> <br> <br>
         * <b>uso:</b><br>
         * Calcado calcado = new Calcado ("categoria","tamanho", modelo","preco", "cor", codigoDoProduto);<br> <br>
         * <b>onde:</b> <br>
         *
         * @param categoria faz referência a categoria do calçado.
         * @param tamanho faz referência ao tamanho do calçado.
         * @param modelo faz referênica ao modelo do calçado.
         * @param preco faz referência ao preço do calçado.
         * @param cor faz referência a cor do calçado.
         * @param codigoDoProduto faz referência ao codigo do calçado;
         */

    public Calcado(String categoria, int tamanho, String modelo, double preco, String cor, String codigoDoProduto) {
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;
        this.codigoDoProduto = codigoDoProduto;
        
    }

        public String getCategoria() {
        return categoria;
    }



    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(String codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /**
     * HashCode da classe Calcado
     *
     */
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
        /**
         * Método equals da classe Calcado.
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
        final Calcado other = (Calcado) obj;
        if (this.tamanho != other.tamanho) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.codigoDoProduto, other.codigoDoProduto)) {
            return false;
        }
        return true;
    }

        /**
         * toString da classe Calcado
         * @return String
         */

    @Override
    public String toString() {
        return "Calcado" +
                "\nCategoria: " + categoria + 
                "\nTamanho: " + tamanho + 
                "\nModelo: " + modelo + 
                "\nPreço: " + preco + " R$"+
                "\nCor: " + cor + 
                "\nCodigoDoProduto: " + codigoDoProduto 
                +"\nQuantidade: " + quantidade
                ;
    }
    
    
}
