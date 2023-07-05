import java.util.Scanner;


	public class BBB {
		public static void main(String... args){
	
	// creating a random number to check boolen statement!!
	
	int number1 = (int)(System.currentTimeMillis() % 10);  // generating a random number
	
	int number2 = (int)(System.currentTimeMillis() / 7 % 10); // generating a random number


	Scanner input = new Scanner(System.in);
	System.out.print("What is " + number1 + " + " + number2 + "? ");

	int number = input.nextInt();
	System.out.println(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));
	
	boolean b = true;
	
	int i = 1;

	 
	
	}	
	}
