package chapter1;

public class Step4 {

	public static void main(String[] args) {
		// 기본 주석 : //
		System.out.println("(30분) 남은 PC 이용 시간");
		// System.out.println("(10분) 남은 PC 이용 시간");
		System.out.println("PC 사용 시간이 만료되었습니다.");

		// 우측 값이 좌측으로 대입
		int money = 5000; // 처음 챙긴 돈
		money = money + 2000; // 혹시 모를 가격 인상 / 간식거리를 위한 추가 금액
		System.out.println("남은 금액은 " + money + "원 입니다.");

		/*
		여러 줄 주석 방법 : /* * /
		int a = 10;
		int b = 20;
		System.out.println(a + b); // 30
		*/
		
		
		/*
		 *주석 단축키
		 * ctrl + / 
		 */
	}
}