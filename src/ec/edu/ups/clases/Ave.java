/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Ave
 * @author Amstrong
 */
public final class Ave extends Animal implements Acciones{
    // atrivutos
    private double maximoAlturaVuelo;
    private double tamanoAlas;
    private boolean volar;
    private boolean nadar;
    private int codigo;
    // constructores
    public Ave(){
        
    }

    public Ave(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
    }

    public Ave(int codigo,double maximoAlturaVuelo, double tamanoAlas, boolean volar, boolean nadar, String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        this.maximoAlturaVuelo = maximoAlturaVuelo;
        this.tamanoAlas = tamanoAlas;
        this.volar = volar;
        this.nadar = nadar;
        this.codigo = codigo;
    }

    
    // getters y setters
    public double getMaximoAlturaVuelo() {
        return maximoAlturaVuelo;
    }

    public void setMaximoAlturaVuelo(double maximoAlturaVuelo) {
        this.maximoAlturaVuelo = maximoAlturaVuelo;
    }

    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    // metodos
    public boolean volar(){
        return true;
    }
    public boolean cazarComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Ave: " + super.toString()+ ", Maximo de la Altura de Vuelo: " + maximoAlturaVuelo + ", Tamaño de las Alas: " + tamanoAlas + ", Sabe volar: " + volar + ", sabe nadar: " + nadar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.maximoAlturaVuelo) ^ (Double.doubleToLongBits(this.maximoAlturaVuelo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ave other = (Ave) obj;
        if (Double.doubleToLongBits(this.maximoAlturaVuelo) != Double.doubleToLongBits(other.maximoAlturaVuelo)) {
            return false;
        }
        return true;
    }
    
    
    
    // implementacion metodos abstractos
    @Override
    public boolean cazarAnimal() {
        return true;
    }
    
    @Override
    public boolean nacer(){
        return true;
    }
    @Override
    public boolean reproducirse(){
        return true;
    }
    
    
}
