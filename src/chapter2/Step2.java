package chapter2;

public class Step2 {

	public static void main(String[] args) {
		// 대입 연산자
		int num = 10;
		num = num + 2; // 10이라는 값과 2를 더한 뒤 num이라는 그릇에 담기. 10
		System.out.println(num);

		num = num - 2; // 12에 2를 뺀 뒤 num이라는 그릇에 담기. 10
		System.out.println(num);

		num = num * 2; // 20
		System.out.println(num);

		num = num / 2; // 10
		System.out.println(num);

		num = num % 2; // 0
		System.out.println(num);

		System.out.println("--------------------------");

		// 복합대입연산자
		num = 10;

		// num = num + 2;
		num += 2; // num이라는 값에 (num값과 2를 더한 값)을 대입
		System.out.println(num);

		num -= 2; // num이라는 값에 (num값과 2를 뺀 값)을 대입
		System.out.println(num);

		num *= 2; // num이라는 갑에 (num값과 2를 곱한 값)을 대입
		System.out.println(num);

		num /= 2; // num이라는 값에 (num값과 2를 나눈 몫)을 대입
		System.out.println(num);

		num %= 2; // num이라는 값에 (num값과 2를 나눈 나머지)를 대입
		System.out.println(num);
	}
}