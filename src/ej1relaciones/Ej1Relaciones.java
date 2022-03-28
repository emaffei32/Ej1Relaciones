/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 * and open the template in the editor.
 */
package ej1relaciones;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Elizabeth Maffei
 */
public class Ej1Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*      forma corta para crear los objetos perro y persona utilizando los constructores  
//        Perro pe1 = new Perro(" Pugoso "," Mestizo ",3," chiquito ");
//        Perro pe2 = new Perro(" Chuwi "," Mestizo ",4," mediano ");
//        
//        Persona p1 = new Persona(" Juanito "," Mengano ",100,123456789,pe2);
//        Persona p2 = new Persona(" Fulanito ","Mengon ",80,789456123,pe1);
//        System.out.println(p1.toString());
//        System.out.println(p2.toString() );
fin forma corta*/

        //creo dos objeto de Perro
        Perro pe1 = new Perro();
        Perro pe2 = new Perro();

        //creo dos objeto de Persona
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        //asigno valores a los atributos del perro
        pe1.llenarPerro(pe1);
        pe2.llenarPerro(pe2);

        //asigno valores a los atributos de la persona y
        p1.llenarPersona(p1);
        //le asigno un perro a una persona
        p1.asiganrPerro(pe1);
        //asigno valores a los atributos de la persona y
        p2.llenarPersona(p2);
        //le asigno un perro a una persona
        p2.asiganrPerro(pe2);

        //muestro por consola
        p1.imprimir(p1);
        p2.imprimir(p2);

    }// TODO code application logic here
}
