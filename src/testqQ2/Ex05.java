package testqQ2;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
		int num = sc.nextInt();

		for (int i = 0; i <=num; i++) {
			for (int j = 0; j <num - i; j++) {
				System.out.print(" ");
			} // 공백
			for (int j =i ; j >=0; j--) {
				System.out.print(j);
			} // 줄어듬
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			} // 늘어남
			System.out.println();
		}

	}

}
