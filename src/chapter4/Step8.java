package chapter4;

public class Step8 {

	public static void main(String[] args) {
		// 이중 반복문
		// 별( * ) 사각형 만들기
		/*
		
		*****
		*****
		*****
		*****
		
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n");

		// 별 (*) 왼쪽 삼각형
		/*
		 
		*
		**
		***
		****
		*****		
		
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n");
		// 별 (*) 오른쪽 삼각형
		/*
		 
		    *
		   **
		  ***
		 ****
		*****		
		
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}