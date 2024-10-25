package javacurso;

public class Javacurso {

    public static void main(String[] args) {

        String nombre = "Steven Lopez ";
        System.out.println(nombre);

        String texto = "Esto es una cadena de texto.";
        //System.out.println(texto);
        texto = "Esto es una cadena de texto que fue modificada.";
        //System.out.println(texto);
        texto = "Cadena de texto ultima modificacion.";
        System.out.println(texto);

        String agrupacion = 
                "Bienvenido " + nombre + "Actualmente tienes " + 2 + " Certificaciones";
        System.out.println(agrupacion);
        
        //Para sumar valores numericos se deben encapsular dentro de ()
        System.out.println("Tus metas salariales son: $" + (15000000 + 5000000) + " Neto mensuales");
        
        System.out.println("********************************************");
        
        //Ejemplo de Debugging
        int age = 19;
        boolean esMayorDeEdad = age >= 18;
        
        if(esMayorDeEdad){
            System.out.println("Es mayor de edad y tiene: " + age);
        }else{
            System.out.println("Aun es menor de edad tiene: " + age);
        }
        
        
        

    }

}
