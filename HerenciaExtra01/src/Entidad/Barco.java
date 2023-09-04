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
public class Barco {
    
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;
    private Scanner leer = new Scanner(System.in);

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
  
    public int modulo(){
        return 10;
    }
    
    public Barco crearBarco(){
        System.out.println("Ingrese la matricula");
        String matr = leer.nextLine();
        
        System.out.println("Ingrese la eslora");
        int esl = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingrese el año de fabricacion");
        int fabricacion = leer.nextInt();
        leer.nextLine();
        
        return new Barco(matr, esl, fabricacion);
        
    }
    
}
