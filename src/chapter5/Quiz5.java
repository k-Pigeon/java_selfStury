package chapter5;

public class Quiz5 {

	public static void main(String[] args) {
		int maxSize = 295;
		int minSize = 250;
		Integer[] shoes = new Integer[10];

		for (int i = 0; i < shoes.length; i++) {
			shoes[i] = minSize;
			minSize += 5;
		}

		for (int i = 0; i < shoes.length; i++) {
			System.out.println("신발 사이즈 : " + shoes[i]);
		}
	}
}