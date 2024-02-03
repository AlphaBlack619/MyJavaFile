import java.util.Scanner;

public class EConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    double constant = 1,counter = 1;
        System.out.println("Enter a Term: ");
        int number = input.nextInt();

        for (; counter <= number; counter++){
            constant += 1/counter;
        }
        System.out.println("E Constant In Its " + number + " Is " + constant);

        System.out.println();

        double constant1 = 1, counter1 = 1;
        System.out.println("Enter A Term: ");
        int number1 = input.nextInt();
        System.out.println("Enter X: ");
        int number2 = input.nextInt();
        for (; counter1 <= number1; counter1++){
            constant1 += Math.pow(number2, counter1) / counter1;
        }
        System.out.println("E Constant^x is " + constant1);



}}
