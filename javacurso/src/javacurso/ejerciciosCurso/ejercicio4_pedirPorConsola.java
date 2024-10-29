/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso.ejerciciosCurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

Escribir un programa que pregunte el nombre del usuario en la consola
y después de que el usuario lo introduzca muestre por pantalla la cadena
¡Hola <nombre>!, donde <nombre> es el nombre que el usuario haya introducido.

 */
public class ejercicio4_pedirPorConsola {

    public static void main(String[] args) throws IOException {

        InputStreamReader leerTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(leerTeclado);

        System.out.print("Cual es tu nombre: ");
        String nombreUsuario = reader.readLine();
        
        System.out.println("Hola! " + nombreUsuario);
    }
}
