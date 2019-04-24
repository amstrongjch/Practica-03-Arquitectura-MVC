package ec.edu.ups.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ec.edu.ups.interfaces.Acciones;

/**
 * Novascular
 * @author Edison
 */
public final class NoVascular extends Vegetal implements Acciones{
    // atrivutos
    private String tipo;
    private boolean rizoides;
    private boolean escamas;
    private double cantidadEscamas;
    private int codigo;
    // constructores
    public NoVascular(){
        
    }

    public NoVascular(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
    }

    public NoVascular(int codigo, String tipo, boolean rizoides, boolean escamas, boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano, double cantidadEscamas) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
        this.tipo = tipo;
        this.rizoides = rizoides;
        this.escamas = escamas;
        this.cantidadEscamas = cantidadEscamas;
        this.codigo = codigo;
    }
    // getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isRizoides() {
        return rizoides;
    }

    public void setRizoides(boolean rizoides) {
        this.rizoides = rizoides;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public double getCantidadEscamas() {
        return cantidadEscamas;
    }

    public void setCantidadEscamas(double cantidadEscamas) {
        this.cantidadEscamas = cantidadEscamas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    // metodos
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean votarCO2(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "No Vascular: "+super.toString() + ", Tipo: " + tipo + ", tiene rizoides: " + rizoides + ", tiene escamas: " + escamas +"Cantidad de escamas: "+ cantidadEscamas;
    }
    
    // implementacion de metodos abstractos
    @Override
    public boolean usarVegetal() {
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
