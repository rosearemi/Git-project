package testqQ2;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
