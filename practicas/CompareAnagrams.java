/*
 Write a program that figures out whether // Escribir un programa que comprenda si
 one string is an anagram of another // Un String es un anagrama de otro String
 string. 
 The program should ignore white space and punctuation. 
 // El lprograma debería espacios en blanco y puntuaciones
 */

public class CompareAnagrams {

    public static void main(String[] args) {

        String str1 = new String("Armo con amor");
        String str2 = new String("Amor con mora");

        String str1cln = "";
        String str2cln = "";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println("Solo imprimi strings y sus longitudes\n");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str1cln += str1.charAt(i);

            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                str2cln += str2.charAt(i);

            }
        }
                System.out.println("Voy a imprimir en lowercases");
        str1cln = (str1cln.toLowerCase());
        str2cln = (str2cln.toLowerCase());
        System.out.println(str1cln);
        System.out.println(str1cln.length());
        System.out.println(str2cln);
        System.out.println(str2cln.length());
        String c;
        String d;
        String aux = new String();
        String aux2 = new String();
if(str1cln.length()==str2cln.length()){
    
    for (int i = 0; i < str1cln.length(); i++) {
            for (int j = 0; j < str2cln.length(); j++) {
                if (str1cln.charAt(i) == str2cln.charAt(j)) {
                    c = str1cln.charAt(i) + "";
                    System.out.println("Entro al if->c[" + i + "] " + c);

                    aux += c;
                    break;
                }
                //c="";
            }
        }

        for (int i = 0; i < str2cln.length(); i++) {
            for (int j = 0; j < str1cln.length(); j++) {
                if (str1cln.charAt(j) == str2cln.charAt(i)) {
                    d = str2cln.charAt(i) + "";
                    System.out.println("Entro al if->d[" + j + "] " + d);

                    aux2 += d;
                    break;
                }
                //c="";
            }
        }

        System.out.println("Salio de los fors");

        
        System.out.println(aux);
        System.out.println(aux.length());
        System.out.println(aux2);
        System.out.println(aux2.length());


        //String[] aux= new String[1];
        
        if (aux2.length() == aux.length()) {

            System.out.println("Si son anagrama");

        } else {
            System.out.println("No son anagrama");
        }
        
        }else{
    System.out.println("No son anagrama");
}

    }
}