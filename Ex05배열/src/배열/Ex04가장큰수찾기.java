package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		
		// 정수형 데이터 5개를 저장할 수 있는 배열 array 선언
		// 배열 안의 모든 데이터를 임의의 값으로 초기화
		// 배열 안의 데이터 중 가장 큰 값을 출력
		
		Random ran = new Random();
		// 1. 정수형 데이터 5개 보관할 수 있는 array 생성
		int[] array = new int[5];
		
		// 2. 1~10까지의 랜덤한 숫자로 초기화
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}
		
		// 3. 가장 큰 값 찾기
		// 가장 큰 값을 담아줄 변수 max 선언
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			// max가 가장 큰 값인지?
			// max와 array의 데이터 비교
			if (array[i] >= max) {
				max = array[i];
			}
		}
		
		// 4. 출력
		System.out.println("배열 안에 들어있는 값 : "+ Arrays.toString(array));
		System.out.println("가장 큰 값은 "+ max + "입니다.");
	}

}
