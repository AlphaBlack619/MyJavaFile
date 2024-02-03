import java.util.Scanner;
import java.io.*;

/*Can please throung more light on Var?
VAR = Local Variable Type Inference, one of the evident change to language from java10 onward. its allows to define a variable using Var and without specifiying the of its. the compiler infers the type of the variable using the value provided.*/	

	public class DummyValue {
		public static void main(String... args) {

			Scanner input = new Scanner(System.in);

			int total = 0, counter = 0, score = 0;

			System.out.print("enter the Score of the students or negative number to quit: ");
			int score1 = input.nextInt();
			if ((score1 == 0 || score1 > 0) && score1 < 100) {
				score = score1;
			} else {
				System.out.print("Invalid Score Entered!! Scores Must Be within 0-100");
			}


			while (score < 100 && score > 0) {
				total = total + score;
				counter = counter + 1;

				System.out.print("enter the Score of the students or negative number to quit: ");
				score = input.nextInt();

			}


			if (counter != 0) {
				double average = (double) total / counter;
				System.out.printf("The Total Score Of The Students Is %d%n", total);

				System.out.printf("The Average Score Of The Student is %.2f%n", average);
			} else {
				System.out.println("No Scores Were Entered!!");

			}


		}}
