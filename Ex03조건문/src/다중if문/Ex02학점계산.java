package 다중if문;

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
		
		// 학점을 담을 변수 생성
		char grade = 'A';
		
		if (totalScore >= 90) {
			grade = 'A';
		}else if (totalScore >= 80) {
			grade = 'B';
		}else if (totalScore >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		
		System.out.println(grade + "학점입니다!");
	}

}
