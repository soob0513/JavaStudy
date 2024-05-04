package if_else문;

import java.util.Scanner;

public class Ex02ifelse예제 {

	public static void main(String[] args) {
		// 점수를 입력받아 60점 이상이면 합격
		// 아니면 불합격을 출력해주는 프로그램
		
		// 1. 입력도구 꺼내오기
		// 2. 점수 입력 : 출력하기
		// 3. int 타입 변수 grade에 정수 입력 받기
		// 4. 60점 이상인지 조건 판별
		// 5. 참일 때 --> 합격입니다. 출력
		// 6. 거짓일 때 --> 불합격입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		if (grade >= 60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
