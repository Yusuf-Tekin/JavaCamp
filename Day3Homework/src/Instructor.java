
public class Instructor extends User{
	
	private String bio; // Bu field ise sadece instructor'a ait oldu�unu d���nelim.
	
	public Instructor(String bio) {
		this.bio = bio;
	}
	
	public void addLesson(Lesson lesson) { // Only �nstructor method
		lesson.add(lesson);
	}
	
	
	public void deleteLesson(Lesson lesson) {// Only �nstructor method
		lesson.delete(lesson);
	}
	
	
	public void completedLesson(Lesson lesson) { // Instructor & Student method
		lesson.Completed();
	}
}
