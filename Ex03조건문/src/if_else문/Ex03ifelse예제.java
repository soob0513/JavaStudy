package if_else문;

import java.util.Scanner;

public class Ex03ifelse예제 {

	public static void main(String[] args) {
		// 에버랜드 입장객의 나이와 수를 입력받아 입장료를 계산해주는 프로그램!
		
		// 1. 입력도구 꺼내기
		// 2. 나이를 입력하세요 출력
		// 3. 나이 입력받기
		// 4. 인원수를 입력하세요 출력
		// 5. 인원수 입력받기
		// 6. 입장료 계산하기
		// 6-1. 나이가 20세 미만이라면 입장료 50% 할인 (기본입장료 : 5000원)
		// 6-2. 그렇지 않은 경우는 입장료 그대로 계산 (기본입장료 : 5000원)
		// 7. 결과 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int person = sc.nextInt();
		int price = 5000;
		
		if (age < 20) {
			price = 5000/2;
		}else {
			price = 5000;
		}
		
		System.out.println("총"+(price*person)+"원입니다.");
		
		
	}

}
