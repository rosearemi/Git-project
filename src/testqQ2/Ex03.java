package testqQ2;

import java.util.*;

public class Ex03 {
	static void triangleLB(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void triangleLU(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	static void triangleRB(int n) {
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <=n-i ; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("입력받은 정수는 " + n + " 입니다.");
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
	}

}
