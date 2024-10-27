/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author zukul
 */
public class funciones {

    public static void main(String[] args) throws IOException {

        System.out.print("Escribe el numero1: ");
        int numero1 = cargarNumero();

        System.out.print("Escribe el numero2: ");
        int numero2 = cargarNumero();

        System.out.print("Escribe el numero3: ");
        int numero3 = cargarNumero();

        calcularNumeroMayorYMenor(numero1, numero2, numero3);
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);

    }
    
    /**
     * Esta funcion calcula el numero mayor y menor de tres valores dados
     * @param numero1 El primer valor
     * @param numero2 El segundo valor
     * @param numero3 El tercer valor
     */
    private static void calcularNumeroMayorYMenor(int numero1, int numero2, int numero3) {

        int mayor = numero1;
        //Validamos el numero1 y numero2 quien es mayor
        if (numero2 > mayor) {
            mayor = numero2;
        }

        //Aqui vamos a validar el numero mayor previo contra numero3
        if (numero3 > mayor) {
            mayor = numero3;
        }

        int menor = numero1;
        //Validamos si numero2 es menor a "menor numero1"
        if (numero2 < menor) {
            menor = numero2;
        }

        //Validamos si numero3 es menor a "menor numero2"
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }

    private static void calcularNumeroMayor(int numero1, int numero2, int numero3) {

        int mayor = numero1;
        //Validamos el numero1 y numero2 quien es mayor
        if (numero2 > mayor) {
            mayor = numero2;
        }

        //Aqui vamos a validar el numero mayor previo contra numero3
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El numero mayor es: " + mayor);

    }

    private static void calcularNumeroMenor(int numero1, int numero2, int numero3) {

        int menor = numero1;
        //Validamos si numero2 es menor a "menor numero1"
        if (numero2 < menor) {
            menor = numero2;
        }

        //Validamos si numero3 es menor a "menor numero2"
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("El numero menor es: " + menor);

    }

    /**
     * Esta funcion lo que hace es leer y convertir los valores ingresados a enteros.
     * @return Retorna el valor ingresado por teclado en entero
     * @throws IOException 
     */
    public static Integer cargarNumero() throws IOException {
        InputStreamReader leerTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(leerTeclado);

        String strNumero = reader.readLine();
        int numero = Integer.parseInt(strNumero);//Convertimos string a int
        return numero;
    }

}
