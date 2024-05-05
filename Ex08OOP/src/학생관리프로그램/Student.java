package 학생관리프로그램;

public class Student {
	// 학생 자료형 설계도
	// 1. Field
	// 이름, 학번, 나이, 자바점수, 웹점수, 안드로이드점수
	private String name;
	// private으로 감싸준다 => 캡슐화(정보은닉의 기능)
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	// 생성자 메소드 (constructor)
	// : 객체를 생성하는 순간에 실행되는 메소드
	// : 필드에 있는 데이터를 객체 생성 순간에 초기화(초기값)를 시켜줄 수 있도록 로직 작성
	// alt + shift + s => generate constructor using fields 로 자동생성 가능
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	// 생성자 특징!
	// 1. 리턴타입을 지정하지 않는다! (void도 작성 안 함!)
	// 2. 생성자의 이름은 클래스의 이름과 동일해야한다!! (대소문자까지)
	// 3. 생성자도 결국 메소드다.
	// 4. 매개변수가 아무것도 없는 생성자를 기본 생성자(default constructor)라고 부르는데
	//    생략이 가능하다!!!! (굳이 만들어주지 않아도 사용 가능)
	// 단, 새로운 나만의 생성자를 만들게 되면 기본 생성자는 덮어씌워진다. (사라져버린다)
	// 5. 생성자도 오버로딩(중복정의)이 가능하다
	
	public Student() {  // 기본 생성자 : 매개변수를 아무것도 갖지 않는 것
	}
	
	
	
	// 2. Method
	// getter, setter 만드는 단축키 : alt + shift + s 
	//                           -> generate getters and setters
	//                           -> select All
	
	// 2-1) getter 메소드 : 필드값을 가지고 올 때 사용하는 메소드
	//     -> private로 숨겨져있는 필드의 데이터에 접근해서 
	//        다른 클래스에서 데이터를 가져갈 수 있게 만들어주는 메소드
	//     -> 매개변수는 필요 없다
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	public int getAge() {
		return age;
	}
	
	
	// 2-2) setter 메소드 : 이름을 필드에 넣어줄 때 사용하는 메소드
	//      -> private으로 숨겨져있는 필드의 데이터를 수정하고 싶을 때 사용하는 메소드
	// 세팅만 해주고 가져오지는 않을 거라서 return type 없음 -> void 사용
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
