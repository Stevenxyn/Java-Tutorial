/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso.ejerciciosCurso;

import java.io.IOException;
import javacurso.funciones;
import static javacurso.funciones.cargarNumero;

/**
 * Ejercicio #2
 *
 * Armar un programa que permita cargar 3 numeros y mostrar cual es el numero
 * promedio
 *
 * Ejemplo: Si cargo 2, 6 y 9 el promedio es 5.66
 *
 */
public class ejercicio2_numeroPromedio {

    public static void main(String[] args) throws IOException {

        funciones cargarnumero = new funciones();

        System.out.print("Escribe el primer numero: ");
        int n1 = cargarNumero();

        System.out.print("Escribe el segundo numero: ");
        int n2 = cargarNumero();

        System.out.print("Escribe el tercer numero: ");
        int n3 = cargarNumero();

        //Primero sumamos todos los valores
        int sumatoria = (n1 + n2 + n3);
        //Despues convertimos el int a double y realizamos la division.
        double promedio = Double.valueOf(sumatoria) / 3;

        System.out.println("El promedio de los tres numeros es: " + promedio);
    }

}
