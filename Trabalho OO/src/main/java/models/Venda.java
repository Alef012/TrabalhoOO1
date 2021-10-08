/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exceptions.EstoqueEsgostadoException;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * <p>
 * Classe <b>Venda </b> </p>
 * <p>
 * Define a estrutura de uma Venda na Aplicação</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class Venda {
    private LocalDateTime dataHora;
    private  Vendedor vendedor;
    private  Cliente cliente;
    private  Calcado calcado;
    private int quantidadeVendida;
    private double valor;
    /**
     * Construtor default da classe  <b>Venda</b> <br><br>
     *
     * */
    public Venda() {
    }
    /**
     * Construtor sobrecarregado da classe <b>Venda</b> <br> <br>
     * <b>uso:</b><br>
     * @param dataHora data e hora da venda
     * @param vendedor vendedor que concluiu a venda
     * @param calcado calçado comprado na venda
     * @param cliente cliente que fez a compra
     * @param quantidade quantidade comprada
     *
     * */
    public Venda(LocalDateTime dataHora, Vendedor vendedor, Cliente cliente, Calcado calcado, int quantidade) {
        this.dataHora = dataHora;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.calcado = calcado;
        this.quantidadeVendida = quantidade;
    }

    
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calcado getCalcado() {
        return calcado;
    }

    public void setCalcado(Calcado calcado) {
        this.calcado = calcado;
    }
    
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida,int quantidadeEstoque) throws EstoqueEsgostadoException {
        if(quantidadeVendida>quantidadeEstoque){
           throw new EstoqueEsgostadoException();
        }
      
        this.quantidadeVendida = quantidadeVendida;
        this.valor= this.quantidadeVendida * this.getCalcado().getPreco();
    }

    public double getValor() {
        return valor;
    }

    /**
     * hashCode da classe Venda
     * @return hash
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dataHora);
        hash = 53 * hash + Objects.hashCode(this.vendedor);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + Objects.hashCode(this.calcado);
        hash = 53 * hash + this.quantidadeVendida;
        return hash;
    }

    /**
     * Método equals da classe Venda
     *
     *
     * @param obj
     * @return
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
        final Venda other = (Venda) obj;
        if (this.quantidadeVendida != other.quantidadeVendida) {
            return false;
        }
        if (!Objects.equals(this.dataHora, other.dataHora)) {
            return false;
        }
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.calcado, other.calcado)) {
            return false;
        }
        return true;
    }

    /**
     * Formata a data e a hora pra uma String mais legível
     *
     * @return String data e hora
     */
    public String getDataeHoraFormatada(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.dataHora.getDayOfMonth()).append("/").
                append(this.dataHora.getMonthValue()).
                append("/").
                append(this.dataHora.getYear()).
                append("   ").append(this.dataHora.getHour()).append(":").
                append(this.dataHora.getMinute());
        
        return stringBuilder.toString();
        
    }

    /**
     *
     * toString da classe Venda
     * @return
     */

    @Override
    public String toString() {
        return "Venda{" + "dataHora=" + dataHora + ", vendedor=" + vendedor + ", cliente=" + cliente + ", calcado=" + calcado + ", quantidadeVendida=" + quantidadeVendida + ", valor=" + valor + '}';
    }

    

  
   
    
    
}
