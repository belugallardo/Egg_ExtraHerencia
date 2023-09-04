/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Velero extends Barco{
  
    private int numMastil;

    public Velero() {
    }

    public Velero(int numMastil, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastil = numMastil;
    }

    public int getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(int numMastil) {
        this.numMastil = numMastil;
    }
    
    @Override
   public int modulo() {
       return 10 + numMastil;
    }
   
   @Override
    public Barco crearBarco() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la matricula");
        String matr = leer.nextLine();

        System.out.println("Ingrese la eslora");
        int esl = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el año de fabricacion");
        int fabricacion = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la cantidad de mastiles");
        int cantMastiles = leer.nextInt();
        leer.nextLine();

        return new Velero(cantMastiles, matr, esl, fabricacion);
    }
    
}
