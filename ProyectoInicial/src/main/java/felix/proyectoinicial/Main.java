/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felix.proyectoinicial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Felix
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////EJERCICIO 1////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //Dato de tipo String:
        String nombre = "Felix";

        //Dato de tipo numerico:
        int followersInsta = 325;
        int followersLinkedIn = 30;

        //Concatenación:
        String frase = "Hola mi nombre es: " + nombre + ". Tengo: " + followersInsta + followersLinkedIn + " seguidores";
        String frase2 = "\nHola mi nombre es: " + nombre + ". Tengo: " + (followersInsta + followersLinkedIn) + " seguidores";

        System.out.println("Ejercicio 1");
        System.out.println(frase);
        System.out.println(frase2);

        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////EJERCICIO 2////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nEjercicio 2:");

        int edad = 15;

        //Dato de tipo booleano:
        boolean esMayorEdad = edad >= 18; // La comparación devuelve true o false

        if (esMayorEdad) { //True
            System.out.println("Es mayor de edad.");

        } else { //False
            System.out.println("Es menor de edad.");
        }

        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////EJERCICIO 3////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //Codigo obtenido de StackOverflow: https://stackoverflow.com/questions/1653871/how-do-i-get-input-from-system-in-java-in-netbeans
        //Permite introducir datos por teclado y almacenarlos.
        System.out.println("\nEjercicio 3:");

        //<tipo de vbe> <nombre de vbe> = new <clase>
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingresa el nombre:");
        String nombre2 = buffer.readLine(); //Lee una linea de lo introducido por teclado y lo guarda en "name"
        System.out.println("Hola " + nombre2);

        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////EJERCICIO 4////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\nEjercicio 4:");

        System.out.println("Introduce tu edad: ");

        String stredad = buffer.readLine();
        int edad2 = Integer.parseInt(stredad); //Convertimos el String edad en un numero(int)

        //Dato de tipo booleano:
        boolean esMayorEdad2 = edad2 >= 18; // La comparación devuelve true o false

        if (esMayorEdad2) { //True
            System.out.println("Es mayor de edad.");

        } else { //False
            System.out.println("Es menor de edad.");
        }


        ////////////////////////////////////////////////////////////////////////
        /////////////////////////////EJERCICIO 4////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
    }
}
