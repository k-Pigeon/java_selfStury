package chapter2;

public class Step1 {

	public static void main(String[] args) {
		// 산술연산자

		// 일반연산자
		System.out.println(1 + 2); // 3
		System.out.println(6 - 4); // 2
		System.out.println(2 * 4); // 8 (곱셈)
		System.out.println(4 / 2); // 2(나눗셈)

		System.out.println(5 / 2); // 2.5. 결과는 2. 기본적으로 "정수만 나누는 구조"
		System.out.println(2 / 4); // 0

		System.out.println(4 % 2); // 0 나머지 연산. 나눗셈을 한 뒤 나머지값(몫X)
		System.out.println(5 % 2); // 1

		// 우선순위에 따른 연산
		System.out.println(2 + 2 * 2); // 6. 당연히 일반적으로 수학적 우선순위인 곱셈이 먼저.
		System.out.println((2 + 2) * 2); // 8. 덧셈을 먼저 연산하기 위해 괄호를 사용

		// 변수를 이용한 연산
		int a = 20;
		int b = 10;
		int c;

		c = a + b;
		System.out.println(c); // 30. 덧셈

		c = a - b;
		System.out.println(c); // 10 뺼셈

		c = a * b;
		System.out.println(c); // 200 곱셈

		c = a / b;
		System.out.println(c); // 2 나눗셈(몫)

		c = a % b;
		System.out.println(c); // 0 나눗셈(나머지)

		// 증감연산 ++, --
		int val;
		val = 10;
		System.out.println(val);
		// val = val + 1;
		// val이라는 변수에 +1을 올리는 증감연산
		// ++val; //++를 먼저 실행한 뒤 이 행을 실행
		// val++; // 이 행을 실행한 뒤에 ++을 실행

		System.out.println(val);
		System.out.println(++val);// 출력 전에 연산
		System.out.println(val);

		val = 10;
		System.out.println(val);
		System.out.println(val++);// 출력한 뒤에 연산
		System.out.println(val);

		val = 10;
		System.out.println(val);
		System.out.println(--val); // 출력 전에 연산
		System.out.println(val);

		val = 10;
		System.out.println(val);
		System.out.println(val--); // 출력한 뒤에 연산
		System.out.println(val);
	}
}