package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		// 10에 더 가까운 수 구하기
		// 1. 정수형 num1과 num2 입력받기
		// 2. num1과 num2 중 10에 더 가까운 수를 반환하는 close10메소드 생성
		// 단, 두 숫자 모두 10과의 차이가 같다면 0을 반환
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");		
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 더 가까운 수 : " + result);
	}

	private static int close10(int num1, int num2) {
		// 5와 9를 봤을 때 10에 더 가까운 수는?
		// 10-5 =5 / 10-9=1   ---> 더 작은 수가 10에 가깝다고 판단!
		// 11, 15
		// 10-11=-1 / 10-15=-5 ---> 더 작은 수가 10에 가깝다고 판단XXX
		
		// -1, -5에서 -를 뗄 수 있는 방법은??
		
		// 1) 큰 수에서 작은 수를 뺀다. (if 많아진다!)
		
		// 2) 제곱 : -1*-1=1 / -5*-5=25
//		int result = 0;
//		if ((10-num1)*(10-num1) < (10-num2)*(10-num2)) { 
//			result = num1;
//		}else if ((10-num1)*(10-num1) > (10-num2)*(10-num2)) {
//			result = num2;
//		}else {
//			result = 0;
//		}
//		return result;
		
		// 3) 절대값 : 수직선 위에서 원점으로부터 어떤 수를 나타내는 점까지의 거리
		int result = 0;
		if (Math.abs(10-num1) < Math.abs(10-num2)) {
			result = num1;
		}else if (Math.abs(10-num1) > Math.abs(10-num2)) {
			result = num2;
		}else {
			result = 0;
		}
		return result;
	}


	
	
}

