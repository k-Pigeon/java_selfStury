package chapter2;

public class Step3 {

	public static void main(String[] args) {
		// 비교 연산자
		// 참이면 true, 거짓이면 false
		System.out.println(5 > 3); // 5는 3보다 큰가? true
		System.out.println(5 >= 3); // 5는 3보다 크거나 같은가? true
		System.out.println(5 >= 5); // 5는 5보다 크거나 같은가? true
		System.out.println(5 >= 7); // 5는 7보다 크거나 같은가? false

		System.out.println(5 < 3); // 5는 3보다 작은가? false
		System.out.println(5 <= 3); // 5는 3보다 작거나 같은가? false

		System.out.println(5 == 5); // 5는 5와 같은가? true
		System.out.println(5 == 3); // 5는 3과 같은가? false
		System.out.println(5 != 5); // 5는 5와 같지 않은가? false
		System.out.println(5 != 3); // 5는 3과 같지 않은가? true

	}
}