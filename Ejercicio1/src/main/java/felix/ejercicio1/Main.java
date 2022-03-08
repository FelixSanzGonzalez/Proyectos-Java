/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felix.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felix
 */

/*
EJERCICIO 1: CREAR UN PROGRAMA QUE PERMITE CARGAR 3 NUMEROS Y MUESTRA CUAL ES EL
MAYOR Y CUAL ES EL MENOR
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Introduce el primer numero: ");
        int n1 = obtenerNumero();

        System.out.println("Introduce el segundo numero: ");
        int n2 = obtenerNumero();

        System.out.println("Introduce el tercer numero: ");
        int n3 = obtenerNumero();

        System.out.println("Los numeros introducidos son: " + n1 + " " + n2 + " " + n3);

        calcularMayoryMenor(n1, n2, n3);

    }

    /**
     * Función que devuelve el numero introducido por teclado
     *
     * @return n. Devuelve el numero escrito por teclado
     */
    private static int obtenerNumero() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        return n;
    }

    /**
     * Función que calcula y muestra por pantalla el menor y mayor de 3 numeros
     * introducidos.
     *
     * @param n1 Primer numero
     * @param n2 Segundo numero
     * @param n3 Tercer numero
     *
     */
    private static void calcularMayoryMenor(int n1, int n2, int n3) {

        //Obtenemos el numero mayor:
        int mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        //Obtenemos el numero menor:        
        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < mayor) {
            menor = n3;
        }

        //RESULTADO:
        System.out.println("El numero mas alto es: " + mayor);
        System.out.println("El numero mas bajo es: " + menor);

    }

}
