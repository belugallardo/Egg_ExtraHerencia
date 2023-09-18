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
public class Hotel4 extends Hotel{
    protected TipoGimnasio tipo;
    protected String nombreRestaurante;
    protected int capRestaurante;

    public Hotel4() {
    }

    public Hotel4(TipoGimnasio tipo, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int numCamas, int numPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, numPisos, nombre, direccion, localidad, gerente);
        this.tipo = tipo;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
       this.setPrecioHabitaciones(calcularPrecioHabitaciones());
    }

    public TipoGimnasio getTipo() {
        return tipo;
    }

    public void setTipo(TipoGimnasio tipo) {
        this.tipo = tipo;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public int calcularPrecioHabitaciones() {
        int precioBase = super.calcularPrecioHabitaciones();

        if (this.capRestaurante < 30) {
            precioBase += 10 * this.capRestaurante;
        } else if (this.capRestaurante >= 30 && this.capRestaurante <= 50) {
            precioBase += 30 * this.capRestaurante;
        } else {
            precioBase += 50 * this.capRestaurante;
        }
        if (this.tipo == TipoGimnasio.A) {
            precioBase += 50;
        } else {
            precioBase += 30;
        }
        return precioBase;
    }

    
    
    
}
