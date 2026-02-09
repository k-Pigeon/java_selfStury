package chapter3;

public class Step3 {
	public static void main(String[] args) {
		// 문자열을 비교
		String s1 = "Java";
		String s2 = "Python";

		// equals. 지정한 변수와 지정된 변수가 같은 값을 갖고 있는가?
		// 지정한 변수(s1)이 기준
		System.out.println(s1.equals("Java"));
		System.out.println(s2.equals("Python"));
		// 대소문자 구문 없이 문자열지 같은지의 여부를 판단
		System.out.println(s2.equalsIgnoreCase("python"));

		// 문자열 비교 심화
		s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
		s2 = "1234";
		System.out.println(s1.equals(s2)); // true. 내용을 비교
		System.out.println(s1 == s2); // true. 참조를 비교

		s1 = new String("1234"); // 서로 다른 메모리 상으로 존재.
		s2 = new String("1234"); // 등호 == 는 메모리 참조까지 구분

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false
	}
}