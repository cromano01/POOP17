import java.util.*;

public class RegistroDeAlumnos {

  
    public static void main(String[] args) {
    	InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader (isr);

    	//Scanner calilfk=new Scanner(System.in);

        /*Almacenar la calificación de 10 alumnos; en un arreglo de enteros insertar calificaciones
entre 0 y 10*/
int n=10;
float calificaciones[] = new float[n];

String nombres[] = new String[n];
String nombre="";
if(n<=10){

for (int i=0;i<n;i++){
 System.out.println("Ingrese el nombre del alumno: "); 
 //nombres[i]=in.nextString();
// System.out.println(in.next());
 nombres[i]=in.next();
 System.out.println("Ingrese la calificacion del alumno: "); 
// calificaciones[i]=in.nextfloat();
//  System.out.println(in.next());
  calificaciones[i]=in.nextFloat();
   System.out.println(" >> Siguiente alumno >> "); 
 }
	System.out.println("Sale del for de registro");

}

for (int i=0;i<n;i++){

if (calificaciones[i]>=0 && calificaciones[i]<=4.99){
	System.out.println("La calificacion para " + nombres[i]+ "es: " +calificaciones[i]);
	System.out.println("Es REPROBADO");
}
}

for (int i=0;i<n;i++){

if (calificaciones[i]>=5 && calificaciones[i]<=6.99){
	System.out.println("La calificacion para " + nombres[i]+ "es: " +calificaciones[i]);
	System.out.println("Es BIEN");
}
}

for (int i=0;i<n;i++){

if (calificaciones[i]>=7 && calificaciones[i]<=8.99){
	System.out.println("La calificacion para " + nombres[i]+ "es: " +calificaciones[i]);
	System.out.println("Es NOTABLE");
}
}

for (int i=0;i<n;i++){

if (calificaciones[i]>=9 && calificaciones[i]<=10){
	System.out.println("La calificacion para " + nombres[i]+ "es: " +calificaciones[i]);
	System.out.println("Estas reprobado");
}
}
/*
// impresion de datos
for (int i=0;i<n;i++){
 System.out.println("Estas son las notas de: " +
 */ 
    }
    
}
