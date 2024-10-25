/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso.ejerciciosCurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {

    public static void main(String[] args) throws IOException {

        /*
        Ejercicio de programacion #1
        
        Armar un programa que permita cargar 3 numeros
        y mostrar cual es el mayor y cual es el menor
        
         */
        InputStreamReader leerTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(leerTeclado);

        System.out.println("Escribe tu primer numero: ");
        String strNumero1 = reader.readLine();
        int numero1 = Integer.parseInt(strNumero1);

        System.out.println("Escribe tu segundo numero: ");
        String strNumero2 = reader.readLine();
        int numero2 = Integer.parseInt(strNumero2);

        System.out.println("Escribe tu tercer numero: ");
        String strNumero3 = reader.readLine();
        int numero3 = Integer.parseInt(strNumero3);

        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2; //numero2 ahora es mayor
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        int menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }
}
