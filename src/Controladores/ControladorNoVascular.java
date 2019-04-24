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
 *controladorNoVascular
 * en esta clase se aplicara los crup de NoVascular
 * @author Amstrong
 */
public class ControladorNoVascular {
    private Map<Integer, NoVascular> lista;
    private int codigo;
    
//constructor
    public ControladorNoVascular() {
        lista = new HashMap<Integer, NoVascular>();
        codigo=0;
    }
//creacion del objeto de tipo NoVascular
    public void create(NoVascular objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
        
    }
//leer el objeto tipo NoVascular 
    public NoVascular read(int codigo) {
       return lista.get(codigo);
        }
//modificacion del objeto tipo NoVascular
    public void update(NoVascular objeto) {
            
                lista.remove(objeto.get(codigo));
                lista.put(objeto.getCodigo(), objeto);
            }
        
  
//eliminar del objeto de tipo NoVascular
    public void delet(int codigo) {
                lista.remove(codigo);
              
            }
//listar los objetos de tipo NoVascular 
    public void listar(){
        System.err.println(lista.values());
    }  
}
