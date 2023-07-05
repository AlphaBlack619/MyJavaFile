import java.util.Scanner;

  public class Remainder {
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    int a = 56 % 6;
    int b = 78 % -4;
    int c = -34 % 5;
    int d = -34 % -4;
    int e = 5 % 1;
    int f = 1 % 5;
    
 System.out.printf("the remainders are as follows, %d is the remainder for 56, while %d is for 78, %d is for -34, then %d is -34 and %d is 5 and %d is for 1 thankyou.%n", a, b, c, d, e, f);  
    }
  }
