import java.time.*;
import java.text.*;
import java.util.*;



public class MyDate {
	

    LocalDateTime now = LocalDateTime.now();
    DateFormat format;
    Date date;
    

    
    int year = 1970;
    int month = 1;
    int day = 1;
    
    public MyDate() {
    	this.year = now.getYear();
    	this.month = now.getMonthValue();
    	this.day = now.getDayOfMonth();
    }
    
    
    public MyDate(long elapsedTime) {
    	setDate(elapsedTime);
    }
    
    public MyDate(int year , int month , int day) {
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
    
    public void setDate(long elapsedTime) {
  
    	  
    	 DateFormat format_day = new SimpleDateFormat("dd");
    	 DateFormat format_month = new SimpleDateFormat("MM");
    	 DateFormat format_year = new SimpleDateFormat("yyyy");
    	 
    	 Date date = new Date(elapsedTime);
    	 
    	 // format_xxx.format(Date object) return String, need convert to integer 
    	 this.day = Integer.parseInt(format_day.format(date));
    	 this.month = Integer.parseInt(format_month.format(date));
    	 this.year = Integer.parseInt(format_year.format(date));
    	 
    	 
    	  	
     	
     	// THIRD method
     	
     	/*
     	 format = new SimpleDateFormat("dd-MM-yyyy");
     	date = new Date(elapsedTime);
     	
     	use getDate() to return the date
     	 */
     	
    	
    	 
    	
		
    }
    
    /*Direct get the full date
    public String getDate() {
    	return format.format(date);
    }
    
    */
    
    public int getYear() {
    	return year;
    }
    
    public int getMonth() {
    	return month;
    }
    
    public int getDay() {
    	return day;
    }

	public static void main(String[] args) {
		
		/*
		MyDate date = new MyDate(432000000);
		System.out.println("Date: " + date.getDate());
		*/
		
    	// Example 1 : 5 days after 1/1/1970
    	MyDate date1 = new MyDate(432000000);
    	System.out.println("Date: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear() );
    	
    	// Example 2 : 35 days after 1/1/1970
    	MyDate date2 = new MyDate(3024000000L);
    	System.out.println("Date: " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear() );
    	
     	// Example 4 : 88 days after 1/1/1970
    	MyDate date4 = new MyDate(7603200000L);
    	System.out.println("Date: " + date4.getDay() + "/" + date4.getMonth() + "/" + date4.getYear() );
   
    	// Example 3 : 454 days after 1/1/1970
    	MyDate date3 = new MyDate(39225600000L);
    	System.out.println("Date: " + date3.getDay() + "/" + date3.getMonth() + "/" + date3.getYear() );

	}

}

