package 배열;

public class Ex01배열기초 {

	public static void main(String[] args) {
		
		// 배열의 생성 -> new int[5];
		// [] : 배열, 리스트에 사용
		// () : 함수, 메소드에 사용
		
		int[] numbers = new int[3];
		// numbers : 배열 공간의 이름
		// [3] : 배열의 크기가 3
		
		// 배열 생성 후 값을 넣으려면 인덱스 번호 사용
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 7;
		
		// 배열 생성할 때 값을 알고 있다면
		int[] arr = {1,2,3,4,5};
		
		System.out.println(numbers);
		// --> [I@2ff4acd0 --> 주소값 출력됨
		
		// 배열의 값을 출력하려면?
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		// --> 인인덱스 번호를 붙여줘야 한다!
	}

}
