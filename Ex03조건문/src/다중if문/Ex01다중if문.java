package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력받아서 해당하는 숫자가 
		// 0인지, 홀수인지, 짝수인지 판별하는 프로그램을 만들어보자!
		
		// 1. 입력도구 꺼내오기
		// 2. 숫자를 입력하세요 출력
		// 3. 숫자 입력받기
		// 4. 숫자를 판단해서 0인지, 홀수인지, 짝수인지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다.");
		}else if (num%2 != 0) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}

	}

}
