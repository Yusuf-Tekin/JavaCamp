package Example1;
import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		LocalDate now  = LocalDate.now();
		DaysManager daysmanager = new DaysManager();
		HomeworkManager hwmanager = new HomeworkManager();
		
		
		Days day1 = new Days(1,"G�n 1",now);
		daysmanager.AddNewDays(day1);
		
		
		Homeworks homework1 = new Homeworks(1, "�dev 1", "Bu 1.g�n 1. �devdir", day1);
		Homeworks homework2 = new Homeworks(2, "�dev 2", "Bu 1.g�n 2. �devdir", day1);
		
		
		hwmanager.addNewHomework(homework1);
		hwmanager.addNewHomework(homework2);
		

		
		Days day2 = new Days(2,"G�n 2",now);
		daysmanager.AddNewDays(day2);
		
		
		Homeworks homework3 = new Homeworks(3,"�dev 1","Bu 2.g�n 1.�devdir.",day2);
		Homeworks homework4 = new Homeworks(4,"�dev 2","Bu 2.g�n 2.�devdir.",day2);
		Homeworks homework5 = new Homeworks(5,"�dev 3","Bu 2.g�n 3.�devdir.",day2);
		
		hwmanager.addNewHomework(homework3);
		hwmanager.addNewHomework(homework4);// 2. g�n i�in yeni �devler
		hwmanager.addNewHomework(homework5);
		
		
		hwmanager.deleteHomework(homework5);// �dev 3 adl� �dev silindi ��kt�s� al�n�r
		
		hwmanager.showContent(); // �devlerin listesinin d�nd�r�r
		
		daysmanager.ShowContent();// G�nlerin listesini d�nd�r�r
		/*
		 * 			*
		 * 			*
		 * 			* b�yle devam edebilir elbette d�zenlenedebilir.
		 * 
		 * */
		
		
		
	}

}
