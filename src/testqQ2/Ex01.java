package testqQ2;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt();
		int a=1; //1���ڸ�
		int count = 0;
		
		while(num>a) {
			a *=10;
			count++;
			
			
		}
		System.out.println(num+"�� �Է��ϸ�"+count+"�� �Դϴ�.");
		
	}

}
