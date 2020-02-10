package epam.com.simple_calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	 System.out.println( "Simple Calcii!" );
         @SuppressWarnings("resource")
 		Scanner s1=new Scanner(System.in);
         while(true) {
         	System.out.println("Enter number 1:\n");
 	        int a = s1.nextInt();
 	        System.out.println("Enter number 2:\n");
 	        int b = s1.nextInt();
 	    System.out.println("Enter operation choice:\n1.Addition\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus\n");
 	    int choice = s1.nextInt();
 	    choice=choice-1;
         if(choice<0 || choice>5) throw new Exception("Enter a valid caluculatormethodsion.");
         	int[] x = new int[5];
 			@SuppressWarnings("unused")
 			int[] operations = {
 					x[0] = caluculatormethods.plus(a,b),
         			x[1] = caluculatormethods.subtract(a,b),
         			x[2] = caluculatormethods.multiply(a,b),
         			x[3] = caluculatormethods.divide(a,b),
         			x[4] = caluculatormethods.modulusdivision(a,b),
         	};
 			System.out.println(x[choice]);
 			System.out.println("Press 0 to exit");
 			int ch = s1.nextInt();
 			if(ch==0) {
 				break;
 			}
         }
    }
}
