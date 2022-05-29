/* 2.28 (Diámetro, circunferencia y área de un círculo) He aquí un adelanto. En este capítulo aprendió sobre los 
enteros y el tipo int. Java también puede representar números de punto flotante que contienen puntos decimales, 
como 3.14159. Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π. Use las 
técnicas que se muestran en la figura 2.7 [nota: también puede utilizar la constante predefinida Math.PI para el valor 
de π. Esta constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las clases en 
este paquete se importan de manera automática, por lo que no necesita importar la clase Math mediante la instrucción 
import para usarla]. Use las siguientes fórmulas (r es el radio):
diámetro = 2r
circunferencia = 2πr
área = πr2 
No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo como el valor que 
se imprimirá en una instrucción System.out.printf. Los valores producidos por los cálculos del área y 
 la circunferencia son números de punto flotante. Dichos valores pueden imprimirse con el especificador de formato %f en una
instrucción System.out.printf. */

import java.lang.Math;
import java.util.Scanner;

public class Ejercicio2_28 {
    public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);
    
    float rad;
    System.out.println("\n\n Diametro, circunferencia y area de un circulo");
    System.out.print(" \n Digite el radio del circulo: ");
    rad = sc.nextFloat();
    
    System.out.printf(" El diametro del circulo es %f", 2*rad);
    System.out.print("\n La circunferencia del circulo es ");
    System.out.printf("%f", Math.PI*rad*2);
    System.out.print("\n El area del circulo es ");
    System.out.printf("%f",Math.PI * Math.pow(rad, 2));
    System.out.print("\n\n");
    sc.close();    
    }
}