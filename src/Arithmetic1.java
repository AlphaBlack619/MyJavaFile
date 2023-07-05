import java.util.*;
	
	public class Arithmetic1 {
		public static void main(String... args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first integer: \n");
	int integer1 = input.nextInt();
	
	int square1 = integer1 * integer1;
	
	System.out.printf("%s %d%n%n", "The square of the first integer is", square1);
	
	System.out.print("Enter the second integer: \n");
	int integer2 = input.nextInt();
	
	int square2 = integer2 * integer2;
	
	System.out.printf("%s %d%n%n", "The square of the second integer", square2);
	
	int sumSquares = square1 + square2;
	int differenceOfTheirSquares = square1 - square2;		
		
	System.out.printf("The sum of the two integers squares is %d while the difference of their squares is %d thankyou%n%n", sumSquares, differenceOfTheirSquares);	
	
	  }
	 }
