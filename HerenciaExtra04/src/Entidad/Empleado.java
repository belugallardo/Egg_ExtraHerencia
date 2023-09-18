/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.EstadoCivil;

/**
 *
 * @author belugallardo
 */
public class Empleado extends Persona{
    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }
    
    public Empleado(int anioIncorporacion, int numDespacho){
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    
    
}
