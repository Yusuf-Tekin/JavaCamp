package Example1;
import java.util.ArrayList;

public class HomeworkManager {
	
	ArrayList<Homeworks> homeworks = new ArrayList<Homeworks>();
	
	public void addNewHomework(Homeworks homework) {
		
		homeworks.add(homework);
		
		
	}
	
	public void showContent() {
		
		for(Homeworks homework : homeworks) {
			
			System.out.println("Homework Id:" + homework.id + 
					"\nHomework Name:" + homework.name + "\nHomework Content:" + homework.content
					+ "\nHomework day:" + homework.day.date+ "\n-----------------");
			
		}
		
	}
	
	public void deleteHomework(Homeworks homework) {
		
		System.out.println(homeworks.remove(homework));
		
		System.err.println(homework.name + " adlý ödev silindi.");
	}

}
