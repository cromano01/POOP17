import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Menu {

    public static void main(String []agrs)
    {
		Scanner sc = new Scanner(System.in);
		int op=0;
		double n1,n2,s=0,m=0,d=0,r=0;
		do{
          
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("This program is a Calculator and provides you with 5 options, that are: ");
			System.out.println("[1] ADDITION");
			System.out.println("[2] SUSTRACTION");
			System.out.println("[3] MULTIPLICATION");
			System.out.println("[4] DIVISION");
			System.out.println("[5] EXIT");

				try{ op=Integer.parseInt(br.readLine());
				}catch (Exception e){
					System.out.println("Intenta solo numeros del 1 al 5, por favor");
						op=5;
						}
						
						
			if(op<1){
				System.out.println("Intenta solo numeros del 1 al 12, por favor");
				op=5;

					}

				switch(op)
				{	
					case 1:
					System.out.println("Type the 1st number");
					n1=sc.nextDouble();
					System.out.println("Type the 2nd number");
					n2=sc.nextDouble();
					s=n1+n2;
				
					System.out.println("Sum result: "+s);
					break;
					case 2:
					System.out.println("Type the 1st number");
					n1=sc.nextDouble();
					System.out.println("Type the 2nd number");
					n2=sc.nextDouble();
					r=n1-n2;
					System.out.println("Subtractios result:"+r);
					break;
					case 3:
					System.out.println("Type the 1st number");
					n1=sc.nextDouble();
					System.out.println("Type the 2nd number");
					n2=sc.nextDouble();
					m=n1*n2;
					System.out.println("La multiplication es:"+m);
					break;
					case 4:
					System.out.println("Type the 1st number");
					n1=sc.nextDouble();
					System.out.println("Type the 2nd number");
					n2=sc.nextDouble();
					d=n1/n2;
					System.out.println("Division result:"+d);
					break;

				}
        }while(op!=5);
    }

}