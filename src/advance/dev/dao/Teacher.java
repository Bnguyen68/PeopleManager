package advance.dev.dao;

import advance.dev.model.People;

//extends kế thừa
//implements triển khai
public class Teacher extends People implements IPeople {
	private String TeacherID;// string kieu du lieu

	// Constructor
	public Teacher(String name, int age, String teacherID) {
		super(name, age);// tham chiếu lớp cha
		this.TeacherID = teacherID;
	}

	// Phương thức thêm giáo viên (Override từ interface IPeople)
	@Override
	public void add() {
		// phương thức add
		// Logic để thêm giáo viên vào danh sách nếu cần
		// Ở đây có thể làm gì đó như thêm giáo viên vào một danh sách trong cơ sở dữ
		// liệu
	}

	// Phương thức in thông tin về giáo viên (Override từ interface IPeople)
	@Override
	public void printPeople() {
		// phương thức printpeople
		// Logic để in thông tin về giáo viên ra màn hình hoặc tệp
		// Ví dụ: System.out.println("Teacher Name: " + getName() + ", Teacher ID: " +
		// getTeacherID());
	}

	// Getter cho TeacherID
	public String getTeacherID() {
		return TeacherID;
	}

	// Setter cho TeacherID
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
}