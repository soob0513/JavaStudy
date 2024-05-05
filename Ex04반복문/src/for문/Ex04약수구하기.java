package for문;

import java.util.Scanner;

public class Ex04약수구하기 {

	public static void main(String[] args) {
		// 입력 받은 정수의 약수를 구하자
		// 1. 숫자를 입력 받는다
		// 2. 입력 받은 숫자를 임의의 숫자로 나누었을 때 나머지가 0이라면 약수!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
