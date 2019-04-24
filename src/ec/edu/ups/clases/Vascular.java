/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.clases.Vegetal;
import ec.edu.ups.interfaces.Acciones;

/**
 * Vascular
 * @author Amstrong
 */
public final class Vascular extends Vegetal implements Acciones{
    // atrivutos
    private double tamanoRaiz;
    private double tamanoallo;
    private double tamanoHoja;
    private int cantidadMaximaFrutos;
    private int codigo;
    // constructores
    public Vascular(){
        
    }

    public Vascular(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
    }

    public Vascular(int codigo, double tamanoRaiz, double tamanoallo, double tamanoHoja, int cantidadMaximaFrutos, boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
        this.tamanoRaiz = tamanoRaiz;
        this.tamanoallo = tamanoallo;
        this.tamanoHoja = tamanoHoja;
        this.cantidadMaximaFrutos = cantidadMaximaFrutos;
        this.codigo = codigo;
    }
    
    // getters y setters
    public double getTamanoRaiz() {
        return tamanoRaiz;
    }

    public void setTamanoRaiz(double tamanoRaiz) {
        this.tamanoRaiz = tamanoRaiz;
    }

    public double getTamanoallo() {
        return tamanoallo;
    }

    public void setTamanoallo(double tamanoallo) {
        this.tamanoallo = tamanoallo;
    }

    public double getTamanoHoja() {
        return tamanoHoja;
    }

    public void setTamanoHoja(double tamanoHoja) {
        this.tamanoHoja = tamanoHoja;
    }

    public int getCantidadMaximaFrutos() {
        return cantidadMaximaFrutos;
    }

    public void setCantidadMaximaFrutos(int cantidadMaximaFrutos) {
        this.cantidadMaximaFrutos = cantidadMaximaFrutos;
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
        return "Vascular: "+super.toString()+ ", Tamaño de la Raiz: " + tamanoRaiz + ", Tamaño del tallo: " + tamanoallo + ", Tamaño de la Hoja: " + tamanoHoja + ", Cantidad Maxima de Frutos: " + cantidadMaximaFrutos;
    }
    // implementacion metodos abstractos
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

    public void getNombre(String jvc2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
