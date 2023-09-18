/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesor;
import Enum.Curso;
import Enum.Departamento;
import Enum.EstadoCivil;
import Enum.Seccion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioFacultad {

    Scanner leer = new Scanner(System.in);
    ArrayList<Persona> listadoPersonas = new ArrayList();
    ArrayList<Profesor> listaProfesores = new ArrayList();
    ArrayList<PersonalDeServicio> listaPersonal = new ArrayList();
    ArrayList<Estudiante> listaEstudiante = new ArrayList();

    public void cargarPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el apellido");
        String apellido = leer.nextLine();

        System.out.println("Ingrese el numero de identificacion");
        String dni = leer.nextLine();

        System.out.println("Ingrese la opcion de acuerdo a su estado civil\n"
                + "1 - SOLTERO\n"
                + "2 - CASADO\n"
                + "3 - VIUDO\n"
                + "4 - DIVORCIADO\n"
                + "5 - SEPARADO\n"
                + "6 - CONVIVIENTE");
        int opcion = leer.nextInt();
        leer.nextLine();

        EstadoCivil estadoCivil = EstadoCivil.SOLTERO;

        switch (opcion) {
            case 1:
                estadoCivil = EstadoCivil.SOLTERO;
                break;
            case 2:
                estadoCivil = EstadoCivil.CASADO;
                break;
            case 3:
                estadoCivil = EstadoCivil.VIUDO;
                break;
            case 4:
                estadoCivil = EstadoCivil.DIVORCIADO;
                break;
            case 5:
                estadoCivil = EstadoCivil.SEPARADO;
                break;
            case 6:
                estadoCivil = EstadoCivil.CONVIVIENTE;
                break;

        }

        Persona persona = new Persona(nombre, apellido, dni, estadoCivil);

        System.out.println("¿Que desea cargar?\n"
                + "1 - Profesor\n"
                + "2 - Personal de Servicio\n"
                + "3 - Alumno");

        int tipoPersona = leer.nextInt();
        leer.nextLine();

        switch (tipoPersona) {
            case 1:
                cargarProfesor(persona);
                break;
            case 2:
                cargarPersonal(persona);
                break;
            case 3:
                cargarAlumno(persona);
                break;
        }
    }

    private void cargarProfesor(Persona persona) {
        Empleado empleado = new Empleado();
        empleado = crearEmpleado(persona);
        System.out.println("Seleccione el departamento correspondiente\n"
                + "1  -  LENGUAJES,\n"
                + "2  -  MATEMATICAS,\n"
                + "3  -  ARQUITECTURA,\n"
                + "4  -  CIENCIAS SOCIALES,\n"
                + "5  -  CIENCIAS DE LA COMPUTACION");

        int opcion = leer.nextInt();
        leer.nextLine();
        Departamento dpto = null;

        switch (opcion) {
            case 1:
                dpto = Departamento.LENGUAJES;
                break;
            case 2:
                dpto = Departamento.MATEMATICAS;
                break;
            case 3:
                dpto = Departamento.ARQUITECTURA;
                break;
            case 4:
                dpto = Departamento.CIENCIAS_SOCIALES;
                break;
            case 5:
                dpto = Departamento.CIENCIAS_DE_LA_COMPUTACION;
                break;
        }

        Profesor profe = new Profesor(dpto, empleado.getAnioIncorporacion(), empleado.getNumDespacho(), persona.getNombre(), persona.getApellido(), persona.getDni(), persona.getEstadoCivil());
        listadoPersonas.add(profe);
        listaProfesores.add(profe);
    }

    private void cargarPersonal(Persona persona) {
        Empleado empleado = new Empleado();
        empleado = crearEmpleado(persona);
        System.out.println("Seleccione la seccion correspondiente\n"
                + "1  -  BIBLIOTECA,\n"
                + "2  -  DECANATO,\n"
                + "3  -  SECRETARIA,\n"
                + "4  -  ADMINISTRACIÓN,\n"
                + "5  -  RECURSOS HUMANOS\n"
                + "6  -  CONTABILIDAD\n"
                + "7  -  MANTENIMIENTO");
        int opcion = leer.nextInt();
        leer.nextLine();
        Seccion seccion = null;

        switch (opcion) {
            case 1:
                seccion = Seccion.BIBLIOTECA;
                break;
            case 2:
                seccion = Seccion.DECANATO;
                break;
            case 3:
                seccion = Seccion.SECRETARIA;
                break;
            case 4:
                seccion = Seccion.ADMINISTRACION;
                break;
            case 5:
                seccion = Seccion.RECURSOS_HUMANOS;
                break;
            case 6:
                seccion = Seccion.CONTABILIDAD;
                break;
            case 7:
                seccion = Seccion.MANTENIMIENTO;
                break;

        }

        PersonalDeServicio ps = new PersonalDeServicio(seccion, empleado.getAnioIncorporacion(), empleado.getNumDespacho(), persona.getNombre(), persona.getApellido(), persona.getDni(), persona.getEstadoCivil());
        listadoPersonas.add(ps);
        listaPersonal.add(ps);
    }

    private void cargarAlumno(Persona persona) {
        System.out.println("Ingrese el curso correspondiente para el alumno\n"
                + "1 - MATEMATICAS\n"
                + "2 - LENGUAJE Y LITERATURA\n"
                + "3 - CIENCIAS SOCIALES\n"
                + "4 - HISTORIA\n"
                + "5 - BIOLOGIA\n"
                + "6 - QUIMICA\n"
                + "7 - FISICA\n"
                + "8 - INFORMATICA");
        int opcion = leer.nextInt();
        leer.nextLine();
        Curso curso = null;

        switch (opcion) {
            case 1:
                curso = Curso.MATEMATICAS;
                break;
            case 2:
                curso = Curso.LENGUAJE_Y_LITERATURA;
                break;
            case 3:
                curso = Curso.CIENCIAS_SOCIALES;
                break;
            case 4:
                curso = Curso.HISTORIA;
                break;
            case 5:
                curso = Curso.BIOLOGIA;
                break;
            case 6:
                curso = Curso.QUIMICA;
                break;
            case 7:
                curso = Curso.FISICA;
                break;
            case 8:
                curso = Curso.INFORMATICA;
                break;

        }
        Estudiante estudiante = new Estudiante(curso, persona.getNombre(), persona.getApellido(), persona.getDni(), persona.getEstadoCivil());
        listadoPersonas.add(estudiante);
        listaEstudiante.add(estudiante);

    }

    private Empleado crearEmpleado(Persona persona) {

        System.out.println("Ingrese el año de incorporacion a la facultad");
        int anio = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el numero de despacho");
        int num = leer.nextInt();
        leer.nextLine();

        Empleado empleado = new Empleado(anio, num);
        return empleado;
    }

    public void reasignarDespacho() {
        System.out.println("Ingrese el dni del empleado que desea reasignar despacho");
        String dni = leer.nextLine();

        for (Persona listadoPersona : listadoPersonas) {
            if (listadoPersona.getDni().equals(dni)) {
                if (listadoPersona instanceof Empleado) {
                    Empleado empleado = (Empleado) listadoPersona;
                    System.out.println("Empleado " + listadoPersona.getNombre() + " " + listadoPersona.getApellido());
                    System.out.println("Ingrese el nuevo numero de despacho");
                    int nuevoDespacho = leer.nextInt();
                    leer.nextLine();
                    empleado.setNumDespacho(nuevoDespacho);
                }

            } else {
                System.out.println("No se encuentra ningun empleado con ese numero de dni");
            }
        }
    }

    public void matriculacionCurso() {

    }

    public void cambioDepartamento() {
        System.out.println("Ingrese el dni del profesor que desea cambiar Departamento");
        String dni = leer.nextLine();

        for (Profesor lista : listaProfesores) {
            if (lista.getDni().equals(dni)) {
                System.out.println("Profesor " + lista.getNombre() + " " + lista.getApellido());
                System.out.println("");
                System.out.println("Seleccione el departamento correspondiente\n"
                        + "1  -  LENGUAJES,\n"
                        + "2  -  MATEMATICAS,\n"
                        + "3  -  ARQUITECTURA,\n"
                        + "4  -  CIENCIAS SOCIALES,\n"
                        + "5  -  CIENCIAS DE LA COMPUTACION");

                int opcion = leer.nextInt();
                leer.nextLine();

                switch (opcion) {
                    case 1:
                        lista.setDepartamento(Departamento.LENGUAJES);
                        break;
                    case 2:
                        lista.setDepartamento(Departamento.MATEMATICAS);
                        break;
                    case 3:
                        lista.setDepartamento(Departamento.ARQUITECTURA);
                        break;
                    case 4:
                        lista.setDepartamento(Departamento.CIENCIAS_SOCIALES);
                        break;
                    case 5:
                        lista.setDepartamento(Departamento.CIENCIAS_DE_LA_COMPUTACION);
                        break;
                }
            } else {
                System.out.println("No se encuentra ningun profesor con ese dni");
            }
        }
    }

    public void trasladoSeccion() {
        System.out.println("Ingrese el dni del personal que desea cambiar Seccion");
        String dni = leer.nextLine();

        for (PersonalDeServicio lista : listaPersonal) {
            if (lista.getDni().equals(dni)) {
                System.out.println("Personal: " + lista.getNombre() + " " + lista.getApellido());
                System.out.println("Seleccione la seccion correspondiente\n"
                        + "1  -  BIBLIOTECA,\n"
                        + "2  -  DECANATO,\n"
                        + "3  -  SECRETARIA,\n"
                        + "4  -  ADMINISTRACIÓN,\n"
                        + "5  -  RECURSOS HUMANOS\n"
                        + "6  -  CONTABILIDAD\n"
                        + "7  -  MANTENIMIENTO");
                int opcion = leer.nextInt();
                leer.nextLine();

                switch (opcion) {
                    case 1:
                        lista.setSeccion(Seccion.BIBLIOTECA);
                        break;
                    case 2:
                        lista.setSeccion(Seccion.DECANATO);
                        break;
                    case 3:
                        lista.setSeccion(Seccion.SECRETARIA);
                        break;
                    case 4:
                        lista.setSeccion(Seccion.ADMINISTRACION);
                        break;
                    case 5:
                        lista.setSeccion(Seccion.RECURSOS_HUMANOS);
                        break;
                    case 6:
                        lista.setSeccion(Seccion.CONTABILIDAD);
                        break;
                    case 7:
                        lista.setSeccion(Seccion.MANTENIMIENTO);
                        break;

                }
            } else {
                System.out.println("No se encuentra niingun personal con ese dni");
            }
        }
    }
    
    public void imprimirTodosLosDatos(){
        for (Persona listadoPersona : listadoPersonas) {
            if (listadoPersona instanceof Profesor) {
                Profesor p = (Profesor) listadoPersona;
                System.out.println("PROFESOR: Nombre: " + p.getNombre() + " Apellido: " + p.getApellido() + " DNI: " + p.getDni() + " Estado Civil : " + p.getEstadoCivil() + " Año Incorporación: " + p.getAnioIncorporacion() + " N Despacho: " + p.getNumDespacho() + " Departamento: " + p.getDepartamento());  
            }
            if (listadoPersona instanceof PersonalDeServicio) {
                PersonalDeServicio ps = (PersonalDeServicio) listadoPersona;
                System.out.println("PERSONAL DE SERVICIO: Nombre: " + ps.getNombre()+ "Apellido: " + ps.getApellido() + " DNI " + ps.getDni() + " Estado Civil : " + ps.getEstadoCivil() + " Año Incorporación: " + ps.getAnioIncorporacion() + " N Despacho: " + ps.getNumDespacho() + " Sección: " + ps.getSeccion());  
            }
            if (listadoPersona instanceof Estudiante) {
                Estudiante e = (Estudiante) listadoPersona;
                System.out.println("ESTUDIANTE: Nombre: " + e.getNombre() + " Apellido: " + e.getApellido() + " DNI " + e.getDni() + " Estado Civil: " + e.getEstadoCivil() + " Curso: " + e.getCurso() );
                
            }
        }
    }
}
