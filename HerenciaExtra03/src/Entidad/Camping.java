/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
/*Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.*/
/**
 *
 * @author belugallardo
 */
public class Camping extends Extrahoteleros{
    private int capMaxCarpas;
    private int cantBanioDisponible;
    private boolean poseeRestaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanioDisponible, boolean poseeRestaurante, boolean esPrivado, int cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, cantMetros, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanioDisponible = cantBanioDisponible;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanioDisponible() {
        return cantBanioDisponible;
    }

    public void setCantBanioDisponible(int cantBanioDisponible) {
        this.cantBanioDisponible = cantBanioDisponible;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }
    
    
}
