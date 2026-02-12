package chapter5;

public class Step3_multyArray {

	public static void main(String[] args) {
		// 다차원 배열(2차원 배열)
		System.out.println("2차원 배열");

		// 교실 책상 개수
		// 가로 3개, 세로 5개
		// 1분단 5자리
		// 2분단 5자리
		// 3분단 5자리
		String[] seatA = { "A1", "A2", "A3", "A4", "A5" };
		String[] seatB = { "B1", "B2", "B3", "B4", "B5" };
		String[] seatC = { "C1", "C2", "C3", "C4", "C5" };

		// 2차원(행, 열)
		String[][] classRoom = new String[][] { { "A1", "A2", "A3", "A4", "A5" }, { "B1", "B2", "B3", "B4", "B5" },
				{ "C1", "C2", "C3", "C4", "C5" } };

		// ex) B2에 접근하려면?
		System.out.println(classRoom[1][1]);

		// ex) C5에 접근하려면?
		System.out.println(classRoom[2][4]);

		// 첫줄 4칸, 둘쨰 줄 3칸, 셋째 줄 5칸 배열
		String[][] classRoom2 = { { "A1", "A2", "A3", "A4" }, { "B1", "B2", "B3" }, { "C1", "C2", "C3", "C4", "C5" } };
		// A3
		System.out.println(classRoom2[0][2]);
		// A5(없는 값을 접근
		// System.out.println(classRoom2[0][4]);

		// 3차원 배열(예시)
		String[][][] marry = new String[][][] {
			{ {}, {}, {} }, //2차원 배열 안에 들어있는 1차원 배열들
			{ {}, {}, {} },
			{ {}, {}, {} },
			//그 2차원 배열을 감싼 3차원 배열
		};
	}
}