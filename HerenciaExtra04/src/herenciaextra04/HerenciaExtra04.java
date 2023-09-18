/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra04;

import Servicio.ServicioFacultad;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class HerenciaExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioFacultad sf = new ServicioFacultad();
        Scanner leer = new Scanner (System.in);
        int opcion = 0;
        
        do{
            menu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1 :
                        sf.cargarPersona();
                        break;
                case 2 : 
                        sf.imprimirTodosLosDatos();
                        break;
                case 3 : 
                        sf.reasignarDespacho();
                        break;
                case 4 :
                        sf.matriculacionCurso();
                        break;
                case 5 :
                        sf.trasladoSeccion();
                        break;
                case 6:
                        System.out.println("Salida exitosa");
                        break;
                default:
                        System.out.println("Opcion invalida");
            }
        }while(opcion != 6);
    }
    
    public static void menu(){
        System.out.println("Elija la opción deseada\n"
                + "1 - Cargar una persona\n"
                + "2 - Listado de personas\n"
                + "3 - Reasignacion de despacho\n"
                + "4 - Matriculacion de estudiante\n"
                + "5 - Traslado de seccion\n"
                + "6 - Salir");
        
    }
    
}
