/*(Separación de los dígitos en un entero) Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás 
por tres espacios */
import java.util.Scanner;

public class Ejercicio2_30 {
    public static void main(String[]args) {
    
    Scanner sc = new Scanner(System.in);

    int num = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
    int resul1 = 0, resul2 = 0, resul3 = 0, resul4 = 0;
    System.out.print("\n\n");
    System.out.print("Digite un numero de 5 cifras: ");
    num = sc.nextInt();
    
    resul1 = num / 10;
    d1 = num % 10;

    resul2 = resul1 / 10;
    d2 = resul1 % 10;

    resul3 = resul2 / 10;
    d3 = resul2 % 10;

    resul4 = resul3 / 10;
    d4 = resul3 % 10;

    d5 = resul4 % 10;

    System.out.printf("\nEl numero separado en digitos es: %d    %d    %d    %d    %d", d5, d4, d3, d2, d1);
    System.out.print("\n\n");

    sc.close();
        
    }
}
