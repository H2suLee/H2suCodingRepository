package chapter4;

public class forLoop_Star {
	public static void main(String[] args) {
		// for문을 이용하여 별찍기
		// 별찍기 i는 줄 넘버, j는 * 갯수(?)

		// 1)
		// *
		// **
		// ***
		// ****
		// *****

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// 2)
//		// *****
//		// ****
//		// ***
//		// **
//		// *
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//
//		// 3)
//		//     *
//		//    **
//		//   ***
//		//  ****
//		// *****
//		
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j < 5; j++) {
//				if(i>j){
//				System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//		System.out.println();
//		}
//		
//		// 4)
//		// *
//		// ***
//		// ****
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j<=2*i-1;j++) {
//				System.out.print("*");
//			} System.out.println();
//		} 
//		
//		// 5) 트리형
//		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= (5-i); j++) {
//				System.out.print(" ");
//				}
//			for (int j = 1; j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}
}
