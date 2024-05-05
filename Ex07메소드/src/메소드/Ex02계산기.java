package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		// import 단축키 : ctrl + shift + o
		
		// 메소드 사용하는 영역
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '*';
		System.out.println(cal(num1, num2, op));
	}

	// 메소드 생성하는 영역(main 바깥)
	// 메소드명 : cal
	// 매개변수 : int 2개, char 1개
	// 리턴타입 : int 
	
	// private : 다른 클래스에서는 사용할 수 없게 막는 접근제한자
	private static int cal(int num1, int num2, char op) {
		int result = 0;
		// op값이 어떤 모양인지에 따라 다른 연산을 해주는 메소드
		if (op == '+') {
			result = num1 + num2;
		}else if (op == '-') {
			result = num1 >= num2? num1 - num2: num2 - num1;
		}else if (op == '*') {
			result = num1 * num2;
		}else if (op == '/') {
			result = num1 / num2;
		}
		
		return result;
	}

}
