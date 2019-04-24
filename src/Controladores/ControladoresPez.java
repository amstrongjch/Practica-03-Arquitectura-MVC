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
 *controladorPez
 * en esta clase se realizara los crup de Pez
 * @author Amstrong
 */
public class ControladoresPez {
    
    private List<Pez> lista;
    private int codigo;
    
//constructor
    public ControladoresPez() {
        codigo=0;
        lista = new ArrayList<>();
    }
    
//creacion del objeto tipo pez
    public void create(Pez objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
        
    }
//leer el objeto del tipo pez
    public Pez read(int codigo){
        for (Pez pez  : lista) {
            if(pez .getCodigo() == codigo){
                return pez ;
            }
        }
        return null;
    }
//modificacion del objeto de tipo pez  
    public void update(Pez  objeto){
        for (int i = 0; i < lista.size(); i++) {
            Pez  elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
               break;
            }            
        }
    }
//elimnacion del objeto de tipo pez
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Pez  elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }  
//listar los objetos del tipo pez
    public void listar(){
        for(Pez pez : lista){
            System.out.println(pez);
        }
    }
//sirve para mostrar por pantalla los codigos de los objetos
    public void codigo(){
        for(Pez pez: lista){
            System.out.println(pez.getCodigo()+". "+pez.getNombre()); 
        }
    }
}
