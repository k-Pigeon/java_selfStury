package chapter4;

public class Step1 {

	public static void main(String[] args) {
		// 조건문 if
		int hour = 10; // 오전 10시

		// if문 내에서 한 문장만 실행할 경우 중괄호{} 생략 가능
		// if문 내에서 여러 문장이 실행될 경우 중괄효{} 필수
		if (hour < 14) {
			System.out.println("커피마실 분?");
			System.out.println("저는 \'에스프레소\'");
		}
		System.out.println("커피 주문 완료");

		// 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
		hour = 10;
		boolean morningcoffee = false; // 모닝커피를 마셨는지 여부
		if (hour < 14 && morningcoffee == false) {
			System.out.println("커피 + 1");
		}
		System.out.println("커피 주문 완료");

		// 오후 2시 이후이거나 모닝 커피를 마신 경우?
		hour = 15;
		morningcoffee = true;

		// 아침커피를 마신 오후 2시
		// if (hour >= 14 || morningcoffee == true) {
		if (hour >= 14 || morningcoffee) {
			System.out.println("디카페인 커피 + 1");
		}
		System.out.println("커피 주문 완료");
	}
}