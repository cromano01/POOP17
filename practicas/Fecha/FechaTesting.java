
import java.io.IOException;
import java.util.*;
import jdk.nashorn.internal.runtime.JSType;

public class FechaTesting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0, a = 0;
        String m = "";

        //Se pide por teclado el dia, mes y año
        System.out.println("Programa para intoducir y validar fechas ");
        System.out.println("Introduce fecha como se te pide...");

        do {
            System.out.printf("Ingresa el dia: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error en los datos ingresados");
                System.out.println("Intenta de nuevo");
                System.out.printf("Ingresa el dia: ");
                sc.next();
            }
            d = sc.nextInt();
        } while (d <= 0);

        try {
            System.out.print("Ingresa el mes: ");
            m = sc.next();
        } catch (Exception e) {
            System.out.println("Error en los datos ingresados");
        }
         do {
            
             System.out.print("Ingresa el año: ");
            while (!sc.hasNextInt()) {
            System.out.println("Error en los datos ingresados");
                System.out.println("Intenta de nuevo");
                System.out.printf("Ingresa el año: ");
                sc.next();
            }
            a = sc.nextInt();
        } while (a <= 0);

        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Fecha fecha = new Fecha(d, m, a);
        boolean bandera = fecha.fechaCorrecta();
        if (bandera) { //si la fecha es correcta

            //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida, es correcta, es: " + fecha.ObtenerFecha());

        } else { //mala fecha
            System.out.println(fecha.MalaFecha());
        }

        Fecha fechaCal = new Fecha(d, m, a);
        fechaCal.asignarFechaCalendario();

    }
}
