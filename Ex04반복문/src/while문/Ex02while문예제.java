package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
		// 키보드로 입력받은 수가 10보다 작거나 같을 때만
		// 계속해서 정수를 입력 받기!
		// 10보다 큰 수를 입력하면 "종료되었습니다."를 출력
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}

	}

}
