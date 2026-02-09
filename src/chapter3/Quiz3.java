package chapter3;

public class Quiz3 {

	public static void main(String[] args) {
		String jumin = "050417-3123456";
		System.out.println(jumin.substring(0, jumin.indexOf("-") + 2));
	}
}