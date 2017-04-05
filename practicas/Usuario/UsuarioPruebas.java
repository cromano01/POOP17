import java.io.*;
import java.util.*;

public class UsuarioPruebas{

public static void main(String []args){
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Lector reader = new Lector();
Fecha fechaNac = new Fecha();
Usuario usu = new Usuario();


System.out.printf("\nIngresa tu nombre: ");
usu.asignarNombre(reader.leeString());
System.out.println("\n******************");
System.out.printf("\n¿Cómo deseas ser llamado?: ");
usu.asignarNickname(reader.leeString());
System.out.println("\n******************");
System.out.printf("\nIngresa tu direccion: ");
usu.asignarDireccion(reader.leeString());
System.out.println("\n******************");
System.out.printf("\nIngresa tu teléfono: ");
usu.asignarTelefono(reader.leeInt());
System.out.println("\n******************");
System.out.println("******************");
System.out.println("\nIngresa tu fecha de nacimiento dd-mm-aaaa");
System.out.println("\n******************");
System.out.printf("\nDia: ");
fechaNac.asignarDia(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nMes: ");
fechaNac.asignarMes(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nAnio: ");
fechaNac.asignarAnio(reader.leeInt());
usu.asignarFechaDeNacimiento(fechaNac);
System.out.println("\n******************");
System.out.println("******************");
System.out.println(usu);

System.out.println("\n\n******************");
System.out.println("\n\n******************");
System.out.println("\nCambio de usuario");
System.out.println("\n\n******************");
System.out.println("\n\n******************");


Usuario usu1 = new Usuario("","");

System.out.printf("\nIngresa tu nombre: ");
usu1.asignarNombre(reader.leeString());
System.out.println("\n******************");
System.out.printf("\n¿Cómo deseas ser llamado?: ");
usu1.asignarNickname(reader.leeString());
System.out.println("\n******************");
System.out.println(usu1);

System.out.println("\n\n******************");
System.out.println("\n\n******************");
System.out.println("\nCambio de usuario");
System.out.println("\n\n******************");
System.out.println("\n\n******************");

Usuario usu2 = new Usuario(" ", 0, 0);
Fecha fechaNac2 = new Fecha();
System.out.printf("\nIngresa tu nombre: ");
usu2.asignarNombre(reader.leeString());
System.out.println("\n******************");

System.out.printf("\nIngresa tu teléfono: ");
usu2.asignarTelefono(reader.leeInt());
System.out.println("\n******************");
System.out.println("******************");
System.out.println("\nIngresa tu fecha de nacimiento dd-mm-aaaa");
System.out.println("\n******************");
System.out.printf("\nDia: ");
fechaNac2.asignarDia(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nMes: ");
fechaNac2.asignarMes(reader.leeInt());
System.out.println("\n******************");
System.out.printf("\nAnio: ");
fechaNac2.asignarAnio(reader.leeInt());
usu2.asignarFechaDeNacimiento(fechaNac2);
System.out.println(usu2);

}//fin del metodo main

	
}//fin de la clase