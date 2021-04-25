package Example1;
import java.util.ArrayList;

public class DaysManager {
	
	ArrayList<Days> days = new ArrayList<Days>();
	
	
	public void AddNewDays(Days day) {
		
		days.add(day);
		
	}
	
	public void ShowContent() { // G�nler i�in bilgilerini d�nd�r�r
		for(Days day : days) {
			
			System.out.println("Day Id:" + day.id + "\nDay Name:" + day.dayName + "\nDay Date:" + day.date  + "\n-------------");
			
		}
		
	}
	
	public void deleteDay(Days day) {
		System.out.println(days.remove(day));
		System.err.println(day.dayName + " adl� g�n silindi.");
	}
	
}
