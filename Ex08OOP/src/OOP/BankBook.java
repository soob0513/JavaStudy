package OOP;

public class BankBook {
	
	// 은행 프로그램 만든다고 가정!
	// 통장 정보를 저장할 수 있는 우리만의 자료형 설계도면
	
	// 1. Field(Data, 속성)
	// 잔액(money)
	private int money;
	// 이름(name)
	private String name;
	// 클래스 내부에 존재하는 데이터는 외부에서 함부로 접근할 수 없게끔
	// 정보은닉을 지켜주어야 한다! (사용자가 임의로 변경하는 것을 막기!)
	
	
	// 2. Method(Logic, 기능, 행위)
	// 입금하다 (deposit)
	// --> return 타입 없음, 매개변수로 정수형 하나 받아오기
	// 메소드 구조 : 접근제한자 리턴타입 메소드 이름(매개변수) {로직 작성}
	public void deposit(int money) {
		this.money += money;
		// this 키워드 : this.money --> this가 가지고 있는 money
		//             == Bankbook.money
		//           : 현재 Class 그 자체(나 자신)를 지칭하는 키워드
	}
	
	// 출금하다 (withdraw)
	// --> return type 없음, 매개변수로 정수형 하나 받아오기
	public void withdraw(int money) {
		// 현재 잔액보다 출금하려는 돈이 많을 때 -> "잔액이 부족합니다." 출력
		// 현재 잔액보다 출금하려는 돈이 적을 때 -> 잔액 변경해주기(누적) 
		if (this.money >= money) {
			this.money -= money;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	// 잔액 확인하기 (showMoney)
	// --> return type 있음! int 형태를 되돌려주기
	public int showMoney() {
		return money;
	}
	
	
}
