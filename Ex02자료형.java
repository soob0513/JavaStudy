package ex02변수및자료형;

public class Ex02자료형 {

	public static void main(String[] args) {
		
		// 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// 참이라는 데이터를 저장하는 bool이라는 변수 선언
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		// 2) 문자 자료형 : char (2byte)
		// : 홑따옴표를 사용해서 작성, 한 글자만 들어갈 수 있다.
		
		char name = '김';
		
		// 문자열 자료형 (기본 자료형은 아님!!)
		// String : 쌍따옴표를 사용해서 작성, 여러 글자가 들어갈 수 있다.
		
		String name3 = "김민정";
		
		// 3) 숫자 자료형 : int (4byte)
		
		// 자동(묵시적) 형 변환 : 작은 용량의 상자에서 큰 용량의 상자로 옮기는 작업
		// double (8 byte)
		
		int num1 = 4;
		double num2 = num1;
		
		// ---> 작은 크기를 가진 데이터 자료형을 큰 크기의 자료형으로 옮겨 담을 때, 자동으로 자료형이 변환!
		// long num2 = 12345;
		System.out.println(num1);
		System.out.println(num2);
		
		// 강제(명시적) 형 변환 : 큰 용량의 상자에서 작은 용량의 상자로 옮기는 작업.
		//                    옮길 곳이 더 작은 공간이기 때문에 데이터 손실 발생 가능.
		
		

		// 4) 실수 자료형
		// float(4byte), double(8byte) >> 기본값 double
		// 3.14라는 데이터를 담는 float 형태의 변수 num3를 선언
		
		float num3 = (float) 3.14;
		float num4 = 3.14f;
		
		
		System.out.println(num4);
		
	}

}
