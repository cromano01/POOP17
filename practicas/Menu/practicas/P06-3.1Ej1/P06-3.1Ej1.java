import java.util.*;

public class Calculadora{

public  static void Menu(){

Scanner S = new Scanner(System.in);
    int a=0, b=0, res=0;
    int  opcion;
    
        System.out.println("\n\n\tEste programa es un programa que a través de un menú,  ");
        System.out.println("\tpermitira realizar operaciones de sumar, restar, multiplicar,\n\tdividir y salir.");
        System.out.println("\tEl menú será visualizado por un método sin argumentos, \n\tque devolverá como resultado la opcion elegida.\n\n");
        System.out.println("\tLa ejecución será de la forma siguiente: \n");
        System.out.println("\t1.- sumar \n");
        System.out.println("\t2.- restar \n");
        System.out.println("\t3.- multiplicar \n");
        System.out.println("\t4.- dividir \n");
        System.out.println("\t5.- salir \n");

        System.out.printf("\tSelecciona la opcion deseada: ");
        opcion=S.nextInt();
        System.out.println("\n\n");
    switch (opcion)
    {
    case 1 :
    sumar();
        break;
    case 2:
    restar();
        break;
    case 3:
    multiplicar();
        break;
    case 4:
    dividir();
        break;
    case 5:
    salir();
        break;
        default:
        System.out.println("\tHa ingresado un valor no valido\n");
        break;
    }


    }

public static void sumar{

        System.out.println("\t1.- sumar\n");
        System.out.printf("\tDato 1: ");
        a=S.nextInt();
        System.out.printf("\tDato 2: ");
        b=S.nextInt();
        System.out.println("\n");
        System.out.println("\tDato 1: "+a);
        System.out.println("\tDato 2: "+b);
        res= a+b;
        System.out.println("\tResultado: "+ res);
}

public static void restar{

            System.out.println("\t2.- restar\n");

        System.out.printf("\tDato 1: ");
        a=S.nextInt();
        System.out.printf("\tDato 2: ");
        b=S.nextInt();
        System.out.println("\n");
        System.out.println("\tDato 1: "+a);
        System.out.println("\tDato 2: "+b);
        res= a-b;
        System.out.println("\tResultado: "+ res);
}

public static void multiplicar{

        System.out.println("\t3.- multiplicar\n");

        System.out.printf("\tDato 1: ");
        a=S.nextInt();
        System.out.printf("\tDato 2: ");
        b=S.nextInt();
        System.out.println("\n");
        System.out.println("\tDato 1: "+a);
        System.out.println("\tDato 2: "+b);
        res= a*b;
        System.out.println("\tResultado: "+ res);

}

public static void dividir{
            System.out.println("\t4.- dividir\n");

        System.out.printf("\tDato 1: ");
        a=S.nextInt();
        System.out.printf("\tDato 2: ");
        b=S.nextInt();
        System.out.println("\n");
        System.out.println("\tDato 1: "+a);
        System.out.println("\tDato 2: "+b);
        res= a/b;
        System.out.println("\tResultado: "+ res);
}
public static void salir{

        System.out.println("\t5.- salir\n");
        System.out.println("\tAdios! \n\n");
    }


public static void main(String[] args)
{

    Menu();


}
}
