package ex01산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내오기 --> 한번만 하면 됨!
		Scanner sc = new Scanner(System.in);
		// 2. '첫번째 정수 입력 :' 문자 출력
		System.out.print("첫번째 정수 입력 : ");
		// 3. 입력도구를 사용해 정수 입력 받기
		int num1 = sc.nextInt();
		// 4. '두번째 정수 입력 :' 문자 출력
		System.out.print("두번째 정수 입력 : ");
		// 5. 입력도구를 사용해 정수 입력 받기
		int num2 = sc.nextInt();
		// 6. '더한 결과값 출력 :' (연산까지!)
		System.out.println("더한 결과값 : "+(num1+num2));
		System.out.println("뺀 결과값 : "+(num1-num2));
		System.out.println("곱한 결과 값 : "+(num1*num2));
		System.out.println("나눈 결과 값 : "+ ((double)num1/num2));
		// --> 연산하기 전에 둘 중 하나의 변수에 먼저 형변환을 해줘야함
		// --> float은 담을 수 있는 용량이 double보다 적다.
		
	}

}
