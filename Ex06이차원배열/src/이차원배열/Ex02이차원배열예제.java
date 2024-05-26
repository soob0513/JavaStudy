package 이차원배열;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {
		// 1. 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array를 선언
		// 2. 21부터 시작하는 변수 num 선언하기
		// 3. 열부터 데이터가 저장될 수 있도록 코드 작성
		// 4. 출력하기
		
		int[][] array = new int[5][5];
		int num = 21;
		
//		for (int i = 0; i < array.length; i++) {
//			array[i][0] = num++;
//			
//		}
//		for (int i = 0; i < array.length; i++) {
//			array[i][1] = num++;
//			
//		}
//		for (int i = 0; i < array.length; i++) {
//			array[i][2] = num++;
//			
//		}
		
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}
		
//		System.out.print(array[0][0]+"\t");
//		System.out.print(array[0][1]+"\t");
//		System.out.print(array[0][2]+"\t");
//		System.out.print(array[0][3]+"\t");
//		System.out.print(array[0][4]+"\t");
//		System.out.println();
//
//		System.out.print(array[1][0]+"\t");
//		System.out.print(array[1][1]+"\t");
//		System.out.print(array[1][2]+"\t");
//		System.out.print(array[1][3]+"\t");
//		System.out.print(array[1][4]+"\t");
//		System.out.println();
		
		for (int j = 0; j <array.length; j++){
			for(int i = 0; i< array[0].length; i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		
	}

}
