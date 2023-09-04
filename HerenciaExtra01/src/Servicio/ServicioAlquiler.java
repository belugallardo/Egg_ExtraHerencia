/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioAlquiler {
    private Scanner leer = new Scanner(System.in);
    Alquiler alq = new Alquiler();
 
    public void crearAlquiler(){
        
        System.out.println("Ingrese su nombre");
        alq.setNombre(leer.nextLine());
        
        System.out.println("Ingrese su dni");
        alq.setDocumento(leer.nextLine());
        
        System.out.print("Ingrese una fecha (formato yyyy-MM-dd): ");
        String fechaDevolucionIngresada = leer.nextLine();
        alq.setFechaDevolucion(LocalDate.parse(fechaDevolucionIngresada));
        
        
        alq.setFechaAlquiler(LocalDate.now());
        
        System.out.println("Ingrese la posicion del amarre");
        alq.setPosicionAmarre(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese el barco que desea amarrar");
        Barco eleccionBarco = listadoBarcos();
        alq.setBarco(eleccionBarco);
       
        int dias = cantidadDias(alq.getFechaAlquiler(), alq.getFechaDevolucion());
        System.out.println(dias);
        
        calculoAlquiler(eleccionBarco, dias);
        
    }
    
    private Barco listadoBarcos(){
        System.out.println("1 - Barco\n"
                + "2 - Velero\n"
                + "3 - Barco a Motor\n"
                + "4 - Yate");
        int opcion = leer.nextInt();
        leer.nextLine();
        Barco eleccionBarco = null;
        
        switch(opcion){
            case 1 : 
                    Barco barco = new Barco();
                    eleccionBarco = barco.crearBarco();
                    break;
            case 2:
                    Velero velero = new Velero();
                    eleccionBarco = velero.crearBarco();
                    break;
            case 3:
                    BarcoMotor bm = new BarcoMotor();
                    eleccionBarco = bm.crearBarco();
                    break;
            case 4:
                    Yate yate = new Yate();
                    eleccionBarco = yate.crearBarco();
                    break;
                    
            default:
                    System.out.println("Ingreso incorrecto");
                    listadoBarcos();
        }
       return eleccionBarco;         
    }
    
     private int cantidadDias(LocalDate inicio, LocalDate fin){
        long diferenciaDiasLong = ChronoUnit.DAYS.between(inicio, fin);
        int diferenciaDiasInt = (int) diferenciaDiasLong;
        return diferenciaDiasInt;
    }
    
    public void calculoAlquiler(Barco barco, int dias){
     
       int modulos = barco.modulo();
       int totalAlquiler = dias * modulos;
        System.out.println("El total por el alquiler es de $" + totalAlquiler);
    }
}
