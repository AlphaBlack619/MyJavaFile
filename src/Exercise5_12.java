import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
       System.out.print("Enter numbers from 1 to 30 or \"ctrl d\" to terminate: \n");
       while (scan.hasNext()) {
           System.out.print("Enter numbers from 1 to 30: ");
           int b = scan.nextInt();
           if (b % 3 == 0) {
               a += b;
           }
       }
        System.out.printf("the sum of numbers divisible by 3 is %d%n", a);
    }

}
