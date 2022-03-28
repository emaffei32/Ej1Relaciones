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
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long documento;

    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }//metodo para pedir los valores de los atributos persona

    public void llenarPersona(Persona p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("ingrese apellido");
        p1.setApellido(leer.next());
        System.out.println("ingrese edad");
        p1.setEdad(leer.nextInt());
        System.out.println("ingrese dni");
        p1.setDocumento(leer.nextLong());

    }

    //metodo para imprimir
    public void imprimir(Persona p1) {

        System.out.println("------------------------");
        System.out.println(p1);

    }

    /*funcion para mostrar los datos de persona y perro,forma larga
//    public void mostrar(Persona p){
//        System.out.println("--------------------------------");
//        System.out.println("el nombre de la persona es: "+p.getNombre());
//        System.out.println("el apellido es: "+p.getApellido());
//        System.out.println("la edad es :"+p.getEdad());
//        System.out.println("el documento es :"+p.getDocumento());
//        System.out.println("-----------------------");
//        System.out.println("el nombre perro es: "+p.getPerro().getNombre());
//        System.out.println("la raza del perro es: "+p.getPerro().getRaza());
//        System.out.println("la edad del pero es : "+p.getPerro().getEdad());
//        System.out.println("el tamanio del perro es: "+p.getPerro().getTamanio());
//    }
fin forma larga*/

    public void asiganrPerro(Perro pe1) {
        this.perro = pe1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

}
