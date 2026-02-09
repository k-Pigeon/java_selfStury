package chapter1;

public class Step6 {

	public static void main(String[] args) {
		System.out.println("상수");
		final String KR_country_CODE = "+82"; // 국가번호. final : 절대 바뀌어서는, 바뀌지 않는 상수
		// KR_country_CODE = "+8282";
		System.out.println(KR_country_CODE);

		final double PI = 3.141592; // 원주율
		final String DATE_OF_BIRTH = "2005-04-17"; // 생년월일(바뀌지 않음)

	}
}