
package repositorios;

import interfaces.CRUD;
import java.util.ArrayList;
import models.Calcado;
/**
 *
 * <p>
 * <b>Estoque</b> </p>
 * <p>
 * Repositório de Calçado</p>
 *
 * @author Felipe Alef
 * @since out 2021
 * @version 1.0
 */
public class Estoque implements CRUD<Calcado> {
    private static ArrayList<Calcado> calcados;

    public static void setCalcados(ArrayList<Calcado> calcados) {
        Estoque.calcados = calcados;
    }

    public static ArrayList<Calcado> getCalcados() {
        return calcados;
    }

    /**
     * construtor da Classe
     */
    public Estoque() {
        calcados = new ArrayList<Calcado>();
    }

    /**
     * Metodo pra adicionar um Calçado no repositório
     * @param entidade
     * @return True se conseguiu cadastrar e False se não
     */
    @Override
    public boolean cadastrar(Calcado entidade) {
       return calcados.add(entidade);
    }

    @Override
    public boolean editar(Calcado entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * remove um calçado do repositório
     * @param entidade
     * @return True ou False
     */
    @Override
    public boolean remover(Calcado entidade) {
       return calcados.remove(entidade);
    }

    /**
     * remove um calçado do repositório
     * @param index
     * @return True ou False
     */
    public boolean remover(int index){
        this.calcados.remove(index);
        return true;
    }

    /**
     * lista os calçados cadastrados
     * @return calçados
     */
    @Override
    public ArrayList<Calcado> listar() {
       return this.calcados;
    }
    /**
     * lista os calçados cadastrados
     * @return calçados
     */
    public ArrayList<Calcado> get(){
        return calcados;
    }

    /**
     * retorna o tamanho do repositório
     * @return
     */
    public int tamanho(){
        return this.calcados.size();
    }

    /**
     * Recupera o Calçado selecionado
     * @param index
     * @return
     */
    public Calcado obter(int index){
        return this.calcados.get(index);
    }

}
