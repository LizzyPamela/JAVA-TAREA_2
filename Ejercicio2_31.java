/*(Tabla de cuadrados y cubos) Utilizando sólo las técnicas de programación
que aprendió en este capítulo, escriba una aplicación que calcule los cuadrados
y cubos de los números del 0 al 10, y que imprima los valores resultantes en formato de tabla,
como se muestra a continuació */
import java.lang.Math;


public class Ejercicio2_31 {
    public static void main(String[]args) {
    System.out.print("\n\n");
    System.out.print("  TABLA DE CUADRADOS Y CUBOS DEL 1 AL 10");

    System.out.print("\n\n\t1\t"); //Datos del 1
    System.out.print(Math.pow(1, 2));
    System.out.print("\t");
    System.out.println(Math.pow(1, 3));

    System.out.print("\t2\t"); //Datos del 2
    System.out.print(Math.pow(2, 2));
    System.out.print("\t"); 
    System.out.println(Math.pow(2, 3));

    System.out.print("\t3\t"); // Datos del 3
    System.out.print(Math.pow(3, 2));
    System.out.print("\t"); 
    System.out.println(Math.pow(3, 3));

    System.out.print("\t4\t"); //Datos del 4
    System.out.print(Math.pow(4, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(4, 3));

    System.out.print("\t5\t"); //Datos del 5
    System.out.print(Math.pow(5, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(5, 3));

    System.out.print("\t6\t"); //Datos del 6
    System.out.print(Math.pow(6, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(6, 3));

    System.out.print("\t7\t"); //Datos del 7
    System.out.print(Math.pow(7, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(7, 3));

    System.out.print("\t8\t"); //Datos del 8
    System.out.print(Math.pow(8, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(8, 3));

    System.out.print("\t9\t"); //Datos del 9
    System.out.print(Math.pow(9, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(9, 3));

    System.out.print("\t10\t"); //Datos del 10
    System.out.print(Math.pow(10, 2)); 
    System.out.print("\t"); 
    System.out.println(Math.pow(10, 3));
    System.out.print("\n\n");      
    }
    
}
