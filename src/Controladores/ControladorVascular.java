/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ec.edu.ups.clases.Vascular;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *controladorVascular
 * En esta clase se aplicara los crud de Vascular
 * @author Amstrong
 */
public class ControladorVascular {
    private SortedSet<Vascular> lista;
    private int codigo;

    //constructor
    public ControladorVascular() {
        lista = new TreeSet<>();
        codigo =0;
    }
//creacion del objeto tipo Vascular
    public void create(Vascular objeto) {
        codigo++;
        lista.add(objeto);
    }
//leer el objeto de tipo vascular
    public Vascular read(int codigo) {
        for (Vascular vascular : lista) {
            if (vascular.getCodigo() == codigo) {
                return vascular;
            }
        }
        return null;
    }
//modificacion del objeto tipo vascular
    public void update(Vascular objeto) {
        for (Vascular vascular : lista) {
            
            if (vascular.equals(objeto)) {
                lista.remove(vascular);
                lista.add(objeto);
                break;
            }
        }
    }
//eliminacion del objeto tipo vascular
    public void delet(int codigo) {
        for (Vascular vascular :lista) {
            
            if (vascular.getCodigo()==codigo) {
                lista.remove(vascular);
                break;
            }
        }
    }
    //listar los objetos de tipo vascular
    public void imprimir(){
        System.out.println("lista ordenada");
        for(Vascular vascular : lista){
            System.out.println(vascular.toString());
        }
    }
    //sirve para mostrar por pantalla los codigos de los objetos
    public void codigo(){
        for(Vascular vascular : lista){
            System.err.println(vascular.getCodigo()+ ". "+vascular.getNombre());
        }
    }

}
