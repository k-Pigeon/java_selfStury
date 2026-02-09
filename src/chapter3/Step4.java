package chapter3;

public class Step4 {

	public static void main(String[] args) {
		// 특수문자, 이스케이프 문자
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("재밌어요");

		// \n : 줄바꿈
		System.out.println("자바가\n너무\n재밌어요");

		// \t : 키보드 탭(tab)키
		System.out.println("Java\tPython");

		// \\ : 한 개의 역슬래시 +"\"
		System.out.println("C:\\Program Files\\Adobe");

		// \"\" : 문자열 내에서 큰 따옴표 "" 를 표현
		System.out.println("자바는 \"객체지향 언어\"에요.");

		// \'\' : 문자열 내에서 작은 따옴표 '' 를 표현
		System.out.println("파이썬은 \'멀티 패러다임 언어\'에요.");

		char c = 'A';
		c = '\''; // 작은 따옴표 한개가 하나의 "문자열"로 지정
		System.out.println(c);
	}
}