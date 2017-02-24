import java.io.*;
import java.util.*;


public class NelemenConDigitFin{
	
public static void main(String[] args){
	

	        Scanner valores = new Scanner(System.in);

        int n = 0;
                int x = 0;
        int i;

        System.out.println("");
        System.out.println("Programa que indica los numeros finalizados en el digito que escoja el usuario de entre un rango de numeros enteros positivos del numero 1 al 300");
        System.out.println("");
        System.out.printf("Indica la cantidad de numeros que mostrará el Programa: ");
        n = valores.nextInt();
        System.out.println("");
        int numerosElegidos[] = new int[n];
		Random rango = new Random();
		System.out.println("Indica en que numero deben terminar	\n los numero que te voy a mostrar dentro de la seleccion de numeros aleatorios");
        x = valores.nextInt();
        
        // muestra valores
        for (i = 0; i <n; i++) {
        	//System.out.println(rango.nextInt(300-0+1));
        	numerosElegidos[i]=rango.nextInt(300-0+1);
        	//numerosElegidos[i]=1;

    	}

        System.out.println("Imprimo numeros Elegidos aleatorimente: ");

        for (i = 0; i < n; i++) {
		System.out.printf(numerosElegidos[i]+", ");        
	}

	for (i = 0; i < n; i++) {
		if(numerosElegidos[i]%10==x)
		    System.out.println("Incidencias de x, que es el numero de fin de cifra "+numerosElegidos[i]);        
	}

        /*
        
        System.out.printf("Indica el digito final de los numeros que mostrará el Programa: ");

        for (i = 0; i < n; i++) {
            System.out.print("Indica el valor del elemento " + (i+1) + " del arreglo: ");
            numeros[i] = valores.nextInt();
          

        }
*/  
//fin de main        
}

// fin de clase
}