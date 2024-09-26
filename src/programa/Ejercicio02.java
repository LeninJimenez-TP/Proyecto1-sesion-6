
package programa;

/*Crear un programa en java que permita ingresar un numero
verificar si es un numero primo o no
ejemplo:
numero = 13
resultado:
es un numero primo
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        //declarar variables
        int numero, primo,i;
        Scanner lectura = new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar un numero:");
        numero=lectura.nextInt();
        //proceso de datos
        boolean esPrimo = true;
        i = 2;
         while (i <= numero / 2) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
            i++;
        }
         //salida de datos
     if (esPrimo && numero > 1) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}