
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Vendedor;


public class RepositorioDeVendedores implements CRUD<Vendedor>{
    
    private static ArrayList<Vendedor> vendedores;

    public RepositorioDeVendedores() {
        this.vendedores=new ArrayList<Vendedor>();
    }

    public static void setVendedores(ArrayList<Vendedor> vendedores) {
        RepositorioDeVendedores.vendedores = vendedores;
    }

    public static ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    
        
    @Override
    public boolean cadastrar(Vendedor vendedor) {
       vendedores.add(vendedor);
       return true;
    }
  
    @Override
    public boolean editar(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remover(Vendedor vendedor) {
        vendedores.remove(vendedor);
        return true;
    }

    public boolean remover(int index){
        this.vendedores.remove(index);
        return true;
    }
      public Vendedor obter(int index){
        return this.vendedores.get(index);
    }
     
    public int tamanho(){
        return this.vendedores.size();
    }
    @Override
    public ArrayList listar() {
        return this.vendedores;
    }
    
    
    
    
  
    
}
