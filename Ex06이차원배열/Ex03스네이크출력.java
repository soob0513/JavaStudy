package 이차원배열;

public class Ex03스네이크출력 {

	public static void main(String[] args) {
		// 1. 5행 5열 이차원 배열 생성하기
		// 2. 21부터 시작하는 변수 num 생성하기
		// 3. 스네이크 모양으로 데이터 저장하기
		//  - 조건 판단해주기
		//    - 짝수행일 경우 (2로 나눴을 때 나머지가 0인 경우)
		//    - 홀수행일 경우 (2로 나눴을 때 나머지가 1인 경우)
		// 4. 출력
		
		int[][]array = new int[5][5];
		int num = 21;
		

//		for (int i = 0; i < array[0].length; i++) {
//			array[0][i] = num++;
//		}
//		for (int i = array[0].length; i >= 0; i--) {
//			array[1][i] = num++; 
//		}
		
		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) { 
				for (int i = 0; i < array[0].length; i++) {
					array[j][i] = num++;
				}
			}else {
				for (int i = array[0].length - 1; i >= 0; i--) {
					array[j][i] = num++;
				}
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i <array[0].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
