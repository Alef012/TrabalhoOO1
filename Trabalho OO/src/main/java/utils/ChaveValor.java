/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 * Objeto chave valor para auxiliar nos cálculos dos relatórios, como calçado mais vendido, vendedor que mais vendeu e cliente que mais comprou
 * @author Felipe Alef
 * @since outubro 2021
 * @version 1.0
 */
public class ChaveValor {
    
    
    private String chave;
    private double valor;

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * toString do chaveValor
     * @return String
     */

    @Override
    public String toString() {
        return "ChaveValor{" + "chave=" + chave + ", valor=" + valor + '}';
    }

    public ChaveValor() {
        this.valor=0;
    }
    
    
    
    
}
