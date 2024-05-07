package 월급계산프로그램;

public class PartTimeEmployee extends Employee {
	
	// 1. field (Data, 속성)
	private int workDay;   // 일수
	
	// 2. 메소드
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay); // --> 부모의 생성자 메소드 사용하겠다! --> 이 메소드는 부모 클래스에 적혀있음
		this.workDay = workDay;
	}
	
	// getMoneyPay() : 월 급여를 계산하고 리턴
	public int getMoneyPay() {
		return pay * workDay;
	}


	
}
