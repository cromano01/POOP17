public class VariablesDeclarationG{

byte bytevar = 127;
short shortvar = 32767;
int intvar = 2147483647;
long longvar = 9223372036854775807L;
char charvar = 72;

String stringvarN = null;
String stringvarHJ = "hola java";


public static void main(String[] args) {

VariablesDeclarationG VD= new VariablesDeclarationG();

System.out.println("mi var es byte var = "+ VD.bytevar);
System.out.println("mi var es corta var = "+ VD.shortvar);
System.out.println("mi var es entera var = "+ VD.intvar);
System.out.println("mi var es larga var = "+ VD.longvar);
System.out.println("mi var es de carcacteres = "+ VD.charvar);
System.out.println("mi var es cadena de caracteres apuntanndo a NULL = "+ VD.stringvarN);
System.out.println("mi var es cadena de caracteres frase = "+ VD.stringvarHJ);
	
}

}