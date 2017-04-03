import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class OddEven {  // Save as "OddEven.java"
   public static void main(String[] args) throws NumberFormatException, IOException {
      int lowerbound = 1, upperbound = 1000;
      
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the number: ");
   Integer number=Integer.parseInt(br.readLine());
         if (number % 2 == 0) {  // Even
      System.out.println("The number is even");   // Same as sumEven = sumEven + number
         } else {                // Odd
System.out.println("The number is odd"); // Same as sumOdd = sumOdd + number
         }
       
      // Print the result
	  System.out.println("Next text: ");
	  String text=br.readLine();
	  System.out.println("text= "+text);	  
   }
   }
