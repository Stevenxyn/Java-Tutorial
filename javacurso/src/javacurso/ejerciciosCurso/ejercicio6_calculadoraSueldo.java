/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacurso.ejerciciosCurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Escribir un programa que pregunte al usuario por el número de horas 
trabajadas y el coste por hora. Después debe mostrar por pantalla
la paga que le corresponde.
 */
public class ejercicio6_calculadoraSueldo {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader leerTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(leerTeclado);
        
        System.out.print("Cuantas horas trabajo hoy?: ");
        String strHorasLaboradas = reader.readLine();
        double horasLaboradas = Double.parseDouble(strHorasLaboradas);
        
        System.out.print("Cuanto cuesta una hora laboral?: ");
        String strSueldoPorHora = reader.readLine();
        double sueldoPorHora = Double.parseDouble(strSueldoPorHora);
        
        double calculoPagarTotal = sueldoPorHora * horasLaboradas;
        
        System.out.println(
                "Se te debe pagar tu turno un total de " 
                        + calculoPagarTotal + " por las " + horasLaboradas + " horas trabajadas");
        
        
        
    }

}
