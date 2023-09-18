/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author belugallardo
 */
public class Extrahoteleros extends Alojamiento{

    protected boolean esPrivado;
    protected int cantMetros;

    public Extrahoteleros() {
    }

    public Extrahoteleros(boolean esPrivado, int cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.cantMetros = cantMetros;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public int getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(int cantMetros) {
        this.cantMetros = cantMetros;
    }
    
    
}
