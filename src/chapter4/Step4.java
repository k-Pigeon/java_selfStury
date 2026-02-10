package chapter4;

public class Step4 {

	public static void main(String[] args) {
		// Switch Case
		// 1등급 : 상위권
		// 2, 3등급 : 중위권
		// 4등급(그 외외) : 하위권

		// if else 문을 이용한 방법
		int grade = 1;
		if (grade == 1) {
			System.out.println("상위권 등급");
		} else if (grade == 2 || grade == 3) {
			System.out.println("중위권 등급");
		} else {
			System.out.println("하위권 등급");
		}
		System.out.println("성적표 배부 완료_1");

		// Switch Case문
		// case 뒤로는 break로 끝남
		// 작성하지 않으면 다른 문구까지 이동하기에 중요.
		grade = 3;
		switch (grade) {
		case 1:
			System.out.println("상위권등급");
			break;
		case 2:
			System.out.println("중위권등급");
			break;
		case 3:
			System.out.println("중위권등급");
			break;
		default:
			System.out.println("하위권등급");
		}
		System.out.println("성적표 배부 완료_2");

		// 고기 등급에 따라 가격이 변경
		// grade는 case의 조건식을 찾음
		// break가 없기 때문에 다음 case문으로 자동 실행(break가 될 때까지)
		grade = 3;
		int price = 7000;
		switch (grade) {
		case 1:
			price += 1000;
		case 2:
			price += 1000;
		case 3:
			price += 1000;
		}
		System.out.println(grade + "등급 제품의 가격 : " + price + "원");

		// switch case : 지정된 값이 "명확한" 케이스가 있는 경우
		// if else : 범위적 케이스인 경우
	}
}