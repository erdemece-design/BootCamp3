
package kodlama.io;

public class StudentManager {
	public void add(User user) {
	System.out.println("The user has been added " + user.firstName + user.lastName);
}

public void joinToClass(Lecture lecture) {
	System.out.println("The name of the course those you joined is " + lecture.getName());
}
}
