package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제 {

	public static void main(String[] args) {
		
		// int 타입의 변수 grade를 선언하고 키보드로 값을 입력 받으세요.
		// 만약 grade가 60점 이상이면 "합격입니다."
		// 그렇지 않다면 "불합격입니다."를 출력
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 점수를 입력하세요 출력
		System.out.print("점수를 입력하세요 : ");
		
		// 3. int타입 grade에 점수 입력 받기
		int grade = sc.nextInt();
		
		// 4. grade가 60점 이상인지 판별
		if (grade >= 60) {
			System.out.println("합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		
	}

}
