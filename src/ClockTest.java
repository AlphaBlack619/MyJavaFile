import java.util.Scanner;

	public class ClockTest {
	public static void main(String...args) {
		
	Clock myClock = new Clock (199, 45, 13);
	Clock myClock2 = new Clock (48, 13, 20);
	
	

	System.out.printf("The Time Is %s:%s:%s%n", myClock.getSecond(), myClock.getMinute(), myClock.getHour());
	System.out.printf("The Time Is %s:%s:%s%n", myClock2.getSecond(), myClock2.getMinute(), myClock2.getHour());
	
	}
	}
