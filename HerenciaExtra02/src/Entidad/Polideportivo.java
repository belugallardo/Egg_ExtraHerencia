/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/*Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.*/
/**
 *
 * @author belugallardo
 */
public class Polideportivo extends Edificio{
    private Scanner leer = new Scanner(System.in);
    private String nombre;
    private boolean esTechado;

    public Polideportivo() {
        
    }

    public Polideportivo(String nombre, boolean esTechado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.esTechado = esTechado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEsTechado() {
        return esTechado;
    }

    public void setEsTechado(boolean esTechado) {
        this.esTechado = esTechado;
    }
    
    
    
   public  void crearPolideportivo() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Polideportivo");
        this.nombre = leer.nextLine();
        
        System.out.println("¿Es techado? S/N");
        String respuesta = leer.nextLine();
        if(respuesta.equalsIgnoreCase("S")){
            this.esTechado = true ;
        }else{
            this.esTechado = false ;
        }

        System.out.println("Ingrese el ancho del Polideportivo");
        this.ancho = leer.nextDouble();
        leer.nextLine();

        System.out.println("Ingrese el largo del Polideportivo");
        this.largo = leer.nextDouble();
        leer.nextLine();

        System.out.println("Ingrese el alto del Polideportivo");
        this.alto = leer.nextDouble(); 
        leer.nextLine();

        
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Polideportivo");
        System.out.println(super.getAncho() * super.getLargo());
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Polideportivo");
        System.out.println((super.getAncho() * super.getLargo()) * super.getAlto());
    }
    
    
    
}
