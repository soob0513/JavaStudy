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
		System.out.println(getSum(7));
		System.out.println(isPerfect(7));
		
		printFinish();
	}
	


	// 완전수 구하기 완료! 를 출력하는 메소드
	public static void printFinish() {
		// void : 리턴타입이 없음을 의미하는 키워드 (아직 리턴타입을 모르겠을 때)
		System.out.println("완전수 구하기 완료!!!");
	}
	
	
	// 1. 약수 찾기 메소드
	// 메소드명 : isDivisor
	// 매개변수 : int 2개
	// 리턴타입 : boolean
	
	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		// num2가 num1의 약수니?
		if (num1 % num2 == 0) {
			// num2가 num1의 약수가 맞다!!
			result = true;
		}
		return result;
	}
	
	// 2. 자신을 제외한 약수의 총합을 구하는 메소드
	// 메소드명 : getSum
	// 매개변수 : int 1개
	// 리턴타입 : int
	private static int getSum(int num) {
		int result = 0;
		// 1. 입력된 숫자의 약수를 구한다 → 1~num 숫자 중에서 num을 제외한 범위
		// 2. 나 자신을 제외한 약수들의 합 → 누적 합계
		for (int i = 1; i < num; i++) {
		    // 기존 로직
//			if (num%1 == 0) {
				// i는 num의 약수!
//				result += i;
//			}
			
			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 구현할 수는 없으나 
			// 메소드 자체를 호출해서 사용하는 것은 가능하다!
			if(isDivisor(num,i)==true) {
				result += i;
			}
		}
		return result;
	}

	// 3. 완전수인지 확인하는 메소드
	// 메소드명 :  isPerfect
	// 매개변수 : int타입 1개
	// 리턴타입 : boolean
	private static boolean isPerfect(int num) {
		boolean result = false;
		// 입력된 숫자 num과, num을 제외한 약수들의 합이 같다면? --> 완전수
		if (getSum(num) == num) {
			// num 완전수!
			result = true; 
		}
		return false;
	}
}
