/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Venda {
    private LocalDateTime dataHora;
    private  Vendedor vendedor;
    private  Cliente cliente;
    private  Calcado calcado;
    private int quantidade;

    public Venda() {
    }

    public Venda(LocalDateTime dataHora, Vendedor vendedor, Cliente cliente, Calcado calcado, int quantidade) {
        this.dataHora = dataHora;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.calcado = calcado;
        this.quantidade = quantidade;
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
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dataHora);
        hash = 53 * hash + Objects.hashCode(this.vendedor);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + Objects.hashCode(this.calcado);
        hash = 53 * hash + this.quantidade;
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
        final Venda other = (Venda) obj;
        if (this.quantidade != other.quantidade) {
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

    

  
   
    
    
}
