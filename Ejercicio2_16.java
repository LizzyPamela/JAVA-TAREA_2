/*2.16 (Comparacion de enteros) Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
los numeros del usuario y muestre el número más grande, seguido de las palabras es más grande. Si los numeros son 
iguales, imprima el mensaje, Estos numeros son iguales. Utilice las tecnicas que se muestran en la figura 2 15 */


import java.util.Scanner;

public class Ejercicio2_16 {

    public static void main(String[]arg){

    Scanner sc = new Scanner(System.in);
    int num1, num2;
        System.out.print("\n\n");
        System.out.print("\tComparando numeros");
        System.out.print("\nDigite el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = sc.nextInt();
    
        if(num1 > num2){
            System.out.printf("%d", num1);
            System.out.print("  es el mas grande.");
        }
    
        if(num2 > num1){
           System.out.printf("%d", num2);
           System.out.print( "  es el mas grande.");
        }
        
        if(num1 == num2){
            System.out.print( "Estos numeros son iguales.");
        }


    sc.close();
    System.out.print("\n\n");
    }
    
}