import java.util.*;

	public class ComparingIntegers1 {
		
		public static void main(String... args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("\nEnter The Integer: ");
	int number = input.nextInt();
	
	int numberSquare = (number * number);
	
	System.out.printf("%n%d Is The Integer%n%n", number);
	
	if (number == 100 & numberSquare != 100) {
System.out.printf("%d Is Equal To 100, But Its Square %d Is Not Equal To 100%n", number, numberSquare);
	}
	
	if (number < 100 & numberSquare > 100) {
	System.out.printf("%d Is Less Than 100 But Its Square %d Is Greater Than 100%n", number, numberSquare);
	}
	
	if (number > 100 & numberSquare > 100) {
	System.out.printf("%d Is Greater Than 100 And Its Square %d Is Also Greater Than 100%n", number, numberSquare);
	}
	
	if (number < 100 & numberSquare < 100) {
	System.out.printf("%d Is Less 100 And Its Square %d Are Is Also Than 100%n", number, numberSquare);
	}
	
	if (number < 100 & numberSquare == 100) {
	System.out.printf("%d Is Less 100 But Its Square %d Is Equal To 100%n", number, numberSquare);
	}
	
	}
	}
