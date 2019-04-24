/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ec.edu.ups.clases.Ave;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *controladorAve
 * @author Amstrong
 * en esta clase se aplicara el crup de ave
 * 
 */
public class ControladorAve {
    private Set<Ave> lista;
    private int codigo;
    
//constructor
    public ControladorAve() {
        lista = new HashSet<>();
        codigo=0;
    }
//creacion del objeto tipo ave
    public void create(Ave objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
// leer el objeto tipo ave
    public Ave read(int codigo) {
        for (Ave ave : lista) {
            if (ave.getCodigo() == codigo) {
                return ave;
            }
        }
        return null;
    }
//modificacion del objeto tipo ave
    public void update(Ave objeto) {
        for (Ave ave : lista) {
            
            if (ave.equals(objeto)) {
                lista.remove(ave);
                lista.add(objeto);
                break;
            }
        }
    }
// elminacion del objeto tipo ave
    public void delet(int codigo) {
        for (Ave ave : lista) {
            if (ave.getCodigo()==codigo) {
                lista.remove(ave);
                break;
            }
        }
    }
 //listar los objetos tipo ave
    public void listar(){
        for(Ave ave : lista){
            System.out.println(ave);
        }
    }
//metodos extra mostrar por pantalla los codigos de los objetos
    public void codigo(){
        for(Ave ave : lista){
            System.out.println(ave.getCodigo()+ "."+ave.getNombre());
        }
    }
}
