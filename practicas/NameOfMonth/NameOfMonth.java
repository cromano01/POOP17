import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class NameOfMonth {

   public static void main(String[] args) throws NumberFormatException, IOException {
	int num=0;
   do{
	   
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\nThis program tells you the name of a month based on the number assigned to it. \n");
    System.out.println("\nSo, please select a number between 1 and 12 for the program to name you the month. \n");
   try{num=Integer.parseInt(br.readLine());}catch (Exception e){System.out.println("\n\tIntenta solo numeros del 1 al 12, por favor\n");
   num=13;
   
   }
if(num<1){
	System.out.println("\n\tIntenta solo numeros del 1 al 12, por favor\n");
	num=13;

}
   switch (num)
    {
    case 1:
        System.out.println ("\n\t January // *Esp= Yanuari\n");
        break;
    case 2:
        System.out.println ("\n\t February\n");
        break;
    case 3:
        System.out.println ("\n\t March // *Esp= March\n");
        break;
    case 4:
        System.out.println ("\n\t April // *Esp= Eipril\n");
        break;
    case 5:
        System.out.println ("\n\t May // *Esp= Mei\n");
        break;
    case 6:
        System.out.println ("\n\tJune // *Esp= Yun\n");
        break;
    case 7:
        System.out.println ("\n\t July // *Esp= Yulai \n");
        break;
    case 8:
        System.out.println ("\n\t August // *Esp= Ogost\n");
        break;
    case 9:
        System.out.println ("\n\t September\n");
        break;
    case 10:
        System.out.println ("\n\t October\n");
        break;
    case 11:
        System.out.println ("\n\t November\n");
        break;
    case 12:
        System.out.println ("\n\t December\n");
        break;
        default:
            System.out.println ("\n\t You have entered an invalid number");
        }
		
		  }while(num!=13 || num>13);
    } // main method
}
 