package chapter4;

public class Step10_break {

	public static void main(String[] args) {
		// break;
		// 두바이 쫀득쿠키. 1인당 1개까지, 매장에서는 최대 30개까지만.

		int max = 30;
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + "번 손님, 주문하신 두바이 쫀득 쿠기 나왔습니다~");
			if (i == max) {
				System.out.println("두바이 쫀득 쿠기가 품절되었습니다.");
				break; // 이 문구가 사용된 반복문을 탈출시키는 명령어
			}
		}
		System.out.println("영업을 종료합니다.");

		System.out.println("\n\n\n");

		// while문
		int index = 1; // 손님 대기번호
		while (index <= 50) { // 줄을 서로 있는 손님 ㅅ ㅜ
			System.out.println(index + "번 손님, 주문하신 두바이 쫀득 쿠기 나왔습니다~");
			if (index == max) {
				System.out.println("두바이 쫀득 쿠키가 품절되었습니다.");
				break; // 같은 방식
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");
	}
}