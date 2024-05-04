package switch문;

import java.util.Scanner;

public class Ex03계절계산기 {

	public static void main(String[] args) {
		// 월을 입력 받아 봄, 여름, 가을, 겨울 중 맞는 계절을 알려주는 프로그램
		// 12, 1, 2월 -> 겨울
		// 3, 4, 5월 -> 봄
		// 6, 7, 8월 -> 여름
		// 9, 10, 11월 -> 가을
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season = "봄";
		
		switch (month) {
		case 12, 1, 2:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
			break;
		case 9, 10, 11:
			season = "가을";
			break;
		default :
			System.out.println("1~12월까지만 입력해주세요.");
		}
		
		System.out.println(month + "월은 " + season + "입니다!");

	}

}
