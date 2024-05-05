package doWhile문;

import java.util.Scanner;

public class Ex02doWhile문예제 {

	public static void main(String[] args) {
		// 몸무게 관리 프로그램
		// 1. 현재 몸무게와 목표 몸무게 입력받기
		// 2. 주차별 감량 몸무게를 입력 받기
		// 3. 현재 몸무게가 목표 몸무게에 달성하면 "축하합니다!" 출력, 종료시키기
		
		Scanner sc = new Scanner(System.in);
		// 1. 현재 몸무게 입력
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		// 2. 목표 몸무게 입력
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 1;
		
		do {
			// 3. 주차 감량 몸무게 입력
			System.out.print(week+"주차 감량 몸무게 : ");
			week++;
			int minus = sc.nextInt();
			// 4-1. 현재몸무게 = 현재몸무게 - 감량몸무게
			now = now - minus;
			// 4-2. 현재몸무게가 목표몸무게에 도달했는지 조건을 판단
			if (now <= goal) {
				System.out.println(now +"kg 달성!! 축하합니다!!");
				break;
			}
		}while(true);
		// 목표 몸무게에 도달하지 못했다면 3-4 반복하기
		
	}

}
