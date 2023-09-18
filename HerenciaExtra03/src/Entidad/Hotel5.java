/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.TipoGimnasio;

/**
 *
 * @author belugallardo
 */
public class Hotel5 extends Hotel4{
    private int cantSalones;
    private int cantSuites;
    private int cantLimusinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimusinas, TipoGimnasio tipo, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int numPisos, String nombre, String direccion, String localidad, String gerente) {
        super(tipo, nombreRestaurante, capRestaurante, cantHabitaciones, numCamas, numPisos, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
        this.setPrecioHabitaciones(calcularPrecioHabitaciones());
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public int calcularPrecioHabitaciones() {
       int precioBase = super.calcularPrecioHabitaciones();
       precioBase += 15 * this.cantLimusinas;
       return precioBase;
    }
    
   
}
