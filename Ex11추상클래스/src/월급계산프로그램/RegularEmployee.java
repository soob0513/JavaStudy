package 월급계산프로그램;

public class RegularEmployee extends Employee {
	
	// 1. field (Data, 속성)
	private int bonus;    // 보너스
	
	// 2. 메소드
	// 생성자(Constructor) 메소드
	public RegularEmployee (String empno, String name, int pay, int bonus){
		super(empno, name, pay); // 부모 클래스의 생성자를 호출
		this.bonus = bonus;
	}
	
	// getMoneyPay : 월 급여를 계산하고 리턴
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}
	
}
