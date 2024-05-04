package ex03삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		
		// 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 만들어보자!
		// 1. 입력도구 꺼내오기
		// 2. '정수를 입력하세요 :' 출력하기 (개행 없이)
		// 3. 입력도구 사용해서 정수 입력 받기
		// 4. 입력받은 정수가 홀수인지 짝수인지 판별하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// System.out.println(num%2 == 0 ? num+"는(은) 짝수입니다." : num+"는(은) 홀수입니다.");
		
		String result = num%2 == 0? "짝수" : "홀수";
		System.out.println(num+"는(은)"+ result + "입니다.");
		
	}

}
