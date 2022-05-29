/*(Enteros menor y mayor) Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros 
mayor y menor en el grupo. Use solamente las técnicas de programación que aprendió en este capítulo */
import java.util.Scanner;

public class Ejercicio2_24 {


public static void main(String[]arg) {
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3, num4, num5;
    System.out.print("\n\n");
    System.out.println("Determinar el Mayor y Menor numero en el conjunto");
    System.out.print("Digite el primer numero: "); 
    num1 = sc.nextInt();
    System.out.print("Digite el segundo numero: "); 
    num2 = sc.nextInt();
    System.out.print("Digite el tercero numero: "); 
    num3 = sc.nextInt();
    System.out.print("Digite el cuarto numero: "); 
    num4 = sc.nextInt();
    System.out.print("Digite el quinto numero: "); 
     num5 = sc.nextInt();

    //Evaluacion de el mayor numero en el conjunto
    System.out.print("\n\n");
     if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
         System.out.printf("%d", num1);
         System.out.print(" es el mayor de todos los numeros y ");
     }
     if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
        System.out.printf("%d", num2);
        System.out.print(" es el mayor de todos los numeros y ");
    }
    if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
        System.out.printf("%d", num3);
        System.out.print(" es el mayor de todos los numeros y ");
    }
    if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
        System.out.printf("%d", num4);
        System.out.print(" es el mayor de todos los numeros y ");
    }
    if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
        System.out.printf("%d", num5);
        System.out.print(" es el mayor de todos los numeros y ");
    }

    //Evaluacion de el menor numero de todo el conjunto
    if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
        System.out.printf("%d", num1);
        System.out.print(" es el menor de todos los numeros.");
    }
    if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
       System.out.printf("%d", num2);
       System.out.print(" es el menor de todos los numeros.");
   }
   if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
       System.out.printf("%d", num3);
       System.out.print(" es el menor de todos los numeros.");
   }
   if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
       System.out.printf("%d", num4);
       System.out.print(" es el menor de todos los numeros.");
   }
   if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
       System.out.printf("%d", num5);
       System.out.print(" es el menor de todos los numeros.");
   }
   System.out.print("\n\n");
    sc.close();
    
}
    
}
