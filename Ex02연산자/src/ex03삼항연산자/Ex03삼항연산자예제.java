package ex03삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자예제 {

	public static void main(String[] args) {
		// 농구공을 담기 위해 필요한 상자의 개수를 구하는 프로그램 만들기
		// 상자 하나에는 농구공이 최대 5개 들어갈 수 있다.
		// 만약 농구공이 '23'개라면 필요한 상자의 개수는 '5'개이다. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		int box1 = num/5;
		int box2 = num%5 == 0? 0: 1;
		System.out.println("필요한 상자의 수 : " +(box1 + box2));
		
	}

}
