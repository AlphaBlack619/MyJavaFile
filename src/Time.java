import java.util.Scanner;

   public class Time {
    	 public static void main(String [] args ) {
     
         Scanner input = new Scanner(System.in);
         
 	System.out.print("Enter the integer: ");
   	int integer = input.nextInt();
   
  	 if (integer % 5 == 0)
   	System.out.println("Hi Five");
 	  if (integer % 2 == 0)
  	 System.out.println("Hi Even");
   
  	 int a = 3, y = 3;
   	if (a > 2)
	if (y > 2) {
	int z = a + y;
	System.out.println("z is " + z);
	}
	else
	System.out.println("x is " + a);
   
 	  final double EPSILON = 1E-14;
	double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
	if (Math.abs(x - 0.5) < EPSILON)
	System.out.println(x + " is approximately 0.5");

     
     
     }
     }
