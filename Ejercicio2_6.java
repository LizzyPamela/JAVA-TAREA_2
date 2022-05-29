/*  Utilice las instrucciones que escribió en el ejercicio 2.5 para escribir un programa completo que calcule e 
imprima el producto de tres enteros.
INSTRUUCCIONES EJERCICIO2.5
Escriba declaraciones, instrucciones o comentarios para realizar cada una de las siguientes tareas:
a) Indicar que un programa calculará el producto de tres enteros.
b) Crear un objeto Scanner llamado entrada que lea valores de la entrada estándar.
c) Declarar las variables x, y, z y resultado de tipo int.
d) Pedir al usuario que escriba el primer entero.
e) Leer el primer entero del usuario y almacenarlo en la variable x.
f) Pedir al usuario que escriba el segundo entero.
g) Leer el segundo entero del usuario y almacenarlo en la variable y.
h) Pedir al usuario que escriba el tercer entero.
i) Leer el tercer entero del usuario y almacenarlo en la variable z.
j) Calcular el producto de los tres enteros contenidos en las variables x, y y z, y asignar el resultado a la variable resultado.

*/
import java.util.Scanner;

public class Ejercicio2_6 {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\n");
        System.out.println("\t CALCULO EL PRODUCTO DE TRES ENTEROS");
        
        int x, y, z, resultado;

        System.out.print("Digite el primer numero: "); //lectura del primer numero
        x = entrada.nextInt();

        System.out.print("Digite el segundo numero: ");//lectura del segundo numero
        y = entrada.nextInt();

        System.out.print("Digite el tercer numero: ");//lectura del tercer numero
        z = entrada.nextInt();

        resultado = x * y * z;//Calculd del producto de los numeros digitados por el usuario

        System.out.print("\n");
        System.out.printf("El producto es %d" , resultado);
        //Impresion del producto final

        System.out.print("\n\n");

        entrada.close();     
    }
    
}
