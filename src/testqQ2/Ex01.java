package testqQ2;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int a=1; //1의자리
		int count = 0;
		
		while(num>a) {
			a *=10;
			count++;
			
			
		}
		System.out.println(num+"을 입력하면"+count+"자 입니다.");
		
	}

}
