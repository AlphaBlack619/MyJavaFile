import java.util.Scanner;

	public class While {
		public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
	//int product = 3;
	
	//while (product <= 100) {
	//product = 3 * product;
	//System.out.println (product);
	//}
	
	int total = 0;
	int gradeCounter = 1;
	
	while (gradeCounter <= 5) {
	
	System.out.print("enter grade: ");
	
	int grade = input.nextInt();
	
	total = total + grade;
	
	++gradeCounter  ;
	}
	
	int average = total / 5;
	System.out.printf("%nTotal of all 5 grades is %d%n", total);
	System.out.printf("Class Average is %d%n", average);
	
	for (int counter = 0; counter <= 6; counter++)
	System.out.printf("%d ", counter);
	
	int x = 2, y = 10;
	
	for (int j = x; j <= 4 * x * y; j += y/x){
	System.out.printf("ttt %d%n", j); 
	}

}
}
