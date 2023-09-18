/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Extrahoteleros;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import Enum.TipoGimnasio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioAlojamientos {


    ArrayList<Alojamiento> listaAlojamientos = new ArrayList();
    ArrayList<Hotel> listaHoteles = new ArrayList();
    ArrayList<Camping> listaCamping = new ArrayList();
    ArrayList<Residencia> listaResidencia = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public Alojamiento crearAlojamiento() {

        System.out.println("Ingrese el nombre del alojamiento");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la direccion del alojamiento");
        String direccion = leer.nextLine();
        System.out.println("Ingrese la localidad del alojamiento");
        String localidad = leer.nextLine();
        System.out.println("Ingrese el gerente del alojamiento");
        String gerente = leer.nextLine();

        Alojamiento alojamiento = new Alojamiento(nombre, direccion, localidad, gerente);

        String opcion;
        do {

            System.out.println("¿Que alojamiento desea crear?\n"
                    + "1 - Hotel\n"
                    + "2 - Extrahotelero");

            opcion = leer.nextLine();

        } while (!opcion.equals("1") && !opcion.equals("2"));

        if (opcion.equals("1")) {
            crearHotel(alojamiento);
        } else {
            crearExtraHotel(alojamiento);
        }

        return alojamiento;
    }

    private Hotel crearHotel(Alojamiento alojamiento) {
        System.out.println("Ingrese la cantidad de habitaciones");
        int cantHab = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el numero de camas del hotel");
        int numCamas = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la cantidad de pisos");
        int cantPisos = leer.nextInt();
        leer.nextLine();

        Hotel hotel = new Hotel(cantHab, numCamas, cantPisos, alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(), alojamiento.getGerente());

        String opcion;

        do {
            System.out.println("¿Que tipo de hotel desea crear?\n"
                    + "1 - Hotel 4 estrellas\n"
                    + "2 - Hotel 5 estrellas");

            opcion = leer.nextLine();

        } while (!opcion.equals("1") && !opcion.equals("2"));

        crearHotel4(hotel, opcion);
        return hotel;
    }

    private Hotel4 crearHotel4(Hotel hotel, String opcion) {
        String tipoGym;
        TipoGimnasio enumGym;
        do {
            System.out.println("Seleccione la categoria de gimnasio A/B");
            tipoGym = leer.nextLine();

        } while (!tipoGym.equalsIgnoreCase("A") && !tipoGym.equalsIgnoreCase("B"));

        if (tipoGym.equalsIgnoreCase("A")) {
            enumGym = TipoGimnasio.A;
        } else {
            enumGym = TipoGimnasio.B;
        }

        System.out.println("Ingrese el nombre del restaurante");
        String nombreRest = leer.nextLine();

        System.out.println("Ingrese la capacidad del restaurante");
        int capRest = leer.nextInt();
        leer.nextLine();

        Hotel4 hotel4 = new Hotel4(enumGym, nombreRest, capRest, hotel.getCantHabitaciones(), hotel.getNumCamas(), hotel.getNumPisos(), hotel.getNombre(), hotel.getDireccion(), hotel.getLocalidad(), hotel.getGerente());
        if (opcion.equalsIgnoreCase("2")) {
            crearHotel5(hotel4);
        } else {
            listaAlojamientos.add(hotel4);
            listaHoteles.add(hotel4);
        }
        return hotel4;
    }

    private Hotel5 crearHotel5(Hotel4 hotel4) {
        System.out.println("Ingrese la cantidad de Salones");
        int cantSalones = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la cantidad de Suites");
        int cantSuites = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la cantidad de Limusinas");
        int cantLimo = leer.nextInt();
        leer.nextLine();

        Hotel5 hotel5 = new Hotel5(cantSalones, cantSuites, cantLimo, hotel4.getTipo(), hotel4.getNombreRestaurante(), hotel4.getCapRestaurante(), hotel4.getCantHabitaciones(), hotel4.getNumCamas(), hotel4.getNumPisos(), hotel4.getNombre(), hotel4.getDireccion(), hotel4.getNombre(), hotel4.getGerente());
        listaAlojamientos.add(hotel5);
        listaHoteles.add(hotel5);
        return hotel5;
    }

    private Extrahoteleros crearExtraHotel(Alojamiento alojamiento) {
        String esPrivado;
        do {
            System.out.println("Es privado? S/N");
            esPrivado = leer.nextLine();
        } while (!esPrivado.equalsIgnoreCase("S") && !esPrivado.equalsIgnoreCase("N"));

        boolean flag;
        flag = esPrivado.equalsIgnoreCase("S");

        System.out.println("Ingrese la cantidad de metros");
        int cantMetros = leer.nextInt();
        leer.nextLine();

        Extrahoteleros extra = new Extrahoteleros(flag, cantMetros, alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(), alojamiento.getGerente());

        String opcion;
        do {
            System.out.println("¿Que Extrahotelero desea crear?\n"
                    + "1 - Camping\n"
                    + "2 - Residencia");

            opcion = leer.nextLine();

        } while (!opcion.equals("1") && !opcion.equals("2"));

        if (opcion.equals("1")) {
            crearCamping(extra);
        } else {
            crearResidencia(extra);
        }

        return extra;
    }

    private Camping crearCamping(Extrahoteleros extra) {
        System.out.println("Ingrese la cantidad maxima de carpas");
        int capMax = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese cantidad de baños disponibles");
        int capBanio = leer.nextInt();
        leer.nextLine();

        String tieneRestaurante;
        do {
            System.out.println("¿Posee restaurante? S/N");
            tieneRestaurante = leer.nextLine();
        } while (!tieneRestaurante.equalsIgnoreCase("S") && !tieneRestaurante.equalsIgnoreCase("N"));

        boolean flag;
        flag = tieneRestaurante.equalsIgnoreCase("S");

        Camping camping = new Camping(capMax, capBanio, flag, extra.isEsPrivado(), extra.getCantMetros(), extra.getNombre(), extra.getDireccion(), extra.getLocalidad(), extra.getGerente());
        listaAlojamientos.add(camping);
        listaCamping.add(camping);
        return camping;
    }

    private Residencia crearResidencia(Extrahoteleros extra) {
        System.out.println("Ingrese la cantidad de habitaciones");
        int cantHabitaciones = leer.nextInt();
        leer.nextLine();

        String haceDescuentos;
        do {
            System.out.println("¿Hace descuentos? S/N");
            haceDescuentos = leer.nextLine();
        } while (!haceDescuentos.equalsIgnoreCase("S") && !haceDescuentos.equalsIgnoreCase("N"));

        boolean flagRest;
        flagRest = haceDescuentos.equalsIgnoreCase("S");

        String poseeCampos;
        do {
            System.out.println("¿Posee campos deportivos? S/N");
            poseeCampos = leer.nextLine();
        } while (!poseeCampos.equalsIgnoreCase("S") && !poseeCampos.equalsIgnoreCase("N"));

        boolean flagCampos;
        flagCampos = poseeCampos.equalsIgnoreCase("S");

        Residencia residencia = new Residencia(cantHabitaciones, flagRest, flagCampos, extra.isEsPrivado(), extra.getCantMetros(), extra.getNombre(), extra.getDireccion(), extra.getLocalidad(), extra.getGerente());
        listaAlojamientos.add(residencia);
        listaResidencia.add(residencia);
        return residencia;
    }

    /*Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.*/
    public void mostrarTodos() {
        System.out.println("Listado de Alojamientos por nombre");
        listaAlojamientos.forEach((listaAlojamiento) -> {
            System.out.println(listaAlojamiento.getNombre());
        });
    }

    public void hotelMasCaro() {
        Collections.sort(listaHoteles);
        Collections.reverse(listaHoteles);
        for (Hotel lista : listaHoteles) {
            System.out.println(lista.getNombre()+ " tiene un precio de habitacion de " + lista.getPrecioHabitaciones());    
        }
    }

    public void campingConRestaurante() {

        for (Camping camping : listaCamping) {
            if (camping.isPoseeRestaurante()) {
                System.out.println("El camping " + camping.getNombre() + " tiene restaurante");
            }
        }
    }
    
    public void residenciasConDescuento(){
       
        for (Residencia residencia : listaResidencia) {
            if(residencia.isHaceDescuentos()){
                System.out.println("La residencia " + residencia.getNombre()+ " hace descuentos" );
            }
        }
    }
}
