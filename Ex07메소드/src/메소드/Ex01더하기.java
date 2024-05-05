package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기 (main 안쪽 영역에서 사용하기)
		double result = addDouble(3.14, 4.2);
		System.out.println(result);
		
		System.out.println(subNum(4, 10));
	}
	
	// 메소드 생성 (main 영역을 벗어나서)
	// 1. 더하기
	public static double addDouble(double n1, double n2) {
		return n1 + n2;
	}
	
	// 2. 빼기
	// 리턴타입 : int / 메소드명 : subNum / 매개변수 : int 2개
	// 매개변수로 받아온 데이터 2개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과값을 돌려주기
	public static int subNum(int n1, int n2) { 
		// subNum이라는 메소드도 static이라는 공간에 같이 올려주세요.
		int result = 0;
		
		result = n1 > n2 ? n1 - n2: n2- n1;
		
		return result;
	}
		
	



}
