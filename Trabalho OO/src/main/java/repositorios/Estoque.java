
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Calcado;

public class Estoque implements CRUD<Calcado> {
    private static ArrayList<Calcado> calcados;

    public static void setCalcados(ArrayList<Calcado> calcados) {
        Estoque.calcados = calcados;
    }

    public static ArrayList<Calcado> getCalcados() {
        return calcados;
    }

    public Estoque() {
        calcados = new ArrayList<Calcado>();
    }
    
    @Override
    public boolean cadastrar(Calcado entidade) {
       return calcados.add(entidade);
    }

    @Override
    public boolean editar(Calcado entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remover(Calcado entidade) {
       return calcados.remove(entidade);
    }
    public boolean remover(int index){
        this.calcados.remove(index);
        return true;
    }
    @Override
    public ArrayList<Calcado> listar() {
       return this.calcados;
    }
    
    public ArrayList<Calcado> get(){
        return calcados;
    }
    public int tamanho(){
        return this.calcados.size();
    }

    public Calcado obter(int index){
        return this.calcados.get(index);
    }
    
    
    
    
    
}
