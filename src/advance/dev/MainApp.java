package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.dao.Teacher;

public class MainApp {
	public static void main(String[] args) {// mảng đối số
		// Khởi tạo một đối tượng Manager
		Manager manager = new Manager();

		// Thêm các giáo viên vào danh sách
		manager.addTeacher(new Teacher("Nguyen", 35, "T001"));
		manager.addTeacher(new Teacher("Thanh", 40, "T002"));
		manager.addTeacher(new Teacher("Sinh", 30, "T003"));

		// In danh sách giáo viên hiện có
		System.out.println("Danh sách giáo viên:");
		manager.printTeacherList();

		// Lấy ra số giáo viên hiện có trong danh sách
		System.out.println("Số giáo viên hiện có trong danh sách: " + manager.getNumberOfTeachers());

		// Lấy ra tên của giáo viên có tuổi cao nhất
		String oldestTeacherName = manager.getOldestTeacherName();
		if (oldestTeacherName != null) {
			System.out.println("Tên của giáo viên có tuổi cao nhất: " + oldestTeacherName);
		} else {
			System.out.println("Không có giáo viên trong danh sách.");
		}
	}
}
