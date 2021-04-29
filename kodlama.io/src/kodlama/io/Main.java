package kodlama.io;

public class Main {

	public static void main(String[] args) {
		Lecture lecture1 = new Lecture(001,"Java Programming and React"); 
		System.out.println("The id of the lecture is " + lecture1.getId() + " and the name of the course1 is " + lecture1.getName());
		
		
		Lecture lecture2 = new Lecture(002,"c# and angular");
		System.out.println("The id of the course2 is " + lecture2.getId() + " and the name of the course2 is " + lecture2.getName());
		
		Student student1 = new Student();
		
		student1.id = 1;
		student1.firstName = "erdem";
		student1.lastName = "ece";
		student1.studentId = 555;
		
		Instructor instructor1 = new Instructor();
		
		instructor1.id = 2;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroð";
		instructor1.instructorId= "111";
		
		UserManager userManager = new UserManager();
		
		userManager.add(student1);
		userManager.add(instructor1); //example
		System.out.println("-------------------------------");
		userManager.remove(student1); //example
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.joinToClass(lecture1);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.update(instructor1);
	}

}
