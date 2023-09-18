/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.EstadoCivil;
import Enum.Seccion;

/**
 *
 * @author belugallardo
 */
public class PersonalDeServicio extends Empleado{
    private Seccion seccion;

    public PersonalDeServicio(Seccion seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public PersonalDeServicio() {
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    
}
