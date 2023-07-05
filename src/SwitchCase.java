import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int counter = 0, gradeCounter = 0, pass = 0, fail = 0, grade = 0;
        Scanner scanner = new Scanner(System.in);
        while (grade != -1) {
            System.out.print("\nEnter Grade OR -1 To Terminate: ");
            grade = scanner.nextInt();
            if (grade >= 0) {
                gradeCounter += grade;
                counter++;
                switch (grade / 11) {
                    case 0, 1:
                        fail++;
                        System.out.print("Redraw From Study");
                        break;
                    case 2:
                        fail++;
                        System.out.print("Grade F--Repeat course");
                        break;
                    case 3:
                        fail++;
                        System.out.print("Grade E-- CarryOver Course");
                        break;
                    case 4:
                        fail++;
                        System.out.print("Grade D-- Pass On Trial");
                        break;
                    case 5:
                        pass++;
                        System.out.print("Grade C2-- Pass");
                        break;
                    case 6:
                        pass++;
                        System.out.print("Grade C1-- Pass");
                        break;
                    case 7:
                        pass++;
                        System.out.print("Grade B2-- Pass");
                        break;
                    case 8:
                        pass++;
                        System.out.print("Grade B1-- Merit");
                        break;
                    case 9, 10:
                        pass++;
                        System.out.print("Grade A1-- Excellent");
                        break;
                    default:
                        System.out.print("Meet Your HOD");
                        break;

                }
            }
            }
            int average = gradeCounter / counter;
            System.out.println("Total Number Of Students = " + counter + "\nTotal Grade = " + gradeCounter + "\nTotal Passes = " + pass + "\nTotal Failures =  " + fail + "\nAverage = " + average + "\nThankYou");
    }
}