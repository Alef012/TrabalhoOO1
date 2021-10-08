
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Vendedor;
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

public class RepositorioDeVendedores implements CRUD<Vendedor>{
    
    private static ArrayList<Vendedor> vendedores;

    /**
     *
     * Construtor da Classe
     */
    public RepositorioDeVendedores() {
        this.vendedores=new ArrayList<Vendedor>();
    }

    public static void setVendedores(ArrayList<Vendedor> vendedores) {
        RepositorioDeVendedores.vendedores = vendedores;
    }

    public static ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    /**
     * Metodo pra adicionar um vendedor no repositório
     * @param vendedor
     * @return True
     */
    @Override
    public boolean cadastrar(Vendedor vendedor) {
       vendedores.add(vendedor);
       return true;
    }


    @Override
    public boolean editar(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Remove um vendedor do repositório
     * @param vendedor
     * @return True
     */

    @Override
    public boolean remover(Vendedor vendedor) {
        vendedores.remove(vendedor);
        return true;
    }

    /**
     * Remove um vendedor do repositório pelo index
     * @param index
     * @return True
     */
    public boolean remover(int index){
        this.vendedores.remove(index);
        return true;
    }

    /**
     * Recupera um vendedor pelo index
     * @param index
     * @return
     */
      public Vendedor obter(int index){
        return this.vendedores.get(index);
    }
    /**
     * retorna a o tamanho do arraylist
     * @return
     */
    public int tamanho(){
        return this.vendedores.size();
    }
    /**
     * lista os vendedores do repositório
     * @return clientes
     */
    @Override
    public ArrayList listar() {
        return this.vendedores;
    }
    
    
    
    
  
    
}
