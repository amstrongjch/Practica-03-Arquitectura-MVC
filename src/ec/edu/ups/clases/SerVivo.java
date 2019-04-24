/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * SerVivo
 * @author Amstrong
 */
public abstract class SerVivo implements Comparable<SerVivo> {
    // atrivutos
    private String nombre;
    private int añosVida;
    private double peso;
    private double tamaño;
    public int Codigo;
    
    // constructores
    public SerVivo(){
        
    }
    
    public SerVivo(String nombre){
        
    }

    public SerVivo(String nombre, int añosVida, double peso, double tamaño) {
        this.nombre = nombre;
        this.añosVida = añosVida;
        this.peso = peso;
        this.tamaño = tamaño;
    }
   /* public SerVivo(String nombre, int añosVida, double peso, double tamaño){
        this.nombre=nombre;
        this.añosVida=añosVida;
        this.peso=peso;
        this.tamaño=tamaño;
    }*/
    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosVida() {
        return añosVida;
    }

    public void setAñosVida(int añosVida) {
        this.añosVida = añosVida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamano(double tamano) {
        this.tamaño = tamaño;
    }
    
    // metodos
    public boolean nacer(){
        return true;
    }
     public boolean reproducirce(){
        return true;
    }
      public boolean morir(){
        return true;
    }
    // metodo abstracto
    public abstract boolean vivir();

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Años de Vida: " + añosVida + ", Peso: " + peso + ", Tamaño: " + tamaño;
    }
    @Override
    public int hashCode(){
        int hash=5;
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
            
        }
        if(obj==null){
            return false;
            
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        final SerVivo other=(SerVivo)obj;
        if(this.Codigo !=other.Codigo ){
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(SerVivo o){
        if(nombre.compareTo(o.getNombre())>=1){
        return 1;
        }else if(nombre.compareTo(o.getNombre())<=-1){
                return -1;
            }else {
            return 0;
        }
        
    }
}
