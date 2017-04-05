import java.io.*;
import java.util.*;


public class DirectorioDeUsuariosPruebas{
	


/*
public boolean iniciarSesion(){


}
*/

public static void main(String []args){
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Lector reader = new Lector();
Fecha fecNac = new Fecha();
DirectorioDeUsuarios dirusu = new DirectorioDeUsuarios();


System.out.printf("\nIngresa tu nombre: ");
dirusu.asignarNombre(reader.leeString());
System.out.println("\n******************");
System.out.printf("\n¿Cómo deseas ser llamado?: ");
dirusu.asignarNickname(reader.leeString());
System.out.println("\n******************");
System.out.printf("\nIngresa tu direccion: ");
dirusu.asignarDireccion(reader.leeString());
System.out.println("\n******************");
System.out.printf("\nIngresa tu teléfono: ");
dirusu.asignarTelefono(reader.leeInt());
System.out.println("\n******************");
System.out.println("******************");
System.out.println("\nIngresa tu fecha de nacimiento dd-mm-aaaa");
System.out.println("\n******************");
System.out.printf("\nDia: ");
fecNac.asignarDia(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nMes: ");
fecNac.asignarMes(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nAnio: ");
fecNac.asignarAnio(reader.leeInt());
dirusu.asignarFechaDeNacimiento(fecNac);
System.out.println("\n******************");
System.out.println("******************");
System.out.println(dirusu);

System.out.println("\n\n******************");
System.out.println("\n\n******************");
System.out.println("\nCambio de usuario");
System.out.println("\n\n******************");
System.out.println("\n\n******************");


}//fin del metodo main

	
}//fin de la clase