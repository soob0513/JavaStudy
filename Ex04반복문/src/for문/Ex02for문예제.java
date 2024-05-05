package for문;

public class Ex02for문예제 {

	public static void main(String[] args) {
		// for문 사용해서 96부터 73까지 출력
		for (int i = 96; i >= 73; i--) {
			System.out.print(i + " ");
		}
		
		// 개행
		System.out.println();
		
		// 숫자들 중 홀수만 출력 
		for (int i = 96; i >= 73; i--) {
			if (i%2 == 1) {
				System.out.print(i + " ");
			}
		}
			
		
	}

}
