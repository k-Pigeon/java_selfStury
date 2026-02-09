package chapter2;

public class Quiz2 {

	public static void main(String[] args) {
		int height = 13;
		String s = height >= 120 ? "가능합니다." : "불가능합니다";
		System.out.println("키가 " + height + "cm 이므로 탑승 " + s);
	}
}