	public class Clock {
	
		private int second;
		private int minute;
		private int hour;
		
	public Clock ( int second, int minute, int hour) {
	if (second >= 0 & second <= 60 ) {
	this.second = second;
	}
	
	if (minute >= 0 & minute <= 60) {
	this.minute = minute;
	}

	if (hour >= 0 & hour <= 23) {
	this.hour = hour;
	}
	}
	
	public void setSecond (int second) {
	if (second >= 0 & second <= 60 ) {
	this.second = second;
	}
	}
	
	public int getSecond () {
	return second;
	}
	
	public int getMinute () {
	return minute;
	}
	
	public void setMinute (int minute) {
	if (minute >= 0 & minute <= 60) {
	this.minute = minute;
	}
	}
	
	public int getHour () {
	return hour;
	}
	
	public void setHour(int hour) {
	if (hour >= 0 & hour <= 23) {
	this.hour = hour;
	}
	} 

	}
