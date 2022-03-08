/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felix.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Felix
 */

/*
EJERCICIO 2: Crear un programa que permita introducir 3 numeros por teclado y
devuelva el numero promedio de estos.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Introduce el primer numero: ");
        double n1 = obtenerNumero();

        System.out.println("Introduce el segundo numero: ");
        double n2 = obtenerNumero();

        System.out.println("Introduce el tercer numero: ");
        double n3 = obtenerNumero();

        double media = obtenerMedia(n1, n2, n3);

        System.out.println("La media es: " + media);

    }

    /**
     * Función que devuelve el numero introducido por teclado
     *
     * @return n. Devuelve el numero escrito por teclado
     */
    private static double obtenerNumero() {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();

        return n;
    }

    /**
     * Funcion que obtiene la media de los numeros introducidos como parametro
     *
     * @param n1
     * @param n2
     * @param n3
     * @return media. Media de los numeros pasados.
     */
    private static double obtenerMedia(double n1, double n2, double n3) {

        double media = (n1 + n2 + n3) / 3;

        return media;
    }

}
