package kodlama.io;

public class Lecture {
	private int id;
	private String name;
	

	public Lecture(int id, String name) {  //cons block
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
