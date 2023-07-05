import java.util.Scanner;

	public class StudentTest {
		public static void main(String... args) {
		
	Scanner input = new Scanner(System.in);
	
	Student class1 = new Student("Moyin", 93.5);
	Student class2 = new Student("Nero", 72.75);
	
	System.out.printf("%S's letter grade is: %s%n", class1.getName(), class1.getLetterGrade());
	System.out.printf("%s's letter grade is: %s%n", class2.getName(), class2.getLetterGrade());
	
	
	System.out.print("Enter the new name: ");
	String name = input.nextLine();
	class1.setName(name);
	
	System.out.print("Enter the new name: ");
	name = input.nextLine();
	class2.setName(name);
	
	System.out.print("Enter the new Average: ");
	double average = input.nextDouble();
	class1.setAverage(average);
	
	System.out.print("Enter the new Average: ");
	average = input.nextDouble();
	class2.setAverage(average);
	
	
	
	System.out.printf("%S's average grade is: %.1f and the letter grade is %S %n", class1.getName(), class1.getAverage(), class1.getLetterGrade());
	System.out.printf("%s's average grade is: %.1f and the letter grade is %S %n", class2.getName(), class2.getAverage(), class2.getLetterGrade());
	
	
	
	}
	
	}
