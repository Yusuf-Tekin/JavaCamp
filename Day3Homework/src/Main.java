
public class Main {
	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		
		Lesson lesson1 = new Lesson("This is a first lesson.");
		Lesson lesson2 = new Lesson("This is a second lesson.");
		
		
		Instructor instructor1 = new Instructor("This is a my bio");
		instructor1.setUsername("engin_demirog");
		instructor1.setPassword("123456");
		instructor1.setId(1);
		instructor1.addLesson(lesson1); // Lesson added with instructor's
		userManager.Add(instructor1);
		
		
		Student student1 = new Student("123");
		student1.setUsername("yusuf.tekinx");
		student1.setPassword("123456789");
		student1.setId(2);
		
		student1.Completed(lesson1); // Instructor's added lesson is completed by student1
		
		Student student2 = new Student("254");
		student2.setUsername("hello_world");
		student2.setPassword("1231456");
		student2.setId(3);
		student2.Completed(lesson1); // Instructor's added lesson is completed by student2
		
		
			
		instructor1.deleteLesson(lesson2); // lesson2 is deleted by instructor
		
		
		
		
		
		
	}

}
