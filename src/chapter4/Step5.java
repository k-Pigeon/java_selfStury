package chapter4;

public class Step5 {

	public static void main(String[] args) {
		// 반복문 for
		// XX매장(햄버거집)
		// 손님이 여러명 방문한 경우
//		System.out.println("어서오세요, XX점입니다.");
//		System.out.println("어서오세요, XX점입니다.");
//		System.out.println("어서오세요, XX점입니다.");
//		System.out.println("어서오세요, XX점입니다.");
//
//		// 인사법이 바뀐다면?
//		System.out.println("환영합니다, XX점입니다.");
//		System.out.println("환영합니다, XX점입니다.");
//		System.out.println("환영합니다, XX점입니다.");
//
//		// 매장 이름이 바뀐다면?
//		// XX->YY
//		System.out.println("환영합니다, YY점입니다.");
//		System.out.println("환영합니다, YY점입니다.");
//		System.out.println("환영합니다, YY점입니다.");

		// 선언, 조건, 증감
		// 지금은 10보다 "작을 동안" 실행
		for (int i = 0; i < 10; i++) {
			// System.out.println("어서오세요, XX점입니다. " + i);
			// System.out.println("환영합니다, XX점입니다. " + i);
			System.out.println("환영합니다, YY점입니다. " + i);
		}

		System.out.println("\n\n");

		// 짝수만 출력을 하는 방법
		// 증감을 +2 씩 하는 방법
		for (int i = 0; i < 10; i += 2) {
			System.out.print(i);
		}
		System.out.print("\n");
		// 홀수만 출력하는 방법
		// 증감을 +2씩 증가와 동시에, 시작 숫자를 "1"로 변경
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i);
		}

		System.out.println();

		// 거꾸로 숫자를 출력
		// i가 0을 "초과하는 동안" 실행
		// 증감은 -1. +로 할 경우, 0 이하로 갈 수 없으니 무한루프에 돌입
		for (int i = 5; i > 0; i--) {
			System.out.print(i);
		}
		System.out.println("\n");

		// 1부터 10까지의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // 증감되는 모든 값들을 합산
			System.out.println("현재까지의 총합은 " + sum + "입니다.");
		}
		System.out.println("\n" + sum);
	}
}