package chapter6;

public class Step2_parameter {
	// 단순 호출이 아닌, 연산이 필요한 경우 소괄호 내부에 입력값이 필요
	public static void pythagoreanDefinition(int opposite, int adjacent) {
		double result = (Math.pow(opposite, 2) + Math.pow(adjacent, 2));
		System.out.println(Math.sqrt(result));
	}

	public static void main(String[] args) {
		// 전달값, Parameter
		pythagoreanDefinition(5, 4);
	}
}