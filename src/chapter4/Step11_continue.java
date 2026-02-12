package chapter4;

public class Step11_continue {

	public static void main(String[] args) {
		// Continue
		// 두바이 쫀득 쿠키 주문 손님 중 노쇼(말해놓고 안보임) 손님이 존재하는 경우

		int max = 20; // 최대 판매 수량
		int sold = 0;// 현제 두쫀쿠 판매 수량
		int noShow = 17; // 대기번호 17번 노쇼
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 손님, 주문하신 두바이 쫀득 쿠키 나왔습니다.");

			if (i == noShow) {
				System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue; // 하위 코드를 실행하지 않고 다음 증감으로 이동
			}

			sold++;
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.\n\n\n");

		// while문을 이용한 continue
		int index = 1;
		sold = 0;
		while (index <= 50) {
			System.out.println(index + "번 손님, 주문하신 두바이 쫀득 쿠기 나왔습니다.");
			// 손님이 노쇼라면?
			if (index == noShow) {
				System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				index++;
				continue;
			}
			sold++; // 판매처리
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");

	}
}