//Calcular el promedio de un numero en base a tres numeros leidos  por el teclado
import java.util.Scanner;

public class Promedio{

    public static void main(String[]args) {
      float num1, num2, num3, prom;
    System.out.print("\n\n");
    Scanner entrar = new Scanner(System.in);
    System.out.println("******************************************************");
    System.out.print("Digite la primera nota: "); 
    num1 = entrar.nextFloat();
    System.out.print("Digite la segunda nota: "); 
    num2 = entrar.nextFloat();
    System.out.print("Digite la tercera nota: "); 
    num3 = entrar.nextFloat();

    prom = (num1 + num2 + num3)/3;

        if(prom > 65){
          System.out.printf("\nUsted ha aprobado con %.2f", prom, "\n");
          System.out.println("\n******************************************************");}

        if(prom < 65){
          System.out.printf("\nUsted ha desaprobado %.2f", prom, "\n");
          System.out.println("\n******************************************************");}
          entrar.close();
          System.out.print("\n\n");
    }
    


}