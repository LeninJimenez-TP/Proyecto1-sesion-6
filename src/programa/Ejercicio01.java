
package programa;

/*Crear un programa en java que permita ingresar un numero
calcule su factorial
ejemplo
factorial de 10
resultado:
3,628,800
 
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        //declarar variables
        int numero, factorial,contador;
        Scanner lectura = new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar un numero:");
        numero=lectura.nextInt();
        //proceso de datos
        factorial = 1;
        contador = 1;
        
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }
        //salida de datos
     System.out.println("El factorial de un numero es: " +factorial);
    }
}
