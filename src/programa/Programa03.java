
package programa;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualizar el digito mayor, la  cantidad de digitos impares
y la suma de nuemos pares.
Ejemplo:
cantidad 78952
resultados:
dmay=9
cdimp=3
sdpares=10
 */
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //declarar variables
        int cantidad, dmay, cdimp, sdpares, dig, r;
        Scanner lectura = new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        cdimp=0;
        sdpares=0;
        dmay=0;
        while (cantidad>0){
            dig=cantidad%10;
            if (dig>dmay){
                dmay=dig;
            }
            r=dig%2;
            if (r==0){
                sdpares += dig;
            }else{
                cdimp++;   
            }
            cantidad=cantidad/10;
        }
            //salida de datos
            System.out.println("El digito mayor es:" +dmay);
            System.out.println("La cantidad de digitos imp es:" +cdimp);
            System.out.println("La suma de los ditos pares es:" +sdpares);
        }
                
        
    
}
