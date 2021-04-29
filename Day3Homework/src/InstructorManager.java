
public class InstructorManager {

	public void addLesson(Lesson lesson) { // Only ýnstructor method
		lesson.add(lesson);
	}
	
	
	public void deleteLesson(Lesson lesson) {// Only ýnstructor method
		lesson.delete(lesson);
	}
	
	
	public void completedLesson(Lesson lesson) { // Instructor & Student method
		lesson.Completed(lesson);
	}
}
