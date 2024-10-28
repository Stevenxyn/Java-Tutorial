/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso.ejerciciosCurso;

import java.io.IOException;
import javacurso.funciones;
import static javacurso.funciones.cargarNumero;

/**
 * Ejercicio #3
 *
 * Armar un programa que permita ingresar un numero y mostrar si es par o impar
 *
 * Un número par es aquel que se puede dividir por dos sin dejar un residuo,
 * mientras que un número impar dejará un residuo de uno.
 *
 */
public class ejercicio3_par_impar {

    public static void main(String[] args) throws IOException {

        //Importamos la funcion de leer numeros
        funciones cargarNumero = new funciones();

        System.out.print("Ingresa un numero: ");
        int numero = cargarNumero();

        
        if ((numero % 2) == 0) {
            System.out.println(numero + " Es par");
        } else {
            System.out.println(numero + " Es impar");
        }

    }

}
