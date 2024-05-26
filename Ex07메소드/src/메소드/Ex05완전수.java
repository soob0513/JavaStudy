package 메소드;

import java.util.Scanner;

public class Ex05완전수 {

	public static void main(String[] args) {
		// 완전수 : 자기 자신을 제외한 양의 약수를 더했을 때 자기 자신이 되는 양의 정수
		// ex) 6 = 1+2+3
		
		// num2가 num1의 약수인지 확인하여
		// 약수라면 true, 아니라면 false 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
	}

	private static boolean isDivisor(int num1, int num2) {
		// TODO Auto-generated method stub
		return false;
	}

}
