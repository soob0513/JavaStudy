package OOP;

public class Main {
	
	// 실행할 수 있는 공간!!
	public static void main(String[] args) {
		
		// 1. 객체(Object)를 생성(선언)해보기
		// --> 클래스 설계도면을 기반으로!
		// 회원 자료형 만들기! 변수명 : member1
		// 자료형 변수명 = new 자료형();
		Member member1 = new Member();
		// member1 --> 주소값이 저장되어있는 레퍼런스 변수
		
		// 주소값 출력
		System.out.println(member1);  // -> OOP.Member@2ff4acd0
		
		// 2. 객체 안에 있는 필드에 접근하는 방법
		// 레퍼런스 변수명.필드
		// . --> 접근의 의미! 가지고 있는!
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		// 필드에 아무런 값도 넣지 않았을 때는 기본값이 세팅된다.
		// String --> null
		// int --> 0
		// double --> 0.0
		
		// 3. 객체 안에 있는 필드 데이터를 변경하기
		member1.name = "제니";
		System.out.println(member1.name);
		
		member1.age = 28;
		member1.id = "blackpink";
		member1.pw = "960116";
		System.out.println(member1.age);
		System.out.println(member1.id);
		System.out.println(member1.pw);
		
		
		// 하나의 클래스 설계도면으로 여러 개의 객체 생성 가능
		// 짝꿍 데이터를 저장하는 member2 객체 생성
		// 안에 저장되어있는 데이터 모두 출력
		Member member2 = new Member();
		member2.name = "윈터";
		member2.age = 23;
		member2.id = "aespa";
		member2.pw = "010101";
		System.out.println(member2.name);
		System.out.println(member2.age);
		System.out.println(member2.id);
		System.out.println(member2.pw);
		
		// 메소드 실행
		member2.kakaoTalk("안녕~");
	}

}
