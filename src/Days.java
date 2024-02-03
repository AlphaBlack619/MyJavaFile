import java.util.Scanner;

  public class Days {
    public static void main(String [] args) {
    
      Scanner input = new Scanner(System.in);
      
 System.out.print("enter the number for days: ");
  int days = input.nextInt();
  
  int nextMeet = days % 7;
  System.out.println("the day in 100 days time will be tuesday which is " + nextMeet + " our next meeting date");
     
    
    
    
    } 
  }
