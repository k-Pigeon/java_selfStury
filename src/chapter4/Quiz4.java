package chapter4;

public class Quiz4 {

	public static void main(String[] args) {
		int price = 4000;
		int maxPrice = 30000;
		int time = 10;
		int result = price * time;

		if ((price * time) > maxPrice) {
			result = maxPrice;
		}

		String kind = "장애인 차량";

		if (kind == "경차" || kind == "장애인 차량") {
			result /= 2;
			System.out.println(kind + " " + time + "시간 주차 시 " + result + "원");
		} else {
			System.out.println(kind + " " + time + "시간 주차 시 " + result + "원");
		}

	}
}