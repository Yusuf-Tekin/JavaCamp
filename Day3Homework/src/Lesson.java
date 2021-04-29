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
		System.out.println(lesson.getTitle() + " adlý ders eklendi");
		
		lessons.add(lesson);
	}
	
	public void delete(Lesson lesson) { 
		System.out.println(lesson.getTitle()  + " adlý ders silindi");
		lessons.remove(lesson);
	}
	
	public void Completed(Lesson lesson) {
		System.out.println(lesson.getTitle()  + " adlý ders tamamlandý");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
