package Example1;
import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		LocalDate now  = LocalDate.now();
		DaysManager daysmanager = new DaysManager();
		HomeworkManager hwmanager = new HomeworkManager();
		
		
		Days day1 = new Days(1,"Gün 1",now);
		daysmanager.AddNewDays(day1);
		
		
		Homeworks homework1 = new Homeworks(1, "Ödev 1", "Bu 1.gün 1. ödevdir", day1);
		Homeworks homework2 = new Homeworks(2, "Ödev 2", "Bu 1.gün 2. ödevdir", day1);
		
		
		hwmanager.addNewHomework(homework1);
		hwmanager.addNewHomework(homework2);
		

		
		Days day2 = new Days(2,"Gün 2",now);
		daysmanager.AddNewDays(day2);
		
		
		Homeworks homework3 = new Homeworks(3,"Ödev 1","Bu 2.gün 1.ödevdir.",day2);
		Homeworks homework4 = new Homeworks(4,"Ödev 2","Bu 2.gün 2.ödevdir.",day2);
		Homeworks homework5 = new Homeworks(5,"Ödev 3","Bu 2.gün 3.ödevdir.",day2);
		
		hwmanager.addNewHomework(homework3);
		hwmanager.addNewHomework(homework4);// 2. gün için yeni ödevler
		hwmanager.addNewHomework(homework5);
		
		
		hwmanager.deleteHomework(homework5);// Ödev 3 adlý ödev silindi çýktýsý alýnýr
		
		hwmanager.showContent(); // Ödevlerin listesinin döndürür
		
		daysmanager.ShowContent();// Günlerin listesini döndürür
		/*
		 * 			*
		 * 			*
		 * 			* böyle devam edebilir elbette düzenlenedebilir.
		 * 
		 * */
		
		
		
	}

}
