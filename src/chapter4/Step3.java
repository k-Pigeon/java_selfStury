package chapter4;

public class Step3 {

	public static void main(String[] args) {
		// 조건문 else if
		// 점심메뉴로 제육 1순위, 없으면 돈까스 2순위, 없으면 국밥 3순위
		boolean porkRice = true;
		boolean porkCutlet = true;

		// 1번 조건 "제육이 있는가?"
		if (porkRice) {
			System.out.println("제육 메뉴 결정");
		}
		// 2번 조건 "돈가스는 있는가?"
		else if (porkCutlet) {
			System.out.println("돈가스 메뉴 결정");
		}
		// 3번 조건 "다 없으면 국밥이나 먹자"
		else {
			System.out.println("국밥 먹자");
		}
		System.out.println("식사 끝!");

		porkRice = false;
		porkCutlet = false;
		boolean hamburger = true;

		// 1번 조건 "제육이 있는가?"
		if (porkRice) {
			System.out.println("제육 메뉴 결정");
		}
		// 2번 조건 "돈가스는 있는가?"
		// else if는 여러번 사용 가능
		else if (porkCutlet) {
			System.out.println("돈가스 메뉴 결정");
		}
		// 3번 조건 "햄버거 있을까?"
		else if (hamburger) {
			System.out.println("햄버거로 메뉴 결정");
		}
		// 4번 조건 "다 없으면 국밥이나 먹자"
		else {
			System.out.println("국밥 먹자");
		}
		System.out.println("저녁 식사 끝!");
	}
}