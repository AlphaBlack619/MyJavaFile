import java.util.Scanner;
import java.security.SecureRandom;
	public class Quiz {
		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
		SecureRandom number1 = new SecureRandom();
		SecureRandom number2 = new SecureRandom();



			System.out.println("enter  first number: ");
			int num1 = input.nextInt();
			System.out.println("enter second number: ");
			int num2 = input.nextInt();
			int gcb = 2;

			for (int k = 2;k <= num1 && k <= num2; k++){
				if ( num1 % k == 0 && num2 % k == 0){
					gcb = k;
				}

			}
			System.out.printf("The greatest common divisor %d",gcb);
				;
//			for (int k = 2; k <= num1 && k <= num2; k++) {
//				if (num1 % k == 0 && num2 % k == 0){
//					gcb = k;
//			}}System.out.printf("The greatest common divisor %d",gcb);

//

//			for (int k = 2; k <= num1 / 2 && k <= num2 / 2; k++) {
//				if (num1 % k == 0 && num2 % k == 0) {
//					gcb = k;
//				}
			}

		
		
		
		}

