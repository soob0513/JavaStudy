package OOP;

public class Member {

	// 나만의 자료형 설계도면
	// --> main method를 포함하지 X
	// --> 자체적으로 실행되지 X
	// OOP (Object Oriented Programming)
	
	// 1 . Field (Data, 속성)
	String name; // 이름
	int age;     // 나이
	String id;   // 아이디
	String pw;   // 비밀번호
	
	// 2. Method (Logic, 행위, 기능)
	// 카카오톡에서 메시지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name + "님이 " + msg + "을(를) 전송합니다.");
	}
	
	// 이모티콘 보내기
	public void sendEmo(String emo) {
		System.out.println(name + "님이" + emo + "를 보냅니다.");
	}

}
