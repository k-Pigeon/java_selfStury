package chapter4;

public class Step6 {

	public static void main(String[] args) {
		// 반복문 while
		// 100m 달리기 측정 거리
		int distance = 100; // 달리기 거리
		int move = 0; // 현재 이동 거리 0m

		// while : 특정 조건이 참인 동안 계속 실행
		while (move < distance) {
			System.out.println("\n다리를 뻗어 달립니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 2; // 한 걸음 이동거리 1m
		}
		System.out.println("도착");

//		// while의 무한 루프
//		move = 0;
//		while (move < distance) {
//			System.out.println("\n다리를 뻗어 달립니다.");
//			System.out.println("현재 이동 거리 : " + move);
//		}
//		System.out.println("도착");
	}
}