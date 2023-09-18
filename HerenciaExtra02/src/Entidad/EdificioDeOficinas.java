/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class EdificioDeOficinas extends Edificio {

    private Scanner leer = new Scanner(System.in);
    private int numeroDeOficinas;
    private int cantPersonasPorOficina;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantPersonasPorOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }


    public void crearEdificio() {

            System.out.println("Nuevo Edificio");
            System.out.println("Ingrese el ancho del edificio");
            this.ancho = leer.nextDouble();
            leer.nextLine();
            
            System.out.println("Ingrese el largo del edificio");
            this.largo = leer.nextDouble();
            leer.nextLine();
            
            System.out.println("Ingrese el alto del edificio");
            this.alto = leer.nextDouble();
            leer.nextLine();
            
            System.out.println("Ingrese la cantidad de pisos que posee el edificio");
            this.numPisos = leer.nextInt();
            leer.nextLine();
      
            System.out.println("Ingrese la cantidad de oficinas por piso");
            this.numeroDeOficinas = leer.nextInt();
            leer.nextLine();
  
            System.out.println("Ingrese la cantidad de personas que trabajan en las oficinas");
            this.cantPersonasPorOficina = leer.nextInt();
            leer.nextLine();
            
            
            
    }

    public void cantPersona(EdificioDeOficinas ed) {
        int personasPiso = ed.getNumeroDeOficinas() * ed.getCantPersonasPorOficina();
        int personasEdificio = personasPiso * ed.getNumPisos();

        System.out.println("La cantidad de personas que entrarian en un piso son " + personasPiso);
        System.out.println("La cantidad de personas que entrarian en un edificio son " + personasEdificio);

    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Edificio de Oficinas");
        System.out.println(getAncho() * getLargo());
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Edificio de Oficinas");
        System.out.println((getAncho() * getLargo()) * getAlto());
    }

}
