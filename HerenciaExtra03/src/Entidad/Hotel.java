/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
/*Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.*/
/**
 *
 * @author belugallardo
 */
public class Hotel extends Alojamiento implements Comparable<Hotel>{
    protected int cantHabitaciones;
    protected int numCamas;
    protected int numPisos;
    protected int precioHabitaciones;

    public Hotel(int cantHabitaciones, int numCamas, int numPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
        this.setPrecioHabitaciones(calcularPrecioHabitaciones());
        
    }


    public Hotel() {
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
       
      public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    protected int calcularPrecioHabitaciones(){
        int aux = 50 + (1* this.numCamas);
        return aux;
    }

    @Override
    public int compareTo(Hotel otroHotel) {
        
        return Double.compare(this.precioHabitaciones, otroHotel.getPrecioHabitaciones());
    }


    
}
