package chapter6;

public class Step3_return {
	// 학생 전화번호
	public static String number() {
		String phone = "010-3456-7890";
		return phone; // 변수값을 반환
	}

	// 학생 주소
	public static String address() {
		return "경기도 성남시";
	}

	// 학생 학과
	public static String department() {
		return "컴퓨터공학과";
	}

	public static void main(String[] args) {
		// 반환값
		String phoneNumber = number();
		System.out.println("학생 전화번호 : " + phoneNumber);

		String address = address();
		System.out.println("학생 주소 : " + address);

		System.out.println("학생 학과 : " + department());

	}
}