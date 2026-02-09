package chapter3;

public class Step2 {

	public static void main(String[] args) {
		String s = "i like Java and MySQL and Python.";

		// 문자열 변환
		// replace. 특정 문자열을 해당 문자열로 "전부" 바꾸는 기능(공백 포함, 변수 영향 X)
		System.out.println(s.replace(" and", ", "));
		// index 기준(0부터 시작) 7부터 시작. 이전내용은 삭제(변수에 영향 X)
		System.out.println(s.substring(7));
		// 특정 값의 위치 정보를 찾은 뒤, 그 위치부터 잘라내어 출력
		System.out.println(s.substring(s.indexOf("Java")));
		// 특정한 값부터 특정한 값 "이전까지" 출력(점 출력 X)
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));

		// 공백 제거
		s = "i         love          java.         ";
		System.out.println(s); // 기본
		System.out.println(s.trim()); // 불필요한 공백 제거(앞뒤)

		// 문자열 결합
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2); // 두 변수가 완전히 결합된 채 출력
		System.out.println(s1 + ", " + s2); // 변수 사이에 특정한 문자열이 붙어서 출력
		System.out.println(s1.concat(", ").concat(s2)); // 문자열에 특정 문자열을 결합

	}
}