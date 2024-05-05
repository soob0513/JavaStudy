package 이차원배열;

public class Ex01이차원배열기초 {

	public static void main(String[] args) {
		// 1. 이차원 배열 생성하기
		// 정수형 데이터를 보관할 수 있는 이차원 배열 생성
		int[][] array = new int[3][3];  // [행][열]
		
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[0][0]);
		// 몇번째 행의 몇번 인덱스로 들어갈지!
		
		// 2. 이차원 배열 값을 넣으면서 생성
		int[][] array2 = {{1, 2, 3}, 
						  {4, 5, 6}, 
						  {7, 8, 9}};
		System.out.println(array2[1][1]);
		
		
		// 3. 이차원 배열 안에 값 넣기!
		/*
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;
		*/
		
		int num = 1;  // 넣어줄 데이터
		/*
		array[0][0] = num++;
		array[0][1] = num++;
		array[0][2] = num++;
		
		array[1][0] = num++;
		array[1][1] = num++;
		array[1][2] = num++;
		
		array[2][0] = num++;
		array[2][1] = num++;
		array[2][2] = num++;
		*/
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				array[j][i] = num++;
			}
		}
		
		
		// 4. 이차원 배열 출력하기
		/*
		System.out.print(array[0][0] + "\t");
		System.out.print(array[0][1] + "\t");
		System.out.print(array[0][2] + "\t");
		System.out.println();
		*/
		for (int j = 0; j < array.length; j ++) {
			for (int i = 0; i < array[0].length; i++) {
				System.out.print(array[j][i] + "\t"); // "\t" : 공백
			}
		}
		
	}

}
