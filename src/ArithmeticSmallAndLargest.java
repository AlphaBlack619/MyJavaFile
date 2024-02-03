import java.util.*;

	public class ArithmeticSmallAndLargest {
	
		public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("%nEnter the first number: ");
	int number1 = input.nextInt();
	
	System.out.printf("%nEnter the second number: ");
	int number2 = input.nextInt();
	
	System.out.printf("%nEnter the third number: ");
	int number3 = input.nextInt();
	
	int sum = number1 + number2 + number3;
	int product  = number1 * number2 * number3;
	double average = sum / 3;
	
	System.out.printf("%nThe Sum of integers is %d And their product is %d, While the average is %.0f%n%n", sum, product, average);
	
	if (number1 < number2 && number1 < number3) {
	System.out.printf("Number %d Is The Smallest Of Number %d And Number %d Thankyou.%n%n", number1, number2, number3);
	}
	
	if (number1 > number2 && number1 > number3) {
	System.out.printf("Number %d IS The Largest Number Of Them All%n%n", number1);
	}
	
	if (number2 < number1 && number2 < number3) {
	System.out.printf("Number %d Is The Smallest Of Number %d And Number %d Thankyou.%n%n", number2, number1, number3);	
	}
	
	if (number2 > number1  && number2 > number3) {
	System.out.printf("Number %d IS The Largest Number Of Them All%n%n", number2);
	}
	
	
	if (number3 < number1 && number3 < number2) {
	System.out.printf("Number %d Is The Smallest Of Number %d And Number %d Thankyou.%n%n", number3, number1, number3);
	}
	if (number3 > number1 && number3 > number2) {
	System.out.printf("Number %d IS The Largest Number Of Them All.%n%n", number3);
	}
		
		
		}
		}
