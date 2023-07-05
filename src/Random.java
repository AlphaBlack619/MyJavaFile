import java.util.Scanner;

	public class Random {
		public static void main (String...args){
		
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
			}
			
			System.out.print("what is " + number1 + "-" + number2 + "? \n");
			int answer = input.nextInt();
			
			if (number1 - number2 == answer)
			System.out.println("your answer is correct");
			else {
			System.out.println("your answer is wrong.");
			System.out.println(number1 + "-" + number2 + " should be " + (number1 - number2));
			}		
		
		}
	}
