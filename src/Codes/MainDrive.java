package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		김준기, 1996, true, 경기도 남양주시 

		StudentData std1 = new StudentData();

		std1.name = "김준기";
		std1.birthYear = 1996;
		std1.isMale = true;
		std1.address = "경기도 남양주시";

//		김민성, 1998, true, 서울시 도봉구 

		StudentData std2 = new StudentData("김민성", 1998, true, "서울시 도봉구");

		System.out.println(std2.name);

//		코틀린 양성, 조경진, 20

		LectureData ld1 = new LectureData("코틀린 양성", "조경진", 20);

		LectureData ld2 = new LectureData();

		System.out.println(ld2.title);

	}

}