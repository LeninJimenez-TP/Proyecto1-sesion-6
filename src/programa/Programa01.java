
package programa;

/* Crear un programa en java que permita ingresar una cantidad.
Visualidar en nunero de digitos de la cantidad ingresada.
 
Por ejemplo
Cantidad=1234
Resultado:
Candig=4
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declarar variables
        int cantidad,candig;
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        candig=0;
        while(cantidad>0){
            //variable del contador
            candig++;
            cantidad=cantidad/10;   
        }
         //salida de datos
         System.out.println("La cantidad de digitos es:"+candig);
    }
    
}
