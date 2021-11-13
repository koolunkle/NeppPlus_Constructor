package Codes;

public class LectureData {

	String title;
	String teacherName;
	int maxStudentCount;

	public LectureData(String title, String teacherName, int maxStudentCount) {
		super();
		this.title = title;
		this.teacherName = teacherName;
		this.maxStudentCount = maxStudentCount;
	}

	public LectureData() {

		this("미정", "강사 없음", 10);
	}

}