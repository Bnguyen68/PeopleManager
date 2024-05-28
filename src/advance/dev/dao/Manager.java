package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
	private List<Teacher> teacherList = new ArrayList<>();// kích thươc
	// kiểu giữ liệu

	// Phương thức thêm giáo viên
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
	}

	// Phương thức in danh sách giáo viên hiện có
	public void printTeacherList() {
		for (Teacher teacher : teacherList) {
			System.out.println("Teacher Name: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Teacher ID: "
					+ teacher.getTeacherID());
		}
	}

	// Phương thức lấy ra số giáo viên hiện có trong danh sách
	public int getNumberOfTeachers() {
		return teacherList.size();
	}

	// Phương thức lấy ra tên giáo viên có tuổi cao nhất
	public String getOldestTeacherName() {
		if (teacherList.isEmpty()) {
			return null;// không trỏ đến đối tượng nào
		}

		// Sắp xếp danh sách giáo viên theo tuổi tăng dần
		Collections.sort(teacherList, Comparator.comparingInt(Teacher::getAge));// so sánh thuộc tính age dựa trên
																				// teacher

		// Lấy ra giáo viên có tuổi cao nhất (ở cuối danh sách sau khi đã sắp xếp)
		Teacher oldestTeacher = teacherList.get(teacherList.size() - 1);

		return oldestTeacher.getName();
	}
}
