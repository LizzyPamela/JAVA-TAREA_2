
/* Ejercicio 2.15 (Aritmética) Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los
 números del usuario e imprima la suma, producto, diferencia y cociente (división) de los números. Use las técnicas
  que se muestran en la figura 2.7*/

  import java.util.Scanner;

  public class Ejercicio2_15{
  
  
      public static void main(String[]args){
          Scanner entrar = new Scanner(System.in);
  
          float num1, num2, sum, dif, prod, coci;
          System.out.print("\n\n");
          System.out.print("Digite el primer numero: ");
          num1 = entrar.nextFloat();
          System.out.print("Digite el segundo numero: ");
          num2 = entrar.nextFloat();
  
          sum = num1 + num2;
          dif = num1 - num2;
          prod = num1*num2;
          coci = num1/num2;
  
          System.out.printf("\nLa suma de los numeros es: %.2f", sum);
          System.out.printf("\nLa diferencia  de los numeros es: %.2f", dif);
          System.out.printf("\nEl producto de los numeros es: %.2f", prod);
  
          if (num2 == 0){
              System.out.println("\nLa division entre cero no esta definida.\n\n");
          }
          if (num2 != 0){
              System.out.printf("\nLa division de los numeros es: %.2f", coci);
  
          }
          entrar.close();
          System.out.print("\n\n");
      }
  }