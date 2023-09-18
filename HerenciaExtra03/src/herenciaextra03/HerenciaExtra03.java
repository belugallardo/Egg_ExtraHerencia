/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra03;

import Servicio.ServicioAlojamientos;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class HerenciaExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioAlojamientos sa = new ServicioAlojamientos();
       String opcion;
       Scanner leer = new Scanner (System.in);
       
       do{
           menu();
           opcion = leer.nextLine();
           
           switch(opcion){
               case "1" :
                        sa.crearAlojamiento();
                        break;
               case "2":
                        sa.campingConRestaurante();
                        break;
               case "3":
                        sa.hotelMasCaro();
                        break;
               case "4": 
                        sa.mostrarTodos();
                        break;
               case "5":
                        sa.residenciasConDescuento();
                        break;
               case "6":
                        System.out.println("Salida exitosa");
                        break;
               default:
                   System.out.println("Opcion invalida");
                   
                   
           }
       }while(!opcion.equals("6"));
       
    }
    
    public static void menu(){
        System.out.println("Ingrese la opcion deseada\n"
                + "1 - Crear un alojamiento\n"
                + "2 - Mostrar los campings con restaurantes\n"
                + "3 - Mostrar la lista de los Hoteles, del mas caro al mas barato\n"
                + "4 - Mostrar todos los alojamientoa\n"
                + "5 - Mostrar las residencias con descuentos\n"
                + "6 - Salir");
    }
    
}
