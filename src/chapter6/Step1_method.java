package chapter6;

public class Step1_method {
	// 메소드 함수는 소괄호 필수(정의)
	// 한번 정의하면 여러번 사용 가능(코드 중복 방지)
	public static void methodActivation() {
		System.out.println("======메소드 활성화=======");
	}

	public static void main(String[] args) {
		// 메소드 (주인장 기준 마의 구간)
		// 메소드 호출
		System.out.println("메소드 활성화 전");
		methodActivation();
		System.out.println("메소드 활성화 후");
	}
}