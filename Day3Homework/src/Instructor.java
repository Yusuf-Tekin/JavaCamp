
public class Instructor extends User{
	
	private String bio; // Bu field ise sadece instructor'a ait olduðunu düþünelim.
	
	public Instructor(String bio) {
		this.bio = bio;
	}
	
	public void addLesson(Lesson lesson) { // Only ýnstructor method
		lesson.add(lesson);
	}
	
	
	public void deleteLesson(Lesson lesson) {// Only ýnstructor method
		lesson.delete(lesson);
	}
	
	
	public void completedLesson(Lesson lesson) { // Instructor & Student method
		lesson.Completed();
	}
}
