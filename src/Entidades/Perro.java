/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elizabeth Maffei
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
 
    //metodo para pedir valores y asignarselos a los atributos del objheto perro
    public void llenarPerro(Perro pe2){
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el nombre del perro");
        pe2.setNombre(leer.next());
        System.out.println("ingrese la raza");
        pe2.setRaza(leer.next());
        System.out.println("ingrese la edad del perro");
        pe2.setEdad(leer.nextInt());
        System.out.println("ingrese el tamaño");
        pe2.setTamanio(leer.next());
    }
    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    public Perro() {
    }
    
}
