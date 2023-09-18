/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Departamento;
import Enum.EstadoCivil;

/**
 *
 * @author belugallardo
 */
public class Profesor extends Empleado{
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
