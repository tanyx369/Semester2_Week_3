import java.time.*;
import java.util.*;

public class Time
{
	
	LocalDateTime time = LocalDateTime.now();
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
		hour = time.getHour();
		minute = time.getMinute();
		second = time.getSecond();
		
	}
	
	public Time(long milli) {
		setTime(milli);
	}
	
	public Time(int hour , int min , int sec) {
		this.hour = hour;
		this.minute = min;
		this.second = sec;
	}
	
	
	
	public void setTime(long elapsedTime) {
		
		long totalSeconds = elapsedTime / 1000;
		second = (int) (totalSeconds % 60);
		
		long totalMinutes = totalSeconds / 60;

		  // Compute the current minute in the hour

		  minute = (int)(totalMinutes % 60);

		  // Obtain the total hours

		  int totalHours = (int)(totalMinutes / 60);

		   // Compute the current hour

		 hour = (int)(totalHours % 24);
		
		
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	
	public static void main(String[] args) {
		    Time time = new Time();
			System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
			
			   Time time2 = new Time(555550000);

			    //Print the data field

			    System.out.println(time2.getHour() + ":" +

			      time2.getMinute() + ":" + time2.getSecond());

			    //Create object to the class and assign the arguments

			   Time time3 = new Time(5, 23, 55);

			    //Print the data field

			    System.out.println(time3.getHour() + ":" +

			      time3.getMinute() + ":" + time3.getSecond());
	}
	

}

