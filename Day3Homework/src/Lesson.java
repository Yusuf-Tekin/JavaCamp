import java.util.ArrayList;
import java.util.List;

public class Lesson {
	
	List<Lesson> lessons = new ArrayList<Lesson>(); 
	
	
	private int id;
	private String title;
	
	public Lesson(String title) { 
		this.title = title;
	}
	
	public void add(Lesson lesson) {
		System.out.println(title + " lesson added");
		
		lessons.add(lesson);
	}
	
	public void delete(Lesson lesson) { 
		System.out.println(title + " lesson deleted");
		lessons.remove(lesson);
	}
	
	public void Completed() {
		System.out.println(title + " lesson completed");
	}
	
}
