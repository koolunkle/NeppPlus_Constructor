package Codes;

public class StudentData {

	String name;
	int birthYear;
	boolean isMale;
	String address;

	public StudentData(String inputName, int inputBirthYear, boolean inputIsMale, String inputAddress) {
		name = inputName;
		birthYear = inputBirthYear;
		isMale = inputIsMale;
		address = inputAddress;

		System.out.println("4가지 파라미터 받는 학생 클래스 생성");

	}

	public StudentData() {
		super();
		System.out.println("기본 생성자를 별도로 학생 클래스 생성");
	}

}