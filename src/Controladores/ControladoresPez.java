/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ec.edu.ups.clases.Pez;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amstrong
 */
public class ControladoresPez {
    
    private List<Pez> lista;
    private int codigo;

    public ControladoresPez() {
        codigo=0;
        lista = new ArrayList<>();
    }
    
    public void create(Pez objeto){
        codigo++;
        lista.add(objeto);
        objeto.setCodigo(codigo);
    }
    
    public Pez read(int codigo){
        for (Pez pez  : lista) {
            if(pez .getCodigo() == codigo){
                return pez ;
            }
        }
        return null;
    }
    
    public void update(Pez  objeto){
        for (int i = 0; i < lista.size(); i++) {
            Pez  elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
               break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Pez  elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }    
}
