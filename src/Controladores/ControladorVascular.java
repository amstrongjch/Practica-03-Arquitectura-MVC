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
 *
 * @author Edison
 */
public class ControladorVascular {
    private SortedSet<Vascular> lista;
    private int codigo;

    public ControladorVascular() {
        lista = new TreeSet<>();
        codigo =0;
    }

    public void create(Vascular objeto) {
        codigo++;
        lista.add(objeto);
    }

    public Vascular read(int codigo) {
        for (Vascular vascular : lista) {
            if (vascular.getCodigo() == codigo) {
                return vascular;
            }
        }
        return null;
    }

    public void update(Vascular objeto) {
        for (Vascular vascular : lista) {
            
            if (vascular.equals(objeto)) {
                lista.remove(vascular);
                lista.add(objeto);
                break;
            }
        }
    }

    public void delet(int codigo) {
        for (Vascular vascular :lista) {
            
            if (vascular.getCodigo()==codigo) {
                lista.remove(vascular);
                break;
            }
        }
    }
    public void imprimir(){
        System.out.println("lista ordenada");
        for(Vascular vascular : lista){
            System.out.println(vascular.toString());
        }
    }
    
}
