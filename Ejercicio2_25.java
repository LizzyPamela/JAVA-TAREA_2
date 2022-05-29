/*(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par
  [sugerencia: use el operador residuo. Un número par es un múltiplo de 2. Cualquier
   múltiplo de 2 deja un residuo de 0 cuando se divide entre 2]. */

import java.util.Scanner;

public class Ejercicio2_25 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int num, eva;
        System.out.print("\n\n");
        System.out.println("Numeros pares e impares");
        System.out.print("\nDigite un numero: ");
        num = sc.nextInt();

        eva = num % 2;

        if( eva == 0){
            System.out.println("El numero digitado es un numero par. ");
        }
        
        if( eva != 0){
            System.out.println("El numero digitado es un numero impar.");

        }
        System.out.print("\n\n");

        sc.close();

    }

    
}
