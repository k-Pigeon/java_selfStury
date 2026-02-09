package chapter1;

public class Step3 {

	public static void main(String[] args) {
		// 수학적 " = " : 같은 값
		// 코드적 " = " : 우측 값을 좌측 변수에 대입한다.
		String name = "코드";
		// 정수형 변수
		int second = 30;

		// 문자열 + 는 서로 "연결고리 역할"
		System.out.println(name + "가 " + second + "초 뒤 시작합니다.");
		System.out.println(name + " Start!!");

		System.out.println("==================================");

		double score = 90.5;
		name = "김둘기"; // 중간중간 값 변경 가능
		char grade = 'A'; // 여러 글자는 "", 한글자는 ''
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade + "입니다.");

		System.out.println("==================================");
		boolean pass = true; // true/false 두가지 선택지
		System.out.println("이번 시험은 합격했을까요?" + pass);

		System.out.println("==================================");
		double d = 3.14151235658979; // 기본적으로 소숫점은 double형
		float f = 3.14151235658979f; // float은 double만큼 정밀한 소숫점을 사용할 수 없다. 필요할 경우 값 뒤에 "f" 입력
		System.out.println(d); // double은 긴 소숫점을 표시할 수 있다.
		System.out.println(f); // float은 보다 짧은 소숫점을 다룬다.

		// int i = 1000000000000; // 정수형들은 자동으로 int형 자료형으로 인식. 약 -21억~21억까지만 인식
		long l = 1000000000000l; // long형 자료형을 사용하려면 변수 뒤에 " l "(소문자 L)을 입력
		l = 1_000_000_000_000l; // 편의성으로 _ 를 사용할 수 있다.
		System.out.println(l);
	}
}