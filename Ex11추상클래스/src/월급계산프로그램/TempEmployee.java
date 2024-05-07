package 월급계산프로그램;

public class TempEmployee extends Employee {
	
	// 메소드
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay); // 부모 클래스의 생성자를 호출
	}
	
	// getMoneyPay : 월 급여를 계산하고 리턴
	public int getMoneyPay() {
		return pay / 12;
	}
	
	
	
}
