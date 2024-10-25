/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class probando_inputs {

    public static void main(String[] args) throws IOException {

        //Esto lo que hace es crear una variable dinamica y leerla
        InputStreamReader leerTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(leerTeclado);

        System.out.println("Escribe tu nombre: ");
        String nombre = reader.readLine();
        //System.out.println("Hola  " + nombre);

        // Mostrar un mensaje de bienvenida y pedir al usuario su nombre
        System.out.print("Ingresa tu apellido: ");
        Scanner scanner = new Scanner(System.in);
        String apellido = scanner.nextLine();// luego definir otras variables
        //System.out.println(apellido);

        System.out.println("Bienvenido " + nombre + " " + apellido);

        System.out.println("************************************************");

        System.out.println("Escribe tu edad: ");
        String strEdad = reader.readLine();

        //Transformamos el StringEdad a numero
        int edad = Integer.parseInt(strEdad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad y tiene: " + edad);
        } else {
            System.out.println("Aun es menor de edad tiene: " + edad);
        }

    }
}
