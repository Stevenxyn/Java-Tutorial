package javacurso;

public class JAVA_variables {

    public static void main(String[] args) {

        //Cadenas de texto
        String nombre = "El gato con botas";
        nombre = "Burro de Shker";
        System.out.println(nombre);

        //Numero enteros
        int edad = 5;
        edad = 25;
        System.out.println(edad);

        //Booleano
        boolean estaVivo = true;
        estaVivo = false;
        System.out.println(estaVivo);

        //Float 
        float valorFloat = 45.123f;
        System.out.println(valorFloat);

        //Double - Mas presicion en decimales
        double valorDouble = 89.2900194800592;
        System.out.println(valorDouble);

        //Char caracter
        char tipoSexo = 'M';
        System.out.println(tipoSexo);

        System.out.println("*****************************************************");

        String studentName = "Steven Lopez";
        int studentID = 72718;
        int studentAge = 24;
        float StudentFee = 72.25f;
        char studentGrade = 'C';

        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Fee: " + StudentFee);
        System.out.println("Student Grade: " + studentGrade);

        
        
        System.out.println("*****************************************************");

        int lenght = 4;
        int width = 6;
        int area;
        
        //Calculate the area of the rectangle
        area = lenght * width;
        
        System.out.println("Lenght is: " + lenght);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
        
        
    }

}
