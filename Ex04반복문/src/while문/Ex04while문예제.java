package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수와 짝수가 각각 몇 개 입력되었는지 출력하는 프로그램
		
		// 1. 입력 도구 꺼내오기
		// 2. 정수 입력 출력하기 (개행없이)
		// 3. 정수 입력받기
		// 4. 입력받은 정수가 짝수라면 짝수의 개수를 +1
		// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
		// 6. 짝수와 홀수의 개수 출력하기
		// 2~6까지 반복! -1을 입력하면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num%2 == 0) {
				even++;
			}else if (num%2 ==1) {
				odd++;
			}else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;	
			}
			
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);
			
		}
		
		
	}

}
