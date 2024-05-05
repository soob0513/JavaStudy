package doWhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex03PlusGame {

	public static void main(String[] args) {
		// 램덤한 숫자 뽑아서 더하기 게임!
		// 1. 랜덤으로 정수 2개를 뽑아 문제를 출력
		// 2. 사용자로부터 두 수의 합을 입력 받기
		// 3. 입력 받은 값이 두 수의 합과 일치하면 "성공!"
		//    그렇지 않은 경우 "실패.."를 출력
		// 4. 일치하지 않았을 때만 다시 실행할 것인지 물어보고 y-> 계속 실행, N->프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 랜덤한 숫자 생성하는 도구 꺼내오기
		Random ran = new Random();
		System.out.println("=====Plus Game=====");
		
		do{
			// 2. 랜덤한 숫자 2개 생성하기
			int num1 = ran.nextInt(10)+1;  // 1~10
			int num2 = ran.nextInt(10)+1;
			
			// 3. 문제 출력하기
			System.out.print(num1+"+"+num2+"=");
			
			// 4. 사용자로부터 정답 입력받기
			int answer = sc.nextInt();
			
			// 5. 입력받은 숫자와 실제 정답이 같은지 비교
			if (answer == num1+num2) {
				// 정답을 맞췄을 때!
				System.out.println("성공!");
				
			}else {
				// 정답을 틀렸을 때!
				System.out.println("실패..");
				// 6. 계속하시겠습니까? 출력
				System.out.print("계속하시겠습니까? >>");
				// 7. Y 또는 N을 입력받기
				// 문자를 입력 받을 때는 String으로 입력받자!
				String con = sc.next();
				// 8. N을 입력받으면 프로그램 종료
				if (con.equals("N") || con.equals("n")) {   
					// String은 기본형이 아닌 특이한 데이터 타입
					// 그래서 비교하기 위해서는 .equals()를 사용해야함!
					System.out.println("프로그램 종료!");
					break;
				}
			}
		} while (true);
		
		
		

	}

}
