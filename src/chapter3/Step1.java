package chapter3;

public class Step1 {
	public static void main(String[] args) {
		String s = "i like Java and MySQL and Python.";
		System.out.println(s);

		// 문자열의 길이
		// 지정된 변수의 순수 길이를 측정하는 기능
		System.out.println(s.length());

		// 대소문자 변환
		System.out.println(s.toUpperCase()); // 지정된 변수값을 모두 "대문자"로 변경
		System.out.println(s.toLowerCase()); // 지정된 변수값을 모두 "소문자"로 변경

		// 포함 관계
		// 지정된 변수값에 특정한 값을 찾는 기능 // true OR false
		System.out.println(s.contains("Java")); // true
		System.out.println(s.contains("C#")); // false
		System.out.println(s.indexOf("Java")); // 위치 정보
		System.out.println(s.indexOf("C#")); // 없는 값의 위치정보를 찾는 경우 -1 반환
		System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
		System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치 정보
		System.out.println(s.startsWith("i like")); // 이 문자열로 시작하는가?(true OR false) true
		System.out.println(s.endsWith(".")); // 이 문자열로 끝나는가?(true OR false) false
	}
}