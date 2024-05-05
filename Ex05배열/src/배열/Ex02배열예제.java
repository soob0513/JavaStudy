package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex02배열예제 {

	public static void main(String[] args) {

		Random ran = new Random();
		// 1. 배열 선언
		int[] array = new int[5];
		
		// 2. 배열의 모든 인덱스 안에 있는 데이터를 랜덤한 값으로 바꿔주세요! (1~10)
		// *** 배열의 크기를 가져오는 방법 ---> 배열이름.length
		for (int i = 0; i< array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}
		
		// 3. 배열 안에 있는 모든 값을 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		
		// 배열 안에 있는 값을 한번에 출력하는 방법
		System.out.println(Arrays.toString(array));
	}

}
