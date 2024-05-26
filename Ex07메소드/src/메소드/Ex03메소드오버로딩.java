package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {
		// 메소드 오버로딩(=중복정의)
		// 매개변수의 개수를 다르게 하고, 메소드의 이름을 똑같이 부여
		System.out.println(add(3.5, 5.5));
		System.out.println(add(4, 5));
	}
	
	// 메소드 생성하기
	
	// 메소드 오버로딩 성립 조건
	// 1. 메소드 이름이 같아야한다.
	// 2. 매개변수의 개수 혹은 자료형(데이터 타입)이 달라야한다.
	// 3. 매개변수와 메소드의 이름이 동일하고 리턴타입만 다른 경우, 오버로딩이 아니다!
	//    -> 넣어준 매개변수에 따라 구분하기 때문에. 
	
	// 실수 데이터 2개를 입력받아서 더해주는 메소드
	private static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	// 정수 데이터 2개를 입력받아서 더해주는 메소드
	private static int add(int num1, int num2) {
		return num1 + num2;
	}
}
