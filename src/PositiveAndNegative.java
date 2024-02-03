import java.util.Scanner;

	public class PositiveAndNegative {
	public static void main(String [] args) {
		
	Scanner input = new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int negative = 1;
	int positive = 0;
	int zero = 0;
	
	System.out.println("Enter The 1ST Number: ");
	num1 = input.nextInt();
	if (num1 < 0 && num1 != 0){
	negative = negative + 1;
	}
	else {
	positive = positive++;
	}
	
	System.out.println("Enter The 2ND Number: ");
	num2 = input.nextInt();
	if (num2 < 0 && num2 != 0){
	negative = negative + 1;
	}
	else {
	positive = positive++;
	}
	
	System.out.print("Enter The 3RD Number: ");
	 num3 = input.nextInt();
	 if (num3 < 0 && num3 != 0) {
	negative = negative + 1;
	}
	else {
	positive = positive++;
	}
	 
	System.out.print("Enter The 4TH Number: ");
	 num4 = input.nextInt();
	 if (num4 != 0 && num4 < 0){
	negative = negative++;
	}
	else {
	positive = positive++;
	}
	 
	System.out.print("Enter The 5TH Number: ");
	num5 = input.nextInt();
	if (num5 < 0 && num5 != 0){
	negative = negative++;
	}
	 else {
	positive = positive++;
	}
	 
	 System.out.printf("THE total of negative input is %d", negative);
	}
	}
