package chapter5;

public class Step4_multyArrayRoop {

	public static void main(String[] args) {
		// 다차원 배열 순회
		// 3 X 5 배열
		String[][] classRoom = { { "A1", "A2", "A3", "A4", "A5" }, { "B1", "B2", "B3", "B4", "B5" },
				{ "C1", "C2", "C3", "C4", "C5" } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				// System.out.print(classRoom[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		String[][] classRoom2 = { { "A1", "A2", "A3", "A4" }, { "B1", "B2", "B3" }, { "C1", "C2", "C3", "C4", "C5" } };

		for (int i = 0; i < classRoom2.length; i++) { // 세로
			for (int j = 0; j < classRoom2[i].length; j++) { // 가로
				// System.out.print(classRoom2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// ex) 가로 15자리, 세로 20자리의 강당
		String[][] hall = new String[20][15];
		String[] eng = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T" };

		for (int i = 0; i < hall.length; i++) { // 세로에 해당하는 반복분
			for (int j = 0; j < hall[i].length; j++) {
				hall[i][j] = eng[i] + (j + 1);
			}
		}
		// 나는 어떤 자리를 이미 찜해뒀다(ex, L11)
		hall[11][10] = "__";
		hall[11][11] = "___";

		// 강당 번호 좌표 확인
		for (int i = 0; i < hall.length; i++) { // 세로
			for (int j = 0; j < hall[i].length; j++) { // 가로
				System.out.print(hall[i][j] + " ");
			}
			System.out.println();
		}
	}
}