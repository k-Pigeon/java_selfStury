package chapter1;

public class Step5 {

	public static void main(String[] args) {

//		  1. 저장할 값과 어울리는 이름
//		  2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능,(공백 사용 불가)
//		  3. 밑줄 또는 문자로 시작 가능, 첫 글자는 숫자 사용 불가
//		  4. 한 단어 또는 2개 이상 단어의 연속
//		  5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
//		  6. 예약어는 사용 불가(public, static, void, int, double, float, ...)

		String country = "대한민국";// 국적
		String firstName = "둘기";// 이름
		String lastName = "김";// 성
		String dateOfBirth = "2005-04-17"; // 생년월일
		String homeAddress = "경기도_성남시";// 집주소
		String purposeOfVisit = "재발급"; // 방문목적
		String issueDate = "2021-05-01"; // 발급일자
		String _issueDate = "2021-05-01"; // 발급일자(밑줄 첫번째)
		String issueDate_2 = "2021-05-01"; // 발급일자(밑줄, 숫자 포함)
		// String -issueDate_2 = "2021-05-01"; // 발급일자(밑줄, 숫자, 하이픈 시작) 안됨

		int age = 19; // 나이
		int lengthOfStay = 10; // 심사 시간

		String item1 = "학생증";
		String item2 = "가족관계증명서";
		// String 3item = "사진"; //숫자 우선 안됨

		// 프로그램의 흐름을 위해 사용하는 경우
		// 크게 이름이 중요하지 않는 경우
		int i = 0;
		String s = "";
		String str = "";

		// 절대 변하지 않는 상수는 대문자로
		// final 예약어. 바꾸고 싶어도 한번 지정한 순간 절대 바꿀 수 없음
		final String CODE = "KR";
		// CODE = "US";
	}
}