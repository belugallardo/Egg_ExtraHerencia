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
public class BarcoMotor extends Barco{
    private int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
      @Override
   public int modulo() {
       return 10 + potencia;
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

        System.out.println("Ingrese la potencia en CV");
        int pot = leer.nextInt();
        leer.nextLine();

        return new BarcoMotor(pot, matr, esl, fabricacion);
    }
}
