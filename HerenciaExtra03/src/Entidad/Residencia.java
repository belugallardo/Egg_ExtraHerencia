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
public class Residencia extends Extrahoteleros{
    /*cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.*/
    private int cantHabitaciones;
    private boolean haceDescuentos;
    private boolean poseeCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean haceDescuentos, boolean poseeCampoDeportivo, boolean esPrivado, int cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuentos = haceDescuentos;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isHaceDescuentos() {
        return haceDescuentos;
    }

    public void setHaceDescuentos(boolean haceDescuentos) {
        this.haceDescuentos = haceDescuentos;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }
    
    
}
