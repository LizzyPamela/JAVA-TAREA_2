/*(Calculadora del índice de masa corporal) En el ejercicio 1.10 introdujimos la calculadora del índice de 
masa corporal (BMI).
Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del 
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. 
Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de 
Salud para que el usuario pueda evaluar su BMI:

VALORES DE BMI
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o más
*/
import java.util.Scanner;
public class Ejercicio2_33 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    double peso, alt, IBM;
    System.out.print("\n\n");
    System.out.println("\t\t CALCULADORA DE INDICE DE MASA CORPORAL\n");
    System.out.print("Indique su peso en libras: ");
    peso = sc.nextDouble();
    System.out.print("Indique su altura en pulgadas: ");
    alt = sc.nextDouble();
    
    IBM = (703*peso)/(alt*alt);

    System.out.printf("\nSu indice de masa corporal es %f", IBM);

    if(IBM < 18.5 ){
        System.out.print(". Usted esta en la categoria de bajo peso.");
    }

    if(IBM >= 18.5 && IBM <=24.9 ){
        System.out.print(". Usted esta en la categoria de peso normal.");
    }
    if(IBM >= 25 && IBM <=29.9){
        System.out.print(". Usted esta en la categoria de sobrepeso.");
    }
    if(IBM >= 30 ){
        System.out.print(". Usted esta en la categoria de obesidad.");
    }

    System.out.print("\n\n");

    sc.close();

    }
}
