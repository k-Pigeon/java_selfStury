package chapter4;

public class Step7 {

	public static void main(String[] args) {
		// 100m 달리기 측정 거리
		int distance = 100; // 달리기 거리
		int move = 0; // 현재 이동 거리 0m
		int leg = 1; // 다리 길이. 길면 길수록 조금이라도 더 멀리 뻗을 수 있다는 뜻

		// while : 특정 조건이 참인 동안 계속 실행
//		while (move + leg < distance) {
//			System.out.println("\n다리를 뻗어 달립니다.");
//			System.out.println("현재 이동 거리 : " + move);
//			move += 2; // 한 걸음 이동거리 1m
//		}
//		System.out.println("도착");

		// while : 조건확인 후 실행
		// do~ while : 실행 후 조건 확인 (최소 1번은 실행)
		do {
			System.out.println("\n다리를 뻗어 달립니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 한 걸음 이동거리 1m
		} while (move + leg < distance);
		System.out.println("도착했습니다.");
	}
}