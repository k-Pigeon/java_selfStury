package chapter4;

public class Step2 {

	public static void main(String[] args) {
		int hour = 10;
		// 조건에 성립하는가
		if (hour < 14) {
			System.out.println("커피 + 1");
		} else { // 어떠한 조건에도 성립하지 않는 경우
			System.out.println("디카페인 커피 + 1");
		}
		System.out.println("커피 주문_1");

		hour = 10;
		boolean morningMeals = true;
		if (hour <= 14 && morningMeals == true) {
			System.out.println("모닝커피 콜?");
		} else {
			System.out.println("식사할 시간입니다.");
		}
	}
}