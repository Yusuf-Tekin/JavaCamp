
public class Student extends User {
	
	private String studentNumber; // Normal de bu instructor'da da bulunan bir field.Ancak user'a özel olduðunu kabul edelim.
	
	public Student(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void Completed(Lesson lesson) {  // Instructor & Student method
		lesson.Completed();
	}

}
