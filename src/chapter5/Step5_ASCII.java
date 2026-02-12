package chapter5;

public class Step5_ASCII {

	public static void main(String[] args) {
		// ASCII : 미국 표준 코드
		// 알파벳 대문자 A : 65부터
		// 알파벳 소문자 B : 97부터
		// 숫자 0 : 48부터
		char c = '0'; // ASCII 기준 48
		System.out.println(c);
		System.out.println((int) c);

		c = '1';
		System.out.println(c);
		System.out.println((int) c);

		c++;
		System.out.println(c);
		System.out.println((int) c);

		// ex) 가로 15자리, 세로 20자리의 강당
		String[][] hall = new String[20][15];
		char ch = 'A';

		for (int i = 0; i < hall.length; i++) { // 세로에 해당하는 반복분
			for (int j = 0; j < hall[i].length; j++) {
				hall[i][j] = String.valueOf(ch) + (j + 1);
			}
			ch++;
		}
		for (int i = 0; i < hall.length; i++) { // 세로
			for (int j = 0; j < hall[i].length; j++) { // 가로
				System.out.print(hall[i][j] + " ");
			}
			System.out.println();
		}
	}
}