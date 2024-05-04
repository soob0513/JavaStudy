package ex01산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		// 변수 num값을 입력받아 백의 자리 이하를 버리는 코드를 작성
		// 만약 변수 num의 값이 456이라면 400이 되고, 111이라면 100이 된다.
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수 입력 : 출력하기 (개행 없이)
		System.out.print("정수 입력 : ");
		
		// 3. 정수 입력 받기 
		int num = sc.nextInt();
		
		// 4. num의 백의자리 이하를 버리기
		int result = num - (num%100);
		int result2 = (num/100)*100;

		System.out.println("첫번째 결과 :" + result);
		System.out.println("두번째 결과 :" + result2);
		
		
		
		
		

	}

}
