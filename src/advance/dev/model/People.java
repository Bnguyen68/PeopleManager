package advance.dev.model;

public class People {
	private String name;
	private int age;

	// Constructor //được khởi tạo khi khởi tạo 1 đối tượng //dùng để khởi tạo thuộc
	// tính cho các đối tượng
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}
}