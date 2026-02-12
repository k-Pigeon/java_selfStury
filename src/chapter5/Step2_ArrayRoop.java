package chapter5;

public class Step2_ArrayRoop {

	public static void main(String[] args) {
		// 배열의 순회
		String[] drinks = { "밀키스", "매실", "케토레이", "파워에이드" };

		// for 반복문 순회
		for (int i = 0; i < 4; i++) {
			System.out.println(drinks[i] + " 하나");
		}
		System.out.println("주세요");

		System.out.println("--------------------");

		// 배열의 길이를 이용한 순회
		for (int i = 0; i < drinks.length; i++) {
			System.out.println(drinks[i] + " 하나");
		}
		System.out.println("주세요");
		System.out.println("--------------------");

		// for-Each 반복문
		for (String drink : drinks) {
			System.out.println(drink + " 하나");
		}
		System.out.println("주세요");
	}
}