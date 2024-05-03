package ex01입출력;

// 도구를 꺼내올 때는 반드시 어디에서 꺼내올지 import 구문을 작성!
import java.util.Scanner;

public class ex01입력출력 {

	public static void main(String[] args) {
		// 주석 : 코드에 영향을 끼치지 않는 일종의 메모
		// 단축키 
		// 1) 글자 크기 늘리기 : ctrl +
		// 2) 글자 크기 줄이기 : ctrl -
		
		// 출력문
		System.out.println("Hello World!");
		// 출력문 생성 단축키 : syso -> ctrl space
		System.out.println("즐거운 금요일~~");
		
		// 입력문
		// 1. 입력을 도와주는 도구를 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력 받을 수 있는 구문 작성
		sc.next();
		
	}

}
