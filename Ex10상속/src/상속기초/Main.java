package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makejjigae();
		c.makejjigae();
		
		// 상속의 특징 3가지
		// 1. 다중 상속이 불가능하다.
		// 2. 상속의 횟수에 제한이 없다.
		// 3. 모든 클래스는 Object(최상위 클래스)를 상속받는다.
		//    --> Object == 클래스 공통의 조상
		
		c.makejae();
		c.makeKimchi();
		
		
		// 1) 업캐스팅(UpCasting)
		//   : 자식클래스(서브, 하위)가 부모클래스(슈퍼, 상위) 타입으로 자동으로 형 변환 하는 것
		//    ex) 강아지는 동물이다 --> 말 됨! 자동으로 형 변환
		//        모든 동물은 강아지다 --> 말 안 됨!
		Parent p2 = new Child();
		// 부모 자료형레퍼런스 변수명 = new 자식자료형();		
		p2.makejae();
		// 만약에, 자식클래스가 부모클래스의 메소드를 오버라이딩(재정의)한 경우
		// 업캐스팅된 객체는 자식클래스의 메소드를 호출
		
		// 2) 다운캐스팅(DownCasting)
		//   : 부모 클래스가 자식 클래스로 강제 형변환
//		Child c2 = (Child) new Parent();
		// 코드에서 빨간줄이 뜬다 == Syntax Error! (구문 오류)
		// Exception 발생!!
		//  --> 구문 오류는 없으나 실행했을 대 예외상황이 발생하는 것!
		
		// 3) 다운캐스팅(DownCasting)
		//   : 업 캐스팅된 객체를 강제 형 변환으로 본래의 자료형태로 되돌려놓는 것
		// 전제조건 : 업캐스팅된 객체만 다운캐스팅이 가능하다.
		Child c2 = (Child) p2;
		c2.makeKimchi();
		// ----> 본래 자신이 가지고 있던 메소드를 사용할 수 있음!!!
		
		
	}

}
