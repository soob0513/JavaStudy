package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex06로또 {

	public static void main(String[] args) {
		// 정수형 데이터 5개 배열 array
		// 배열 안의 데이터 모두 임의의 값으로 초기화 (1~10)
		// 단, 배열에 중복된 값을 제거
		// 배열 안의 데이터 모두 출력
		
		Random ran = new Random();
		
		int[] array = new int[5];
		
		for (int j = 0; j < array.length; j++) {
			// j번 방에 랜덤숫자 집어넣기
			array[j] = ran.nextInt(10) + 1;
			for (int i = 0; i < j; i++) {
				// j번 방 중복 숫자 검사하기
				if (array[i] == array[j]) {
					array[i] = ran.nextInt(10) + 1;
					j--;  // 중복된 숫자가 발생했다면 인덱스 번호를 다시 앞으로 보낼 수 있는 코드
					break; // 만약 중복된 숫자가 하나라도 발견됐다면 멈추고 바깥 for문으로 올릴거야!
				}
			}
		}
		
		System.out.println("로또 번호는!!!!!");
		System.out.println(Arrays.toString(array));

	}

}
