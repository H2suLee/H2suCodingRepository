package co.edu.oop;

public class StarTree {

	public static void main(String[] args) {

		//tree형
		for(int i = 5; i>=0; i--) {
			for(int j = 1; j<i; j++) {
				System.out.print("=");
			}
			for(int j = 1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *
		// ***
		// *****

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}
}
