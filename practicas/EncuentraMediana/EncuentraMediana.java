
import java.util.*;

/**
 *
 * @author Host
 */
public class EncuentraMediana {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        int n = 0;
        int i;

        System.out.println("");
        System.out.println("Programa que indica la mediana de un array de numero impar de elemetos");
        System.out.println("");
        System.out.printf("Indica el tamaño del arreglo que sea un numero impar: ");
        n = valores.nextInt();
        System.out.println("");
        int numeros[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Indica el valor del elemento " + (i+1) + " del arreglo: ");
            numeros[i] = valores.nextInt();
            

        }

      
/*      // Mostrar valores
        System.out.println("Estos son los valores del arreglo: ");
        for (i = 0; i < n; i++) {
            System.out.println("Elemento " + (i+1) + " del arreglo: " + numeros[i]);
        }
*/
        // Ordenar valores
     
     int cambio;
        for (i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++){
                        if (numeros[i] < numeros[j]) {
                cambio = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = cambio;
            }
            }
        }
    /*   System.out.println( "Ahora estos son los valores ORDENADOS DE MANERA ASCENDENTE del arreglo: ");
      for (i = 0; i < n;i++) {
            System.out.println("Elemento " + (i+1) + " del arreglo: " + numeros[i]);

      }
*/
       System.out.println("");
       System.out.printf( "\tLa mediana es: ");
       System.out.println( numeros[n/2] );
       System.out.println("");
      

    }

}
