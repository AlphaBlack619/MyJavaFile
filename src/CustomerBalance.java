 import java.util.Scanner;
 
	public class CustomerBalance{
	public static void main(String... args) {
	 
	 Scanner input = new Scanner(System.in);
	 
	 int accountNumber;
	 accountNumber = input.nextInt();
	 int balanceAtMonthBegining = input.nextInt();
	int  totalOfItemCharged = input.nextInt();
	 int creditApplied = input.nextInt();
	 int allowedCreditLimit = input.nextInt();

	int newBalance =  (balanceAtMonthBegining + creditApplied) - totalOfItemCharged ;
	if (newBalance > allowedCreditLimit);
	System.out.println("Credit Limit Exceeded");
}
}
