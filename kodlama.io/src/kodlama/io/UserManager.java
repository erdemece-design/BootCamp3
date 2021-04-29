package kodlama.io;

public class UserManager {

		
		public void add(User user) {
			System.out.println(" user has been added " + user.firstName + " " + user.lastName);
		}
		
		public void remove(User user) {
			System.out.println(" user has been deleted " + user.firstName + " " + user.lastName);
		}
		
		public void update(User user) {
			System.out.println("user has been updated" +user.firstName +" "+user.lastName);
		}

	}

