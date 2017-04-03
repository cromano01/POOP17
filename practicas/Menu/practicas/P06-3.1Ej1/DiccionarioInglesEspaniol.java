
import java.util.*;

public class DiccionarioInglesEspaniol {
	static String[] parejaEsp = new String[100];
    static String[] parejaIng = new String[100];


    public static void CrearDiccionario() {

        

        parejaEsp[0] = "Verde";
        parejaEsp[1] = "Rojo";
        parejaEsp[2] = "Azul";
        parejaEsp[3] = "Negro";
        parejaEsp[4] = "Café";
        parejaEsp[5] = "Amarillo";
        parejaEsp[6] = "Blanco";

        parejaIng[0] = "Green";
        parejaIng[1] = "Red";
        parejaIng[2] = "Blue";
        parejaIng[3] = "Black";
        parejaIng[4] = "Brown";
        parejaIng[5] = "Yellow";
        parejaIng[6] = "White";

    }

    public static void Traducir() {

        String palabra;

        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String sTexto = reader.next();

        for (int i = 0; i < 100; i++) {
            if (parejaEsp[i].equals(sTexto)) {
                System.out.println("Su traduccion es: " + parejaIng[i]);
            }
        }

        for (int i = 0; i < 100; i++) {
            if (parejaIng[i].equals(sTexto)) {
                System.out.println("Its translation is: " + parejaEsp[i]);
            }
        }

    }


    public static void InicializarArreglos(){

    	for (int i = 0; i < 100; i++) {
    		parejaEsp[i]="";
    	}
    	for (int i = 0; i < 100; i++) {
    		parejaIng[i]="";
    	}
    	

    }

    public static void main(String[] args) {

    	InicializarArreglos();

        CrearDiccionario();

        Traducir();

    }

}

