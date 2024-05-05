package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05성적계산 {

	public static void main(String[] args) {
		// 점수 5개를 입력받고
		// 최고 점수, 최저 점수, 총합, 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 성적 데이터를 저장할 수 있는 배열 생성
		int[] scores = new int[5];
		
		// 2. 성적 데이터 입력 받기 (5개)
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "번째 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		// 3. 입력 받은 데이터 전부 출력
		System.out.println("입력된 점수 : "+ Arrays.toString(scores));
		
		// 4. 최고 점수 구하기, 최저 점수 구하기
		// 5. 합계, 평균 구하기
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] <= scores[0]) {
				min = scores[i];
			}
			sum += scores[i];
		}
		System.out.println("최고 점수 : "+ max);
		System.out.println("최저 점수 : "+ min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum / scores.length);
	}

}
