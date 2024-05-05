package while문;

public class Ex01while문기초 {

	public static void main(String[] args) {
		
		System.out.println("Lily");
		System.out.println("Lily");
		System.out.println("Lily");
		System.out.println("Lily");
		System.out.println("Lily");
		
		// while문 구조
		// Hello World를 5번 출력
		
		while(true) {
			System.out.println("hello world!");
			break;  // 반복을 멈추는 키워드
			// break 안 써주면 오류가 난다. 
			// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			// Unreachable code
		}
		
		// 반복 횟수를 제어해줄 정수형 num 선언하기
		int num = 0;
		
		while (num < 5) {
			System.out.println("moment");
			num++;
		}
		
		int num2 = 0;
		// 무한반복문
		while (true) {
			System.out.println("believe");
			num2++;
			if (num2 > 5) {  // 반복을 멈추는 조건
				break;       // 반복을 멈추는 키워드
			}
			
		}
	}

}
