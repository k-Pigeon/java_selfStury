package chapter2;

public class Step4 {

	public static void main(String[] args) {
		// 논리연산자
		boolean koreanFood = true;
		boolean juice = true;
		boolean Western = false;

		// OR (또는) 조건식. ||
		System.out.println(koreanFood || juice || Western); // 하나라도 true이면 결과도 true
		// AND (~이면서) 조건식. &&
		System.out.println(koreanFood && juice && Western);// 모드 true이어야지 true

		// AND 연산
		// 두 개의 식이 true이어야지 true
		System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 "크면서" 3이 1보다 큰가? ture
		System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 "크면서" 3이 1보다 작은가? false

		// OR 연산
		System.out.println((5 > 3) || (2 > 1)); // 5는 3보다 "크거나" 2가 1보다 큰가? true
		System.out.println((5 > 3) || (2 < 1)); // 5는 3보다 "크거나" 2가 1보다 작은가? true
		System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 "작거나" 3이 1보다 작은가? false

		// System.out.println(1 < 3 < 5); //불가능한 연산자

		// 논리 부정 연산자
		// !. 특정 논리연산에 반대를 출력
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // false
		System.out.println(!(5 == 3)); // true
	}
}