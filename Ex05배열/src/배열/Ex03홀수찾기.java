package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 저장할 수 있는 배열 array 선언
		// 배열 안의 모든 데이터를 임의의 값으로 초기화 (1~100)
		// 배열 안의 데이터 중 홀수의 값만 출력하고, 총 몇 개인지 출력
		
		Random ran = new Random();

		// 1. 5칸짜리 정수형 배열 생성
		int[] array = new int[5];
		
		// 2. 1~100까지의 랜덤한 수로 초기화시키기
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}
		
		// 3. 해당하는 데이터 홀수인지 조건 판단
		System.out.print("array에 들어있는 홀수는 ");
		int cnt = 0;  // 홀수 개수를 카운트할 변수
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				cnt++;  // 홀수일 때 cnt 값을 1씩 증가
			}
		}
		System.out.println("이며, 총 " + cnt +"개입니다.");

	}

}
