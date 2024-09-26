
package programa;

/*Escribe un programa en Java que encuentre la suma de los dígitos
 de un número ingresado.
ejemplo
numero=567
resultado= 18

 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        //declarar variables
        int numero, suma, digito;
        Scanner lectura = new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar un numero:");
        numero=lectura.nextInt();
        //proceso de datos
        suma=0;
        while (numero != 0) {
            digito = numero % 10;
            suma += digito;
            numero = numero / 10;
        }

        System.out.println("La suma de los dígitos es: " +suma);
    }
}
