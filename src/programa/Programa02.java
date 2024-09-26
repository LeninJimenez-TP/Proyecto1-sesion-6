
package programa;

/*
Crear un programa en java que permita ingresar la cantidad.
Visualizar la cantidad ingresada de forma invertida.
Por ejemplo:
Cantidad=123
Resultado:
caninv:321
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //declarar variables
        int cantidad,caninv,dig;
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        caninv=0;
        dig=0;
        while(cantidad>0){
             dig=cantidad%10;
             caninv=(caninv*10)+dig;
            cantidad=cantidad/10;
        }
        //salida de datos
        System.out.println("la cantidad invertida es:"+caninv);
    }
    
}
