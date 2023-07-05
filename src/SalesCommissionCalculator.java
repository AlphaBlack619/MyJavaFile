import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        double totalSales = 0, commission = totalSales * 0.09, given = commission - totalSales;
        System.out.println("enter item sold or -1 to end: ");
        double itemSold = input.nextDouble();
        while (itemSold != -1){
            System.out.println("enter item sold or -1 to end: ");
            itemSold = input.nextDouble();
            if (itemSold > 0){
                totalSales += itemSold;
            }counter++;
        }
    }
}
