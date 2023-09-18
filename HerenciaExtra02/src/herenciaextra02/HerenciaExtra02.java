/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra02;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author belugallardo
 */
public class HerenciaExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Edificio> listaEdificios = new ArrayList();
        int opcion;
        int cantidadPolideportivosTechados = 0;
        int cantidadPolideportivosAbiertos = 0;

        do {
            menu();
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    EdificioDeOficinas edificio = new EdificioDeOficinas();
                    edificio.crearEdificio();
                    edificio.cantPersona(edificio);
                    listaEdificios.add(edificio);

                    break;
                case 2:
                    Polideportivo poli = new Polideportivo();
                    poli.crearPolideportivo();
                    if (poli.getEsTechado()) {
                        cantidadPolideportivosTechados++;
                    } else {
                        cantidadPolideportivosAbiertos++;
                    }
                    listaEdificios.add(poli);
                    break;
                case 3:
                    for (Edificio lista : listaEdificios) {
                        System.out.println(lista.getAlto());;
                    }
                    break;
                case 4:
                    for (Edificio lista : listaEdificios) {
                        lista.calcularVolumen();
                    }
                    break;
                case 5:
                    System.out.println("La cantidad de Polideportivos techados son " + cantidadPolideportivosTechados);
                    System.out.println("La cantidad de Polideportivos abiertos son " + cantidadPolideportivosAbiertos);
                case 6:
                    System.out.println("Salida exitosa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 6);

    }

    public static void menu() {
        System.out.println("Seleccione la opcion\n"
                + "1 - Cree un Edificio\n"
                + "2 - Cree un Polideportivo\n"
                + "3 - Mostrar Superficie De Cada Edificio\n"
                + "4 - Mostrar Volumen de Cada Polideportivo\n"
                + "5 - Mostrar cantidad de Polideportivos abiertos y techados\n"
                + "6 - Salir");
    }

}
