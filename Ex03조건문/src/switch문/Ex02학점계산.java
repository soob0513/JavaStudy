package switch문;

import java.util.Scanner;

public class Ex02학점계산 {

	public static void main(String[] args) {
		// 학점 계산
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 70점 미만 : D
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		char grade = 'A';
		
		switch (totalScore/10) {
		case 10:
			grade='A';
			break;
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default : 
			grade='D';
			break;
		}
		
		/* 이렇게도 가능!
		switch (totalScore/10) {
		case 10:
		case 9:
			grade='A';
		*/
		
		System.out.println(grade + "학점입니다!");

	}

}
