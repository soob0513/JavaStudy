package 자판기프로그램;

import java.util.Scanner;

public class Ex01자판기프로그램 {

	public static void main(String[] args) {
		// 금액을 입력하고 메뉴를 고른 뒤 잔돈을 출력해보기!
		// 사용자가 입력한 메뉴가 무엇인지 판단 --> 조건문
		// 만약에 사용자가 1번을 선택
		// 잔돈 = 지불한 금액 - 700
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.println("1. 이구동성(700원) 2. 썬칩(1000원) 3. 뽀빠이(500원) >> ");
		int menu = sc.nextInt();
		
		int change = money;
		if (menu == 1) {
			if (money < 700) {
				System.out.println("돈이 부족합니다ㅠㅠ");
			}else {
				change = money - 700;
			}
		} else if (menu == 2) {
			if (money < 1000) {
				System.out.println("돈이 부족합니다ㅠㅠ");
			}else {
				change = money - 1000;
			}
		} else if (menu == 3) {
			if (money < 500) {
				System.out.println("돈이 부족합니다ㅠㅠ");
			}else {
				change = money - 500;
			}
		} else {
			System.out.println("올바른 메뉴를 선택해주세요.");
		}
		
		System.out.println("잔돈 : " + change + "원");
	}

}
