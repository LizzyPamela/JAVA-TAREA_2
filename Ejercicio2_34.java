/*Use Web para determinar la población mundial 
actual y la tasa de crecimiento anual de la población mundial. Escriba una aplicación que reciba estos valores como 
entrada y luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años.

La tasa de crecimiento poblacional es equivalente a:  TCP = (poblacion_actual / poblacion_pasada) - 1
*/


import java.util.Scanner;

public class Ejercicio2_34 {
    public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);

       double  a1, a2, a3, a4, a5, a6, TCP;
       double aa = 78749657.32; //Pobalcion registrada de 2021 divida entre 100 para ser soportada por los parametros de Java
      System.out.print ("\n\n");
      System.out.println("\t TASA DE CRECIMIENTO POBLACIONAL");
      System.out.println("Con este programa calcularemos la tasa de poblacion mundial, y la\npoblacion estimada desde 2022 hasta 2027. ");
      System.out.print("Digite la poblacion mundial actual: "); // La pobalcion actual es de 7950313890
      a1 = sc.nextDouble();
    
      TCP = ((a1 /(aa*100) ) - 1);

      System.out.printf("La tasa de crecimiento poblacional de 2021 a 2022 es %.2f", TCP);
      a2 = a1 + a1*TCP;
      System.out.printf("\nSe estima que la poblacion mundial en 2023 sera de %.0f ", a2 );
      a3 = a2 + a2*TCP;
      System.out.printf("\nSe estima que la poblacion mundial en 2024 sera de %.0f " , a3);
      a4 = a3 + a3*TCP;
      System.out.printf("\nSe estima que la poblacion mundial en 2025 sera de %.0f ", a4);
      a5 = a4 + a4*TCP;
      System.out.printf("\nSe estima que la poblacion mundial en 2026 sera de %.0f ", a5);
      a6 = a5 + a5*TCP;
      System.out.printf("\nSe estima que la poblacion mundial en 2027 sera de %.0f ", a6);

      System.out.print("\n\n");
      
      sc.close();
    }
    
}
