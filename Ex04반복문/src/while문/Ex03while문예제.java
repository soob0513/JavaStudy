package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		// 키보드로 입력받은 수를 누적하는 프로그램
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 누적할 공간
		
		while(true) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();		
			sum += input;  // sum = sum + input
			System.out.println("누적결과 : "+ sum);
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}

	}

}
