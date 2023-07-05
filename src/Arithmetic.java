import java.util.*;

  public class Arithmetic {
    public static void main(String [] args) {
    
       Scanner scan = new Scanner(System.in);
       
   System.out.print("Enter number1: ");
   int number1 = scan.nextInt();
   
   System.out.print("Enter number2: ");
   int number2 = scan.nextInt();
   
   int squareNumber1 = number1 * number1;
   
   int squareNumber2 = number2 * number2;
   
   double sum = Math.sqrt(number1) + Math.sqrt(number2);
   double difference = Math.sqrt(number1) - Math.sqrt(number2);
   
   System.out.printf("Squares of %d is %d While that of %d  is %d . The Sum Of Their Squares %.3f While The Difference is %.3f Thankyou%n", sum, difference);
    
    
    
    }
  }
