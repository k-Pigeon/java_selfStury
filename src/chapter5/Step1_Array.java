package chapter5;

public class Step1_Array {

	public static void main(String[] args) {
		// 배열 : 같은 자료형의 값을 여러 개 저장하는 "연속적 공간"
		// 음료수
		String drinkRose = "콜라";
		String drinkAilen = "사이다";
		String drinkMei = "환타";

		System.out.println(drinkRose + " 하나");
		System.out.println(drinkAilen + " 하나");
		System.out.println(drinkMei + " 하나");
		System.out.println("주세요");

		// 배열 선언 첫번째 방법
//		String[] drinks = new String[4]; // 크기 "4"에 해당하는 String형 배열
		// 배열 선언 두번째 방법
		// String drinks[] = new String[4];
//		drinks[0] = "밀키스"; // index 지정은 0부터 시작
//		drinks[1] = "매실";
//		drinks[2] = "게토레이";
//		drinks[3] = "파워에이드";

		// 배열 선언 새번째 방법
		// 해당 경우는 선언과 동시에 값을 저장하기에 new String 뒤에 숫자를 암시하지 않는다.
		// String[] drinks = new String[] { "밀키스", "매실", "케토레이", "파워에이드" };

		// 배열 선언 네번째 방법
		String[] drinks = { "밀키스", "매실", "케토레이", "파워에이드" };

		// 음료수 주문
		System.out.println();
		System.out.println(drinks[0] + " 하나"); // 밀키스 하나
		drinks[1] = "토레타"; // 배열 내의 값을 변경하는 경우
		System.out.println(drinks[1] + " 하나");
		System.out.println(drinks[2] + " 하나");
		System.out.println(drinks[3] + " 하나");
		System.out.println("주세요");

	}
}