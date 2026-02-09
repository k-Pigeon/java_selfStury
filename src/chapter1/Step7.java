package chapter1;

public class Step7 {

	public static void main(String[] args) {
		// 형변환(TypeCasting)
		// 정수형 -> 실수형
		// 실수형 -> 정수형으로
		int score = 93;
		System.out.println(score); // 정수형
		System.out.println((float) score); // 정수형을 소숫점 형태로 전환.
		System.out.println((double) score); // 정수형을 double(더 많은 소숫자리)형으로 변환. 지금은 정수형이기에 .0 만 추가

		// float, double -> int
		float score_f = 93.3f; // float 변수
		double score_d = 98.8; // double형 변수
		System.out.println((int) score_f); // 실수형 -> 정수 (소숫점 버림) 93
		System.out.println((int) score_d); // 실수형 -> 정수 (소숫점 버림) 98

		score = 93 + (int) 98.3; // 93 + 98
		System.out.println(score); // 191

		score_d = 93 + 98.8;// 아무런 문제 없음. 변수가 실수형일 경우 정수는 자동으로 .0 이 붙어 실수로 판단
		// score_d = (double) 93 + 98.8; //(double)은 없어도 결과는 같지만, 편의성을 위해 예시 추가

		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 정수값을 실수 변수에 대입(문제없음) 191 -> 191.0
		// int < long < float < double (자동으로 형변환)

		// 191.8을 191로 변환 시도
		// (형변환시킬형태)가 없으면 더 작은 범위로는 대입 불가
		// double -> float -> long -> int
		int convertedScoreInt = (int) score_d;

		// 숫자를 문자열로
		// 93 이라는 값을 문자열로 변형
		String s1 = String.valueOf(93);
		// 숫자로 들어온 값을 문자열로 변경하는 기능
		s1 = Integer.toString(93);
		System.out.println(s1);

		// 실수를 문자열로 입력
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2);

		// 문자열을 숫자로 변경
		// 특정 값을 정수형으로 변경하는 기능
		int i = Integer.parseInt("93");
		System.out.println(i);

		// 문자열을 실수로 변경
		// 특정 값을 실수형으로 변경하는 기능
		double d = Double.parseDouble("98.8");
		System.out.println(d);

		// 작동 안됨
		int error = Integer.parseInt("java");
		System.out.println(error);
	}
}