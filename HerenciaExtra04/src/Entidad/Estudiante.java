/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Curso;
import Enum.EstadoCivil;

/**
 *
 * @author belugallardo
 */
public class Estudiante  extends Persona{
    private Curso curso;

    public Estudiante() {
    }


    public Estudiante(Curso curso, String nombre, String apellido, String dni, EstadoCivil estadoCivil) {
       super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
