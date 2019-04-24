/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ec.edu.ups.clases.NoVascular;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edison
 */
public class ControladorNoVascular {
    private Map<Integer, NoVascular> lista;
    private int codigo;

    public ControladorNoVascular() {
        lista = new HashMap<Integer, NoVascular>();
        codigo=0;
    }

    public void create(NoVascular objeto) {
        codigo++;
        lista.put(codigo, objeto);
        objeto.setCodigo(codigo);
    }

    public NoVascular read(int codigo) {
       return lista.get(codigo);
        }
     
    public void update(NoVascular objeto) {
        for (int i = 0; i < lista.size(); i++) {
           
            if (lista.get(codigo).getCodigo()==objeto.getCodigo()) {
                lista.remove(codigo, lista.get(codigo));
                lista.put(codigo, objeto);
            }
        }
    }

    public void delet(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(codigo).getCodigo()==codigo) {
                lista.remove(codigo);
              
            }
        }
    }
    
}
