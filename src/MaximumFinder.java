import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the floating point values seperated by spaces");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double result = maximum(num1, num2, num3);
        System.out.println("Maximum is: " + result);
    }
    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue){
                maximumValue = z;
            }
        return maximumValue;
        }
    }