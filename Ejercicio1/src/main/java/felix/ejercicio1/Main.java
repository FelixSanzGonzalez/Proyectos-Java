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

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("Introduce el tercer numero: ");
        int n3 = sc.nextInt();

        System.out.println("Los numero introducidos son: " + n1 + " " + n2 + " " + n3);

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
